package com.in28minutes.spring.basics.springin5steps;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.in28minutes.spring.basics.springin5steps.basic.BinarySearchImpl;

@Configuration
@ComponentScan("com.in28minutes.spring.basics.springin5steps")
public class SpringIn5StepsApplication {
	
	public static void main(String[] args) {
		//BinarySearchImpl binarySearch= new BinarySearchImpl(new QuickSortAlgorithm());
		
		try(AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(
				SpringIn5StepsApplication.class)) {
			
			//			SpringApplication.run(SpringIn5StepsApplication.class, args);
			BinarySearchImpl binarySearch = applicationContext.getBean(BinarySearchImpl.class);
			BinarySearchImpl binarySearch1 = applicationContext.getBean(BinarySearchImpl.class);
			int result = binarySearch.binarySeach(new int[] { 12, 4, 6 }, 3);
			System.out.println(binarySearch);
			System.out.println(binarySearch1);
			System.out.println(result);
		} catch (Exception e) {
			// TODO: handle exception
		}

	}
}
