package com.example.demo.response;

/**
 * description: ResourceResponse
 * date: 4/14/21 8:56 PM
 * author: fourwood
 */
public class ResourceResponse {

    public ResourceResponse(Float proportion, Float use, Float renewable, Float gdp) {
        this.proportion = proportion;
        this.use = use;
        this.renewable = renewable;
        this.gdp = gdp;
    }

    public Float proportion;

    public Float use;

    public Float renewable;

    public Float gdp;

}
