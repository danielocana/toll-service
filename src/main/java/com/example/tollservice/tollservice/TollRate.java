package com.example.tollservice.tollservice;

import java.math.BigDecimal;

public class TollRate {

    private int stationId;
    private BigDecimal currentRate;
    private String timestamp;

    public TollRate() {
    }

    public TollRate(int stationId, BigDecimal currentRate, String timestamp) {
        this.stationId = stationId;
        this.currentRate = currentRate;
        this.timestamp = timestamp;
    }

    public int getStationId() {
        return stationId;
    }

    public BigDecimal getCurrentRate() {
        return currentRate;
    }

    public String getTimestamp() {
        return timestamp;
    }
}
