public class Ordenador {
    private String marca;
    private String modelo;
    Procesador procesador;

    public Ordenador(String marca, String modelo,int nucleos) {
        setMarca(marca);
        setModelo(modelo);
        new Procesador(nucleos);
    }

    public Ordenador(String marca, String modelo) {
        setMarca(marca);
        setModelo(modelo);
        this.procesador = new Procesador(4);
    }

    public Ordenador() {
        this.marca = "Desconocida";
        this.modelo = "Desconocido";
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "Ordenador{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", nucleos=" + procesador +
                '}';
    }
}
