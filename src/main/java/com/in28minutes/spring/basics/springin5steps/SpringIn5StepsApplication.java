package com.in28minutes.spring.basics.springin5steps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.validation.BindingResultUtils;

import basic.BinarySearchImpl;

@SpringBootApplication
public class SpringIn5StepsApplication {
	
	public static void main(String[] args) {
		//BinarySearchImpl binarySearch= new BinarySearchImpl(new QuickSortAlgorithm());
		
	ApplicationContext applicationContext = SpringApplication.run(SpringIn5StepsApplication.class, args);
	BinarySearchImpl binarySearch = applicationContext.getBean(BinarySearchImpl.class);
	
	BinarySearchImpl binarySearch1 = applicationContext.getBean(BinarySearchImpl.class);
		int result= binarySearch.binarySeach(new int[] {12,4,6}, 3);
		System.out.println(binarySearch);
		System.out.println(binarySearch1);
		
		
		System.out.println(result);

	}
}