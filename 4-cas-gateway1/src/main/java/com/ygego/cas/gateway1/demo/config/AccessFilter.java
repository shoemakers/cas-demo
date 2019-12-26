package com.ygego.cas.gateway1.demo.config;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.exception.ZuulException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * @Author: hongyuliu
 * @Date: 2019-12-26
 * @Version 1.0
 */
@Component
@Slf4j
public class AccessFilter extends ZuulFilter {

    @Override
    public String filterType() {

        return "pre";
    }

    @Override
    public int filterOrder() {

        return 0;
    }

    public boolean shouldFilter() {
        return true;
    }

    public Object run() throws ZuulException {
        log.info("执行了zuul的pre过滤器");
        return null;
    }
}
