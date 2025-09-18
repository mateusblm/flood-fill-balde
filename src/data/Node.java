package data;

public class Node {

    public Ponto ponto;
    public Node proximo;

    public Node(Ponto ponto) {
        this.ponto = ponto;
        this.proximo = null;
    }  
}
