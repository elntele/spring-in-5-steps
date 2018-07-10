package com.in28minutes.spring.basics.springin5steps.basic;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.doNothing;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import com.in28minutes.spring.basics.springin5steps.SpringIn5StepsApplication;
//load the context
@RunWith(SpringRunner.class)
@ContextConfiguration(locations="/aplicationContext.xml")
public class BynarySearchXmlCOnfigutationTest {
	
	//get beaans for the context
	@Autowired
	BinarySearchImpl bynarySearch;

	@Test
	public void testBasicScenario() {
		int actualResult= bynarySearch.binarySeach(new int[]{}, 5);

		assertEquals(3, actualResult);
		
		
	}

}
