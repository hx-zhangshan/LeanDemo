package com.zs.demo1;
/**
 * @author zhangS
 * @date 2017年8月30日上午9:13:18
 * @Email 260262911@qq.com
 * @description 这个类是一个 万能的 工厂 
 * 利用泛型 来进行实例化的创建
 */
public interface Gernertor<T>{
	T next();
}
