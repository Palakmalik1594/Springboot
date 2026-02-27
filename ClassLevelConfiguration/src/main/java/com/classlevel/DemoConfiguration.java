package com.classlevel;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages="com.classlevel")
public class DemoConfiguration {
	@Bean
	public Scanner getScanner() {
		return new Scanner(System.in);
	}
	@Bean
	public List<String> getabc(){
		return List.of("Palak","Prisha","Priya");
	}
	@Bean
	public Map<String,Integer> getMap(){
		Map<String,Integer> map=new HashMap<>();
		map.put("Maths",20);
		map.put("Science",30);
		return map;
	}
	

}
