package com.wisely.highlight_spring4.summary;

import com.wisely.highlight_spring4.summary.config.DiConfig;
import com.wisely.highlight_spring4.summary.config.JavaConfig;
import com.wisely.highlight_spring4.summary.dependency.ServiceInjection;
import com.wisely.highlight_spring4.summary.dependency.UseFunctionService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	public static void main(String[] args) {
		// config方式
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class,DiConfig.class);
		//接下去是得到bean的操作方式
		UseFunctionService useFunctionService = context.getBean(UseFunctionService.class);
		ServiceInjection serviceInjection = context.getBean(ServiceInjection.class);

		System.out.println(useFunctionService.SayHello("java config"));
		serviceInjection.say1();
		serviceInjection.say2();

		context.close();
		
	}
}
