package ListaSimpEncaCircular;

public class Teste {

    public static void main(String[] args) {


        ListaCircular lista = new ListaCircular();

        for (int i = 10; i >= 1; i--){
            lista.inserirNoInicio(new No(i));
        }

       // lista.inserirNoInicio(new ListaSimpEncaCircular.No(3));
       // lista.inserirNoInicio(new ListaSimpEncaCircular.No(2));
       // lista.inserirNoInicio(new ListaSimpEncaCircular.No(1));


        lista.inserirNoFim(new No(4));
        lista.imprimir();
    }
}