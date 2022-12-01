package com.kh.chap02_byte.run;

import com.kh.chap02_byte.model.dao.FileByteDao;

public class FileByteRun {

	public static void main(String[] args) {
		
		/*
		 * "바이트 기반 스트림"
		 * 바이트 스트림 : 1byte 단위로만 입출력 할 수 있는 좁은 통로(XXXInputStream/XXXoutputStream)
		 * 기반 스트림 : 외부매체와 직접적으로 연결되는 통로
		 * 
		 * "바이트 기반 스트림" : 외부매체를 지정하고 그 외부매체와 직접적으로 연결되는 1Byte 단위의 통로를 만들겠다.
		 * XXXINputStream : XXX매채로부터 데이터를 "입력" 받는 통로(외부매체로부터 데이터를 가지고 오겠다. 읽어오겠다)
		 * XXXOutputStream : XXX매채로부터 데이터를 "출력" 받는 통로(외부매체로부터 데이터를 내보내겠다. 쓰겠다)
		 * 
		 * 
		 */
		
		FileByteDao fbd = new FileByteDao();
		//fbd.fileSave();
		fbd.fileRead();
		

	}

}
