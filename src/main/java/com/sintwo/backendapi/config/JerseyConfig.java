package com.sintwo.backendapi.config;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

@Component
public class JerseyConfig extends ResourceConfig {

    public JerseyConfig() {
        //注册类的方式
        //register(Demo.class);

        //注册包的方式
		packages("com.sintwo.backendapi.routes");
    }
}