package fly.child;

import fly.parent.Flyer;

public class Bird implements Flyer{

	@Override
	public void fly() {
		System.out.println("Bird... fly");
		
	}

	@Override
	public void land() {
		System.out.println("Bird... land...");
		
	}

	@Override
	public void take_off() {
		System.out.println("Bird...take_off");
		
	}
	
	// 자식만의 메소드... 
	
	public String layEggs() {
		return "새가 알을 까다";
	}
	
	
	
	
}
