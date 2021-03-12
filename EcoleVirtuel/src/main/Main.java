package main;

import isi.sn.entities.Ecole;
import isi.sn.entities.Specialite;
import isi.sn.traitement.EcoleImp;
import isi.sn.traitement.IEcole;

import java.util.Map;

public class Main {
    public static void main(String[] args) {
        IEcole ie =new EcoleImp();
        Map<Specialite,Ecole>ListEcol = ie.saisie();
        ie.affichageEcole(ListEcol);

    }
}
