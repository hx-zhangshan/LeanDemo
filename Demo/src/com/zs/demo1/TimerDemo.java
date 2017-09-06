package com.zs.demo1;

import java.io.File;
import java.util.Timer;
import java.util.TimerTask;
/**
 * timer和timerTask
 *这两个类主要是进行，定时任务的。。。下面的例子，就是一个场景。
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
				System.out.println("————————————————————我们开始了——————————————————————");
				
			}
		}, 1000, 1000);
//		 timer.schedule(new TimerTask() {
//			
//			@Override
//			public void run() {
//				System.out.println("————————————————————我们开始了——————————————————————");
//				
//			}
//		}, 1000, 3000);
		 
		 new Thread(new Runnable() {
			
			@Override
			public void run() {
				try {
					Thread.sleep(6000);
					System.out.println("我们即将退出。。。。。。");
					System.exit(0);
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}
				
			}
		}).start();
	}
}
