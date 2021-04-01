package com.encore.datatype;

/*
 * 1. �ʵ� 
 *    int ������,  char �÷�, float ����, String ����ȸ��, String ���� 
 *    ��ũ��ġ ���θ� �˼� �ִ� �ʵ带 �߰�
 * 
 * 2. �޼ҵ�(Python���� �Լ��� ���� ����)
 * 		2�� ����
 * 			- ���� Test Ŭ�������� �޾Ƽ� �ʵ忡 �Է��ϴ� ���
 * 			- �ʵ忡 �Էµ�, ����� ���� �ֿܼ� ���
 * 
 *** ����(Variable)�� ���Ǵ� ��ġ�� ���� Field �� Local V�� ���еȴ�.
 *     �ʵ� --> Ŭ���� ���� �ٷ� ��, �޼ҵ� ��� �ٱ�
 *     Local V(��������) --> Method ���ο����� ����  
 */
public class WhiteBoard {
	public int size;
	public char color;
	public float price;
	public String company;
	public String material;
	public boolean scratch;
	
	public void setInfo(int size, char color, float price, String company, String material, boolean scratch) {
		// �ʵ�� ���ú����� �̸��� ������, �����ϱ� ���ؼ� �ʵ�տ� this�� ���δ�.
		// this�� �ش�Ŭ���� '�ڱ��ڽ�' �ؼ�.
		this.size = size;
		this.color =color;
		this.price = price;
		this.company = company;
		this.material = material;
		this.scratch = scratch; 
	
	}
	public void printInfo() {
		System.out.println(size + "\t" + color + "\t" + price +"\t" + company + "\t" + material + "\t" + scratch ) ;
		
	}
	

}
