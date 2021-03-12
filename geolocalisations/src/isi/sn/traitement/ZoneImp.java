package isi.sn.traitement;

import isi.sn.entities.Rn;
import isi.sn.entities.Zone;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ZoneImp implements IZone{
    Scanner sc= new Scanner(System.in);

    @Override
    public Zone saisie() {
        Zone z = new Zone();
        System.out.println("entrer l'id de la zone " );
        z.setId(Integer.parseInt(sc.nextLine()));
        System.out.println("entrer le nom de la zone");
        z.setNom(sc.nextLine());
        System.out.println("entrer la latitude de la zone");
        z.setLatitude(Double.parseDouble(sc.nextLine()));
        System.out.println("entrer la longitude de la zone ");
        z.setLongitude(Double.parseDouble(sc.nextLine()));
        return z;
    }

    @Override
    public void afichage(Zone zone) {
        System.out.println("l'id est :" + zone.getId());
        System.out.println("le nom de la zone est " +zone.getNom());
        System.out.println("la latitude de la zone est :" +zone.getLatitude());
        System.out.println("la longitude la zone est :" +zone.getLongitude());

    }
}
