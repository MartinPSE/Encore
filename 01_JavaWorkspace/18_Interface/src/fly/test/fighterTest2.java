package fly.test;

interface Movable{
	void move(int x, int y);
	
	
}

interface Attackable {
	void attack(Unit u);
}

class Unit{
	int currentHP;
	int x;
	int y;
	
}

interface Fightable extends Movable, Attackable {
	void goahead(); // 인터페이스들을 상속하게 되면 --> 결과적으로 powerful한 기능을 가지게 된다.
	
	
}

class Fighter implements Fightable {
	public static final int DEFAULT_X = 0;
	public static final int DEFAULT_Y = 0;
	

	@Override
	public void move(int x, int y) {
		int x1 = DEFAULT_X;
		int y1 = DEFAULT_Y;
		
		x1++;
		y1++;

	}

	@Override
	public void attack(Unit u) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void goahead() {
		// TODO Auto-generated method stub
		
	}
	
}

public class fighterTest2 {

	public static void main(String[] args) {

	}

}
