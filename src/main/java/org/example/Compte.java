/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package org.example;

import java.util.ArrayList;
import java.time.LocalDateTime;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import java.util.List;
public class Compte {

    private static Integer counter = 0;

    private int numCompte;
    private LocalDateTime dateCreation;
    private LocalDateTime dateUpdate;
    private Devise devise;
    private List<Transaction> transactions;
    private banque Banque;
    private client client;

    public Compte(Devise devise, banque Banque, client client) {
        this.numCompte = counter;
        this.dateCreation = LocalDateTime.now();
        this.dateUpdate = LocalDateTime.now();
        this.devise = devise;
        this.Banque = Banque;
        this.client = client;
        this.transactions = new ArrayList<>();
        this.client.addCompte(this);
        counter++;
    }

    public List<Transaction> getTransactions() {
        return new ArrayList<>(transactions);
    }

    public void addTransaction(Transaction transaction) {
        this.transactions.add(transaction);
    }

    public client getClient() {
        return client;
    }

    public banque getBanque() {
        return Banque;
    }

    public int getNumCompte() {
        return numCompte;
    }

    @Override
    public String toString() {
        return "Compte{" +
                "numCompte='" + numCompte + '\'' +
                ", dateCreation=" + dateCreation +
                ", dateUpdate=" + dateUpdate +
                ", devise=" + devise +
                ", transactions=" + transactions.stream().map(transaction -> transaction.getReference()) +
                ", banque=" + Banque +
                ", clientNum=" + client.getNumClient() +
                '}';
    }

    public enum Devise {
        USD,
        EUR,
        GBP,
        JPY,
        CNY,
        XAF,
        MAD
    }

        public String toJson() {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            return objectMapper.writeValueAsString(this); // Converts this object to JSON
        } catch (JsonProcessingException e) {
            System.out.println("An error occurred while converting this object to JSON");
            return null;
        }
    }
}

   