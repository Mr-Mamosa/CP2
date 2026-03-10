package org.example;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;

@WebService
public interface CubeService {
    @WebMethod(operationName = "calculateCube")
    int calculateCube(@WebParam(name = "number") int n);
}