package JAVACORE_TRAINING.TEACHER.ADVANCED_TOPICs.MULTITHREADING.THREAD_SYNCHRONIZATION.Java_Synchronized_Method;

public class StaticSynchronizedBlock extends Object {
	  public static synchronized void StaticA() {
	    System.out.println("Entering StaticA()");
		    try {
		      Thread.sleep(5000);
		    } catch (InterruptedException x) {
	    }
	    System.out.println("Leaving StaticA()");
	  }

	  public static void StaticB() {	  		  
	     synchronized (StaticSynchronizedBlock.class) {
	      System.out.println("Entering StaticB() - Inside sync block");
	      	try {
	      		Thread.sleep(4000);
	      	} catch (InterruptedException x) {
	      }
	      System.out.println("Leaving StaticB() - Inside sync block");	
	    }
	    
	  }

	  public static void main(String[] args) {
	    Runnable runA = new Runnable() {
	      public void run() {
	    	  StaticSynchronizedBlock.StaticA();
	      }
	    };
	    Thread threadA = new Thread(runA, "A");
	    threadA.start();
	    	try {
	    		Thread.sleep(200);
	    	} catch (InterruptedException x) {
	    }
	    	
	    Runnable runB = new Runnable() {
	      public void run() {
	    	  StaticSynchronizedBlock.StaticB();
	      }
	    };
	    Thread threadB = new Thread(runB, "B");
	    threadB.start();
	  }	  
	}
