package com.yedam.review;

public class InterfaceTest implements InterfaceSample{
	
	@Override
	public void test() {
		double a = InterfaceSample.PI;
	}

	@Override
	public int service() {
		
		return 0;
	}

}
