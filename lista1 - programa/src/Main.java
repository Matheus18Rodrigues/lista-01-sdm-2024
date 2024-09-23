public class Universidade {
    private String nome;
    private String cnpj;
    private String endereco;
    private int qtdeSalas;

    public Universidade(String nome, String cnpj, String endereco, int qtdeSalas) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.endereco = endereco;
        this.qtdeSalas = qtdeSalas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getQtdeSalas() {
        return qtdeSalas;
    }

    public void setQtdeSalas(int qtdeSalas) {
        this.qtdeSalas = qtdeSalas;
    }

    public void imprimirDados() {
        System.out.println("Nome da Universidade: " + nome);
        System.out.println("CNPJ: " + cnpj);
        System.out.println("Endereço: " + endereco);
        System.out.println("Quantidade de Salas: " + qtdeSalas);
    }
}

// Classe Programa
public class Programa {
    public static void main(String[] args) {
        Universidade universidade = new Universidade("Universidade XYZ", "12.345.678/0001-99", "Rua ABC, 123", 20);

        universidade.imprimirDados();
    }
}
