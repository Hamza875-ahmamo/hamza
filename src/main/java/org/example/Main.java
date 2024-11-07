package org.example;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        banque cih = new banque("B001", banque.pays.CAMEROUN);
        banque bankOfNiGERIA = new Banque("B002", pays.NIGERIA);
        banque centralBank = new Banque("B003", pays.SENEGAL);

        client client1 = new client(
                "John",
                "Doe",
                "123 Main Street",
                "1234567890",
                "johnDowe@gmail.com",
                null
        );
        Compte compte11 = new Compte(
                Compte.Devise.MAD,
                cih,
                client1
        );
        Compte compte12 = new Compte(
                Compte.Devise.MAD,
                cih,
                client1
        );


        client client2 = new client(
                "Jane",
                "Smith",
                "456 Elm Street",
                "0987654321",
                "janeSmith@gmail.com",
                null
        );
        Compte compte2 = new Compte(
                Compte.Devise.EUR,
                bankOfNiGERIA,
                client2
        );

        client client3 = new client(
                "Alice",
                "Johnson",
                "789 Oak Street",
                "1122334455",
                "aliceJohnson@gmail.com",
                null
        );
        Compte compte3 = new Compte(
                Compte.Devise.GBP,
                centralBank,
                client3
        );

        client client4 = new client(
                "Bob",
                "Brown",
                "321 Pine Street",
                "6677889900",
                "bobBrown@gmail.com",
                null
        );
        Compte compte4 = new Compte(
                Compte.Devise.MAD,
                cih,
                client4
        );

        // VIRIN
        Transaction transaction1 = new Transaction(List.of(compte11, compte4));
        System.out.println(transaction1);
        System.out.println(client1);
        System.out.println(client1.getComptes());
    }
}