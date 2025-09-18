package data;

public class FilaPontos {
    private Node inicioFila;
    private Node fimFila;

    public FilaPontos() {
        this.inicioFila = null;
        this.fimFila = null;
    }

    public void adicionar(Ponto ponto) {
        Node nodeFila = new Node(ponto);
        if(filaEstaVazia()) {
            inicioFila = nodeFila;
            fimFila = nodeFila;
        }

        fimFila.proximo = nodeFila;
        fimFila = nodeFila;
    }

    public Ponto remover() {
        if(filaEstaVazia()) {
            return null;
        }
        Ponto pontoInicio = inicioFila.ponto;
        inicioFila = inicioFila.proximo;
        if(inicioFila == null) {
            fimFila = null;
        }
        return pontoInicio;
    }
    

    public boolean filaEstaVazia() {
        return inicioFila == null;
    }
}
