package org.example;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class client {
  private int Numclient;
  private String nom,prenom;
  private String adresse;
  private String phone;
  private String email;
  private ArrayList<Compte> comptes;
  public client(int Numclient,String nom,String adresse,String phone,String email,String prenom){
    this.Numclient=Numclient;
    this.nom=nom;
    this.adresse=adresse;
    this.nom=nom;
    this.phone=phone;
    this.email=email;
    this.prenom=prenom;
    ArrayList<Compte> compte=new ArrayList<>();
     }
     public List<Compte> getComptes() {
        return new ArrayList<>(comptes);
    }

    public int getNumClient() {
        return Numclient;
    }

    public void addCompte(Compte compte) {
        this.comptes.add(compte);
    }

    @Override
    public String toString() {
        return "Client{" +
                "numClient='" + Numclient + '\'' +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", adresse='" + adresse + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
//                ", comptes=" + comptes +
                '}';
    }
    public String toJson() {
      ObjectMapper objectMapper = new ObjectMapper();
      try {
          return objectMapper.writeValueAsString(this); // Converts this object to JSON
      } catch (JsonProcessingException e) {
          System.out.println("An error occurred while converting this object to JSON.");
          return null;
      }
  }
}
  

    
