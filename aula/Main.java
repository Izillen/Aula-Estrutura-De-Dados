public class Main {
    public static void main(String[] args) {
        Arvore arvore = new Arvore("C://");
        arvore.adicionar("Arquivos");
        arvore.adicionar("Windows");
        arvore.adicionar("Usuários");
        System.out.println(arvore);

    }
}

