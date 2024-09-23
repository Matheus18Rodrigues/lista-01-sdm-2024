
public class Atleta {

    private String nome;
    private int qtdeMedalha;
    private String pais;

    public Atleta(String nome, int qtdeMedalha, String pais) {
        this.nome = nome;
        this.qtdeMedalha = qtdeMedalha;
        this.pais = pais;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQtdeMedalha() {
        return qtdeMedalha;
    }

    public void setQtdeMedalha(int qtdeMedalha) {
        this.qtdeMedalha = qtdeMedalha;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public void imprimirDados() {
        System.out.println("Nome do Atleta: " + nome);
        System.out.println("Quantidade de Medalhas: " + qtdeMedalha);
        System.out.println("País: " + pais);
    }
}

// Classe Programa
public class Programa {
    public static void main(String[] args) {

        Atleta atleta = new Atleta("Usain Bolt", 8, "Jamaica");

        atleta.imprimirDados();
    }
}
