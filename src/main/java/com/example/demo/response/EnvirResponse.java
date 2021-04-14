package com.example.demo.response;

/**
 * description: EnvirResponse
 * date: 4/14/21 8:57 PM
 * author: fourwood
 */
public class EnvirResponse {

    public EnvirResponse(Float ventilation, Float waste) {
        this.ventilation = ventilation;
        this.waste = waste;
    }

    public Float ventilation;

    public Float waste;
}
