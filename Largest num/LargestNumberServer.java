package org.example;

import org.apache.cxf.jaxws.JaxWsServerFactoryBean;

public class LargestNumberServer {
    public static void main(String[] args) {
        // 1. Create the implementation object
        LargestNumberServiceImpl implementor = new LargestNumberServiceImpl();

        // 2. Set up the CXF Server Factory
        JaxWsServerFactoryBean factory = new JaxWsServerFactoryBean();
        factory.setServiceClass(LargestNumberService.class);
        factory.setAddress("http://localhost:8080/largestnumber");
        factory.setServiceBean(implementor);

        // 3. Start the server
        factory.create();
        System.out.println("OAP Service is running at: http://localhost:8080/largestnumber");
    }
}