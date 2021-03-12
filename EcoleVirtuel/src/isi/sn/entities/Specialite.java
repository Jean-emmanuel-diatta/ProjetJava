package isi.sn.entities;

public class Specialite {
    private int idSpec;
    private String nomSpec;

    public Specialite() {
    }

    public Specialite(int idSpec, String nomSpec) {
        this.idSpec = idSpec;
        this.nomSpec = nomSpec;
    }

    public int getIdSpec() {
        return idSpec;
    }

    public void setIdSpec(int idSpec) {
        this.idSpec = idSpec;
    }

    public String getNomSpec() {
        return nomSpec;
    }

    public void setNomSpec(String nomSpec) {
        this.nomSpec = nomSpec;
    }
}
