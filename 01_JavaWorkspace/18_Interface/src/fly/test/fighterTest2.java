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
	void goahead(); // �������̽����� ����ϰ� �Ǹ� --> ��������� powerful�� ����� ������ �ȴ�.
	
	
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
