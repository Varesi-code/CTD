package Presencial.Dao;

import java.sql.SQLException;

public interface IDao <T>{
    T insert(T t);
    T update(T t);
    T select(int id);
    String delete(int id);
}
