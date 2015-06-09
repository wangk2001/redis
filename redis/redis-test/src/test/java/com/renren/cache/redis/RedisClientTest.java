package com.renren.cache.redis;

import org.junit.Test;

public class RedisClientTest {

	@Test
	public void test() {
		RedisClient cl = new RedisClient();
		cl.setHashSet("112233", "123");
		System.out.println(cl.getHashSet("112233"));
	}

}
