package com.atguigu.springcloud.comfig;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author yuluyang
 * @date 2021/6/27 下午10:53
 * @since 1.0.0-SNAPSHOT
 */
@Configuration
public class GateWayComfig {

    @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder routeLocatorBuilder) {
        RouteLocatorBuilder.Builder routes = routeLocatorBuilder.routes();
        routes.route("path_route_atguigu", r -> r.path("/guonei")
                .uri("http://news.baidu.com/guonei"))
                .build();
        return routes.build();
    }

    @Bean
    public RouteLocator customRouteLocator2(RouteLocatorBuilder routeLocatorBuilder) {
        RouteLocatorBuilder.Builder routes = routeLocatorBuilder.routes();
        routes.route("path_route_atguigu2", r -> r.path("/guoji")
                .uri("http://news.baidu.com/guoji"))
                .build();
        return routes.build();
    }
}
