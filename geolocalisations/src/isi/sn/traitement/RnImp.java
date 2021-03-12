package isi.sn.traitement;

import isi.sn.entities.Rn;
import isi.sn.entities.Zone;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RnImp implements IRn {

    @Override
    public Rn saisie() {
        String rep =null;
        Scanner sc = new Scanner(System.in);
        List<Zone>zones = new ArrayList<Zone>();
        Rn r = new Rn();
        //la saisie de la route
        System.out.println("entrer l'id de la route ");
        r.setIdR(Integer.parseInt(sc.nextLine()));
        System.out.println("entrer la latitude de la route");
        r.setLatitudeR(Double.parseDouble(sc.nextLine()));
        System.out.println("entrer la longitude de la route");
        r.setLongitudeR(Double.parseDouble(sc.nextLine()));
        do{
           // r.getZones().add(new ZoneImp().saisie());
            //intenciation d'une nouvelle zone
            Zone z = new Zone();
            IZone iz =new ZoneImp();
            z=iz.saisie();
            zones.add(z);
            System.out.println("voulez-vous saisir une zone? o/n");
            rep =sc.nextLine();
        }while (rep.equalsIgnoreCase("o"));
        r.setZones(zones);
        return r;
    }

    @Override
    public void affichage(Rn rn) {

        System.out.println("-------Affichage--------------");
        System.out.println("l'id  de la route est de : " + rn.getIdR());
        System.out.println("la latitude de la route est de  : " + rn.getLatitudeR());
        System.out.println("la longitude de la route est de : " + rn.getLongitudeR());

        for (Zone z :rn.getZones())
        {
            new ZoneImp().afichage(z);
        }
    }
}