package com.biz.fileread.exec;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import com.biz.fileread.vo.WordVO;

public class WordExec07 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String readFile = 
				"D:/bizwork/workspace/ExFiles/영단어.txt";
		
		List<WordVO> wordVO = new ArrayList();
		
		FileReader fr;
		BufferedReader buffer;
		
		try {
			fr = new FileReader(readFile);
			buffer = new BufferedReader(fr);
			
			while(true) {
				String strWord = buffer.readLine();
				if(strWord == null)break;
				
				String[] strWords = strWord.split(":");
				
				WordVO vo = new WordVO();
				vo.setStrEng(strWords[0]);
				vo.setStrKor(strWords[1]);
				
				wordVO.add(vo);
			}
			buffer.close();
			fr.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Scanner scanner = new Scanner(System.in);
		int intPass = 0;
		int intFail = 0;
		
		while(true) {
			Collections.shuffle(wordVO);
			
			WordVO vo = wordVO.get(0);
			
			int wordCount = wordVO.size();
			int intIndex = (int)(Math.random()*wordCount);
			
			vo = wordVO.get(intIndex);
			
			System.out.println("다음 풀이에 맞는 단어를 입력하세요");
			System.out.println(vo.getStrKor());
			System.out.print(">> ");
			System.out.println("단어(종료하려면 --END)>>");
			
			String inputEng = scanner.nextLine();
					if(inputEng.equals("--END")) {
						 if(intPass<5) {
						System.out.println("5개는 맞춰야지....");
					    System.out.println("계속 gogogogogo");
					    System.out.println("↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓");
					    System.out.println();
						continue;
				}
			 }
			 if(intPass>5) {
					if(inputEng.equals("--END"));
					break;
				}
		
			if(inputEng.equalsIgnoreCase(vo.getStrEng())) {
				System.out.println("참 잘했어요!!!!");
				intPass++;
			}else
				System.out.println("땡!!!");
			    System.out.println(vo.getStrEng());
			    intFail++;
		}	    
			    System.out.println("========================");
			    System.out.println("맞은 개수 : " + intPass);
			    System.out.println("틀린 개수: " + intFail);
			    System.out.println("========================");
			    	
			    
			
	
		
		System.out.println("Game Over");
	
	}

	
}

