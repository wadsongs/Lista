public class ListaEstatica {

    private int v[] = new int[10];
    private int cont = 0;

    public void add(int elemento) {
//        if (cont >= v.lenght) {
//            int vaux[] = new int[(int)(v.length*1.5)]; //novo array
//        }
        v[cont] = elemento;
        cont++;
    }

    public void add(int posicao, int elemento) {
        for (int i = cont; i > posicao; i--) {
            v[i] = v[i-1];
        }
        if (v.length == cont) {
            System.out.println("Lista Cheia!");
        } else {
        v[posicao] = elemento;
        cont++;
        }
    }

    public void show () {
        for (int i = 0; i < cont; i++) {
            System.out.print(v[i] + " ");
        }
    }
}
