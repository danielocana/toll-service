package com.example.tollservice.tollservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.time.Instant;

@RestController
public class TollRateController {


    @GetMapping("tollrate/{stationId}")
    public TollRate getTollRate (@PathVariable int stationId) {
        System.out.println("Station requested: " + stationId);

        TollRate tollRate;

        switch (stationId){
            case 1:
                tollRate = new TollRate(stationId, new BigDecimal("0.55"), Instant.now().toString());
                break;
            case 2:
                tollRate = new TollRate(stationId, new BigDecimal("1.55"), Instant.now().toString());
                break;
            case 3:
                tollRate = new TollRate(stationId, new BigDecimal("0.60"), Instant.now().toString());
                break;
            default:
                tollRate = new TollRate(stationId, new BigDecimal("0.60"), Instant.now().toString());
                break;
        }

        return tollRate;
    }

}
