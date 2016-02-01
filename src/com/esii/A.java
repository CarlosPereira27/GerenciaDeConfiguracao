package com.esii;

public class A {
	
	private int A1;
	private float A2;
	private String A3;
	private String Aramo4;
	
	public int getA1() { 
		return this.A1; 
	}
	
	public float getA2() { 
		return this.A2; 
	}
	
	public String getA3() { 
		return this.A3; 
	}
	
	public String getAramo4() { 
		return this.Aramo4; 
	}
	
	public void setA1(int A1) { 
		this.A1 = A1; 
	}
	
	public void setA3(String A3) { 
		this.A3 = A3; 
	}
	
	public void setAramo4(String Aramo4) { 
		this.Aramo4 = Aramo4; 
	}
	
	public float soma() {
		return this.A1 + this.A2;
	}
	
}
