package org.example;

import jakarta.jws.WebService;

@WebService(endpointInterface = "org.example.LargestNumberService")
public class LargestNumberServiceImpl implements LargestNumberService {

    @Override
    public int findLargest(int a, int b) {
        // Returns the greater of the two numbers
        return Math.max(a, b);
    }
}