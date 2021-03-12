package isi.sn.dao;
import java.util.List;
import isi.sn.entities.User;

public interface IUser {

    public int add(User user) throws  Exception;
    public int delete(int id)throws  Exception;
    public int update(User user)throws  Exception;
    public List<User> getAll()throws  Exception;
    public User get(int id)throws  Exception;
    public User login(String email ,String password)throws  Exception;

}
