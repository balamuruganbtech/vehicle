package com.app;

public class Testing {
	static int val(){
		try{
			System.out.println("teting try{} block");
			return 1;
		}catch(Throwable ex){
			System.out.println("teting catch{} block");
			return 0;
		}finally{
			System.out.println("teting finally{} block");
			return 2;
		}
	}
	public static void main(String[] args) {
		System.out.println("hello "+val());
	}
}
