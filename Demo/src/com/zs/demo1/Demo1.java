package com.zs.demo1;

import java.util.Set;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * ��������
 * ��������ѧ����ƽ���ɼ�
 * 1.ÿ��ͬѧ �����ųɼ���
 * 2.�ֱ�����ÿ��ͬѧ��ƽ���ɼ�
 * 3.��������ͬѧ��ƽ���ɼ�
 * ʹ�� CyclicBarrier 
 * ���������� ��˼���� ������һ�� ƿ������������ƿ����ʱ�����ִ�б��
 * �����ӣ�
 * һ�����δ����Ǹ���Ա��ָ��ĳһ���ص㼯�ϡ������е���Ա�����Ժ�Ȼ�����һ���������
 * ������ ʵ���̡߳������� await֮�������߳�ִ�����֮�󣬾ͻ� �����Լ���run����������
 *
 * @author zs
 *
 */
public class Demo1 implements Runnable{

	//ִ�������õ� ִ�����õ� �̣߳�����this�ƶ��� ���Լ����̡߳���
	private CyclicBarrier cb=new CyclicBarrier(3, this);
	//���������̣߳��趨һ���̳߳ء�
	private ExecutorService ex=Executors.newFixedThreadPool(4);
	//����ÿ��ѧ���� ƽ���ɼ� ʹ��һ���̰߳�ȫ�� ���ݽṹ��
	private ConcurrentHashMap<String, Integer> ch=new ConcurrentHashMap<String, Integer>();
	
	public void count(){
		for (int i = 0; i < 3; i++) {
			ex.execute(new Runnable() {
			
			@Override
			public void run() {
				//��ͨ�� ��������� ÿ��ѧ���� ƽ���ɼ��Ž�e
				
					int score=(int) (Math.random()*40+60);
					ch.put(Thread.currentThread().getName(), score);
					System.out.println(Thread.currentThread().getName()+"ͬѧ�ĳɼ��ǣ�"+score);
					try {
						//������ȴ������е�ͬѧ�������� ƽ���ɼ���
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
		//�������� ͬѧ�ĳɼ�
		Set<String> keySet = ch.keySet();
		for (String str : keySet) {
			rs+= ch.get(str);
			
		}
		System.out.println("����ͬѧ��ƽ���ɼ��ǣ�"+rs/3);
	}

	public static void main(String[] args) {
		new Demo1().count();
		System.out.println("�Ѿ������ˣ������˳�ȥû�С�����������");
	}
}
