package com.threads.threadsafetythreadlocal;

public class ThreadSafety {
	public static void main(String[] args) throws InterruptedException {
	    
        ProcessingThread pt = new ProcessingThread();
        Thread t1 = new Thread(pt, "t1");
        t1.start();
        Thread t2 = new Thread(pt, "t2");
        t2.start();
        //wait for threads to finish processing
        t1.join();
        t2.join();
      //ideally the count should be 8. But it gives different input on each run if synchronized is not used
        System.out.println("Processing count="+pt.getCount());
        System.out.println("Processing counter="+pt.getCounter());
        
        //For checking threadlocal
        Thread th1 = new Thread(pt, "th1");
        th1.start();
        Thread th2 = new Thread(pt, "th2");
        th2.start();
    }
}
