public class ViolaoFlet extends Prototype{

    private int quantidadeCordas=6;
    private String qualidadeCorda="Nylon";
    private double valor=700;


    @Override
    public Prototype clone() {
        System.out.println("Clonou "+ViolaoFlet.class);
        ViolaoFlet novo = new ViolaoFlet();
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
