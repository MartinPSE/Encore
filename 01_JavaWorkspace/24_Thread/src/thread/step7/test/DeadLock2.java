package thread.step7.test;
public class DeadLock2 implements Runnable{

	StringBuffer sb1,sb2;

	public DeadLock2(StringBuffer sb1, StringBuffer sb2){
		this.sb1 = sb1;
		this.sb2 = sb2;
	}

	public void run(){
		synchronized(sb2){ 
				sb2.append("A");
				try{
				Thread.sleep(1000);
				}catch(InterruptedException e){}
				
				synchronized(sb1){
					sb1.notify(); // 이때까지 기다려!! --> 그리고 일어나라!! 
					sb1.append("B");
                    System.out.println(sb1);
                    System.out.println(sb2);
                }
       }
   }			
}