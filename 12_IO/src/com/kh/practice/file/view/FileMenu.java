package com.kh.practice.file.view;

import java.util.Scanner;

import com.kh.practice.file.controller.FileController;

public class FileMenu {
	
	private Scanner sc = new Scanner(System.in);
	
	private FileController fc = new FileController();
	
	
	public void mainMenu() {
		
		while(true) {
		
			System.out.println("**** My Note *****");
			System.out.println("1. 노트 새로 만들기 ");
			System.out.println("2. 노트 열기 ");
			System.out.println("3. 노트 열어서 수정하기 ");
			System.out.println("9. 끝내기 ");
			System.out.print("메뉴 번호 :");
			
			int num = Integer.parseInt(sc.nextLine());
			
			switch(num) {
			case 1: fileSave(); break;
			case 2: fileOpen(); break;
			case 3: fileEdit(); break;
			case 9: System.out.println("프로그램을 종료합니다."); return;
			default: System.out.println("잘못입력하셨습니다. 다시 입력해주세요.");
			}
			
		}
	}
	
	public void fileSave() {
		
		StringBuilder sb = new StringBuilder();
		
		while(true) {
			System.out.println("파일에 저장할 내용을 입력하세요.");
			System.out.println("ex끝it 이라고 입력하면 종료됩니다.");
			System.out.print("내용 :");
			String s = sc.nextLine();
			
			if(s.equals("ex끝it")) {
				break;
			}else {
				sb.append(s+"\n");
			}
		}
		
		while(true) {
			System.out.print("저장할 파일명을 입력해주세요 : ");
			String file = sc.nextLine();
			
			if(fc.checkName(file)) {
				System.out.println("이미 존재하는 파일입니다. 덮어쓰시겠습니까?(y/n)");
				char fn = sc.nextLine().charAt(0);
				
				if(fn == 'y' || fn == 'Y') {
					fc.fileSvae(file, sb); break;
				}else {
					System.out.println("파일명을 다시 입력해주세요.");
					continue;
				}
			}else {
				fc.fileSvae(file, sb);break;
					
			}
		}
		
	}
	
	public void fileOpen() {
		
		System.out.print("열 파일 명 :");
		String file = sc.nextLine();
		
		if(fc.checkName(file) == true) {
			System.out.println(fc.fileOpen(file).toString()/*system안에서 자동호출*/);
			
		}else {
			System.out.println("없는파일입니다.");
		}
		
		
	}
	
	public void fileEdit() {
		
		System.out.print("수정 할 파일 명 :");
		String file = sc.nextLine();
		
		if(fc.checkName(file)) {
			System.out.println("파일에 저장할 내용을 입력하세요.");
			System.out.println("ex끝it 이라고 입력하면 종료됩니다.");
			System.out.print("내용 :");
			
			
			StringBuilder sb = new StringBuilder();
			
			while(true) {
				
				String s = sc.nextLine();
				
				if(s.equals("ex끝it")) {
					break;
				}else {
					sb.append(s+"\n");
				}
			}
			
			fc.fileEdit(file, sb);
			
			
		}else {
			System.out.println("없는파일입니다.");return;
		}
		
	}

}
