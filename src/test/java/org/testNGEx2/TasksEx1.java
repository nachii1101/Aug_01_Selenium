package org.testNGEx2;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TasksEx1 {
	@Test
	public void addTasks(){
		System.out.println("Add Tasks");
	}
	@Test
	public void updateTasks() {
		System.out.println("Update Tasks");
	}
	@Test
	public void DeleteTasks() {
		System.out.println("Delete Tasks");
	}
}

