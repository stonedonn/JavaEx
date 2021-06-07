package com.javaex.interfaceExample.bank;

public class Main {

	public static void main(String[] args) {
		Bank bank = new KBBank();
		bank.withDraw(100);
		bank.deposit(100);
		bank.findDormancyAccount("763231");
		Bank.BCAuth("KBBank");
		
		
		System.out.println("\n********************인스턴스 교체!*****************\n");
		
		bank = new SHBank();
		bank.withDraw(100);
		bank.deposit(100);
		bank.findDormancyAccount("4311");
		Bank.BCAuth("SHBank");
		
		 System.out.println("\n*************카카오은행 연동 실패!!***************\n");
	     //호환성 불가
	     /*
	     bank = new KakaoBank();
	     bank.withDraw(100);
	     bank.deposit(100);
	     bank.findDormancyAccount("4311");
	     */
	         
		 System.out.println("\n*************대학교 주은행  교체!!***************\n");
	         
	     bank = new KBBank(); //new KBBank();
	     bank.withDraw(20000);
	     bank.deposit(1000);
	     bank.findDormancyAccount("855512");
	     Bank.BCAuth("SHBank");
	}

}
