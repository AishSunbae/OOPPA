package com.codecool;

import java.util.concurrent.ThreadLocalRandom;

public class Concert {
    private int price;
    private int timeInMin;
    private Band mainBand;
    private Band warmupBand;
    private int capacity;
    private PlayStyle style;
    private ConcertType concertType;

    public Concert(Band mainBand, int capacity) {
        this.mainBand = mainBand;
        this.warmupBand = new ConcertOrganiser().whoGonnaBeTheWarmUpBand(mainBand.getStyle());
        this.capacity = capacity;
        this.style = mainBand.getStyle();
        this.concertType = createConcertType();
        this.price = ThreadLocalRandom.current().nextInt(12000, 15000 + 1);
    }

    public Concert() {
    }

    private ConcertType createConcertType() {
        if (capacity <= 3000) {
            this.timeInMin = 90;
            return ConcertType.INDOOR;
        } else if (capacity <= 5000) {
            this.timeInMin = 120;
            return ConcertType.OUTDOOR;
        }  else if (capacity <= 8000) {
            this.timeInMin = 600;
            return ConcertType.FESTIVAL;
        }
        return null;
    }

    public int getPrice() {
        return price;
    }

    public int getCapacity() {
        return capacity;
    }

    public ConcertType getConcertType() {
        return concertType;
    }

    public int getTimeInMin() {
        return timeInMin;
    }
}
