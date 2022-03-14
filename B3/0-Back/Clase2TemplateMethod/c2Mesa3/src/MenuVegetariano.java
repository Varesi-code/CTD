public class MenuVegetariano extends Menu {
    private double adicionalEspecias;
    private boolean especias;
    private double adicionalSalsa;
    private int salsas;

    public MenuVegetariano(double precioBase, double adicionalEspecias, boolean especias, double adicionalSalsa, int salsas) {
        super(precioBase);
        this.adicionalEspecias = adicionalEspecias;
        this.especias = especias;
        this.adicionalSalsa = adicionalSalsa;
        this.salsas = salsas;
    }

    public double getAdicionalEspecias() {
        return adicionalEspecias;
    }

    public void setAdicionalEspecias(double adicionalEspecias) {
        this.adicionalEspecias = adicionalEspecias;
    }

    public boolean isEspecias() {
        return especias;
    }

    public void setEspecias(boolean especias) {
        this.especias = especias;
    }

    public double getAdicionalSalsa() {
        return adicionalSalsa;
    }

    public void setAdicionalSalsa(double adicionalSalsa) {
        this.adicionalSalsa = adicionalSalsa;
    }

    public int getSalsas() {
        return salsas;
    }

    public void setSalsas(int salsas) {
        this.salsas = salsas;
    }
}
