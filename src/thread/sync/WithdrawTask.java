package thread.sync;

/**
 * Withdraw Task
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-05-20
 * @version 1.0
 */
public class WithdrawTask implements Runnable {

	private BankAccount account;
	private int amount;

	public WithdrawTask(BankAccount account, int amount) {
		this.account = account;
		this.amount = amount;
	}

	@Override
	public void run() {
		account.withdraw(amount);
	}
}