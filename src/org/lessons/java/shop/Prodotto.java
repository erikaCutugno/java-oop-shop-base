package org.lessons.java.shop;

import java.math.BigDecimal;
import java.util.Random;

public class Prodotto {
public int codice;
public String nome;
public String descrizione;
public BigDecimal prezzo;   
public BigDecimal iva;

public Prodotto(String nome, String descrizione, BigDecimal prezzo, BigDecimal iva) {
    Random random = new Random();
    this.codice = random.nextInt(10000); 
    this.nome = nome;
    this.descrizione = descrizione;
    this.prezzo = prezzo;
    this.iva = iva;
}

public BigDecimal getPrezzoBase(){
    return this.prezzo;
}

public BigDecimal getPrezzoFinale(){
    return this.prezzo.add(this.prezzo.multiply(this.iva));
}

public String getNomeEsteso(){
    if (nome != null){
        return codice + " - " + nome;   
    }
    return null;
}
}
