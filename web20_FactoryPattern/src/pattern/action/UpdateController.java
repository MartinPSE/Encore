package pattern.action;

public class UpdateController implements Controller{

	public String requestHandle() {
	
		System.out.println("UpdateController... Update logic... ");
		
		/*
		 * 
		 *  1. 폼값 받아서
		 *  2. VO 객체 생성
		 *  3. DAO 리턴 받아서
		 *  4. 비지니스 로직 호출
		 *  5. 바인딩
		 *  6. PATH를 리턴
		 * 
		 */
		
		
		return "update_result.jsp";
	}
	

}
