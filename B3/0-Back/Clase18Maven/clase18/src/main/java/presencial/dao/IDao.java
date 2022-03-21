package presencial.dao;

public interface IDao <T> {
    T guardar(T t);
    T buscar(int id);
}
