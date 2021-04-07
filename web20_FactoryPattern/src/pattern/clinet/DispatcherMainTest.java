package pattern.clinet;

import pattern.action.Controller;
import pattern.factory.ControllerFactory;

public class DispatcherMainTest {

	public static void main(String[] args) {
		// 1.

		String command = "INSERT";
		ControllerFactory factory = ControllerFactory.getInstance(); // 공장을 가져오자
		
		Controller controller = factory.createController(command); // 공장에서 차를 만들자
		
		// 2.
		String path = controller.requestHandle();
		System.out.println(path);
		
		
		

	}

}
