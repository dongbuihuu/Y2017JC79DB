package BUIHUUDONG.multithreading.Thread_Synchronization.TheProblemWithoutSynchronization;

public class MainTest {

	public static void main(String[] args) {
		Account account = new Account();
		for (int i = 1; i <= 1000; i++) {
			account.setBalance(i);
		}
		System.out.println("Balance is: " + account.getBalance());

	}

}
