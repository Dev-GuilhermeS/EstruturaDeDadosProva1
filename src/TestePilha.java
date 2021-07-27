public class TestePilha {
    public static void main(String[] args) {
        
        ListaPilha listaPilha = new ListaPilha<>();

        listaPilha.adicionar("Guilherme");
        listaPilha.adicionar("Rubens");
        listaPilha.adicionar("Matheus");
        listaPilha.adicionar("Wendel");

        System.out.println("Adicionados: " + listaPilha);

        listaPilha.remover();

        System.out.println("Removendo: " + listaPilha+ "\n");

        listaPilha.adicionar("Iara");
        listaPilha.adicionar("Caroline");

        System.out.println("Adicionados: " + listaPilha);

        listaPilha.remover();

        System.out.println("Removendo: " + listaPilha);
    }
    
}
