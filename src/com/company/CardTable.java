package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class CardTable {

    Card talon[] = new Card[52];

    Card suitStack1[] = new Card[13];
    Card suitStack2[] = new Card[13];
    Card suitStack3[] = new Card[13];
    Card suitStack4[] = new Card[13];

    Card tableu1[] = new Card[13];
    Card tableu2[] = new Card[13];
    Card tableu3[] = new Card[13];
    Card tableu4[] = new Card[13];
    Card tableu5[] = new Card[13];
    Card tableu6[] = new Card[13];
    Card tableu7[] = new Card[13];

    public void setPlaceCards() {

    }
    public void setInitialTable() {
        Card card = new Card();
        tableu1[0] = card.getRandomCard();
        tableu2[1] = card.getRandomCard();
        tableu3[2] = card.getRandomCard();
        tableu4[3] = card.getRandomCard();
        tableu5[4] = card.getRandomCard();
        tableu6[5] = card.getRandomCard();
        tableu7[6] = card.getRandomCard();
        talon[3] = card.getRandomCard();
    }

    public void fillArrays() {
        Card defaultCard = new Card('n', 0);
        Arrays.fill(tableu1, defaultCard);
        Arrays.fill(tableu2, defaultCard);
        Arrays.fill(tableu3, defaultCard);
        Arrays.fill(tableu4, defaultCard);
        Arrays.fill(tableu5, defaultCard);
        Arrays.fill(tableu6, defaultCard);
        Arrays.fill(tableu7, defaultCard);
        Arrays.fill(suitStack1, defaultCard);
        Arrays.fill(suitStack2, defaultCard);
        Arrays.fill(suitStack3, defaultCard);
        Arrays.fill(suitStack4, defaultCard);
        Arrays.fill(talon, defaultCard);
    }

}

