package com.mkyong;

import java.util.HashMap;
import java.util.Map;

public class DataSourceConfigInfo {
	private String dataSourceType;
	private String key;// holder맵에 담을 key
    private String driverClassName;// org.postgresql.Driver
    private String jndi;// jdbc/bizDataSource01
    private String url;// jdbc;//postgresql;////localhost;//5432/devfwdb
    private String username;// fwapp
    private String password;// ENC(33cSwxJmy8LFNRCrPu4rMUMkddDDj13i)
    private String beanName;// bizDataSource01, bizDataSource02
    private String transactionManagerName;
    private boolean mybatisEnabled ;
    private String mapperLocations;
    private String mapperConfigLocation;
    private String sqlSessionFactoryName;
    private String sqlSessionTemplateName;
    private String namedParameterJdbcTemplate;
    private Map<String, String> pool = new HashMap<String,String>();


    public String getDataSourceType() {
		return dataSourceType;
	}

	public void setDataSourceType(String dataSourceType) {
		this.dataSourceType = dataSourceType;
	}


	public boolean isMybatisEnabled() {
		return mybatisEnabled;
	}

	public void setMybatisEnabled(boolean mybatisEnabled) {
		this.mybatisEnabled = mybatisEnabled;
	}

	public String getDriverClassName() {
        return driverClassName;
    }

    public void setDriverClassName(String driverClassName) {
        this.driverClassName = driverClassName;
    }

    public String getJndi() {
        return jndi;
    }

    public void setJndi(String jndi) {
        this.jndi = jndi;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public Map<String, String> getPool() {
        return pool;
    }

    public void setPool(Map<String, String> pool) {
        this.pool = pool;
    }

    public String getMapperLocations() {
        return mapperLocations;
    }

    public void setMapperLocations(String mapperLocations) {
        this.mapperLocations = mapperLocations;
    }

    public String getMapperConfigLocation() {
        return mapperConfigLocation;
    }

    public void setMapperConfigLocation(String mapperConfigLocation) {
        this.mapperConfigLocation = mapperConfigLocation;
    }

    public String getBeanName() {
        return beanName;
    }

    public void setBeanName(String beanName) {
        this.beanName = beanName;
    }


    public String getTransactionManagerName() {
        return transactionManagerName;
    }



    public void setTransactionManagerName(String transactionManagerName) {
        this.transactionManagerName = transactionManagerName;
    }


    public String getSqlSessionFactoryName() {
        return sqlSessionFactoryName;
    }

    public void setSqlSessionFactoryName(String sqlSessionFactoryName) {
        this.sqlSessionFactoryName = sqlSessionFactoryName;
    }

    public String getSqlSessionTemplateName() {
        return sqlSessionTemplateName;
    }

    public void setSqlSessionTemplateName(String sqlSessionTemplateName) {
        this.sqlSessionTemplateName = sqlSessionTemplateName;
    }

    public String getNamedParameterJdbcTemplate() {
        return namedParameterJdbcTemplate;
    }

    public void setNamedParameterJdbcTemplate(String namedParameterJdbcTemplate) {
        this.namedParameterJdbcTemplate = namedParameterJdbcTemplate;
    }

    public String getBeanName(String defaultBeanName) {
        return beanName==null || "".equals(beanName) ? defaultBeanName:beanName;
    }
    public String getTransactionManagerName(String defaultTransactionManagerName) {
        return transactionManagerName == null || "".equals(transactionManagerName) ? defaultTransactionManagerName : transactionManagerName ;
    }
    public String getSqlSessionTemplateName(String defaultName) {
        return sqlSessionTemplateName == null || "".equals(sqlSessionTemplateName) ? defaultName : sqlSessionTemplateName ;
    }
    public String getSqlSessionFactoryName(String defaultName) {
        return sqlSessionFactoryName == null || "".equals(sqlSessionFactoryName) ? defaultName : sqlSessionFactoryName ;
    }
    public String getNamedParameterJdbcTemplateName(String defaultName) {
        return namedParameterJdbcTemplate == null || "".equals(namedParameterJdbcTemplate) ? defaultName : namedParameterJdbcTemplate ;
    }

	@Override
	public String toString() {
		return "DataSourceConfigInfo [dataSourceType=" + dataSourceType + ", driverClassName=" + driverClassName
				+ ", jndi=" + jndi + ", url=" + url + ", username=" + username + ", password=" + password + ", key="
				+ key + ", beanName=" + beanName + ", transactionManagerName=" + transactionManagerName
				+ ", mybatisEnabled=" + mybatisEnabled + ", mapperLocations=" + mapperLocations
				+ ", mapperConfigLocation=" + mapperConfigLocation + ", sqlSessionFactoryName=" + sqlSessionFactoryName
				+ ", sqlSessionTemplateName=" + sqlSessionTemplateName + ", namedParameterJdbcTemplate="
				+ namedParameterJdbcTemplate + ", pool=" + pool + "]";
	}


}
