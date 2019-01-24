/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week2.softwarefundamentals;

/**
 *
 * @author Ali Hassan
 */
public class Card {
    private String suit;
    private int value;

    public Card(String suit, int value){
        setSuit(suit);
        setValue(value);
    }
    
    /**
     * @return the suit
     */
    public String getSuit() {
        return suit;
    }

    /**
     * @param suit the suit to set
     */
    public void setSuit(String suit) {
        if(suit.equalsIgnoreCase("heart") || suit.equalsIgnoreCase("diamond") ||
            suit.equalsIgnoreCase("club") || suit.equalsIgnoreCase("spade")){
            this.suit = suit;
        } else {
            System.out.println("Invalid suit");
        }      
    }

    /**
     * @return the value
     */
    public int getValue() {
        return value;
    }

    /**
     * @param value the value to set
     */
    public void setValue(int value) {
        if(value >= 1 && value <= 30){
            this.value = value;
        } else {
            System.out.println("Invalid value");
        }
    } 
}
