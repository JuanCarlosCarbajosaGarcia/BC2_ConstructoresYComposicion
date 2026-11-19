public class Procesador {
    private int nucleos;

    public Procesador(int nucleos) {
                setNucleos(nucleos);
    }

    public int getNucleos() {
        return nucleos;
    }

    public void setNucleos(int nucleos) {
        if (nucleos<=0){
            throw new IllegalArgumentException("nucleos debe ser mayor que cero");
        }
        this.nucleos = nucleos;
    }
}
