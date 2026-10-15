package com;

	class MyThread extends Thread{
		MyThread(ThreadGroup g,String name){
			super(g,name);
		}
		public void run() {
			System.out.println(Thread.currentThread().getName());
			try {
				Thread.sleep(2000);
				
			}
			catch(InterruptedException e) {}
		}
	}
	class a{
		a(){
			System.out.println("this is parent");
		}
	}
	class b extends a{
		b(){
			//
			super();
			System.out.println("this is child");
		}
	}
public class myapp {
	
	public static void main(String[]args) throws InterruptedException {
		
		ThreadLocal l=new ThreadLocal();
		l.set(293);
		l.set(34);
		//l.set("gaurjnsj");
		
		System.out.print(l.get());
		//b ab=new b();
//		ThreadGroup g1=new ThreadGroup("parent");
//		ThreadGroup g2=new ThreadGroup("child");
//		MyThread t1=new MyThread(g1,"child Thread1");
//		MyThread t2=new MyThread(g2,"child Thread2");
//		t1.start();
//		t2.start();
//		System.out.println(g1.activeCount());
//		Thread.sleep(5000);
//		System.out.println(g1.activeCount());
//		System.out.println("end");
	}
}
