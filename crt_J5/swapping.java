package crt_J5;

public class swapping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1=100;
		int num2=200;
		System.out.println("before swapping------>"+num1);
		System.out.println("before swapping------>"+num2);
		num1=num1+num2;
		num2=num1-num2;
		num1=num1-num2;
		System.out.println("after swapping------>"+num1);
		System.out.println("after swapping------>"+num2);
	}

}