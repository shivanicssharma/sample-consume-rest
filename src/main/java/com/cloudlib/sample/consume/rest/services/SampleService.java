package com.cloudlib.sample.consume.rest.services;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.FileCopyUtils;
import org.springframework.util.StringUtils;
import org.springframework.web.client.RestTemplate;

import com.cloudlib.sample.consume.rest.ServiceConfiguration;

public class SampleService {
    
    @Autowired
    ServiceConfiguration serviceConfig;
    
    @Autowired
    private RestTemplate restTemplate;
    
    public Object createXXX(Object inputFromUI) throws IOException {
        
        byte[] bdata = FileCopyUtils.copyToByteArray(serviceConfig.getCreateXXRequestPayload().getInputStream());
        String requestPayloadStr = new String(bdata, StandardCharsets.UTF_8);
        /*
        requestPayloadStr = StringUtils.replace(requestPayloadStr, "FIELD1_VALUE", inputFromUI.getField1());
        requestPayloadStr = StringUtils.replace(requestPayloadStr, "FIELD2_VALUE", inputFromUI.getField2());
        */
        
        
        String responseStr = restTemplate.postForObject(serviceConfig.getSomeUrl(), requestPayloadStr, String.class);
        
//        XXObject responseObject = restTemplate.postForObject(serviceConfig.getFedIdpLocalUrl(), requestPayloadStr, XXObject.class);
        
        return null;
    }

}
