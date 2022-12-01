package Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Coin implements Comparable<Coin> {
    private final int nominalValue;    // nominal value
    private final int mintYear;        // the year the coin was minted

    Coin(int nominalValue, int mintYear) {
        this.nominalValue = nominalValue;
        this.mintYear = mintYear;
    }

    public int getNominalValue() {
        return nominalValue;
    }

    public int getMintYear() {
        return mintYear;
    }


    @Override
    public int compareTo(Coin other) {
        // This method we have to implement
        if (nominalValue == other.nominalValue) {
            return 0;
        } else if (nominalValue < other.nominalValue) {
            return -1;
        } else {
            return 1;
        }
    }

    // We consider two coins equal if they have the same nominal value
    @Override
    public boolean equals(Object that) {
        if (this == that) return true;
        if (that == null || getClass() != that.getClass()) return false;
        Coin coin = (Coin) that;
        return nominalValue == coin.nominalValue;
    }

    // getters, setters, hashCode and toString
    @Override
    public String toString() {
        return "Coin{nominal=" + nominalValue + ", year=" + mintYear + "}";
    }

    public static void main(String[] args) {
        Coin big = new Coin(25, 2006);
        Coin medium1 = new Coin(10, 2016);
        Coin medium2 = new Coin(10, 2001);
        Coin small = new Coin(2, 2000);
        List<Coin> coins = new ArrayList<>();

        coins.add(big);
        coins.add(medium1);
        coins.add(medium2);
        coins.add(small);

        Collections.sort(coins);
        coins.forEach(System.out::println);
    }

}