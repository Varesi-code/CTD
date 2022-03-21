package app.persistenceServices;

//Clases ServiceEntity: Por cada entidad tendremos una clase de servicio.
// Las clases de servicio serán utilizadas por la capa de presentación y nos permite desacoplar el acceso a datos de la vista.

import app.daoEstrategias.IDao;
import app.entidades.Entity;

public class ServiceEntity {
    //Tienen una referencia, es decir, un atributo llamado dao del tipo DAO. Este atributo puede ser cualquier clase que implemente dicha interface y esto nos permite el día de mañana cambiar el mecanismo de persistencia mucho más fácil y de manera dinámica, simplemente apuntando a nuestra clase service al nuevo DAO (dinamic binding).
    private IDao<Entity> entityDao;

    public IDao<Entity> getEntityDao() {
        return entityDao;
    }

    public void setEntityDao(IDao<Entity> entityDao) {
        this.entityDao = entityDao;
    }

    public void save(Entity entity){
        //delegar a la clase DAO la responsabilidad de guardar la entidad
        entityDao.create(entity);
    }

    public void delete(Entity entity){
        //delegar a la clase DAO la responsabilidad de eliminar la entidad
        entityDao.delete(entity);
    }

    public Entity findById(Long id){
        //delegar a la clase DAO la responsabilidad de buscar la entidad por id
        return entityDao.read( id);
    }
}
