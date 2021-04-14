package com.example.demo.response;

/**
 * description: TransResponse
 * date: 4/14/21 8:56 PM
 * author: fourwood
 */
public class TransResponse {

    public TransResponse(Float intensity, Float density, Float coverage) {
        this.intensity = intensity;
        this.density = density;
        this.coverage = coverage;
    }

    public Float intensity;

    public Float density;

    public Float coverage;
}
