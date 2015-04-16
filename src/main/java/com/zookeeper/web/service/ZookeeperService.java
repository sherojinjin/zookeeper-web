package com.zookeeper.web.service;

import org.apache.zookeeper.WatchedEvent;
import org.apache.zookeeper.Watcher;
import org.apache.zookeeper.ZooKeeper;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class ZookeeperService implements InitializingBean,Watcher{
	
	@Value("connectString")
	private String connectString;
	@Value("sessionTimeout")
	private int sessionTimeout;
	
	private ZooKeeper zookeeper;
	

	@Override
	public void afterPropertiesSet() throws Exception {
		this.zookeeper=new ZooKeeper(connectString, sessionTimeout,this);
	}

	@Override
	public void process(WatchedEvent event) {
		
	}
	
	public ZooKeeper getZookeeper() {
		return zookeeper;
	}
	
}
