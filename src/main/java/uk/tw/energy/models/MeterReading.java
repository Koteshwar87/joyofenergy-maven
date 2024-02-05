package uk.tw.energy.models;

import lombok.Data;

import java.util.List;

@Data
public class MeterReading {
    private int readingId;
    private List<ElectricityReading> electricityReadings;
    private SmartMeter smartMeter;
}
