package com.threads.threadsafetythreadlocal;

import java.util.concurrent.atomic.AtomicInteger;

class ProcessingThread implements Runnable {
	private int count;

	
	//For synchronizing
	private static AtomicInteger counter = new AtomicInteger(0);
	//Threadlocal variable
	ThreadLocal<Number> counter_threadlocal = new ThreadLocal<Number>(); 

	@Override
	public void run() {
		for (int i = 1; i < 3; i++) {
			processSomething(i);
			counter.incrementAndGet();
		}
	}

	public int getCount() {
		return this.count;
	}
	public int getCounter() {
		return counter.get();
	}

	//can make this method synchronized for thread safety
	private void processSomething(int i) {
		// processing some job
		try {
			Thread.sleep(i * 1000);
			count++;
			if (counter_threadlocal.get()==null) {
				counter_threadlocal.set(1);
			}else {
				counter_threadlocal.set(counter_threadlocal.get().intValue()+1);
			}
			System.out.println(Thread.currentThread().getName()+" count: "+ count);
			System.out.println(Thread.currentThread().getName()+" threadlocal: "+counter_threadlocal.get());
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
	