package com.kh.chap05_assist2.model.run;

import com.kh.chap05_assist2.model.dao.ObjectsDao;
import com.kh.chap05_assist2.model.dao.objectDao;

public class ObjectRun {

	public static void main(String[] args) {

		objectDao od = new objectDao();
		
		//od.fileSave("phone.txt"); //객체단위로 기록되어있기 때문에 깨져서보이지만, 제대로 기록된것.
		//od.fileRead();
		
		ObjectsDao ods= new ObjectsDao();
		ods.fileSvae("phoneList.txt");
		ods.fileRead();
		
	}

}
