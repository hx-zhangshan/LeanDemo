package com.zs.demo1;
/**
 * @author zhangS
 * @date 2017��8��30������9:22:07
 * @Email 260262911@qq.com
 * @description ���ֱ����һ�����ܵ� ����ֵ���� ̫ţ����
 * 
 */
public class A implements Gernertor<A> {

	@Override
	public A next() {
		
		return new A();
	}

}
