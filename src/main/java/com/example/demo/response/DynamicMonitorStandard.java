package com.example.demo.response;

import com.example.demo.entity.DynamicMonitor;

/**
 * description: DynamicMonitorStandard
 * date: 4/19/21 9:29 PM
 * author: fourwood
 */
public class DynamicMonitorStandard {

    public DynamicMonitorStandard(Long districtId, String name, Float standardOutline, Float standardForestCoverage, Float standardServiceValue, Float standardHomelandFunction, Float standardRoadNetworkDensity, Float standardGreenBuilding, Float standardGini, Float standardReclaimedWater, Float standardNonMotorizedLanes, Float standardNonFossilEnergy, Float standardGdpEnergyConsumption, Float standardSolidWaste, Float standardPublicSecuritySatisfaction, Float standardWaterSurface, Float standardDomesticWater, Float standardWaterNetworkDensity, Float standardCarbonEmission, Float standardCarbonEmissionPerCapita, Float standardCarbonEmissionPerProduction, Float standardEnergyConsumptionPerCapita) {
        this.districtId = districtId;
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
    }

    public DynamicMonitorStandard(DynamicMonitor dynamicMonitor) {
        this.districtId = dynamicMonitor.getDistrictId();
        this.name = dynamicMonitor.getName();
        this.standardOutline = dynamicMonitor.getStandardOutline();
        this.standardForestCoverage = dynamicMonitor.getStandardForestCoverage();
        this.standardServiceValue = dynamicMonitor.getStandardServiceValue();
        this.standardHomelandFunction = dynamicMonitor.getStandardHomelandFunction();
        this.standardRoadNetworkDensity = dynamicMonitor.getStandardRoadNetworkDensity();
        this.standardGreenBuilding = dynamicMonitor.getStandardGreenBuilding();
        this.standardGini = dynamicMonitor.getStandardGini();
        this.standardReclaimedWater = dynamicMonitor.getStandardReclaimedWater();
        this.standardNonMotorizedLanes = dynamicMonitor.getStandardNonMotorizedLanes();
        this.standardNonFossilEnergy = dynamicMonitor.getStandardNonFossilEnergy();
        this.standardGdpEnergyConsumption = dynamicMonitor.getStandardGdpEnergyConsumption();
        this.standardSolidWaste = dynamicMonitor.getStandardSolidWaste();
        this.standardPublicSecuritySatisfaction = dynamicMonitor.getStandardPublicSecuritySatisfaction();
        this.standardWaterSurface = dynamicMonitor.getStandardWaterSurface();
        this.standardDomesticWater = dynamicMonitor.getStandardDomesticWater();
        this.standardWaterNetworkDensity = dynamicMonitor.getStandardWaterNetworkDensity();
        this.standardCarbonEmission = dynamicMonitor.getStandardCarbonEmission();
        this.standardCarbonEmissionPerCapita = dynamicMonitor.getStandardCarbonEmissionPerCapita();
        this.standardCarbonEmissionPerProduction = dynamicMonitor.getStandardCarbonEmissionPerProduction();
        this.standardEnergyConsumptionPerCapita = dynamicMonitor.getStandardEnergyConsumptionPerCapita();
    }

    public Long districtId;
    public String name;
    public Float standardOutline;
    public Float standardForestCoverage;
    public Float standardServiceValue;
    public Float standardHomelandFunction;
    public Float standardRoadNetworkDensity;
    public Float standardGreenBuilding;
    public Float standardGini;
    public Float standardReclaimedWater;
    public Float standardNonMotorizedLanes;
    public Float standardNonFossilEnergy;
    public Float standardGdpEnergyConsumption;
    public Float standardSolidWaste;
    public Float standardPublicSecuritySatisfaction;
    public Float standardWaterSurface;
    public Float standardDomesticWater;
    public Float standardWaterNetworkDensity;
    public Float standardCarbonEmission;
    public Float standardCarbonEmissionPerCapita;
    public Float standardCarbonEmissionPerProduction;
    public Float standardEnergyConsumptionPerCapita;
}
