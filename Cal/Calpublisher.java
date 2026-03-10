package org.example;

import org.apache.cxf.jaxws.JaxWsServerFactoryBean;

public class Calpublisher {
    public static void main(String[] args){
        JaxWsServerFactoryBean factory = new JaxWsServerFactoryBean();
        factory.setServiceClass(calserviceimp1.class); // implementation class
        factory.setAddress("http://localhost:8080/calculator"); // service URL
        factory.create(); // publish service
        System.out.println("Service is running at http://localhost:8080/calculator");
    }
}
