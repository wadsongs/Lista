public class ListaDinamica {

    private No primeiro;
    private No ultimo;
    int cont;

    public ListaDinamica() {
        primeiro = null;
        ultimo = null;
        cont = 0;
    }

    public void add (int posicao, Object elemento) {
        No novo = new No(elemento);
        No aux = primeiro;

        // percorre a lista até o elemento anterior

        aux.proximo = novo;

    }

    public void add(Object elemento) {
        No novo = new No(elemento);

        if (primeiro == null) {   //lista vazia
            primeiro = novo;
            ultimo = novo;
        } else {
            ultimo.proximo = novo;
            ultimo = novo;
        }
        cont++;
    }
    public void remove (Object elemento) {
        int posicao = indexOf(elemento);

        No aux = primeiro;

        for(int i = 0; i < posicao-1; i++) {
            aux = aux.proximo;
        }
        if (posicao == 0) { //primeiro elemento
            primeiro = primeiro.proximo;
        } else {
            aux.proximo = aux.proximo.proximo;

            if (posicao == cont -1) { //ultimo elemento
                ultimo = aux;
            }
        }
    }
    public boolean contains(Object elemento) {
        No aux = primeiro;

        while (aux != null) {
            if (aux.dado.equals(elemento)) {
                return true;
            }
            aux = aux.proximo;
        }
        return false;
    }
    public int indexOf(Object elemento) {
        No aux = primeiro;
        int posicao = 0;

        while (aux != null) {
            if (aux.dado.equals(elemento)) {
                return posicao;
            }
            aux = aux.proximo;
            posicao++;
        }
        return -1;
    }

    public void clear() {
        primeiro = null;
        ultimo = null;
        cont = 0;
    }

    public void show() {
        No aux = primeiro;

        while (aux != null) {
            System.out.print(aux.dado + " ");
            aux = aux.proximo;
        }
    }

    public int size() {
        return cont;
    }
}
