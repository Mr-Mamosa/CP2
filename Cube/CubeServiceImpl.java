package org.example;

import jakarta.jws.WebService;

@WebService(endpointInterface = "org.example.CubeService")
public class CubeServiceImpl implements CubeService {
    @Override
    public int calculateCube(int n) {
        return n * n * n;
    }
}