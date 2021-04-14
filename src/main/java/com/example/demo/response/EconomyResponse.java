package com.example.demo.response;

/**
 * description: EconomyResponse
 * date: 4/14/21 8:57 PM
 * author: fourwood
 */
public class EconomyResponse {

    public EconomyResponse(Float gini, Float security) {
        this.gini = gini;
        this.security = security;
    }

    public Float gini;

    public Float security;
}
