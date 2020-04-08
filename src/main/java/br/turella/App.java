package br.turella;

public final class App {
    private App() {
    }

    public static void main(String[] args) {
        Lista lista = new Lista();

        lista.addEnd("Huguinho");
        lista.addEnd("Zezinho");
        lista.addEnd("Luizinho");
        lista.addStart("Patinhas");
        System.out.println(lista.show());

        No removido = lista.removeStart();

        System.out.println("Removido " + removido.getInfo());
        System.out.println(lista.show());

        removido = lista.removeEnd();
        System.out.println("Removido" + removido.getInfo());
        System.out.println(lista.show());
    }
}
