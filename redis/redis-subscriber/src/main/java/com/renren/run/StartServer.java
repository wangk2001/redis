package com.renren.run;

import org.apache.log4j.PropertyConfigurator;

import com.renren.cache.redis.subpub.Program;

public class StartServer {

	public void start(String[] args) {
		Program.startSub();
	}

	public static void main(String[] args) {
		PropertyConfigurator.configure("conf/log4j.properties");

		StartServer st = new StartServer();
		st.start(args);
	}
}
