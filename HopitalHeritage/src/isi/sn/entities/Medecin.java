package isi.sn.entities;

public class Medecin extends Personne {
    private String service;
    private String Specialité;

    public Medecin(int id, String nomPers, String prenomPers) {
        super(id, nomPers, prenomPers);
    }

    public Medecin() {
        super();
    }

    public void setBureau(String nextLine) {
    }

    public void setService(String nextLine) {
    }


    public void getBureau() {
    }
}
