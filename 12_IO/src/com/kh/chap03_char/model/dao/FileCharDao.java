package com.kh.chap03_char.model.dao;

import java.io.*;

public class FileCharDao {
	
	//프로그램 --> 외부매체(파일)

	public void fileSave() {
		//FileWriter : 파일로 데이터를 2byte단위로 출력하는 스트림
		
		FileWriter fw = null;
		
		try {
			fw = new FileWriter("b_char.txt");
			fw.write("와! IO 재밌다. \n");
			fw.write('A');
			fw.write(' ');
			
			char[] cArr = {'a','p','p','l','e'};
			fw.write(cArr);
			fw.flush(); // 버퍼에 잔류하는 모든 문자열 출력. 
			
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	//프로그램 <-- 외부매체(파일)
	public void fileRead() {
		//FileReader : 파일로부터 데이터를 2byte 단위로 입력받는 스트림
		FileReader fr = null;
		
		try {
			fr = new FileReader("b_char.txt");
			
//			System.out.println(fr.read());
//			System.out.println(fr.read());
//			System.out.println(fr.read());
//			System.out.println(fr.read());
//			System.out.println(fr.read());
//			System.out.println(fr.read());
//			System.out.println(fr.read());
//			System.out.println(fr.read());
//			System.out.println(fr.read());
//			System.out.println(fr.read());
//			System.out.println(fr.read());
//			System.out.println(fr.read());
//			System.out.println(fr.read());
//			System.out.println(fr.read());
			
			int value = 0;
			while((value = fr.read())!= -1) {
				System.out.println((char)value);
			}
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
	
}
