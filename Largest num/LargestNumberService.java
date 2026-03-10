package org.example;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;

@WebService
public interface LargestNumberService {

    @WebMethod(operationName = "findLargest")
    int findLargest(
            @WebParam(name = "num1") int a,
            @WebParam(name = "num2") int b
    );
}