package com.howtodoinjava.demo;

import org.junit.Test;

import com.howtodoinjava.rest.controller.SampleBusiness;

public class EmployeeControllerTest extends SpringBootDemoApplicationTests{
	SampleBusiness samb = new SampleBusiness();
	
	@Test
	public void testSum() {
		
		System.out.println("*********************************************"+samb.sum(2, 5));
		
	}

}
