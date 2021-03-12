package main;

import isi.sn.entities.Medecin;
import isi.sn.traitement.IMedecin;
import isi.sn.traitement.MedecimImp;

public class Main {
    public static void main(String[] args) {
        IMedecin medecin = new MedecimImp();
        Medecin me =medecin.saisie();
        medecin.affichage(me);
        ((MedecimImp) medecin).afficherListe();
    }
}
