package com.company;

public class Card {

    char suit;

    int number;

    boolean isRed;

    boolean isBlack;

    public Card() {
        this.suit = 'N';
        this.number = 0;
    }

    public Card(char suit, int number) {
        this.suit = suit;
        this.number = number;
        if (suit == 'H' || suit == 'D') {
            isRed = true;
        }
        else {
            isBlack = true;
        }
    }

    public Card getRandomCard(){
        char[] array = {'S','C','H','D'};
        int arrayRndNum = (int) ((Math.random() * (4 - 0)) + 0);
        char randomLetter = array[arrayRndNum];
        int randomNumber = (int) ((Math.random() * (14 - 1)) + 1);

        Card randomCard = new Card(randomLetter,randomNumber);

        return randomCard;
    }

}
