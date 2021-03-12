package isi.sn.entities;

public class MedecinSpecialiste extends Medecin{
    private String specialité;

    public String getSpecilaté() {
        return specialité;
    }

    public void setSpecialité(String specialité) {
        this.specialité = specialité;
    }

    public MedecinSpecialiste(int id, String nomPers, String prenomPers, String specialité) {
        super(id, nomPers, prenomPers);
        this.specialité = specialité;
    }

    public MedecinSpecialiste(String specialité) {
        this.specialité = specialité;
    }
}
