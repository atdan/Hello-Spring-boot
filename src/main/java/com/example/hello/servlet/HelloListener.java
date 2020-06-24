package com.example.hello.servlet;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class HelloListener implements ServletContextListener {

    // Listener is used for listening to events in a web container
    // such as, when you create a session or create an attribute in a session
    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {
        System.out.println("Servlet Context Destroyed");
    }

    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        System.out.println("Servlet Context Initialized");
    }
}