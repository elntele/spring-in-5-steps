package com.in28minutes.spring.basics.springin5steps.basic;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Qualifier(value="quick")
@Primary
public class QuickSortAlgorithm implements SorteAlgorithm {
	
	public int[] sortNumebers(int[] numbers){
		
		return numbers;
	}

}
