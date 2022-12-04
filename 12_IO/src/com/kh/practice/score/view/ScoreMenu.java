package com.kh.practice.score.view;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

import com.kh.practice.score.controller.ScoreController;

public class ScoreMenu {
	
	Scanner sc = new Scanner(System.in);
	ScoreController scr = new ScoreController();
	
	public void  mainMenu() {
		
		while(true) {
			
			System.out.println("1. 성적 저장");
			System.out.println("2. 성적 출력 ");
			System.out.println("9. 끝내기 ");
			System.out.print("메뉴 번호 :");
			
			int num = Integer.parseInt(sc.nextLine());
			
			switch(num) {
			case 1: saveScore(); break;
			case 2: readScore(); break;
			case 9: System.out.println("프로그램을 종료합니다."); return;
			default: System.out.println("잘못입력하셨습니다. 다시 입력해주세요.");
			}
			
		}
		
		
	}
	
	public void saveScore() {
		
		while(true) {
		
			int count = 1;
			
			System.out.println(count+"번 째 학생 정보 기록");
			System.out.print("이름 : ");
			String name = sc.nextLine();
			
			System.out.print("국어 점수 : ");
			int kor = Integer.parseInt(sc.nextLine());
			
			System.out.print("영어 점수 : ");
			int eng = Integer.parseInt(sc.nextLine());
			
			System.out.print("수학 점수 : ");
			int math = Integer.parseInt(sc.nextLine());
			
			int sum = (kor+eng+math);
			
			double avg = sum/3;
		
			scr.saveScore(name, kor, eng, math, sum , avg);
			
			count++;
			
			System.out.print("그만 입력하시려면 N 또는 n 입력, 계속 하시려면 아무 키나 입력하세요 : ");
			char a = sc.nextLine().charAt(0);
				if(a == 'n' || a == 'N') {
					return;
				}
		}
	}
	
	public void readScore() {
		
		int sumAll = 0;
		double avgAll = 0.0;
		int count = 0;
		
		try(DataInputStream dts = new DataInputStream(scr.readScore())){
			
			for(int i = 0; ; i++){
				
				String name = dts.readUTF();
				
				int kor = dts.readInt();
				int eng = dts.readInt();
				int math = dts.readInt();
				int sum = dts.readInt();
				double avg = dts.readDouble();
				
				System.out.println(name+" "+ kor+" "+ eng+" "+ math+" "+ sum+" "+ avg);
			    
				sumAll += sum;
				avgAll += avg;
				count++;
				
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("읽은 횟수 : 전체 합계 : 평균");
			System.out.println(count+" : "+sumAll+" : "+avgAll);
			
			
		}
			
		
		
	
	
		
				
		
		
		
	}


}
