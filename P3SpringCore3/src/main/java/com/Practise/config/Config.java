package com.Practise.config;

import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
	
	public Config() {
		System.out.println("Configuration Files object is created.");
	}
	
	public void display() {
		System.out.println("Config Display method.");
	}
}
