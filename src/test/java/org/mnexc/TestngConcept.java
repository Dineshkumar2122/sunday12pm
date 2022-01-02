package org.mnexc;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestngConcept {


	@BeforeMethod
	private void before() {
		System.out.println("testcase started..");
	}
	@BeforeClass
	private void beforeClass() {
		System.out.println("execution started...");

	}
	@AfterClass
	private void after() {
		System.out.println("end execution ended..");

	}
	@AfterMethod
	private void aftermethod() {
		System.out.println("end testcases.");

	}
	@Test
	private void test03() {
		System.out.println("testing executed 03");
	}

	@Test(priority=-30)
	private void tect01() {
		System.out.println("testing executed 01");
	}

	@Test(priority=-20)
	private void test02() {
		System.out.println("testing execited 02");
	}
	@Test(priority=-1,enabled=false)
	private void test04() {
		System.out.println("test 04");
	}
}






