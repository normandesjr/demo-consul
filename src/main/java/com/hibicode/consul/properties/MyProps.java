package com.hibicode.consul.properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

@Component
@RefreshScope
public class MyProps {

    @Value("${xpto}")
    private String xpto;

    public String getXpto() {
        return xpto;
    }
}
