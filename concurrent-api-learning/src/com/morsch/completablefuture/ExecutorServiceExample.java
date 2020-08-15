package com.morsch.completablefuture;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorServiceExample {
	
	public static void main(String[] args) throws ExecutionException, InterruptedException{
		
		/**
		 *The <p>ExecutorService</p> interface contains a large number of methods for controlling the progress of the tasks and 
		 *managing the termination of the service. Using this interface, you can submit the tasks for execution and also 
		 *control their execution using the returned Future instance. In the following example, we create an ExecutorService, 
		 *submit a task and then use the returned Future‘s get method to 
		 *wait until the submitted task is finished and the value is returned: 
		 */
		ExecutorService executorService = Executors.newFixedThreadPool(10);
		Future<String> future = executorService.submit(() -> {
			Thread.sleep(4000);
			return "Constant";
		});
		
		System.out.println("do other stuff");
		System.out.println("while assyncrhonous task is running");
		
		future.get();
	}
	

}
