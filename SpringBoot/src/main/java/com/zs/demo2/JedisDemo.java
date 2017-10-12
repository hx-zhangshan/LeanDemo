package com.zs.demo2;

import org.junit.Test;

import redis.clients.jedis.Jedis;

/**
 * @author zhangS
 * @date 2017年8月9日下午2:49:18
 * @Email 260262911@qq.com
 */
public class JedisDemo {
	@Test
	public void getConn(){
		Jedis jedis=new Jedis("172.27.42.162", 6379);
		jedis.set("singleJedis", "hello Jedis");
		System.out.println(jedis.get("singleJedis"));
		jedis.close();
	}
}
