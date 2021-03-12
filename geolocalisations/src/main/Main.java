package main;

import isi.sn.entities.Rn;
import isi.sn.traitement.IRn;
import isi.sn.traitement.RnImp;

public class Main {
    public static void main(String[] args) {
        IRn in = new RnImp();
        Rn rn = in.saisie();
        in.affichage(rn);

    }
}
