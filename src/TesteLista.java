import java.util.ArrayList;

public class TesteLista {
    public static void main(String[] args) {

        Lista lista = new Lista(10);
        Lista listaParaIntercalar = new Lista(10);
        ArrayList listaIntercalarNormal = new ArrayList();

        lista.adiciona(40);
        lista.adiciona(35);
        lista.adiciona(30);
        lista.adiciona(25);

        System.out.println(lista);
        lista.inverter();
        System.out.println(lista);

        listaParaIntercalar.add(5);
        listaParaIntercalar.add(10);
        listaParaIntercalar.add(15);
        listaParaIntercalar.add(20);

        listaIntercalarNormal.add(111);
        listaIntercalarNormal.add(444);
        listaIntercalarNormal.add(888);
        listaIntercalarNormal.add(555);

    }
}