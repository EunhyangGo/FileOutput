package com.biz.fileout;

import java.io.FileWriter;
import java.io.IOException;

public class FileWrite05 {

	public static void main(String[] args) {
		String printFile = 
				 "D:/bizwork/workspace/ExFlies/filew05.txt";
		
		FileWriter fw;
		
		try {
			fw = new FileWriter(printFile);
			for(int i =0; i < 20; i++) {
				fw.write(i);
				fw.write(":");
				
				int rndNum = (int)(Math.random() *100)+1;
				fw.write(rndNum + "\r\n");
				fw.flush();
				// write된 내용을 즉시 파일에 저장하라.
				// 저장할 파일 내용이 많을 경우는 실행하는 속도가 느려진다.
			}
			System.out.println("기록 완료");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}

