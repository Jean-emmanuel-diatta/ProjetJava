package isi.sn.traitement;

import isi.sn.entities.Rn;
import isi.sn.entities.Zone;

import java.util.List;

public interface IRn {
   // public List<Zone> liste();
   // public void affichage(List<Zone> zones);
    public Rn saisie();
    public void affichage(Rn rn);
}
