package com.springcore.ci;

public class Addition {
	 private int a;
	 private int b;
	 
	 public Addition(int a, int b) {
		 this.a=a;
		 this.b=b;
	 }
	 
	 public Addition(double a, double b) {
		 this.a= (int)a;
		 this.b=(int)b;
	 }
	 
	 public Addition(String a, String b) {
		 this.a=Integer.parseInt(a);
		 this.b=Integer.parseInt(b);
	 }
	 
	 public void doSum() {
		 
		 System.out.println("the value of a :"+ this.a);
		 System.out.println("the value of b :"+this.b);
		 System.out.println("the sum is: "+(this.a+this.b));
	 }
}