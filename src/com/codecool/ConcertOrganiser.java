package com.codecool;

import java.util.HashSet;
import java.util.Set;

public class ConcertOrganiser {
    private java.util.Random rand = new java.util.Random();
    private Set<Band> bands  = new HashSet<Band>();
    private int venue;

    public boolean isItRaining() {
        double chance = rand.nextDouble();
        return chance == 0.3;
    }

    public boolean isItFullHouse() {
        double chance = rand.nextDouble();
        return chance == 0.8;
    }

    public Band whoGonnaBeTheWarmUpBand(PlayStyle mainBandStyle) {
        for (Band band:bands) {
            if (band.getStyle() == mainBandStyle ) {
               return band;
            }
        }
        return null;
    }

    public void addBand(Band band) {
        bands.add(band);
    }

    private int getConcertVenue(Concert concert) {
        int concertCapacity = concert.getCapacity();
        int ticketPrice = concert.getPrice();
        return isItFullHouse() ? concertCapacity * ticketPrice : (int) (concertCapacity * 0.8) * ticketPrice;
    }

    private int getBarVenue(Bar bar, Concert concert) {
        int beerPrice = bar.getBeerPrice();
        int concertTime = concert.getTimeInMin();
        int concertActuallyCapacity = isItFullHouse() ? concert.getCapacity() : (int) (concert.getCapacity() * 0.8);
        return beerPrice * ( concertActuallyCapacity * concertTime / 30);
    }

    private void addConcertVenueToConcertOrganiserVenue(Concert concert, Bar bar) {
        int concertVenue = (int) (getConcertVenue(concert) * 0.4);
        int barVenue = getBarVenue(bar, concert);
        this.venue = venue + concertVenue + barVenue;
    }
}
