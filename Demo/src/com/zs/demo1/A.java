package com.zs.demo1;
/**
 * @author zhangS
 * @date 2017年8月30日上午9:22:07
 * @Email 260262911@qq.com
 * @description 这简直就是一个万能的 返回值类型 太牛逼了
 * 
 */
public class A implements Gernertor<A> {

	@Override
	public A next() {
		
		return new A();
	}

}
