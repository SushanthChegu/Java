package com.qn59;

public class Demo {
	
	public static void main(String[] args) throws CloneNotSupportedException {
		
		Demo d = new Demo();
		
		System.out.println(d.hashCode());
		
		d =null;
		System.gc();
		
		System.out.println("End of Garbage collection");

	}

	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("finalize is invoked");
	}
	
}
