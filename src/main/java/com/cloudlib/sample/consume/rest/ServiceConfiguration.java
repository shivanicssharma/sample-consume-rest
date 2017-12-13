package com.cloudlib.sample.consume.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.Resource;

@Configuration
public class ServiceConfiguration {

    @Value("${cloudlib.team.ext-urls.some-url}")
    private String someUrl;
    
    @Value("classpath:jsonpayloads/Create-xx-Request.json")
    private Resource createXXRequestPayload;

    public String getSomeUrl() {
        return someUrl;
    }

    public void setSomeUrl(String someUrl) {
        this.someUrl = someUrl;
    }

    public Resource getCreateXXRequestPayload() {
        return createXXRequestPayload;
    }

    public void setCreateXXRequestPayload(Resource createXXRequestPayload) {
        this.createXXRequestPayload = createXXRequestPayload;
    }

    
}
