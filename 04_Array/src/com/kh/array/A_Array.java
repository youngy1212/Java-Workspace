package com.kh.array;

import java.util.Scanner;

public class A_Array {
	/*
	 * 변수 : 하나의 공간에 하나의 값을 담을 수 있음
	 * 		ex) int a = 10;
	 * 			a = 20; //10->20으로 변경
	 * 
	 * 배열 : 하나의 공간에 여러개의 값을 담을 수 있음(단, 같은 자료형의 값으로만 가능)
	 * 		 정확히 이야기하자면 배열의 각 인덱스 자리에 실제값이 담김(인덱스 0부터 시작.)
	 * 		 예) int[] a = new int[3]; // int형의 자료가 들어갈수 있는 공간을 3개 만든다.
	 * 								  // 방,사물함 [0][1][2]을 3개만듬.
	 *								 // 인덱스는 항상 0부터 시작한다.(중요)
	 *								 // 배열의 크기는 3, 마지막 인덱스 = 2
	 *								// 배열의 크기 100, 마지막 인덱스 = 99
	 *								// 항상 크기 = n, 마지막 인덱스 = n-1	
	 */
	
	public void method1() {
		// 배열을 왜 써야할까?
		// 만약에 변수만을 가지고 프로그래밍을 하게되면
		// 0,1,2,3,4 기록을 해야함.
		/*
		 * 변수로 이용하여 각각의 데이터를 보관하고자 할때 -> 각각의 변수를 만들어서 따로 관리해야함.
		 * 
		 * int num1 = 0;
		 * int num2 = 1;
		 * int num3 = 2;
		 * int num4 = 3;
		 * int num5 = 4;
		 *
		 * 출력할때는 => 일일히 출력해야함. 반복문 사용 안됨
		 * for(int i =1; i<=5; i++){
		 *  	System.out.println(num+i);
		 *  } == >> 실행 안됨.
		 *  
		 *  1. 배열을 가지고 프로그램밍 하기
		 *  0, 1, 2, 3, 4 
		 *  
		 *  1) 배열 선언
		 *  [표현법] 
		 *  자료형 [] 배열명; 
		 *  자료형 배열명[];
		 *  int a; 변수
		 *  int[] a;//배열
		 *  int a[]; // 배열
		 *  
		 *  2) 배열 할당
		 *  이 배열에 몇개의 값들을 보관할건지 배열의 크기를 지정해주는 과정
		 *  지정한 갯수만큼 값이 등러갈 방이 생성됨.
		 *  [표현법]
		 *  배열명 = new 자료형[배열의 크기];
		 *  
		 *  a = new int[5];
		 */
	
		int [] arr = new int[5]; 
		int a;
		
		// System.out.println(a); // a는 선언만 되어있어서 오류
		// System.out.println(arr[0]); //선언이 되어있지 않아도 new로 힙메모리 들어가면서 일괄 0 초기화 되어있음.
		/*
		 *3. 배열의 각 인덱스(=방번호) 자리에 값 대입
		 * [표현법]
		 * 배열명[인덱스] = 값;
		 * 
		 * arr[0] = 0;
		 * arr[1] = 1;
		 * arr[2] = 2;
		 * arr[3] = 3;
		 * .... 
		 */
		
		// 배열의 가장 큰 장점 : 반복문 활용 가능
		for(int i =0; i<5; i++) {
			// 0 1 2 3 4
			arr[i] = i;
		}
		
		// 배열의 for 반복문을 활용해 값을 입력, 출력도 가능함
		for(int i = 0;i < 5; i++) {
			System.out.printf("%d번 인덱스의 값은 : %d\n",i,arr[i]);
		}
		
		//각각의 인덱스 값을 확인하기 위해서는 []블럭을 통해 내가 확인하고자 하는 인덱스(방번호)를 제시해줘야함.
		//arr 전체에 담겨있는 값을 확인하고 싶다면? 
		System.out.println(arr); //실제 arr이라는 값에는 주소값이 담겨있음
		// [I@1888ff2c 여기서 @기준으로 우측은 참조하고 있는 heap 영역의 주소값
		// [ : 배열임을 나타냄
		// I : int 자료형을 의미함.
		
		//array,java,util에 함수로 존재
	}

	
	public void method2() {
		
		int i = 10; // 일반변수. i라는 박스에 10이라는 값이 그냥 담겨있음. 
		// Stack 영역에 int i 라는 박스에 10이 들어가있음
		
		int[] arr = new int[5]; 
		// 배열 자료형
		/*
		 * 우선 대입연산자 기준으로 왼쪽이 먼저 실행되므로 arr 이라는 int형 배열 박스가 먼저 만들어짐(Stack영역에)
		 * 그 다음 int[5]짜리 방이 heap영역에 생성됨. (new 키워드가 붙은 녀석은 항상 heap영역에 값이 할당됨)
		 * 5칸 짜리 방이 만들어진 후에 각방에 기본값으로 (int 0으로)데이터가 초기화 되고, 주소값이 할당돔(0X123)
		 * 마지막으로 대입연산자가 실행되면서 주소값이 arr에 할당이 됨.
		 */
		System.out.println("i : "+i); // 10
		System.out.println("arr : "+arr); // [I@762efe5d // 주소값 16진수
		System.out.println("arr의 해시코드 값 : "+ arr.hashCode()); //1982791261 
		// 해시코드 : 주소값을 10진수의 형태로 변환한 것
	
		double[] dArr = new double[3];
		System.out.println(dArr); //[D@5d22bbb7
		System.out.println("dArr의 해시코드 값 : "+ dArr.hashCode());//1562557367
		
		/*
		 * 기본자료형(boolean, char, byte, short, int, long, float, double)
		 * => 실제 값(리터럴)을 바로 stack영역에 담을 수 있는 변수 => 일반변수
		 * 
		 * 그 외 자료형(int[], double[], short[],...., String, Scanner,..)
		 * => 주소값을 담고 있는 변수 => 참조 변수(레퍼런스 변수)
		 */
	}
	
