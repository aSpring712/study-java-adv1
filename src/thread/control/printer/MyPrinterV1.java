package thread.control.printer;

import java.util.Queue;
import java.util.Scanner;
import java.util.concurrent.ConcurrentLinkedQueue;

import static util.MyLogger.log;
import static util.ThreadUtils.sleep;

/**
 * My Printer V1
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-05-18
 * @version 1.0
 */
public class MyPrinterV1 {

	public static void main(String[] args) throws InterruptedException {
		Printer printer = new Printer();
		Thread printerThread = new Thread(printer, "printer");
		printerThread.start();

		Scanner userInput = new Scanner(System.in);
		while (true) {
			log("프린터할 문서를 입력하세요. 종료 (q): ");
			String input = userInput.nextLine();
			if (input.equals("q")) {
				printer.work = false;
				break;
			}

			printer.addJob(input);
		}
	}

	static class Printer implements Runnable {
		volatile boolean work = true;
		Queue<String> jobQueue = new ConcurrentLinkedQueue<>();

		@Override
		public void run() {
			while (work) {
				if (jobQueue.isEmpty()) {
					continue;
				}

				String job = jobQueue.poll();
				log("출력 시작: " + job + ", 대기 문서: " + jobQueue);
				sleep(3000); // 출력에 걸리는 시간
				log("출력 완료: " + job);
			}
			log("프린터 종료");
		}

		public void addJob(String input) {
			jobQueue.offer(input);
		}
	}
}