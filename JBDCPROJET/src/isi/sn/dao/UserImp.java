package isi.sn.dao;

import isi.sn.entities.User;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class UserImp implements IUser {
    Db db = new Db();
    @Override
    public int add(User user) throws Exception {
        db.open();

        String sql ="INSERT INTO user VALUES(NULL,?,?,?,?)";
        db.init(sql);
        db.getPstm().setString(1,user.getNom());
        db.getPstm().setString(2,user.getPrenom());
        db.getPstm().setString(3,user.getEmail());
        db.getPstm().setString(4,user.getPassword());
        int ok =db.executeUdate();
        return ok;
    }

    @Override
    public int delete(int id) throws Exception {
        db.open();
        String sql ="DELETE FROM user WHERE id =?";
        db.init(sql);
        db.getPstm().setInt(1,id);

        int ok =db.executeUdate();
        return ok;
    }

    @Override
    public int update(User user) throws Exception {
        String sql ="UPDATE user SET nom =? ,prenom =?,email =? ,password =? WHERE id =?";
        db.init(sql);
        db.getPstm().setString(1,user.getNom());
        db.getPstm().setString(2,user.getPrenom());
        db.getPstm().setString(3,user.getEmail());
        db.getPstm().setString(4,user.getPassword());
        db.getPstm().setInt(5,user.getId());
        int ok =db.executeUdate();
        return ok;
    }

    @Override
    public List<User> getAll() throws Exception {
        List<User >user =new ArrayList<User>();
        db.open();
        String sql ="SELECT * FROM user";
        db.init(sql);
        ResultSet rs =db.executeSelect();
        while (rs.next()){
            User user1 =new User();
            user1.setId(rs.getInt(1));
            user1.setNom(rs.getString(2));
            user1.setPrenom(rs.getString(3));
            user1.setEmail(rs.getString(4));
            user1.setPassword(rs.getString(5));
            user.add(user1);
        }
        return user;
    }

    @Override
    public User get(int id) throws Exception {
        User user =null;
        db.open();
        String sql ="SELECT * FROM user WHERE id =?";
        db.init(sql);
        db.getPstm().setInt(1,id);
        ResultSet rs= db.executeSelect();
        if(rs.next()){
            user =new User();
            user.setId(rs.getInt(1));
            user.setNom(rs.getString(2));
            user.setPrenom(rs.getString(3));
            user.setEmail(rs.getString(4));
            user.setPassword(rs.getString(5));
        }
        return user;
    }

    @Override
    public User login(String email, String password) throws Exception {
        User user =null;
        db.open();
        String sql ="SELECT * FROM user WHERE email =? AND password =?";
        db.init(sql);
        db.getPstm().setString(1,email);
        db.getPstm().setString(1,password);
        ResultSet rs= db.executeSelect();
        if(rs.next()){
            user =new User();
            user.setId(rs.getInt(1));
            user.setNom(rs.getString(2));
            user.setPrenom(rs.getString(3));
            user.setEmail(rs.getString(4));
            user.setPassword(rs.getString(5));
        }
        return user;
    }
}