	public void method3() {
		int[] iArr = new int[3]; // iArr[0] == 0
		double[] dArr = new double[3]; //dArr[0] == 0.0
		
		for(int i =0; i< iArr.length; i++) { // 0,1,2
			System.out.println(iArr[i]);
		}
		
		for(int i=0; i< dArr.length; i++) {
			System.out.println(dArr[i]);
		}
		/*
		 * 내가 각 인덱스 초기화하지 않았는데도 값들이 담겨있는 이유
		 * -> heap라는 영역에는 절대로 빈 공간이 존재할수 없기떄문.
		 * 따라서 jvm이 각 공간에 각 자료형의 기본값으로 초기화(대입)을 시켜줌
		 * 
		 * + 배열의 크기를 아는 방법 => 배열명.length
		 */
	}
	
	
	public void method4() {
		int[] arr = new int[5];
		
		// 각 배열의 인덱스에 값을 대입하는 반복문
		for(int i =0; i<arr.length; i++) {
			arr[i] = i+1; // arr[0] =1, arr[1]=2,arr[2]=3....
		}
		
		System.out.println(arr[4]);
		//System.out.println(arr[5]);  
		//ArrayIndexOutOfBoundsException 
		//배열의 인덱스 범위를 벗어남(오류)
		
	}
	
	public void method5() {
		
		int i = 0;
		String str = null;
		
		//int i2 = null; tpyeMissMatch -> null값을 int자료형에 넣을 수 없음.
		int[] arr =null; //null값 할당가능. 주소값을 담을 수 있는 변수의 기본값은 null;
		
		//System.out.println(arr.hashCode());// NullPointerException 오류. 주소값이 null이라.
		/*
		 * 기본값이 null인 변수를 가지고 메소드를 호출한다거나 특정 어딘가에 접근하고자 한다면
		 * 무조건 오류발생 -> NullPointerException
		 * ex) arr.hashCode(), arr.length
		 */
	}

	public void method6() {
		int[] arr = new int[5];
		
		/*
		 * arr[0] = 2;
		 * arr[1] = 4;
		 * arr[2] = 6;
		 * arr[3] = 8
		 * arr[4] = 10;
		 */
		
		for(int i=0; i<arr.length;i++) {
			arr[i] = (i+1)*2;
			System.out.printf("arr[%d] = %d\n",i,arr[i]);
		}
		/*
		 * 배열의 가장 큰 단점
		 * 한번 지정한 배열의 크기는 변경 불가능함.
		 * = > 배열의 크기를 변경하고자 한다면 어쩔수 없이 새로운 배열은 다시 만들어야함.
		 */
		System.out.println("=== arr 변경 전 ===");
		System.out.println(arr);
		System.out.println("arr의 해시코드 값 : "+arr.hashCode() );
		
		
		arr = new int[7]; // 7칸짜리 배열이 생성. // 있던 값은 전부 0으로 초기화 
		
		System.out.println("=== arr 변경 후 ===");
		System.out.println(arr);
		System.out.println("arr의 해시코드 값 : "+arr.hashCode() );
		
		/*
		 * 항상 고유한 주소값 부여, 기존에 생성되었던 주소와 절대로 겹치지 않음.
		 * 기존에 참조하고 있던, 연결이 끊기고 새로운 곳 참조
		 * 
		 * 연결이 끊어진 기존의 배열은 haep영역에 둥둥 떠다님
		 * 일정 시간이 지나고서도, 사용이 되지 않으면 " 가비지 컬렉터(GC)" 가 삭제시켜줌
		 * (자동 메모리 관리)
		 * = > 자바에서 자동메모리관리 특징. 개발자가 코드에만 신경쓸수 있게 해줌.
		 */

		//현재 연결되어있는 고리를 끊고자 할떄
		arr= null; // 아무것도 존재하지 않음을 의미
	}
		
