package com.in28minutes.spring.basics.springin5steps.basic;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component 
@Qualifier("buble")
public class BubleSortAlgorithm implements SorteAlgorithm {
	
	public int[] sortNumebers(int[] numbers){
		
		return numbers;
	}

}
