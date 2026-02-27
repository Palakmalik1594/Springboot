package com.spring;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Person {
	//dependency injection
	@Autowired
	private Mobile mobile;
	public Mobile getMobile() {
		return mobile;
	}
	public void setMobile(Mobile mobile) {
		this.mobile = mobile;
	}
//	public static void message() {
//		System.out.println("Hii");
//	}
	
	@Autowired
	private Scanner scan;
	public Scanner getScan() {
		return scan;
	}
	public void setScan(Scanner scan) {
		this.scan = scan;
	}

}
