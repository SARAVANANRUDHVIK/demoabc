package org.sample;
public class PAR1 implements PAR2,PAR3{
	@Override
	public void test2() {
		System.out.println("saravanan");	
	}
	@Override
	public void test3() {
		System.out.println("karthi");	
	}
	@Override
	public void test1() {
		System.out.println("rudhvik");
		}
public static void main(String[] args) {
	PAR1 check =new PAR1();
	check.test1();
	check.test2();
	check.test3();
	
}
}
