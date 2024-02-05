package uk.tw.energy.models;

import lombok.Data;

import java.math.BigDecimal;
import java.time.DayOfWeek;
import java.util.List;

@Data
public class Plan {
    private int planId;
    private String planName;
    private Company company;
    private BigDecimal unitRate;
    private List<PeakTimeMultiplier> peakTimeMultipliers;

    static class PeakTimeMultiplier {
        DayOfWeek dayOfWeek;
        BigDecimal multiplier;

        public PeakTimeMultiplier(DayOfWeek dayOfWeek, BigDecimal multiplier) {
            this.dayOfWeek = dayOfWeek;
            this.multiplier = multiplier;
        }
    }
}
