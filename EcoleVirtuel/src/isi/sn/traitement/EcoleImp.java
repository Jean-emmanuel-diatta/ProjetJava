package isi.sn.traitement;

import isi.sn.entities.Ecole;
import isi.sn.entities.Specialite;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class EcoleImp implements IEcole {
    @Override
    public Map<Specialite, Ecole> saisie()
    {
        String rep =null;
        Scanner sc = new Scanner(System.in);
        Ecole e =null;
        Specialite sp =null;
        Map<Specialite, Ecole>ListEcol = new HashMap<Specialite, Ecole>();
        do {
            e =new Ecole();
            sp =new Specialite();
       // Map<Specialite, Ecole>ListEcol = new HashMap<Specialite, Ecole>();
        System.out.println("entrer l'identifiant de l'ecole");
        e.setId(Integer.parseInt(sc.nextLine()));
        System.out.println("entrer le nom de l'ecole");
        e.setNom(sc.nextLine());
            System.out.println("entrer  l'id de la specialite de l'ecole");
            sp.setIdSpec(Integer.parseInt(sc.nextLine()));
            System.out.println("entrer le nom de la specialite");
            sp.setNomSpec(sc.nextLine());
            System.out.println(" Voulez-vous continuer? o/n");
            e.setSpecialite(sp);
            ListEcol.put(e.getSpecialite(),e);
            rep = sc.nextLine();
        }while (rep.equalsIgnoreCase("o"));
        return ListEcol;
    }
    @Override
    public void affichageEcole(Map<Specialite, Ecole> maps)
    {
        Collection<Ecole>ecoles =maps.values();
        for (Ecole ecole :ecoles)
        {
            System.out.println("l'id de l'ecole est :"+ ecole.getId());
            System.out.println(" le nom de l'ecole"+ ecole.getNom());
            System.out.println("l'id de la specialite est "+ ecole.getSpecialite().getIdSpec());
            System.out.println("le nom de la specialite est "+ ecole.getSpecialite().getNomSpec());
        }
    }
}
