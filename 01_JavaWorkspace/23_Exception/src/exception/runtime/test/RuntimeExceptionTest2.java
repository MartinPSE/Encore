package exception.runtime.test;

public class RuntimeExceptionTest2 {

	public static void main(String[] args) {
		// ��ü �������� �ʰ� ���������� ������ �� �߻��ϴ� ����
		 
		System.out.println("========= NullPointerException =======");
		String str = "Encrore";
		String str1 = "Encrore1";
		str = null;
		try {
		System.out.println(str.length()); // NullPointerException --> Error -->
		System.out.println(str.toString()); // �۵����� ���Ѵ�.
		} catch ( ArrayIndexOutOfBoundsException e ) {
			System.out.println("Error Catch!");
		} catch ( NullPointerException e1) {
			System.out.println("Error Catch!");
		} finally { // ���� �������(���ܰ� �߻��ϰ� ����, ���ܸ� ��� ����) ������ �� �κ��� ����ȴ�..}
			System.out.println("�޷ո޷�");
			// �� �κп� �� �ڵ带 ���߿� ����帮�ڽ��ϴ�!! 
		}
		
		System.out.println("��.");

	}

}
