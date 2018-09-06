package ListaSimpEncaCircular;

import ListaSimpEncaCircular.No;

public class ListaCircular {
    //private
    No inicio;

    public ListaCircular() {
        this.inicio = null;


    }
    // VERIFICA SE A LISTA ESTA VAZIA
    public boolean isVazia(){
        return inicio ==  null;
    }

    //INSERIR ELEMENTO NO INICIO DA LISTA
    public void inserirNoInicio(No no){
        if (isVazia()){
            inicio = no;
            no.setProximo(inicio);

        }else{
            no.setProximo(inicio);
            No aux = inicio;

            do {
                aux = aux.getProximo();
            }while (aux.getProximo() != inicio);

            aux.setProximo(no); //--APONTAR O PROXIMO DO ELEMENTO(FINAL) PARA O NO CRIADO
            inicio =  no; // -- APONTAR O INICIO PARA O NO CRIADO
        }
    }
    public void inserirNoFim(No no){
        if (isVazia()){
            inserirNoInicio(no);

        }else {
            No aux = inicio;

            do {
                aux = aux.getProximo();
            }while (aux.getProximo() != inicio);

            aux.setProximo(no);
            no.setProximo(inicio);
        }
    }

    public void imprimir(){
        if (!isVazia()){
            No aux = inicio;

            do {
                System.out.println(aux.getElemento());
                aux= aux.getProximo();
            }while (aux != inicio);

        }else{
            System.out.println("Lista está vazia");
        }
    }
}
