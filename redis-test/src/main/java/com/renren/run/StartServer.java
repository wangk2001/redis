package com.renren.run;

import org.apache.log4j.PropertyConfigurator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.renren.cache.redis.subpub.Program;

public class StartServer {

	Logger log = LoggerFactory.getLogger(getClass());

	private void start(String[] args) throws Exception {
		log.info("start server");
		Program.main(args);
	}

	public static void main(String[] args) throws Exception {

		PropertyConfigurator.configure("conf/log4j.properties");
		StartServer startServer = new StartServer();
		startServer.start(args);
	}
}
