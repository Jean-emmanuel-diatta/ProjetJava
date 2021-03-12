package isi.sn.entities;

public class MedecinChef extends Medecin{
    private String Bureau;



    public MedecinChef(int id, String nomPers, String prenomPers) {
        super(id, nomPers, prenomPers);
    }

    public MedecinChef(int id, String nomPers, String prenomPers, String bureau) {
        super(id, nomPers, prenomPers);
        Bureau = bureau;
    }

    public void setBureau(String bureau) {
        Bureau = bureau;
    }
}
