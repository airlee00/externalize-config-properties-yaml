package com.mkyong;

import java.util.Map;
import java.util.Properties;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WelcomeController {

    private static final Logger logger = LoggerFactory.getLogger(WelcomeController.class);

    private AppProperties app;
    private GlobalProperties global;
    private DatasourceProperties datasourceProperties;


    @Autowired
    public void setApp(AppProperties app) {
        this.app = app;
    }

    @Autowired
    public void setGlobal(GlobalProperties global) {
        this.global = global;
    }

    @Autowired
    public void setDatasourceProperties(DatasourceProperties datasourceProperties) {
		this.datasourceProperties = datasourceProperties;
	}

	@RequestMapping("/")
    public String welcome(Map<String, Object> model) {

        String appProperties = app.toString();
        String globalProperties = global.toString();

        Map<String, Object> p = global.getHone();
        
        Properties p2 = new Properties();
        p2. putAll(p);

        logger.debug("Welcome {}, {}", app, global);

        System.out.println("================>" + datasourceProperties.getDatasource());
        System.out.println("================>" + p2);
        model.put("message", appProperties + globalProperties);
        return "welcome";
    }

}