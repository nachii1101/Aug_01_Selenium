package org.testNGEx2;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ReportsEx1 {
	@BeforeTest
	public void getQADetails() {
		System.out.println("Get QA environment details");
	}
	@AfterTest
	public void ClearQAEnvironmentDetails() {
		System.out.println("Clear QA environment details");
	}
	@Test
	public void addReport() {
		System.out.println("Add report");
	}
	@Test
	public void updateReport() {
		System.out.println("Update report");
	}
	@Test
	public void DeleteReport() {
		System.out.println("Delete Report");
	}

}
