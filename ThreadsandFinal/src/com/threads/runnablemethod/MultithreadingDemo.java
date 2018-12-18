package com.threads.runnablemethod;

//Java code for thread creation by implementing 
//the Runnable Interface 
class MultithreadingDemo implements Runnable 
{ 
 public void run() 
 { 
     try
     { 
         // Displaying the thread that is running 
         System.out.println ("Thread " + 
                             Thread.currentThread().getId() + 
                             " is running"); 

     } 
     catch (Exception e) 
     { 
         // Throwing an exception 
         System.out.println ("Exception is caught"); 
     } 
 } 
} 
