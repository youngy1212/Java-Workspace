package com.kh.hw.employee.view;

import java.util.Scanner;

import com.kh.hw.employee.controller.EmployeeController;

public class EmployeeMenu {
	
	Scanner sc = new Scanner(System.in);
	EmployeeController ec = new EmployeeController();
	
	public EmployeeMenu() {
		System.out.println("1. 사원 추가");
		System.out.println("2. 사원 수정");
		System.out.println("3. 사원 삭제");
		System.out.println("4. 사원 출력");
		System.out.println("9. 프로그램 종료");
		System.out.print("메뉴번호를 누르세요 : " );
		int me = sc.nextInt();
		
		switch(me) {
		case 1: insertEmp();
				break;
		case 2: updateEmp();
				break;
		case 3: deleteEmp();
				break;
		case 4: printEmp();
				break;
		default:
			System.out.println("잘못 입력하셨습니다.");
		}
	}
	
	public void insertEmp() {
		
		while(true) {
			System.out.print("사원번호 : " );
			int empNO = sc.nextInt();
			System.out.print("사원이름 : " );
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("사원성별 : " );
			char gender = sc.nextLine().charAt(0);
			System.out.print("전화번호 : " );
			String phone = sc.nextLine();
		
			ec.add(empNO, name, gender, phone);
			
			System.out.print("추가 정보를 더 입력하시겠습니까.(y/n)");
			char ch = sc.nextLine().charAt(0);
			
				if(ch == 'n') {
					 break;
				}
		}
	}
	public void updateEmp() {
		System.out.printf("가장 최신 사원의 정보를 수정하게 됩니다. " );
		System.out.printf("사원의 어떤 정보를 수정하시겠습니까? " );
		System.out.printf("1. 전화 번호 " );
		System.out.printf("2. 사원 연봉 " );
		System.out.printf("3. 보너스율 " );
		System.out.printf("9. 돌아기기 " );
		
		System.out.print("메뉴번호를 누르세요 : " );
		int me = sc.nextInt();
		switch(me) {
		
		case 1: System.out.print("수정 할 전화번호 :");
				String phone = sc.nextLine();
				ec.modify(phone);
				break;
		case 2: System.out.print("수정 할 사원 연봉 :");
				String salary = sc.nextLine();
				ec.modify(salary);
				break;
		case 3: System.out.print("수정 할 보너스 율 :");
				double bonus = sc.nextDouble();
				ec.modify(bonus);
				break;
		case 4: System.out.println("메인메뉴로 돌아갑니다..");
				// EmployeeMenu();
				break;
		default: 
			System.out.println("잘못 입력하셨습니다.");
		}
		
	}
	public void deleteEmp() {
		sc.nextLine();
		System.out.printf("정말 삭제하시겠습니까? (y/n)" );
		char ch = sc.nextLine().charAt(0);
		if(ch == 'y') {
			System.out.println("데이터 삭제에 성공하였습니다.");
		}
	}
	public void printEmp() {
		
	}
	
}
