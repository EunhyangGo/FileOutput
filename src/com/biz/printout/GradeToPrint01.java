package com.biz.printout;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;


import com.biz.printout.vo.GradeVO;


public class GradeToPrint01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<GradeVO> gradeList = new ArrayList();
		
		//GradeVO(성적정보)를 저장하는
		
		// 성적 정보 30개를 생성하는 부분
		for(int i = 0 ; i < 30 ; i++) {
			
			// i 변수를 사용해서 학번을 문자열로 생성
			// i 변수 값에 1을 더해서 학번 1부터 30까지 만들어지도록 문자열로 변환하기 위해서 ""+, 숫자가 문자열로 변경댐
			String strNum = " "+(i+1);
			
			// 50부터 100까지 범위의 임의의 난수를 발생해서 각 과목의 점수를 임의로 생성
			int intKor = (int)(Math.random() *(100-50+1))+50;
			int intEng = (int)(Math.random()* (100-50+1))+50;
			int intMath = (int)(Math.random()* (100-50+1))+50;
			
			// 리스트에 성적정보를 추가 하기 위해서 한 학생의 성적 정보를 새로 생성
			GradeVO gradeVO = new GradeVO();
			
			//새로 생성된 학생의 성적 정보에 학번과 과목 점수를 setting
			gradeVO.setStrNum(strNum);
			gradeVO.setIntKor(intKor);
			gradeVO.setIntEng(intEng);
			gradeVO.setIntMath(intMath);
			
			// setting된 한 학생의 성적정보를 gradeList에 추가하는 것.
			gradeList.add(gradeVO);
			
		} //for end, 30명 학생의 성적 정보가 담긴 gradeLIst를 이제 확보(완료)
		/*
		 * 위에서 생성된 gradeList를 활용하여 ../gradeLIst.txt 파일을 생성하시오
		 * 각 라인의 구성은 학번:국어점수:영어점수:수학점수 형식으로 저장하시오.
		 */
		
		String printFile = 
				 "D:/bizwork/workspace/FileOutput/gradeList.txt";
		PrintWriter pw ;

	
		try {
			// printfile을 저장하기 위한 용도로 open(create)하고 관련 정보를 pw 저장해 놓는다.
			pw = new PrintWriter(printFile);
			// gradeList에 포함된 VO의 개수만큼 반복
			// 굳이 gradeList개수가 30개라고 표현하지 않고 gradeList.size() 메서드를 활용해서
			// 30이라는 값을 연산해서 추출
			for(int i = 0 ; i < gradeList.size(); i++) { 
				// gradeList로부터 get을 이용하여 vo를 추출
				// gradeList로 부터 i번째( i = 0 ~ 29)추출해서 GradeVO를 가져와 vo를 다시 생성하고 담는것.
				GradeVO vo = gradeList.get(i);
				
				// 추출된 vo에서 학번과 성적들을 다시 getter로 불러오기
				String strNum = vo.getStrNum();
				int intKor = vo.getIntKor();
				int intEng = vo.getIntEng();
				int intMath = vo.getIntMath();
			
				// vo로 부터 getter해서 임시 변수에 담아놓은 학번, 성적들을 파일에 기록
			pw.println(strNum+ ":"+intKor+":"+intEng+":"+intMath);
		}
			// 기록이 완료된 후 파일을 닫아서 완료
			pw.close();
			// 사용자에게 모두 완료 되었다는 메세지를 전달
			System.out.println("Save Compelete");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		}
	}

		
	}


