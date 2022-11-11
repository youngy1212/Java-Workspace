package com.KH.name.run;

import com.KH.name.MyName; //자바파일 풀네임 : 패키치명 + 클래스이름 //다른곳 명령어 불러올떄 import 사용 

public class Run {

	
	public static void main(String[] agrs) {
		// 자바 == 동등함 = 값을 대입할떄 사용
		
		MyName mn = new MyName();
		
		mn.callMyName();//실행시키려면() 이거 무조건 있어야함. //The method callMyName() is undefined for the type Run(콜마이네임인 run안에 없음)-> mn으로 위치표현으로 해결
		
		
	
		
		//myname은 사용할 수 없다. MyName cannot be resolved to a type 
		// myname을 사용하기 위해 import를 사용해 run에서 사용할 수 있도록 가져와야함.
		
		

		
	}

}
