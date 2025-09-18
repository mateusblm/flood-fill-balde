package data;

public class PilhaPontos {
    private Node topoPilha;

    public PilhaPontos() {
        this.topoPilha = null;
    }

    public void empilhar(Ponto ponto) {
        Node nodePilha = new Node(ponto);
        nodePilha.proximo = topoPilha;
        topoPilha = nodePilha;
    }

    public Ponto desempilhar() {
        if(pilhaEstaVazia()) {
            return null;
        }
        Ponto pontoTopo = topoPilha.ponto;
        topoPilha = topoPilha.proximo;
        return pontoTopo;
    }

    public boolean pilhaEstaVazia() {
        return topoPilha == null;
    }
    
}
