package com.practicaljava.lesson21.CallableThreads;

import java.util.concurrent.Callable;  
   
 class PortfolioCallable implements Callable<Integer> {  

  public Integer call() throws Exception {  
   for (int i=0; i<5;i++){
	Thread.sleep (700);    // Sleep for 700 milliseconds 
       System.out.println( "You have " +  (500 + i) +  
                                      " shares of IBM");
   }
   
   // Just return some number
   return 10;  
  }  
 }  