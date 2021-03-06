package com.teamsankya.sampleshoppingcart.controllertest;


import org.junit.Test;

import junit.framework.TestCase;
import net.sourceforge.jwebunit.WebTester;

public class ProductControllerTest extends TestCase{
	private WebTester tester = new WebTester();
	private static final String BASE_URL = "http://localhost:8080/sampleshoppingcart/";

	@Override
	protected void setUp() throws Exception {
		tester.getTestContext().setBaseUrl(BASE_URL);
	}

	@Test
	public void testgetProduct() {
		tester.beginAt("index.jsp");

		tester.assertFormPresent();
		tester.setFormElement("productcategory", "dal");
	}


}
