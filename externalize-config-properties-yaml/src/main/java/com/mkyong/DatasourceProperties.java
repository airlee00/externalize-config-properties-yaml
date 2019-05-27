package com.mkyong;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

// By default, Spring boot it loads property from application.properties, we can use @PropertySource to load other .properties files.
//@PropertySource("classpath:custom.properties")
@Component
@ConfigurationProperties("spring.data")
public class DatasourceProperties {

    private List<DataSourceConfigInfo> datasource = new ArrayList<>();

	public List<DataSourceConfigInfo> getDatasource() {
		return datasource;
	}

	public void setDatasource(List<DataSourceConfigInfo> datasource) {
		this.datasource = datasource;
	}


}
