package com.zs.demo1;

import java.util.Set;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 场景需求
 * 计算三个学生的平均成绩
 * 1.每个同学 有三门成绩，
 * 2.分别计算出每个同学的平均成绩
 * 3.计算三个同学的平均成绩
 * 使用 CyclicBarrier 
 * 这个类的字面 意思就是 进行摸一个 瓶颈。。当到达瓶颈的时候继续执行别的
 * 举例子：
 * 一个导游带来是个团员，指定某一个地点集合。当所有的团员到达以后然后才能一起出发、。
 * 这玩意 实现线程。先运用 await之后当其他线程执行完毕之后，就会 调用自己的run方法。。。
 *
 * @author zs
 *
 */
public class Demo1 implements Runnable{

	//执行完设置的 执行设置的 线程，这里this制定的 是自己的线程。。
	private CyclicBarrier cb=new CyclicBarrier(3, this);
	//启动三个线程，设定一个线程池。
	private ExecutorService ex=Executors.newFixedThreadPool(4);
	//保存每个学生的 平均成绩 使用一个线程安全的 数据结构。
	private ConcurrentHashMap<String, Integer> ch=new ConcurrentHashMap<String, Integer>();
	
	public void count(){
		for (int i = 0; i < 3; i++) {
			ex.execute(new Runnable() {
			
			@Override
			public void run() {
				//先通过 随机数生成 每个学生的 平均成绩放进e
				
					int score=(int) (Math.random()*40+60);
					ch.put(Thread.currentThread().getName(), score);
					System.out.println(Thread.currentThread().getName()+"同学的成绩是："+score);
					try {
						//在这里等待。所有的同学都计算了 平均成绩。
						cb.await();
					} catch (InterruptedException | BrokenBarrierException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				
			});
		}
		
	} 
	
	@Override
	public void run() {
		int rs=0;
		//计算三个 同学的成绩
		Set<String> keySet = ch.keySet();
		for (String str : keySet) {
			rs+= ch.get(str);
			
		}
		System.out.println("三个同学的平均成绩是："+rs/3);
	}

	public static void main(String[] args) {
		new Demo1().count();
		System.out.println("已经结束了，看看退出去没有》》》》》》");
	}
}
