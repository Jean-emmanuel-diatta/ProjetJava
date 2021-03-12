package isi.sn.traitement;

import isi.sn.entities.Medecin;

import java.util.ArrayList;
import java.util.Scanner;

public class MedecimImp implements IMedecin {
    @Override
    public Medecin saisie() {
        Scanner scan = new Scanner(System.in);
        //l'instenciation du medecin

        System.out.println("---------------------------------------------");
        System.out.println("*********** AJOUTER UN MEDECIN  *************");
        System.out.println("---------------------------------------------");


        Medecin m = new Medecin();
        System.out.println("entrer l'id du medecin");
        m.setId(Integer.parseInt(scan.nextLine()));
        System.out.println("entrer le nom du medecin");
        m.setNomPers(scan.nextLine());
        System.out.println("entrer le prenom du medecin");
        m.setPrenomPers(scan.nextLine());
        System.out.println("entrer l' specialiste  du medecin");
        m.setSpecialité(scan.nextLine());
        System.out.println("entrer l'id du service");
        m.setId(Integer.parseInt(scan.nextLine()));
        System.out.println("entrer le nom du service du medecin");
        m.setService(scan.nextLine());
        System.out.println("entrer le bureau du medecin");
        m.setBureau(scan.nextLine());



        return m;
    }

    @Override
    public void affichage(Medecin m) {

        System.out.println("---------------------------------------------");
        System.out.println("************* Les Informations **************");
        System.out.println("---------------------------------------------");
        System.out.println("---------------------------------------------");

        System.out.println("l'id du medecin est : " + m.getId());
        System.out.println("le nom du medecin   : " + m.getNomPers());
        System.out.println("le prenom du medecin   : " + m.getPrenomPers());
        System.out.println("l'id du service : " + m.getId());



    }

    public void afficherListe() {
        System.out.println("---------------------------------------------");
        System.out.println("********* LA LISTE  DES SPECIALITES  ********");
        System.out.println("---------------------------------------------");

        ArrayList list = new ArrayList();
        list.add("1- Dentiste");
        list.add("2- Chirigiste");
        list.add("3- Pediatre");
        list.add("4- Neurologue");
        list.add("5- Gynécologue");
        list.add("6- Dermatologue");

        for (Object elm : list) {
            System.out.println(elm);
        }
    }
}