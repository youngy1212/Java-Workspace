package com.kh.practice.dimension;

import java.util.Arrays;
import java.util.Scanner;

public class DimensionPractice {
	
	Scanner sc = new Scanner(System.in);
	
	public void  practice1(){
		//3행 3열짜리 문자열 배열을 선언 및 할당하고
		//인덱스 0행 0열부터 2행 2열까지 차례대로 접근하여 “(0, 0)”과 같은 형식으로 저장 후 출력하세요
		
		String[][] arr = new String[3][3];
		
		for(int i =0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				arr[i][j]= "( "+ i +" , "+j+ " )";
			} 
			System.out.println(Arrays.toString(arr[i]));
		}
		
	}
	
	public void practice2(){
		//4행 4열짜리 정수형 배열을 선언 및 할당하고
		//1) 1 ~ 16까지 값을 차례대로 저장하세요.
		//2) 저장된 값들을 차례대로 출력하세요.
		
		int[][] arr = new int[4][4];
		
		int value = 1;
			for(int i =0; i<arr.length; i++) {
				for(int j=0; j<arr[i].length; j++) {
					arr[i][j] = value++;
					System.out.printf("%4d",arr[i][j]);
				}
				System.out.println();
			}	
	}
	public void printArray(int arr[][]) {
		for(int i =0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.printf("%3d",arr[i][j]); // 이렇게 외부에 출력 메소드를 만들어서 불러오기 가능
			}System.out.println();
		}
	}	
	
	
	public void practice3(){
		//4행 4열짜리 정수형 배열을 선언 및 할당하고
		//1) 16 ~ 1과 같이 값을 거꾸로 저장하세요.
		//2) 저장된 값들을 차례대로 출력하세요.
		
		int[][] arr = new int[4][4];
		int value  = 16;
			for(int i =0; i<arr.length; i++) {
				for(int j=0; j<arr[i].length; j++) {
					arr[i][j] = value--;
					System.out.printf("%4d",arr[i][j]);
			}
				System.out.println();
			}	
			
			printArray(arr);
	}
	
	public void practice4(){
		//4행 4열 2차원 배열을 생성하여 0행 0열부터 2행 2열까지는 1~10까지의 임의의 정수 값 저장 후
		//아래의 내용처럼 처리하세요
		int[][] arr = new int[4][4];
			int sum2 =0;
			
			//1~2행 랜덤값
			for(int i =0; i<3; i++) {
				int sum1 = 0;
				for(int j=0; j<3; j++) {
					arr[i][j] = (int)(Math.random()*10+1);
					sum1 += arr[i][j];
				}  
					//행 합
					arr[i][3] = sum1;
					sum2 += sum1;
			}
			//열 합
			for(int i =0; i<3; i++) {
					arr[3][i]= arr[0][i]+arr[1][i]+arr[2][i];
					sum2 += arr[3][i];
			} arr[3][3] = sum2;
			
			
			//출력
			for(int i =0; i<arr.length; i++) {
				for(int j=0; j<arr[i].length; j++) {
					System.out.printf("%4d",arr[i][j]);
				}System.out.println();
			
			}
			
			 //풀이
			 int[][] arr2 = new int[4][4];
			 for(int i = 0; i<arr2.length-1; i++){
					for(int j =0; j<arr2.length-1; j++){
					arr2[i][j] = (int)(Math.random()*10+1);
					
			 		arr2[i][3] += arr2[i][j];//각 행의 모든값
					arr2[3][j] += arr2[i][j];//각 열의 모든값.
			
					arr2[3][3] += arr2[i][j]*2;// 가로 세로의 총합
					}
					
			} printArray(arr2);
		
	}
	
	public void practice5(){
		//2차원 배열의 행과 열의 크기를 사용자에게 직접 입력받되, 1~10사이 숫자가 아니면
		//“반드시 1~10 사이의 정수를 입력해야 합니다.” 출력 후 다시 정수를 받게 하세요.
		//크기가 정해진 이차원 배열 안에는 영어 대문자가 랜덤으로 들어가게 한 뒤 출력하세요.
		//(char형은 숫자를 더해서 문자를 표현할 수 있고 65는 A를 나타냄
		
		while(true) {
			System.out.print("행 크기 :");
			int row = sc.nextInt();
		
			System.out.print("열 크기 :");
			int col = sc.nextInt();
		
			if(!(row <= 10 && 1 <= row && col <= 10 && 1 <= col)){
				System.out.println("반드시 1~10사이의 정수를 입력하세요.");
				continue;
			}
		
			char[][] arr = new char[row][col];
		
			for(int i =0; i<row; i++) {
				for(int j=0; j<col; j++) {
					arr[i][j] = (char)(Math.random()*25+65);
					System.out.printf("%2c",arr[i][j]);
				}System.out.println();
			} //printArray(arr); 에러 => int로 정의되어있음 but 보내는 데이터틑 char라서
			break;
		}
	}
	
	public void practice6(){
		String[][] strArr = new String[][] {{"이", "까", "왔", "앞", "힘"}, {"차", "지", "습", "으", "냅"}, {"원", 
			"열", "니", "로", "시"}, {"배", "심", "다", "좀", "다"}, {"열", "히", "! ", "더", "!! "},{"..", "..", "..", "..", ".."}};
	
			for(int i = 0; i<strArr[0].length; i++) {
				for(int j = 0; j < strArr.length; j++) {
					System.out.print(strArr[j][i]+" ");
				}
			}	
	}
	
	public void practice7(){
		//사용자에게 행의 크기를 입력 받고 그 수만큼의 반복을 통해 열의 크기도 받아
		//문자형 가변 배열을 선언 및 할당하세요.
		//그리고 각 인덱스에 ‘a’부터 총 인덱스의 개수만큼 하나씩 늘려 저장하고 출력하세요.
		
		System.out.print("행의 크기: ");
		char[][] arr = new char[sc.nextInt()][];
		
		for(int i =0; i<arr.length; i++) {
			System.out.print(i+"행의 열 크기 :");
			arr[i] = new char[sc.nextInt()];
		} 
		
		char vaule = 'a';
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				arr[i][j] = vaule;
				if(vaule == 'z') {
					vaule = 'a'; // z를 넘어가면 다시 a로 back;
				} else {
					vaule++;
				}
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	public void practice8(){
		//1차원 배열에 12명의 학생들을 출석부 순으로 초기화 하고
		//2열 3행으로 2차원 배열 2개를 이용하여 분단을 나눠
		//1분단 왼쪽부터 오른쪽, 1행에서 아래 행 순으로 자리를 배치하세요
		
		String[] arr = {"강건강", "남나나" ,"도대담","류라라","문미미","박보배",
				"송성실" , "윤예의", "진재주" , "차천축" , "피풍표" , "홍하하"};
		
		int count = 0;
		
		String[][] strArr1 = new String[3][2];
		
		System.out.println("== 1분단 ==");
		for(int i = 0; i< strArr1.length; i++) {
			for(int j =0; j<strArr1[i].length; j++) {
				strArr1[i][j] = arr[count++];
				System.out.print(strArr1[i][j]+" ");		
			} System.out.println();
		}
			
		String[][] strArr2 = new String[3][2];
		System.out.println("== 2분단 ==");
		for(int i = 0; i< strArr2.length; i++) {
			for(int j =0; j<strArr2[i].length; j++) {
				strArr2[i][j] = arr[count++];
				System.out.print(strArr2[i][j]+" ");		
			} System.out.println();
		}
		
		
		System.out.print("검색할 학생 이름을 입력하세요 : ");
		String name = sc.nextLine();
		int a = 99;
		
		for(int i = 0; i< arr.length; i++) {
			if(name.equals(arr[i])) {
				a = i;
			}
		}	
		
		if(a < 6) {
			System.out.println("검색하신 "+ name + " 학생은 1분단 " + (a<=1 ? "첫 번째 줄": 
				(a <= 3) ? "두 번쨰 줄": "세 번째줄")+ (a%2 == 1 ? " 오른쪽에":" 왼쪽에")+" 있습니다.");
		}else if(a < 12) {
			System.out.println("검색하신 "+ name + " 학생은 2분단 " + (a<=7 ? "첫 번째 줄": 
				(a <= 9) ? "두 번쨰 줄": "세 번째줄")+ (a%2 == 1 ? " 오른쪽에":" 왼쪽에")+" 있습니다.");
		}
		
	}
	
	public void practice9() {
		String[] arr = {"강건강", "남나나" ,"도대담","류라라","문미미","박보배",
				"송성실" , "윤예의", "진재주" , "차천축" , "피풍표" , "홍하하"};
		
		int count = 0;
		
		String[][] strArr1 = new String[3][2];
		
		System.out.println("== 1분단 ==");
		for(int i = 0; i< strArr1.length; i++) {
			for(int j =0; j<strArr1[i].length; j++) {
				strArr1[i][j] = arr[count++];
				System.out.print(strArr1[i][j]+" ");		
			} System.out.println();
		}
			
		String[][] strArr2 = new String[3][2];
		System.out.println("== 2분단 ==");
		for(int i = 0; i< strArr2.length; i++) {
			for(int j =0; j<strArr2[i].length; j++) {
				strArr2[i][j] = arr[count++];
				System.out.print(strArr2[i][j]+" ");		
			} System.out.println();
		}
		
		//수업 풀이
		System.out.print("검색할 학생의 이름을 입력하세요 : ");
		String name = sc.nextLine();
		
		char[] line = {'첫', '두','세'};
		
		for(int i = 0; i<strArr1.length; i++) {
			for(int j=0; j<strArr1[i].length; j++) {
				if(strArr1[i][j].equals(name)) {
					System.out.printf("검색하신 %s 학생은 1분단 %c번째 줄 %s쪽에 있습니다. ",name,line[i], j==0? "왼" : "오른");
				}
			}
		}
		
		for(int i = 0; i<strArr2.length; i++) {
			for(int j=0; j<strArr2[i].length; j++) {
				if(strArr2[i][j].equals(name)) {
					System.out.printf("검색하신 %s 학생은 2분단 %c번째 줄 %s쪽에 있습니다. ",name,line[i], j==0? "왼" : "오른");
				}
			}
		}
		
		
	}
		
}

