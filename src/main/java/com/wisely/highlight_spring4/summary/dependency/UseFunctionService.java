package com.wisely.highlight_spring4.summary.dependency;

//1
public class UseFunctionService {
	//2
	FunctionService functionService;
	
	public void setFunctionService(FunctionService functionService) {
		this.functionService = functionService;
	}
	
	public String SayHello(String word){
		return functionService.sayHello(word);
	}

}
