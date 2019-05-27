package com.mkyong;

import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

// By default, Spring boot it loads property from application.properties, we can use @PropertySource to load other .properties files.
//@PropertySource("classpath:custom.properties")
@Component
@ConfigurationProperties
public class GlobalProperties {

	private Map<String, Object> hone = new HashMap<String, Object>();
	private Map<String, Object> batch = new HashMap<String, Object>();
	private Map<String, Object> integration = new HashMap<String, Object>();
	private Map<String, Object> biz = new HashMap<String, Object>();

	public Map<String, Object> getHone() {
		return hone;
	}

	public void setHone(Map<String, Object> hone) {
		this.hone = hone;
	}

	public Map<String, Object> getBatch() {
		return batch;
	}

	public void setBatch(Map<String, Object> batch) {
		this.batch = batch;
	}

	public Map<String, Object> getIntegration() {
		return integration;
	}

	public void setIntegration(Map<String, Object> integration) {
		this.integration = integration;
	}

	public Map<String, Object> getBiz() {
		return biz;
	}

	public void setBiz(Map<String, Object> biz) {
		this.biz = biz;
	}

	@Override
	public String toString() {
		return "GlobalHoneProperties [hone=" + hone + ", batch=" + batch + ", integration=" + integration + ", biz="
				+ biz + "]";
	}



}
