public class ViolaoDuploZero extends Prototype {

    private int quantidadeCordas=6;
    private String qualidadeCorda="Aço";
    private double valor=750;


    @Override
    public Prototype clone() {
        System.out.println("Clonou "+ViolaoDuploZero.class);
        ViolaoDuploZero novo = new ViolaoDuploZero();
        novo.setQualidadeCorda(this.qualidadeCorda);
        novo.setQuantidadeCordas(this.quantidadeCordas);
        novo.setValor(this.valor);
        return novo;
    }

    public int getQuantidadeCordas() {
        return quantidadeCordas;
    }

    public void setQuantidadeCordas(int quantidadeCordas) {
        this.quantidadeCordas = quantidadeCordas;
    }

    public String getQualidadeCorda() {
        return qualidadeCorda;
    }

    public void setQualidadeCorda(String qualidadeCorda) {
        this.qualidadeCorda = qualidadeCorda;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
