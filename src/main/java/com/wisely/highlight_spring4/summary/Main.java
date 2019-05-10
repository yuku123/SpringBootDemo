package com.wisely.highlight_spring4.summary;

import com.wisely.highlight_spring4.summary.config.Config;
import com.wisely.highlight_spring4.summary.dependency.ServiceInjection;
import com.wisely.highlight_spring4.summary.dependency.UseFunctionService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	public static void main(String[] args) {
		// config方式
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);

		//接下去是得到bean的操作方式
		UseFunctionService useFunctionService = context.getBean(UseFunctionService.class);
		ServiceInjection serviceInjection = context.getBean(ServiceInjection.class);
		Config resourceService = context.getBean(Config.class);

		//JavaConfig.class
		System.out.println(useFunctionService.SayHello("java config"));
		//DiConfig.class
		serviceInjection.say1();
		serviceInjection.say2();
		//ElConfig.class
		resourceService.outputResource();

		context.close();
		
	}
}
