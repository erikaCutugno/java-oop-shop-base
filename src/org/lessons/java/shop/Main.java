package org.lessons.java.shop;


import java.math.BigDecimal;

public class Main {
public static void main(String[] args) {
    Prodotto borsa = new Prodotto("Borsa", "Borsa piccola", new BigDecimal("100.00"), new BigDecimal("0.22"));
    

    System.out.println( borsa.getPrezzoBase());
    System.out.println( borsa.getPrezzoFinale());
    System.out.println( borsa.getNomeEsteso());
}
}
