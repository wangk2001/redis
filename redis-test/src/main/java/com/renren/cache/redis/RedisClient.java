package com.renren.cache.redis;

import redis.clients.jedis.Jedis;

public class RedisClient {

	private Jedis jedis;
	
	public RedisClient(){
		this.jedis = new Jedis("localhost", 6379);
	}
	
	public void setHashSet(String name,String value){
		this.jedis.set(name, value);
	}
	
	public Object getHashSet(String name){
		return this.jedis.get(name);
	}
	
}
