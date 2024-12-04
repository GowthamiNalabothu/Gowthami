package com.codinghub;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main
{
	public static void main(String[] args) 
	{
		ApplicationContext context=new AnnotationConfigApplicationContext(config1.class);
		game g=context.getBean(game.class);
		System.out.println(g);
		
	}

}
