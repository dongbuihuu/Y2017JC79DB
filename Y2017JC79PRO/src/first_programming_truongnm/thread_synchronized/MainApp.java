package first_programming_truongnm.thread_synchronized;

public class MainApp {

	public static void main(String[] args) {
		NotSynchronized syn1 = new NotSynchronized();
		NotSynchronized syn2 = new NotSynchronized();
		NotSynchronized syn3 = new NotSynchronized();
		syn1.setName("Example1: ");
		syn2.setName("Example2: ");
		syn3.setName("Example3: ");
		syn1.start();
		syn2.start();
		syn3.start();
	}

}
