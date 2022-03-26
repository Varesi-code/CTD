import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Empresa implements Serializable {
    private String cuit;
    private String razonSocial;
    private List<Empleado> empleados;

    public void agregarEmpleado(Empleado empleado){
        empleados.add(empleado);
    }

    public Empresa(String cuit, String razonSocial){
        this.cuit=cuit;
        this.razonSocial=razonSocial;
        empleados= new ArrayList<>();
    }

    public String getCuit() {
        return cuit;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public List<Empleado> getEmpleados() {
        return empleados;
    }

}
