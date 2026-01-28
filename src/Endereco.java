public class Endereco {
    private String logradouro;
    private String rua;
    private int numero;
    private String cidade;
    private String bairro;

    public Endereco (String logradouro, String rua, int numero, String cidde, String bairro){
        setLogradouro(logradouro);
        setRua(rua);
        setNumero(numero);
        setCidade(cidade);
        setBairro(bairro);
    } // construtor que inicializa os atributos dos objetos do tipo endereço

    // Getters e setters, utilizando os conceitos de encapsulamento

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }
}
