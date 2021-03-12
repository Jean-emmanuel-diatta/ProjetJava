package isi.sn.entities;

public class Personne {
    protected int id;
    protected String nomPers;
    protected String prenomPers;

    public Personne(int id, String nomPers, String prenomPers) {
        this.id = id;
        this.nomPers = nomPers;
        this.prenomPers = prenomPers;
    }

    public Personne() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomPers() {
        return nomPers;
    }

    public void setNomPers(String nomPers) {
        this.nomPers = nomPers;
    }

    public String getPrenomPers() {
        return prenomPers;
    }

    public void setPrenomPers(String prenomPers) {
        this.prenomPers = prenomPers;
    }

    public void setSpecialité(String nextLine) {
    }

    public void getSpecialité() {
    }


    public void getNomService() {
    }
}
