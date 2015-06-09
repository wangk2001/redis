package com.renren.cache.redis.subpub;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import redis.clients.jedis.JedisPubSub;

public class Subscriber extends JedisPubSub {

	private static Logger logger = LoggerFactory.getLogger(Subscriber.class);

	@Override
	public void onMessage(String channel, String message) {
		logger.info("Message received. Channel: {}, Msg: {}", channel, message);
	}

	@Override
	public void onPMessage(String pattern, String channel, String message) {
		logger.info("push message. pattern:{},Channel: {}, Msg: {}", pattern,
				channel, message);
	}

	@Override
	public void onSubscribe(String channel, int subscribedChannels) {
		logger.info("Subscribe. Channel: {}, sub channels: {}", channel,
				subscribedChannels);

	}

	@Override
	public void onUnsubscribe(String channel, int subscribedChannels) {
		logger.info("Unsubscribe. Channel: {}, sub channels: {}", channel,
				subscribedChannels);

	}

	@Override
	public void onPUnsubscribe(String pattern, int subscribedChannels) {
		logger.info("PUnsubscribe. pattern: {}, sub channels: {}", pattern,
				subscribedChannels);

	}

	@Override
	public void onPSubscribe(String pattern, int subscribedChannels) {
		logger.info("PSubscribe. pattern: {}, sub channels: {}", pattern,
				subscribedChannels);

	}
}