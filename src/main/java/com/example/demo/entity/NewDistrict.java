package com.example.demo.entity;

import javax.persistence.*;

/**
 * description: NewDistrict
 * date: 4/14/21 8:00 PM
 * author: fourwood
 */
@Entity
@Table(name = "new_district")
public class NewDistrict {

    public NewDistrict(String name, Float gShape, Float gFunc, Float gGreenland, Float gIntensity, Float gDensity, Float gCoverage, Float gProportion, Float gUse, Float gRenewable, Float gGdp, Float gVentilation, Float gWaste, Float gGini, Float gSecurity, Float rShape, Float rFunc, Float rGreenland, Float rIntensity, Float rDensity, Float rCoverage, Float rProportion, Float rUse, Float rRenewable, Float rGdp, Float rVentilation, Float rWaste, Float rGini, Float rSecurity) {
        this.name = name;
        this.gShape = gShape;
        this.gFunc = gFunc;
        this.gGreenland = gGreenland;
        this.gIntensity = gIntensity;
        this.gDensity = gDensity;
        this.gCoverage = gCoverage;
        this.gProportion = gProportion;
        this.gUse = gUse;
        this.gRenewable = gRenewable;
        this.gGdp = gGdp;
        this.gVentilation = gVentilation;
        this.gWaste = gWaste;
        this.gGini = gGini;
        this.gSecurity = gSecurity;
        this.rShape = rShape;
        this.rFunc = rFunc;
        this.rGreenland = rGreenland;
        this.rIntensity = rIntensity;
        this.rDensity = rDensity;
        this.rCoverage = rCoverage;
        this.rProportion = rProportion;
        this.rUse = rUse;
        this.rRenewable = rRenewable;
        this.rGdp = rGdp;
        this.rVentilation = rVentilation;
        this.rWaste = rWaste;
        this.rGini = rGini;
        this.rSecurity = rSecurity;
    }

    public NewDistrict() {
    }

    public void setDistrictId(Long districtId) {
        this.districtId = districtId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getDistrictId() {
        return districtId;
    }

    public String getName() {
        return name;
    }


    public Float getGShape() {
        return gShape;
    }

    public void setGShape(Float gShape) {
        this.gShape = gShape;
    }

    public Float getGFunc() {
        return gFunc;
    }

    public void setGFunc(Float gFunc) {
        this.gFunc = gFunc;
    }

    public Float getGGreenland() {
        return gGreenland;
    }

    public void setGGreenland(Float gGreenland) {
        this.gGreenland = gGreenland;
    }

    public Float getGIntensity() {
        return gIntensity;
    }

    public void setGIntensity(Float gIntensity) {
        this.gIntensity = gIntensity;
    }

    public Float getGDensity() {
        return gDensity;
    }

    public void setGDensity(Float gDensity) {
        this.gDensity = gDensity;
    }

    public Float getGCoverage() {
        return gCoverage;
    }

    public void setGCoverage(Float gCoverage) {
        this.gCoverage = gCoverage;
    }

    public Float getGProportion() {
        return gProportion;
    }

    public void setGProportion(Float gProportion) {
        this.gProportion = gProportion;
    }

    public Float getGUse() {
        return gUse;
    }

    public void setGUse(Float gUse) {
        this.gUse = gUse;
    }

    public Float getGRenewable() {
        return gRenewable;
    }

    public void setGRenewable(Float gRenewable) {
        this.gRenewable = gRenewable;
    }

    public Float getGGdp() {
        return gGdp;
    }

    public void setGGdp(Float gGdp) {
        this.gGdp = gGdp;
    }

    public Float getGVentilation() {
        return gVentilation;
    }

    public void setGVentilation(Float gVentilation) {
        this.gVentilation = gVentilation;
    }

    public Float getGWaste() {
        return gWaste;
    }

    public void setGWaste(Float gWaste) {
        this.gWaste = gWaste;
    }

    public Float getGGini() {
        return gGini;
    }

    public void setGGini(Float gGini) {
        this.gGini = gGini;
    }

    public Float getGSecurity() {
        return gSecurity;
    }

    public void setGSecurity(Float gSecurity) {
        this.gSecurity = gSecurity;
    }

    public Float getRShape() {
        return rShape;
    }

    public void setRShape(Float rShape) {
        this.rShape = rShape;
    }

    public Float getRFunc() {
        return rFunc;
    }

    public void setRFunc(Float rFunc) {
        this.rFunc = rFunc;
    }

    public Float getRGreenland() {
        return rGreenland;
    }

    public void setRGreenland(Float rGreenland) {
        this.rGreenland = rGreenland;
    }

    public Float getRIntensity() {
        return rIntensity;
    }

    public void setRIntensity(Float rIntensity) {
        this.rIntensity = rIntensity;
    }

    public Float getRDensity() {
        return rDensity;
    }

    public void setRDensity(Float rDensity) {
        this.rDensity = rDensity;
    }

    public Float getRCoverage() {
        return rCoverage;
    }

    public void setRCoverage(Float rCoverage) {
        this.rCoverage = rCoverage;
    }

    public Float getRProportion() {
        return rProportion;
    }

    public void setRProportion(Float rProportion) {
        this.rProportion = rProportion;
    }

    public Float getRUse() {
        return rUse;
    }

    public void setRUse(Float rUse) {
        this.rUse = rUse;
    }

    public Float getRRenewable() {
        return rRenewable;
    }

    public void setRRenewable(Float rRenewable) {
        this.rRenewable = rRenewable;
    }

    public Float getRGdp() {
        return rGdp;
    }

    public void setRGdp(Float rGdp) {
        this.rGdp = rGdp;
    }

    public Float getRVentilation() {
        return rVentilation;
    }

    public void setRVentilation(Float rVentilation) {
        this.rVentilation = rVentilation;
    }

    public Float getRWaste() {
        return rWaste;
    }

    public void setRWaste(Float rWaste) {
        this.rWaste = rWaste;
    }

    public Float getRGini() {
        return rGini;
    }

    public void setRGini(Float rGini) {
        this.rGini = rGini;
    }

    public Float getRSecurity() {
        return rSecurity;
    }

    public void setRSecurity(Float rSecurity) {
        this.rSecurity = rSecurity;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long districtId;

    private String name;

    private Float gShape;

    private Float gFunc;

    private Float gGreenland;

    private Float gIntensity;

    private Float gDensity;

    private Float gCoverage;

    private Float gProportion;

    private Float gUse;

    private Float gRenewable;

    private Float gGdp;

    private Float gVentilation;

    private Float gWaste;

    private Float gGini;

    private Float gSecurity;

    private Float rShape;

    private Float rFunc;

    private Float rGreenland;

    private Float rIntensity;

    private Float rDensity;

    private Float rCoverage;

    private Float rProportion;

    private Float rUse;

    private Float rRenewable;

    private Float rGdp;

    private Float rVentilation;

    private Float rWaste;

    private Float rGini;

    private Float rSecurity;

}
