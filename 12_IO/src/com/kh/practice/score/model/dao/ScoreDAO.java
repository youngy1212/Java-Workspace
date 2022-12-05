package com.kh.practice.score.model.dao;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ScoreDAO {
	
	public void saveScore(String name, int kor, int eng, int math, int sum, double avg) {
		
		try(DataOutputStream dos = new DataOutputStream(new FileOutputStream("test.txt",true))){
//			dos.writeUTF(name);
//			dos.writeInt(kor);
//			dos.writeInt(eng);
//			dos.writeInt(math);
//			dos.writeInt(sum);
//			dos.writeDouble(avg);	
		
			String data = name+"\t"+kor+"\t"+eng+"\t"+math+"\t"+sum+"\t"+ avg;
			dos.writeUTF(data);
				
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	} catch (IOException e) {
		e.printStackTrace();
	}
	}

	public DataInputStream readScore() throws FileNotFoundException {
		
		DataInputStream dts = new DataInputStream(new FileInputStream("test.txt"));
			return dts;
			
	}

}
