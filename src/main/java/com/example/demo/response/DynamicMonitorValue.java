package com.example.demo.response;

import com.example.demo.entity.DynamicMonitor;

/**
 * description: DynamicMonitorValue
 * date: 4/19/21 9:29 PM
 * author: fourwood
 */
public class DynamicMonitorValue {

    public DynamicMonitorValue(Long districtId, String name, Float valueOutline, Float valueForestCoverage, Float valueServiceValue, Float valueHomelandFunction, Float valueRoadNetworkDensity, Float valueGreenBuilding, Float valueGini, Float valueReclaimedWater, Float valueNonMotorizedLanes, Float valueNonFossilEnergy, Float valueGdpEnergyConsumption, Float valueSolidWaste, Float valuePublicSecuritySatisfaction, Float valueWaterSurface, Float valueDomesticWater, Float valueWaterNetworkDensity, Float valueCarbonEmission, Float valueCarbonEmissionPerCapita, Float valueCarbonEmissionPerProduction, Float valueEnergyConsumptionPerCapita) {
        this.districtId = districtId;
        this.name = name;
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

    public DynamicMonitorValue(DynamicMonitor dynamicMonitor) {
        this.districtId = dynamicMonitor.getDistrictId();
        this.name = dynamicMonitor.getName();
        this.valueOutline = dynamicMonitor.getValueOutline();
        this.valueForestCoverage = dynamicMonitor.getValueForestCoverage();
        this.valueServiceValue = dynamicMonitor.getValueServiceValue();
        this.valueHomelandFunction = dynamicMonitor.getValueHomelandFunction();
        this.valueRoadNetworkDensity = dynamicMonitor.getValueRoadNetworkDensity();
        this.valueGreenBuilding = dynamicMonitor.getValueGreenBuilding();
        this.valueGini = dynamicMonitor.getValueGini();
        this.valueReclaimedWater = dynamicMonitor.getValueReclaimedWater();
        this.valueNonMotorizedLanes = dynamicMonitor.getValueNonMotorizedLanes();
        this.valueNonFossilEnergy = dynamicMonitor.getValueNonFossilEnergy();
        this.valueGdpEnergyConsumption = dynamicMonitor.getValueGdpEnergyConsumption();
        this.valueSolidWaste = dynamicMonitor.getValueSolidWaste();
        this.valuePublicSecuritySatisfaction = dynamicMonitor.getValuePublicSecuritySatisfaction();
        this.valueWaterSurface = dynamicMonitor.getValueWaterSurface();
        this.valueDomesticWater = dynamicMonitor.getValueDomesticWater();
        this.valueWaterNetworkDensity = dynamicMonitor.getValueWaterNetworkDensity();
        this.valueCarbonEmission = dynamicMonitor.getValueCarbonEmission();
        this.valueCarbonEmissionPerCapita = dynamicMonitor.getValueCarbonEmissionPerCapita();
        this.valueCarbonEmissionPerProduction = dynamicMonitor.getValueCarbonEmissionPerProduction();
        this.valueEnergyConsumptionPerCapita = dynamicMonitor.getValueEnergyConsumptionPerCapita();
        this.unitDomesticWater = dynamicMonitor.getUnitDomesticWater();
        this.unitGdpEnergyConsumption = dynamicMonitor.getUnitGdpEnergyConsumption();
    }

    public Long districtId;
    public String name;
    public Float valueOutline;
    public Float valueForestCoverage;
    public Float valueServiceValue;
    public Float valueHomelandFunction;
    public Float valueRoadNetworkDensity;
    public Float valueGreenBuilding;
    public Float valueGini;
    public Float valueReclaimedWater;
    public Float valueNonMotorizedLanes;
    public Float valueNonFossilEnergy;
    public Float valueGdpEnergyConsumption;
    public Float valueSolidWaste;
    public Float valuePublicSecuritySatisfaction;
    public Float valueWaterSurface;
    public Float valueDomesticWater;
    public Float valueWaterNetworkDensity;
    public Float valueCarbonEmission;
    public Float valueCarbonEmissionPerCapita;
    public Float valueCarbonEmissionPerProduction;
    public Float valueEnergyConsumptionPerCapita;
    public String unitDomesticWater;
    public String unitGdpEnergyConsumption;
}
