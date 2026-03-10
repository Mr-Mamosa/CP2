package org.example;

import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;

public class calclient {
    public static void main(String[] args) {
        JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();

        factory.setServiceClass(CalService.class);

        factory.setAddress("http://localhost:8080/calculator");

        CalService calculator = (CalService) factory.create();

        int result = calculator.add(10, 20);
        System.out.println("Result: " + result);
    }
}