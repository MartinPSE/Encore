package com.encore.javadoc;
// Single Comment

/*
 * 
 * 
 *  Multi Line Comment
 *  
 *  
 */


/**
 * Documentation Comment
 * @author Hyeong Seok Oh
 * @since JDK 1.8.4 
 * @version [소스코드 버전 정보]...Source Code Version Level1
 */
public class JavaComment {
	/**
	 *  엔코아 아카데미에서 수강하는 학생의 이름
	 */
	public String name;
	/** 
	 * 엔코아 아카데미에서 수강하는 학생의 아이디
	 * 
	 */
	public int stuId;
	
	/**
	 * 
	 * @param java test score
	 * @param python test score
	 * @return result score of python and java
	 */
	public int scoreSum(int java, int python) { 
		return java + python;
		
	}
	
}

