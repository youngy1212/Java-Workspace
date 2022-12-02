package com.kh.practice.file.dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileDAO {

	public boolean checkName(String file) {
		// new File(file).isFile();  파열 여부 판단. ture 있음 false 없음. 
		File check = new File(file);
		
		return check.exists();
		
		//경로.isFile() 경로가 file인지 확인 / .isDirectory()  경로가 directory 확인
		//경로.exists() 경로에 file이나 directory 가 존재하는지 확인.
		
	}
	
	public void fileSvae(String file, String s) {
		
		try(BufferedWriter fout = new BufferedWriter(new FileWriter(file))){
			fout.write(s);
			fout.flush(); // 혹시 모르니까 데이터 넘어갈수있게 flush
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public StringBuilder fileOpen(String file) {
		
		StringBuilder sb = new StringBuilder();
		try(BufferedReader br = new BufferedReader(new FileReader(file))){
			
			String value = null;
			while(( value = br.readLine()) != null){  //조건문에서  = 대입한 경우도 대입된것임.
				sb.append(value+"\n");
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return sb; //return은 무조건 조건문..try등등 밖으로 위치해야함. 
	}
	
	public void fileEdit(String file, String s) {
		
		try(BufferedWriter fout = new BufferedWriter(new FileWriter(file,true))){ //이어쓰기
			fout.write(s);
			fout.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
		
	
	
}
