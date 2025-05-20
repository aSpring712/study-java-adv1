package thread.sync;

/**
 * Bank Account
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-05-20
 * @version 1.0
 */
public interface BankAccount {

	boolean withdraw(int amount);

	int getBalance();
}