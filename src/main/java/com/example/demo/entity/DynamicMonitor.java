package com.example.demo.entity;

import javax.persistence.*;

/**
 * description: DynamicMonitor
 * date: 4/19/21 8:59 PM
 * author: fourwood
 */
@Entity
@Table(name = "dynamic_monitor")
public class DynamicMonitor {

    public DynamicMonitor() {
    }

    public DynamicMonitor(String name, Float standardOutline, Float standardForestCoverage, Float standardServiceValue, Float standardHomelandFunction, Float standardRoadNetworkDensity, Float standardGreenBuilding, Float standardGini, Float standardReclaimedWater, Float standardNonMotorizedLanes, Float standardNonFossilEnergy, Float standardGdpEnergyConsumption, Float standardSolidWaste, Float standardPublicSecuritySatisfaction, Float standardWaterSurface, Float standardDomesticWater, Float standardWaterNetworkDensity, Float standardCarbonEmission, Float standardCarbonEmissionPerCapita, Float standardCarbonEmissionPerProduction, Float standardEnergyConsumptionPerCapita, Float valueOutline, Float valueForestCoverage, Float valueServiceValue, Float valueHomelandFunction, Float valueRoadNetworkDensity, Float valueGreenBuilding, Float valueGini, Float valueReclaimedWater, Float valueNonMotorizedLanes, Float valueNonFossilEnergy, Float valueGdpEnergyConsumption, Float valueSolidWaste, Float valuePublicSecuritySatisfaction, Float valueWaterSurface, Float valueDomesticWater, Float valueWaterNetworkDensity, Float valueCarbonEmission, Float valueCarbonEmissionPerCapita, Float valueCarbonEmissionPerProduction, Float valueEnergyConsumptionPerCapita) {
        this.name = name;
        this.standardOutline = standardOutline;
        this.standardForestCoverage = standardForestCoverage;
        this.standardServiceValue = standardServiceValue;
        this.standardHomelandFunction = standardHomelandFunction;
        this.standardRoadNetworkDensity = standardRoadNetworkDensity;
        this.standardGreenBuilding = standardGreenBuilding;
        this.standardGini = standardGini;
        this.standardReclaimedWater = standardReclaimedWater;
        this.standardNonMotorizedLanes = standardNonMotorizedLanes;
        this.standardNonFossilEnergy = standardNonFossilEnergy;
        this.standardGdpEnergyConsumption = standardGdpEnergyConsumption;
        this.standardSolidWaste = standardSolidWaste;
        this.standardPublicSecuritySatisfaction = standardPublicSecuritySatisfaction;
        this.standardWaterSurface = standardWaterSurface;
        this.standardDomesticWater = standardDomesticWater;
        this.standardWaterNetworkDensity = standardWaterNetworkDensity;
        this.standardCarbonEmission = standardCarbonEmission;
        this.standardCarbonEmissionPerCapita = standardCarbonEmissionPerCapita;
        this.standardCarbonEmissionPerProduction = standardCarbonEmissionPerProduction;
        this.standardEnergyConsumptionPerCapita = standardEnergyConsumptionPerCapita;
        this.valueOutline = valueOutline;
        this.valueForestCoverage = valueForestCoverage;
        this.valueServiceValue = valueServiceValue;
        this.valueHomelandFunction = valueHomelandFunction;
        this.valueRoadNetworkDensity = valueRoadNetworkDensity;
        this.valueGreenBuilding = valueGreenBuilding;
        this.valueGini = valueGini;
        this.valueReclaimedWater = valueReclaimedWater;
        this.valueNonMotorizedLanes = valueNonMotorizedLanes;
        this.valueNonFossilEnergy = valueNonFossilEnergy;
        this.valueGdpEnergyConsumption = valueGdpEnergyConsumption;
        this.valueSolidWaste = valueSolidWaste;
        this.valuePublicSecuritySatisfaction = valuePublicSecuritySatisfaction;
        this.valueWaterSurface = valueWaterSurface;
        this.valueDomesticWater = valueDomesticWater;
        this.valueWaterNetworkDensity = valueWaterNetworkDensity;
        this.valueCarbonEmission = valueCarbonEmission;
        this.valueCarbonEmissionPerCapita = valueCarbonEmissionPerCapita;
        this.valueCarbonEmissionPerProduction = valueCarbonEmissionPerProduction;
        this.valueEnergyConsumptionPerCapita = valueEnergyConsumptionPerCapita;
    }

