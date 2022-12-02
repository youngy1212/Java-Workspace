package com.kh.chap05_assist2.model.dao;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.kh.chap05_assist2.model.Phone;

public class ObjectsDao {
	
	public void fileSvae(String fileName){
		
		Phone[] arr = new Phone[3];
		
		arr[0] = new Phone("아이폰",15000000);
		arr[1] = new Phone("갤럭시",13000000);
		arr[2] = new Phone("플립폰",20000000);
		
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))) {
			
			for(int i =0; i<arr.length; i++) {
				oos.writeObject(arr[i]);
				
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}	
	
	
		public void fileRead() {
			
			try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("phoneList.txt"))) {
				
				while(true) {
					System.out.println(ois.readObject());
				} //java.io.EOFException 오류 발생. 문서의 끝에 도착했습니다. /예외처리
				//EOFException 발생 : End of File 의 약자
				//IOEException의 자식이기 때문에 다형성에 의해서 catch됨
				
				
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}catch(EOFException e){	
				System.out.println("파일을 다 읽었습니다.");
			} catch (IOException e) {
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
			
		}
		
		
	
	

}
