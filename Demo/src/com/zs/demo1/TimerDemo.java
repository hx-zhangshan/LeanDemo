package com.zs.demo1;

import java.io.File;
import java.util.Timer;
import java.util.TimerTask;
/**
 * timer��timerTask
 *����������Ҫ�ǽ��У���ʱ����ġ�������������ӣ�����һ��������
 * @author cheney
 *
 */
public class TimerDemo {

	public static void main(String[] args) {
		timer1();
		File file=new File("");
		file.listFiles();
	}
	public static void timer1(){
		Timer timer=new Timer();
		 int dd=0;
		timer.scheduleAtFixedRate(new TimerTask() {
			
			@Override
			public void run() {
				System.out.println("�������������������������������������������ǿ�ʼ�ˡ�������������������������������������������");
				
			}
		}, 1000, 1000);
//		 timer.schedule(new TimerTask() {
//			
//			@Override
//			public void run() {
//				System.out.println("�������������������������������������������ǿ�ʼ�ˡ�������������������������������������������");
//				
//			}
//		}, 1000, 3000);
		 
		 new Thread(new Runnable() {
			
			@Override
			public void run() {
				try {
					Thread.sleep(6000);
					System.out.println("���Ǽ����˳�������������");
					System.exit(0);
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}
				
			}
		}).start();
	}
}
