package com.example.lab1;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

/**
 * A simple Camel route that triggers from a timer and calls a bean and prints to system out.
 * <p/>
 * Use <tt>@Component</tt> to make Camel auto detect this route when starting.
 */
@Component
public class MyCamelRouter4 extends RouteBuilder {

    @Override
    public void configure() throws Exception {
        from("timer://simpleTimer?period=1000").routeId("ROUTE4").log("TimerRoute");

    }

}