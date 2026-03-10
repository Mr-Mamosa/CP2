package org.example;


import jakarta.jws.WebService;

@WebService(endpointInterface = "org.example.CalService")
public class calserviceimp1 implements CalService{
    @Override
    public int multiply(int num1, int num2) {
        return num1*num2;
    }
}
