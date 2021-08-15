public class ViolaoClassico extends Prototype {


    private int quantidadeCordas=6;
    private String qualidadeCorda="Nylon";
    private double valor=500;

    @Override
    public Prototype clone() {
        System.out.println("Clonou "+ViolaoClassico.class);
        ViolaoClassico novo = new ViolaoClassico();
        novo.setQualidadeCorda(this.qualidadeCorda);
        novo.setValor(this.valor);
        novo.setQuantidadeCordas(this.quantidadeCordas);
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
