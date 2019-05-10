package com.wisely.highlight_spring4.summary.config;

import com.wisely.highlight_spring4.summary.dependency.FunctionService;
import com.wisely.highlight_spring4.summary.dependency.UseFunctionService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration // 对此类进行配置，标志
public class JavaConfig {

	//接下去三个@Bean的配置方式
	@Bean
	public FunctionService functionService(){
		return new FunctionService();
	}
	
//	@Bean
//	public UseFunctionService useFunctionService(){
//		UseFunctionService useFunctionService = new UseFunctionService();
//		useFunctionService.setFunctionService(functionService()); //3
//		return useFunctionService;
//	}

	@Bean
	public UseFunctionService useFunctionService(FunctionService functionService){//4
		UseFunctionService useFunctionService = new UseFunctionService();
		useFunctionService.setFunctionService(functionService);
		return useFunctionService;
	}
}