    public Long getDistrictId() {
        return districtId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Float getStandardOutline() {
        return standardOutline;
    }

    public void setStandardOutline(Float standardOutline) {
        this.standardOutline = standardOutline;
    }

    public Float getStandardForestCoverage() {
        return standardForestCoverage;
    }

    public void setStandardForestCoverage(Float standardForestCoverage) {
        this.standardForestCoverage = standardForestCoverage;
    }

    public Float getStandardServiceValue() {
        return standardServiceValue;
    }

    public void setStandardServiceValue(Float standardServiceValue) {
        this.standardServiceValue = standardServiceValue;
    }

    public Float getStandardHomelandFunction() {
        return standardHomelandFunction;
    }

    public void setStandardHomelandFunction(Float standardHomelandFunction) {
        this.standardHomelandFunction = standardHomelandFunction;
    }

    public Float getStandardRoadNetworkDensity() {
        return standardRoadNetworkDensity;
    }

    public void setStandardRoadNetworkDensity(Float standardRoadNetworkDensity) {
        this.standardRoadNetworkDensity = standardRoadNetworkDensity;
    }

    public Float getStandardGreenBuilding() {
        return standardGreenBuilding;
    }

    public void setStandardGreenBuilding(Float standardGreenBuilding) {
        this.standardGreenBuilding = standardGreenBuilding;
    }

    public Float getStandardGini() {
        return standardGini;
    }

    public void setStandardGini(Float standardGini) {
        this.standardGini = standardGini;
    }

    public Float getStandardReclaimedWater() {
        return standardReclaimedWater;
    }

    public void setStandardReclaimedWater(Float standardReclaimedWater) {
        this.standardReclaimedWater = standardReclaimedWater;
    }

    public Float getStandardNonMotorizedLanes() {
        return standardNonMotorizedLanes;
    }

    public void setStandardNonMotorizedLanes(Float standardNonMotorizedLanes) {
        this.standardNonMotorizedLanes = standardNonMotorizedLanes;
    }

    public Float getStandardNonFossilEnergy() {
        return standardNonFossilEnergy;
    }

    public void setStandardNonFossilEnergy(Float standardNonFossilEnergy) {
        this.standardNonFossilEnergy = standardNonFossilEnergy;
    }

    public Float getStandardGdpEnergyConsumption() {
        return standardGdpEnergyConsumption;
    }

    public void setStandardGdpEnergyConsumption(Float standardGdpEnergyConsumption) {
        this.standardGdpEnergyConsumption = standardGdpEnergyConsumption;
    }

    public Float getStandardSolidWaste() {
        return standardSolidWaste;
    }

    public void setStandardSolidWaste(Float standardSolidWaste) {
        this.standardSolidWaste = standardSolidWaste;
    }

    public Float getStandardPublicSecuritySatisfaction() {
        return standardPublicSecuritySatisfaction;
    }

    public void setStandardPublicSecuritySatisfaction(Float standardPublicSecuritySatisfaction) {
        this.standardPublicSecuritySatisfaction = standardPublicSecuritySatisfaction;
    }

    public Float getStandardWaterSurface() {
        return standardWaterSurface;
    }

    public void setStandardWaterSurface(Float standardWaterSurface) {
        this.standardWaterSurface = standardWaterSurface;
    }

    public Float getStandardDomesticWater() {
        return standardDomesticWater;
    }

    public void setStandardDomesticWater(Float standardDomesticWater) {
        this.standardDomesticWater = standardDomesticWater;
    }

    public Float getStandardWaterNetworkDensity() {
        return standardWaterNetworkDensity;
    }

    public void setStandardWaterNetworkDensity(Float standardWaterNetworkDensity) {
        this.standardWaterNetworkDensity = standardWaterNetworkDensity;
    }

    public Float getStandardCarbonEmission() {
        return standardCarbonEmission;
    }

    public void setStandardCarbonEmission(Float standardCarbonEmission) {
        this.standardCarbonEmission = standardCarbonEmission;
    }

    public Float getStandardCarbonEmissionPerCapita() {
        return standardCarbonEmissionPerCapita;
    }

    public void setStandardCarbonEmissionPerCapita(Float standardCarbonEmissionPerCapita) {
        this.standardCarbonEmissionPerCapita = standardCarbonEmissionPerCapita;
    }

    public Float getStandardCarbonEmissionPerProduction() {
        return standardCarbonEmissionPerProduction;
    }

    public void setStandardCarbonEmissionPerProduction(Float standardCarbonEmissionPerProduction) {
        this.standardCarbonEmissionPerProduction = standardCarbonEmissionPerProduction;
    }

    public Float getStandardEnergyConsumptionPerCapita() {
        return standardEnergyConsumptionPerCapita;
    }

    public void setStandardEnergyConsumptionPerCapita(Float standardEnergyConsumptionPerCapita) {
        this.standardEnergyConsumptionPerCapita = standardEnergyConsumptionPerCapita;
    }

    public Float getValueOutline() {
        return valueOutline;
    }

    public void setValueOutline(Float valueOutline) {
        this.valueOutline = valueOutline;
    }

    public Float getValueForestCoverage() {
        return valueForestCoverage;
    }

    public void setValueForestCoverage(Float valueForestCoverage) {
        this.valueForestCoverage = valueForestCoverage;
    }

    public Float getValueServiceValue() {
        return valueServiceValue;
    }

    public void setValueServiceValue(Float valueServiceValue) {
        this.valueServiceValue = valueServiceValue;
    }

    public Float getValueHomelandFunction() {
        return valueHomelandFunction;
    }

    public void setValueHomelandFunction(Float valueHomelandFunction) {
        this.valueHomelandFunction = valueHomelandFunction;
    }

    public Float getValueRoadNetworkDensity() {
        return valueRoadNetworkDensity;
    }

    public void setValueRoadNetworkDensity(Float valueRoadNetworkDensity) {
        this.valueRoadNetworkDensity = valueRoadNetworkDensity;
    }

    public Float getValueGreenBuilding() {
        return valueGreenBuilding;
    }

    public void setValueGreenBuilding(Float valueGreenBuilding) {
        this.valueGreenBuilding = valueGreenBuilding;
    }

    public Float getValueGini() {
        return valueGini;
    }

    public void setValueGini(Float valueGini) {
        this.valueGini = valueGini;
    }

    public Float getValueReclaimedWater() {
        return valueReclaimedWater;
    }

    public void setValueReclaimedWater(Float valueReclaimedWater) {
        this.valueReclaimedWater = valueReclaimedWater;
    }

    public Float getValueNonMotorizedLanes() {
        return valueNonMotorizedLanes;
    }

    public void setValueNonMotorizedLanes(Float valueNonMotorizedLanes) {
        this.valueNonMotorizedLanes = valueNonMotorizedLanes;
    }

    public Float getValueNonFossilEnergy() {
        return valueNonFossilEnergy;
    }

    public void setValueNonFossilEnergy(Float valueNonFossilEnergy) {
        this.valueNonFossilEnergy = valueNonFossilEnergy;
    }

    public Float getValueGdpEnergyConsumption() {
        return valueGdpEnergyConsumption;
    }

    public void setValueGdpEnergyConsumption(Float valueGdpEnergyConsumption) {
        this.valueGdpEnergyConsumption = valueGdpEnergyConsumption;
    }

    public Float getValueSolidWaste() {
        return valueSolidWaste;
    }

    public void setValueSolidWaste(Float valueSolidWaste) {
        this.valueSolidWaste = valueSolidWaste;
    }

    public Float getValuePublicSecuritySatisfaction() {
        return valuePublicSecuritySatisfaction;
    }

    public void setValuePublicSecuritySatisfaction(Float valuePublicSecuritySatisfaction) {
        this.valuePublicSecuritySatisfaction = valuePublicSecuritySatisfaction;
    }

    public Float getValueWaterSurface() {
        return valueWaterSurface;
    }

    public void setValueWaterSurface(Float valueWaterSurface) {
        this.valueWaterSurface = valueWaterSurface;
    }

    public Float getValueDomesticWater() {
        return valueDomesticWater;
    }

    public void setValueDomesticWater(Float valueDomesticWater) {
        this.valueDomesticWater = valueDomesticWater;
    }

    public Float getValueWaterNetworkDensity() {
        return valueWaterNetworkDensity;
    }

    public void setValueWaterNetworkDensity(Float valueWaterNetworkDensity) {
        this.valueWaterNetworkDensity = valueWaterNetworkDensity;
    }

    public Float getValueCarbonEmission() {
        return valueCarbonEmission;
    }

    public void setValueCarbonEmission(Float valueCarbonEmission) {
        this.valueCarbonEmission = valueCarbonEmission;
    }

    public Float getValueCarbonEmissionPerCapita() {
        return valueCarbonEmissionPerCapita;
    }

    public void setValueCarbonEmissionPerCapita(Float valueCarbonEmissionPerCapita) {
        this.valueCarbonEmissionPerCapita = valueCarbonEmissionPerCapita;
    }

    public Float getValueCarbonEmissionPerProduction() {
        return valueCarbonEmissionPerProduction;
    }

    public void setValueCarbonEmissionPerProduction(Float valueCarbonEmissionPerProduction) {
        this.valueCarbonEmissionPerProduction = valueCarbonEmissionPerProduction;
    }

    public Float getValueEnergyConsumptionPerCapita() {
        return valueEnergyConsumptionPerCapita;
    }

    public void setValueEnergyConsumptionPerCapita(Float valueEnergyConsumptionPerCapita) {
        this.valueEnergyConsumptionPerCapita = valueEnergyConsumptionPerCapita;
    }

    @Override
    public String toString() {
        return "DynamicMonitor{" +
                "districtId=" + districtId +
                ", name='" + name + '\'' +
                ", standardOutline=" + standardOutline +
                ", standardForestCoverage=" + standardForestCoverage +
                ", standardServiceValue=" + standardServiceValue +
                ", standardHomelandFunction=" + standardHomelandFunction +
                ", standardRoadNetworkDensity=" + standardRoadNetworkDensity +
                ", standardGreenBuilding=" + standardGreenBuilding +
                ", standardGini=" + standardGini +
                ", standardReclaimedWater=" + standardReclaimedWater +
                ", standardNonMotorizedLanes=" + standardNonMotorizedLanes +
                ", standardNonFossilEnergy=" + standardNonFossilEnergy +
                ", standardGdpEnergyConsumption=" + standardGdpEnergyConsumption +
                ", standardSolidWaste=" + standardSolidWaste +
                ", standardPublicSecuritySatisfaction=" + standardPublicSecuritySatisfaction +
                ", standardWaterSurface=" + standardWaterSurface +
                ", standardDomesticWater=" + standardDomesticWater +
                ", standardWaterNetworkDensity=" + standardWaterNetworkDensity +
                ", standardCarbonEmission=" + standardCarbonEmission +
                ", standardCarbonEmissionPerCapita=" + standardCarbonEmissionPerCapita +
                ", standardCarbonEmissionPerProduction=" + standardCarbonEmissionPerProduction +
                ", standardEnergyConsumptionPerCapita=" + standardEnergyConsumptionPerCapita +
                ", valueOutline=" + valueOutline +
                ", valueForestCoverage=" + valueForestCoverage +
                ", valueServiceValue=" + valueServiceValue +
                ", valueHomelandFunction=" + valueHomelandFunction +
                ", valueRoadNetworkDensity=" + valueRoadNetworkDensity +
                ", valueGreenBuilding=" + valueGreenBuilding +
                ", valueGini=" + valueGini +
                ", valueReclaimedWater=" + valueReclaimedWater +
                ", valueNonMotorizedLanes=" + valueNonMotorizedLanes +
                ", valueNonFossilEnergy=" + valueNonFossilEnergy +
                ", valueGdpEnergyConsumption=" + valueGdpEnergyConsumption +
                ", valueSolidWaste=" + valueSolidWaste +
                ", valuePublicSecuritySatisfaction=" + valuePublicSecuritySatisfaction +
                ", valueWaterSurface=" + valueWaterSurface +
                ", valueDomesticWater=" + valueDomesticWater +
                ", valueWaterNetworkDensity=" + valueWaterNetworkDensity +
                ", valueCarbonEmission=" + valueCarbonEmission +
                ", valueCarbonEmissionPerCapita=" + valueCarbonEmissionPerCapita +
                ", valueCarbonEmissionPerProduction=" + valueCarbonEmissionPerProduction +
                ", valueEnergyConsumptionPerCapita=" + valueEnergyConsumptionPerCapita +
                '}';
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long districtId;

    private String name;

    private Float standardOutline;
    private Float standardForestCoverage;
    private Float standardServiceValue;
    private Float standardHomelandFunction;
    private Float standardRoadNetworkDensity;
    private Float standardGreenBuilding;
    private Float standardGini;
    private Float standardReclaimedWater;
    private Float standardNonMotorizedLanes;
    private Float standardNonFossilEnergy;
    private Float standardGdpEnergyConsumption;
    private Float standardSolidWaste;
    private Float standardPublicSecuritySatisfaction;
    private Float standardWaterSurface;
    private Float standardDomesticWater;
    private Float standardWaterNetworkDensity;
    private Float standardCarbonEmission;
    private Float standardCarbonEmissionPerCapita;
    private Float standardCarbonEmissionPerProduction;
    private Float standardEnergyConsumptionPerCapita;

    private Float valueOutline;
    private Float valueForestCoverage;
    private Float valueServiceValue;
    private Float valueHomelandFunction;
    private Float valueRoadNetworkDensity;
    private Float valueGreenBuilding;
    private Float valueGini;
    private Float valueReclaimedWater;
    private Float valueNonMotorizedLanes;
    private Float valueNonFossilEnergy;
    private Float valueGdpEnergyConsumption;
    private Float valueSolidWaste;
    private Float valuePublicSecuritySatisfaction;
    private Float valueWaterSurface;
    private Float valueDomesticWater;
    private Float valueWaterNetworkDensity;
    private Float valueCarbonEmission;
    private Float valueCarbonEmissionPerCapita;
    private Float valueCarbonEmissionPerProduction;
    private Float valueEnergyConsumptionPerCapita;

}
