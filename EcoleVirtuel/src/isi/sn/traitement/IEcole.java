package isi.sn.traitement;

import isi.sn.entities.Ecole;
import isi.sn.entities.Specialite;

import java.util.Map;

public interface IEcole {

    public Map<Specialite , Ecole>saisie();
    public void affichageEcole(Map<Specialite, Ecole>maps);
}
