package org.example;

import org.apache.cxf.jaxws.JaxWsServerFactoryBean;

public class CubeServer {
    public static void main(String[] args) {
        CubeServiceImpl implementor = new CubeServiceImpl();
        JaxWsServerFactoryBean factory = new JaxWsServerFactoryBean();

        factory.setServiceClass(CubeService.class);
        // Address where the SOAP service will be accessible
        factory.setAddress("http://localhost:8080/cubeservice");
        factory.setServiceBean(implementor);

        factory.create();
        System.out.println("✅ Cube SOAP Service is running at http://localhost:8080/cubeservice");
    }
}