package uk.tw.energy.models;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class ElectricityReading {
    private int readingId;
    private LocalDateTime readingTime;
    private Long reading;
}