	public void method7() {
		//배열 선언과 동시에 할당(크기 지정)
		int [] arr = new int[4];
		// 각 인덱스 값 초기화(대입)
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		arr[3] = 4;

		//배열 선언 및 동시에 초기화(대입) 까지 한번에 끝내는 방법 2가지
		//방법1.
		int[] arr1 = new int[] {1, 2, 3, 4};
		
		//방법2.
		int[] arr2 = {1,2,3,4}; 
		
		// 배열 비교
		System.out.println(arr1 == arr2); //false 
		// arr1 -> arr1의 heap영역의 "주소값"
		// arr2 -> arr2의 heap영역의 "주소값"
		// 주소값 == 주소값 : 주소값 간의 동등비교를 수행하기 때문에 false
	}
	
	public void method8() {
		//1.크기 10짜리 정수(int)배열 선언
		//2.반복문 활용해서 0번 인덱스부터 마지막인덱스까지 순차적으로 접근하면서 대입
		// 대입값은 랜덤값(1~100)
		//3.반복문을 활용해서 0번인덱스부터 ~ 마지막인덱스까지 배일에 담긴값출력. 
		// 출력예시) arr[x] : xx 입니다.
		
		int [] arr = new int[10];
		for(int i=0; i<arr.length; i++) {
			arr[i] = (int)(Math.random() * 100 + 1);
			System.out.printf("arr[%d] : %d 입니다.\n",i,arr[i]);
		}
	}
	public void method9() {
		//1.사용자에게 매번 키의 정보를 입력받은 후 해당 크기만큼 문자열 배열생성
		Scanner sc = new Scanner(System.in);
		System.out.print("배열의 길이 : ");
		int size = sc.nextInt();
		
		String[] arr = new String[size]; 
		
		//2. 반복문을 활용해서 매번 사용자에게 과일명을 입력받아 그 값을 매~인덱스 자리에 대입
		sc.nextLine();
		for(int i = 0; i<arr.length; i++) {
			System.out.print("좋아하는 과일 입력 : ");
			arr[i] = sc.nextLine();
		}
		for(int i =0; i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
	
	public void method10() {
		//사용자에게 문자열 하나를 입력받은 후
		// 각각의 문자들을 char 배열에 옮겨담기
		// 1. 사용자에게 문자열 입력받기
		// 2. cahr 배열 생성해두기 ( 배열 크기 == 문자열의 길이만큼)
		// 3. 문자열에서 각 인덱스별로 문자를 뽑아서 char배열의 각 인덱스에 담기
		//  문자열을 뽑는 방법 : 문자열.charAt(); // arr[0] = 문자열.charAt(0);
		// 4. char 배열의 각 인데스에 있는 값 출력하기
		
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 입력하기 : ");
		String str = sc.nextLine();
		
		char[] arr = new char[str.length()]; 
		
		for(int i =0; i <arr.length; i++) {
			arr[i] = str.charAt(i);
			System.out.printf("char %d : %s\n",i,arr[i]);
		}
	}
	
	public void method11() {
		//1. 사용자에게 배열의 길이를 입력받은 후, 해당 크기만큼 정수배열 생성
		Scanner sc = new Scanner(System.in);
		System.out.print("배열의 길이 : ");
		int num = sc.nextInt();
		int [] arr = new int[num];
		
		//2. 반복문을 활용해서 0번 ~ 마지막 인덱스까지 순차적으로 접근하면서 값을 대입
		//    -> 랜덤값
		
		for(int i =0; i<arr.length; i++) {
			arr[i] = (int)(Math.random() * 100 + 1);
		}
		
		//3. 반복문을 활용해서 0번 인덱스부터~ 마지막까지 배열에 담긴값 출력과 동시에 
		// 해당 인덱스에 담긴 값이 짝수인 경우 그 값들의 총합 구하기
		int sum = 0;
		for(int i =0; i<arr.length; i++) {
			System.out.printf("arr[%d] : %d\n",i,arr[i]);
			if(arr[i]%2 == 0) {
				sum += arr[i];
			}
		}System.out.println("짝수의 총 합은 :"+sum);
		
		
	}
	public void method12() {
		Scanner sc = new Scanner(System.in);
		
		double[] heights = new double[3];
		
		//1.  반복문을 활용해서  heights 배열의 0~ 마지막 인덱스까지 반복
		// 	  진행하면서 사용자로부터 키에 대한 정보를 입력받아 각 인덱스에 저장
		
		for(int index = 0; index < heights.length; index++) {
			System.out.print((index+1)+"번째 키(cm)를 입력하세요 : ");
			heights[index] = sc.nextDouble();
		}
		
		//2. 3명의 키에 대한 정보를 출력시키면서 동시에 모든 키에 대한 총합을 저장
		double sum = 0;
		for(int index = 0; index<heights.length; index++) {
			System.out.printf("%d번째 키는 : %.1f\n",(index+1),heights[index]);
			sum += heights[index];
		}
		
		//3. 3명의 키의 총합을 출력하고, 3명 키의 평균도 출력(단, 소숫점 첫재짜리까지 출력)
		System.out.printf("3명 키의 총합: %.1f \n3명 키의 평균 : %.1f ",sum,sum/3);
	}



}
