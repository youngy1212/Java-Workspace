package com.kh.chap05_assist2.model.dao;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.kh.chap05_assist2.model.Phone;

public class objectDao {

	//프로그램 ==> 파일(출력)
	public void fileSave(String fileName) {
		
		Phone ph = new Phone("아이폰",10000000);
		
		//객체단위로 파일에 입, 출력하고자 할때 필요한 스트림
		//FileOutputStram : 파일에 데이터를 출력하는 " 기반" 스트림
		//ObjectOutputStram : 객체 단위로 출력할수 있도록 도와주는 보조 스트림
		
		
	try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))){
		oos.writeObject(ph);
	} catch(FileNotFoundException e) {
		e.printStackTrace();
	}catch(IOException e) {
		e.printStackTrace();
	}
		
	}
	
	
	public void fileRead() {
		//FileInputStream : 파일로부터 데이터를 읽어드리기 위해 사용되는 기반 스트림
		//ObjectInputStream : 스트림으로부터 객체단위로 데이터를 입력받기 위해 사용되는 보조 스트림.
		
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("phone.txt"))){
			
			Phone p = (Phone)ois.readObject();
			System.out.println(p);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}

	
	
	
}
