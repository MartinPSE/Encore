package com.encore.cons;
/*
 *  1. ������ ( Constructor)
 *  ��ü�� �����ɶ����� ����(ȣ��) �Ǵ� ��. 
 *  2. �⺻ ������
 *  ::
 *  ���ڰ� ����
 *  {} �ȿ��� �ƹ��� ���۵� ���� �ʴ� ������. 
 *  
 */
public class Shirt {
	// 1. �ʵ� ���� 
	public String brandname;
	public double price;
	public boolean	 longSleeved;
	
	public Shirt () {
		// �ʵ� �ʱ�ȭ 

		
	}

	
	
	public String getDetails( ) {
		return brandname + ", "+ price +", " + longSleeved;
		
	}
}
