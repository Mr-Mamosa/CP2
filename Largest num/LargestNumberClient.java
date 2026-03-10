package org.example;

import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import java.util.Scanner;

public class LargestNumberClient {
    public static void main(String[] args) {
        // 1. Set up the CXF Proxy Factory to consume the service
        JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();
        factory.setServiceClass(LargestNumberService.class);
        factory.setAddress("http://localhost:8080/largestnumber");

        // 2. Create the client proxy
        LargestNumberService client = (LargestNumberService) factory.create();
        Scanner scanner = new Scanner(System.in);

        try {
            // 3. Get user input
            System.out.print("Enter the first number: ");
            int num1 = scanner.nextInt();

            System.out.print("Enter the second number: ");
            int num2 = scanner.nextInt();

            // 4. Call the SOAP service method
            int result = client.findLargest(num1, num2);

            System.out.println("Result: The largest number is " + result);

        } catch (Exception e) {
            System.err.println("❌ Could not connect. Is the server running?");
        } finally {
            scanner.close();
        }
    }
}