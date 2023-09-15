package org.task;

public class Loop {
	public void q1() {
		
		for(int i=5;i>0;i--) {
			for(int j=1;j<i;j++)
			{
			 System.out.print(j+" ");	
			}
			System.out.println();
		}
//		for(int i=1;i<5;i++)
//		{
//			int a=1;
//			for(int j=5;j>i;j--)
//			{
//				System.out.print(a);
//				a++;
//			}
//			System.out.println();
//		}
		
	}
	public void q2() {
		
		for(int i=1;i<5;i++) {
			
			for(int j=1;j<5;j++)
			{
			 System.out.print(i*5+" ");	
			}
			System.out.println();
			}
		}
	


	public static void main(String[] args) {
	Loop l=new Loop();
	l.q1();
	l.q2();
	}
		
}
