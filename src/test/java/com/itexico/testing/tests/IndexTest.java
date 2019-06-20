package com.itexico.testing.tests;

import org.aeonbits.owner.ConfigFactory;
import org.testng.annotations.Test;

import com.itexico.testing.configurations.DriverConfigurations;

public class IndexTest {
	
	@Test
	public void testIndex() {
		DriverConfigurations conf = ConfigFactory.create(DriverConfigurations.class);
		System.out.println("Message: " + conf.msg());
	}
}
