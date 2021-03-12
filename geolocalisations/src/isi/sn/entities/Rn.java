package isi.sn.entities;

import java.util.List;

public class Rn {
private int idR;
private List<Zone>zones;
private  double latitudeR;
private double longitudeR;

    public Rn() {
    }

    public Rn(int idR, List<Zone> zones, double latitudeR, double longitudeR) {
        this.idR = idR;
        this.zones = zones;
        this.latitudeR = latitudeR;
        this.longitudeR = longitudeR;
    }

    public int getIdR() {
        return idR;
    }

    public void setIdR(int idR) {
        this.idR = idR;
    }

    public List<Zone> getZones() {
        return zones;
    }

    public void setZones(List<Zone> zones) {
        this.zones = zones;
    }

    public double getLatitudeR() {
        return latitudeR;
    }

    public void setLatitudeR(double latitudeR) {
        this.latitudeR = latitudeR;
    }

    public double getLongitudeR() {
        return longitudeR;
    }

    public void setLongitudeR(double longitudeR) {
        this.longitudeR = longitudeR;
    }
}
