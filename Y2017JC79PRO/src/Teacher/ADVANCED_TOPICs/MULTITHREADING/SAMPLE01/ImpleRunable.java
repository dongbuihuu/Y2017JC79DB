package JAVACORE_TRAINING.TEACHER.ADVANCED_TOPICs.MULTITHREADING.SAMPLE01;

public class ImpleRunable
								implements Runnable {    

    public void run() {
		for (int i = 0; i < 3; i++)
            try {
                Thread.sleep(3000);
                System.out.println("i = " + i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
	}
    
    public static void main(String[] str) {
        Thread objT = new Thread(new ImpleRunable());
        objT.start();
    }
}
