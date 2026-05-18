public class Arvore {

    No raiz;

    public Arvore(String valor) {
        this.raiz = new No(valor, null);
    }

    public void adicionar(String valor, String valorPai) {
        No pai = buscar(valorPai);

        No novoNo = new No(valor, this.raiz);
        this.raiz.adicionarFilho(novoNo);
    }

    public No buscar(String valor) {
        return buscar(valor, this.raiz);
    }

    public No buscar(String valor, No atual) {
        if (valor == atual.valor){
            return atual;
        }

        for (No filho : atual.filhos) {
            if(filho.valor == valor){
                return filho;
            }
            buscar(valor, filho);
        }
        return null;
    }
}
