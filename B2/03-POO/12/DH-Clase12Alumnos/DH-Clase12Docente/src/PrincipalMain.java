
public class PrincipalMain {

	public static void main(String[] args) {
		Cuenta ca= new CuentaCorriente();
		ca.setSaldo(100);

		if (ca instanceof CajaAhorro) {
		((CajaAhorro)ca).cobrarIntereses();
		}
		System.out.println(ca.informarSaldo());
		
	}

}
