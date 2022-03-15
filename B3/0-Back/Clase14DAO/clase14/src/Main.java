import presencial.bd.BD;
import presencial.dao.MedicamentoDaoH2;
import presencial.modelo.Medicamento;
import presencial.service.MedicamentoService;

public class Main {
    public static void main(String[] args) throws Exception {
        //crear base de datos
        BD.crearBD();

        MedicamentoService medicamentoService= new MedicamentoService(new MedicamentoDaoH2());
        Medicamento medicamento= new Medicamento("Ibuprofeno Forte","lab",4,685.5,5);
        medicamentoService.guardar(medicamento);
    }
}
