package presencial.service;

import presencial.dao.IDao;
import presencial.modelo.Medicamento;

public class MedicamentoService {
    private IDao<Medicamento> medicamentoDao;

    public MedicamentoService(IDao<Medicamento> medicamentoDao) {
        this.medicamentoDao = medicamentoDao;
    }

    public Medicamento guardar(Medicamento medicamento){
        return medicamentoDao.guardar(medicamento);
    }
}
