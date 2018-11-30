package com.biz.fileout;

import java.io.FileWriter;
import java.io.IOException;

public class FileWrite02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String printFile = 
				 "D:/bizwork/workspace/ExFlies/filew02.txt";
		FileWriter fw;
		try {
			// FileWriter는 두번째 매개변수에 true값을 ㅏ하면 파일을 append mode로 생성하고 
			// r기존 내용을 삭제하지 않고, 계속 추가한다
			
			// 만약 생략하면, 항상 세파일을 만들고 기존에 있었다면 모두 삭제된다.
			fw = new FileWriter(printFile);
			for(int i= 0; i <10 ; i++) {
				int rndNum = (int)(Math.random() *100)+1;
				fw.write("우리나라만세");
				
				fw.write(rndNum + "\r\n");
			}
			fw.close();
			System.out.println("파일 작성 완료");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
