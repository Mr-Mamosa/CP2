package org.example;

import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import java.util.Scanner;

public class CubeClient {
    public static void main(String[] args) {
        JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();
        factory.setServiceClass(CubeService.class);
        factory.setAddress("http://localhost:8080/cubeservice");

        CubeService client = (CubeService) factory.create();
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter a number to find its cube: ");
            int input = scanner.nextInt();

            // The proxy handles the SOAP XML conversion
            int result = client.calculateCube(input);
            System.out.println("The cube of " + input + " is: " + result);

        } catch (Exception e) {
            System.err.println("❌ Error: Could not connect to the SOAP server.");
        } finally {
            scanner.close();
        }
    }
}