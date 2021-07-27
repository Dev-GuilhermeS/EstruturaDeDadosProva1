public class TesteLigada {
    public static void main(String[] args) {
        ListaLigada listaLigada = new ListaLigada();
        ListaLigada listaIntercalar = new ListaLigada();

        listaLigada.add(5);
        listaLigada.add(10);
        listaLigada.add(15);
        listaLigada.add(20);

        System.out.println("Lista normal: " + listaLigada);
        listaLigada.inverte();
        System.out.println("Lista invertida: " + listaLigada);
        listaLigada.inverte();
        System.out.println("Lista normal: " + listaLigada);
        listaLigada.inverte();
        System.out.println("Lista invertida: " + listaLigada);
        listaLigada.inverte();

        listaIntercalar.add(1);
        listaIntercalar.add(2);
        listaIntercalar.add(3);
        listaIntercalar.add(4);

        listaLigada.intercalar(listaIntercalar);

        System.out.println("\nLista intercalada: " + listaLigada);

        ListaLigada novaLista = new ListaLigada();

        novaLista.add(7777);
        novaLista.add(4444);
        novaLista.add(2222);
        novaLista.add(5555);

        System.out.println("Lista sem união: " + novaLista);
        novaLista.unir(listaIntercalar);
        System.out.println("Lista com união: " + novaLista);

        
    }
}
