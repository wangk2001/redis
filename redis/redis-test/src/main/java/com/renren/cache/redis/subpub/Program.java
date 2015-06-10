package com.renren.cache.redis.subpub;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

public class Program {

	public static final String CHANNEL_NAME = "commonChannel";

	private static Logger logger = LoggerFactory.getLogger(Program.class);

	public static void main(String[] args) throws Exception {

		JedisPoolConfig poolConfig = new JedisPoolConfig();

		JedisPool jedisPool = new JedisPool(poolConfig, "localhost", 6379, 0);



		Jedis publisherJedis = jedisPool.getResource();

		new Publisher(publisherJedis, CHANNEL_NAME).start();

		jedisPool.returnResource(publisherJedis);
	}
}