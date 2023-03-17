public class Main {
    public static void main(String[] args) {
//        ListaEstatica lista = new ListaEstatica();
        ListaDinamica lista2 = new ListaDinamica();

//        lista.add(0,2);
//        lista.add(2,3);
//        lista.add(1,5);
//        lista.add(3,7);
//        lista.add(4,1);
//        lista.add(5,4);
//        lista.add(6,6);
//        lista.add(7,8);
//        lista.add(8,9);
//        lista.add(9,0);
//        lista.add(11,7);

        lista2.add(3);
        lista2.add(5);
        lista2.add(4);
        lista2.add(2);
        lista2.add(1);
        System.out.println(lista2.contains(5));
        System.out.println(lista2.indexOf(5));
        lista2.remove((Integer)5);
        lista2.show();


    }
}