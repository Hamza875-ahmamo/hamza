package org.example;

public enum typeTransaction {
    VIRIN, // Transcation entre 2 clients de la meme Banque
    VIREST, // Transcation entre deux clients de meme Pays
    VIRMULTA,// Transcation entre 2 clients de deux Bnaques differentes de meme pays
    VIRCHKA // Transcatio entre 2 clients de deux banques differentes de deux pays differentes
}
