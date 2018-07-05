package com.in28minutes.spring.basics.springin5steps;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.in28minutes.spring.basics.springin5steps.xml.XmlPersonDAO;

@Configuration
@ComponentScan("com.in28minutes.spring.basics.springin5steps")
public class SpringIn5StepsXMLContextApplication {

	private static Logger LOGGER=LoggerFactory.getLogger(SpringIn5StepsXMLContextApplication.class);
	
	public static void main(String[] args) {

		try (ClassPathXmlApplicationContext applicationContext =
				new ClassPathXmlApplicationContext("AplicationContext.xml")) {

			XmlPersonDAO personDao = 
					applicationContext.getBean(XmlPersonDAO.class);
			
			LOGGER.info("Beans Loaded-> {}", (Object) applicationContext.getBeanDefinitionNames());
			System.out.println(personDao);
			System.out.println(personDao.getXmljdbcConnection());
		} catch (Exception e) {
		}

	}
}
