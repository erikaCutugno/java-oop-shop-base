package org.lessons.java.shop;

import java.math.BigDecimal;
import java.util.Random;

public class Prodotto {
private int codice;
private String nome;
private String descrizione;
private BigDecimal prezzo;   
private BigDecimal iva;

public Prodotto(String nome, String descrizione, BigDecimal prezzo, BigDecimal iva) {
    Random random = new Random();
    this.codice = random.nextInt(10000); 
    this.nome = nome;
    this.descrizione = descrizione;
    this.prezzo = prezzo;
    this.iva = iva;
}
// Getters e Setters

public int getCodice(){
    return codice;
}
public String getNome(){
    return nome;
}
public void setNome(String nome){
    this.nome = nome;
}

public String getDescrizione(){
    return descrizione;
}
public void setDescrizione(String descrizione){
    this.descrizione = descrizione;
}
public BigDecimal getPrezzo(){
    return prezzo;
}
public void setPrezzo(BigDecimal prezzo){
    this.prezzo = prezzo;
}
public BigDecimal getIva(){
    return iva;
}
public void setIva(BigDecimal iva){
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
