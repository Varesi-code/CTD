package app.daoEstrategias;

//Interface DAO: Es la interface que obligará a las clases DAOs que la implementen a implementar las operaciones que necesitamos realizar sobre la base de datos.

public interface IDao<Entity> {

    //Metodos CRUD
    public boolean create(Entity entity);
    public Entity read(Long id);
    public boolean update(Entity entity);
    public boolean delete(Entity entity);


}
