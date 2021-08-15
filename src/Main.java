public class Main {
    public static void main(String[] args) {

        Violao7Cordas v1 = new Violao7Cordas();
        Violao12Cordas v2 = new Violao12Cordas();
        ViolaoClassico v3 = new ViolaoClassico();
        ViolaoDuploZero v4 = new ViolaoDuploZero();
        ViolaoFlet v5 = new ViolaoFlet();
        ViolaoFolk v6 = new ViolaoFolk();
        ViolaoJumbo v7 = new ViolaoJumbo();
        ViolaoTriploZero v8 = new ViolaoTriploZero();
        ViolaoZero v9 = new ViolaoZero();

        fazAlgumaCoisa(v1);
        fazAlgumaCoisa(v2);
        fazAlgumaCoisa(v3);
        fazAlgumaCoisa(v4);
        fazAlgumaCoisa(v5);
        fazAlgumaCoisa(v6);
        fazAlgumaCoisa(v7);
        fazAlgumaCoisa(v8);
        fazAlgumaCoisa(v9);
    }

    public static void fazAlgumaCoisa(Prototype o){
        Prototype p=o.clone();
        ViolaoClassico v1 = null;
        Violao7Cordas v2 = null;
        Violao12Cordas v3 = null;
        ViolaoDuploZero v4 = null;
        ViolaoFlet v5 = null;
        ViolaoFolk v6 = null;
        ViolaoJumbo v7 = null;
        ViolaoTriploZero v8 = null;
        ViolaoZero v9 = null;

        if(p instanceof ViolaoClassico){
            v1=(ViolaoClassico) p;
        }else if(p instanceof Violao7Cordas){
            v2=(Violao7Cordas) p;
        }else if(p instanceof Violao12Cordas){
            v3=(Violao12Cordas) p;
        }else if(p instanceof ViolaoDuploZero){
            v4=(ViolaoDuploZero) p;
        }else if(p instanceof ViolaoFlet){
            v5=(ViolaoFlet) p;
        }else if(p instanceof ViolaoFolk){
            v6=(ViolaoFolk) p;
        }else if(p instanceof ViolaoJumbo){
            v7=(ViolaoJumbo) p;
        }else if(p instanceof ViolaoTriploZero){
            v8=(ViolaoTriploZero) p;
        }else if(p instanceof ViolaoZero){
            v9=(ViolaoZero) p;
        }
    }
}
