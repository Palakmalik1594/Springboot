package com.classlevel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Mobile {
	@Value("345874387")
	private String number;

	public String getNumber() {
		return number;
	}
	

	public void setNumber(String number) {
		this.number = number;
	}

}
