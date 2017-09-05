package com.example.utility;

import org.springframework.stereotype.Component;

@Component
public class Utility implements UtilityDao{
public void print() {
	System.out.println("working...");
}
}
