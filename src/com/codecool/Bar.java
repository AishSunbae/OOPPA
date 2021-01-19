package com.codecool;

public class Bar {
    private int beerPrice;

    public Bar(Concert concert) {
        ConcertType concertType = concert.getConcertType();
        switch (concertType) {
            case INDOOR -> this.beerPrice = 600;
            case OUTDOOR -> this.beerPrice = 800;
            case FESTIVAL -> this.beerPrice = 1000;
        }
    }

    public int getBeerPrice() {
        return beerPrice;
    }
}
