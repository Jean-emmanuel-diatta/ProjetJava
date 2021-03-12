package main;

import isi.sn.dao.Db;
import isi.sn.dao.IUser;
import isi.sn.dao.UserImp;
import isi.sn.entities.User;

import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
      /*  Db db = new Db();
        db.open();

        String sql ="INSERT INTO user VALUES(NULL,?,?,?,?)";
        db.init(sql);
        db.getPstm().setString(1,"diatta");
        db.getPstm().setString(2,"jean");
        db.getPstm().setString(3,"jeanemmanuel@isi.sn");
        db.getPstm().setString(4,"paser12");
        int ok =db.executeUdate();
        System.out.println(ok);
        */
        IUser userdao = new UserImp();
        User user =new User();
        user.setNom("diop");
        user.setPrenom("tapha");
        user.setEmail("diop.sn");
        user.setPassword("13ejfjh");
        int ok =userdao.add(user);
        System.out.println(ok);
        List<User>users =userdao.getAll();
        for (User u: users){
            System.out.println("id "+ u.getId() + " nom " + u.getNom() + " prenom " + u.getPrenom() +
                    " email " +u.getEmail() + " password " + u.getPassword());
        }
    }
}
