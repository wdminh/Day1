package day01;

import java.util.Scanner;

public class variables {
public static void main(String args[]){
//	declare an integer n1 without initializing
	int n1;
//	declare an integer n2 with initializing value
	int n2=10;
//	declare a char c with initializing value
	char c='m';
//	declare a string firstname with initializing value
	String firstName="minh";
//	declare a double n3 with initializing value
	double n3=123.456;
//	declare a boolean result without initializing value
	boolean result;
//	set the value for n1
	n1=30;
//	firstname
	System.out.println("My name is :"+firstName);
//	operator
	//+ 
	System.out.println("n1+n2="+(n1+n2));
	//-
	System.out.println("n1-n2="+(n1-n2));
	//*
	System.out.println("n1*n2="+(n1*n2));
	//divide
	System.out.println("n1/n2="+(n1/n2));
	//%
	System.out.println("n1%n2="+(n1%n2));
//	n1>n2
	result=n1>n2;
	System.out.println("n1>n2 is:"+result);
//	n1<n2
	result=n1<n2;
	System.out.println("n1<n2 is:"+result);
//	n1>=n2
	result=n1>=n2;
	System.out.println("n1>=n2 is:"+result);
//	n1<=n2
	result=n1<=n2;
	System.out.println("n1<=n2 is:"+result);
//	n1=n2
	result=n1==n2;
	System.out.println("n1==n2 is:"+result);
	
}
public static void main_if(String[] args) {
	int n1=10;
	int n2=20;
//	simple if statement : n1>n2
	if(n1>n2) System.out.println("true");
	else System.out.println("wrong");
	
	if(n2%3==0)
	{ n2/=3; System.out.println(n2);}
	else if(n2%2==0){
		n2=n2/2;
		System.out.println(n2);
	}
	
	
	
	
}
public static void main_switch(String[] args) {
	char  index;
	Scanner sc= new Scanner(System.in);
	System.out.println("enter the index:");
	index=sc.next().charAt(0);
	String day="initialized";
	switch(index){
	case '0':
		day="Monday";
		break;
	
	case 'a':
		day="Tuesday";
		break;
	default:
		day="Unknown";
		break;
}
	
	System.out.println(index);
	System.out.println(day);
	sc.close();
	}
}
