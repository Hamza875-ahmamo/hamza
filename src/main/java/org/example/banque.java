package org.example;
import java.util.ArrayList;
public class banque {
     private String id;
     private String pays;
     private ArrayList<Compte> comptes;
     enum Pays {
        CAMEROUN,
        NIGERIA,
        TOGO,
        BENIN,
        SENEGAL,
        MALI,
        BURKINA_FASO,
        COTE_DIVOIRE,
        GABON,
        CONGO,
        TCHAD,
        RCA,
        GUINEE,
        GUINEE_BISSAU,
        GUINEE_EQUATORIALE,
        MAURITANIE,
        NIGER,
        LIBERIA,
        SIERRA_LEONE,
        GHANA,
        RDC,
        BURUNDI,
        RWANDA,
        OUGANDA,
        KENYA,
        TANZANIE,
        ANGOLA,
        NAMIBIE,
        ZAMBIE,
        ZIMBABWE,
        MOZAMBIQUE,
        MADAGASCAR,
        MAURICE,
        SEYCHELLES,
        COMORES,
        DJIBOUTI,
        SOMALIE,
        ETHIOPIE,
        ERITREE,
        SOUDAN,
        SOUDAN_DU_SUD,
        EGYPTE,
        LIBYE,
        TUNISIE,
        ALGERIE,
        MAROC,
        SAHARA_OCCIDENTAL,
        GAMBIE,
        BOTSWANA,
    }
     public banque(String id,String pays){
          this.id=id;
          this.pays=pays;
          comptes=new ArrayList<Compte>();
          
          }
          @Override
    public String toString() {
        return "Banque{" +
                "id='" + id + '\'' +
                ", pays=" + pays +
                '}';
    }
}


