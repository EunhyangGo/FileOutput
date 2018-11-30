package com.biz.printout;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class GradeToPrint03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String printFile = 
				 "D:/bizwork/workspace/FileOutput/gradeList.txt";
		// 파일 저장을 위한 객체 선언
		PrintWriter pw;
		
		try {
			// 파일 저장을 위한 객체 생성
			// = 파일을 저장하기 위해 open(create)
			pw = new PrintWriter(printFile);
			
			for(int i = 0; i < 30; i++) {
				pw.print(i+1); //학번 생성 후 기록 하기
				pw.print(":");
				
				// 1번 과목 점수
				pw.print((int)(Math.random()*100-50+1) + 50);
				pw.print(":");
				
				// 2번 과목 점수
				pw.print((int)(Math.random()*100-50+1) + 50);
				pw.print(":");
				
				// 3번 과목 점수
				pw.print((int)(Math.random()*100-50+1) + 50);
				pw.print(":");
				
				// 총점도 기록
				int intSum = (int)(Math.random()*100-50+1) + 50;
				
			}
			
			// 파일 저오 닫기 = 기록된 항목들이 파일에 저장된다.
			pw.close();
			System.out.println("Save Compelete");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
