public class MenuInfantil extends Menu{
    private double adicionalJuguete;
    private int juguetes;

    public MenuInfantil(double precioBase, double adicionalJuguete, int juguetes) {
        super(precioBase);
        this.adicionalJuguete = adicionalJuguete;
        this.juguetes = juguetes;
    }

    public double getAdicionalJuguete() {
        return adicionalJuguete;
    }

    public void setAdicionalJuguete(double adicionalJuguete) {
        this.adicionalJuguete = adicionalJuguete;
    }

    public int getJuguetes() {
        return juguetes;
    }

    public void setJuguetes(int juguetes) {
        this.juguetes = juguetes;
    }
}
