import javax.swing.*;
import java.lang.String; //  utilizado para escrever os atributos em formato de "String"
import java.util.ArrayList; // utilizado para implementação da lista de veículos que o mmotorista pode ter
import java.time.LocalDate; // usado para indicar a data de nascimento do motorista
import java.util.List;

public class Motorista {
    private String cpf;
    private Endereco endereco;
    private String cnh;
    private String nome;
    private String aniversario;
    private String nome_social;
    private boolean ativo;
    private ArrayList<Veiculo> veiculos; // cada motorista pode ter cadastrado mais de um veículo, ou seja, um motorista pode estar vinculado a uma losta de veículos

    public Motorista (String cpf, Endereco endereco, String cnh, String nome, String aniversario, String nome_social, Veiculo veiculos){
        setCpf(cpf);
        setEndereco(endereco);
        setCnh(cnh);
        setNome(nome);
        setAniversario(aniversario);
        setNome_social(nome_social);
        setAtivo(ativo);
        setVeiculos((List<Veiculo>) veiculos); // como o motorista pode possui vários veículos, utilizamos o método set com uma lista de veículos
    } // construtor utilizado para inicializar os atributos dos objetos do tipo Motorista, utilizando os "setters", uma estratégia de encapsulamento

    public void desativar() {
        this.ativo = false; // deixa o veículo do motorista inativo
        for (int i = 0; i < veiculos.size(); i++) { // para a quantidade de veículos que o motorista possui, do primeiro ao último
            Veiculo veiculo = veiculos.get(i); // pegamos o índice desse veículo
            veiculo.desativar(); // utilizamos recursividade para o veículo que acabamos de encontrar o índice e o deixamos inativo.
        }
    }

    public void ativar(){
        this.ativo = true;
    }

    public String getCpf() {
        return cpf;
    }

    public boolean validacpf (String cpf){
        if (cpf == null) return false;

        // Remove caracteres não numéricos
        cpf = cpf.replaceAll("\\D", "");

        // Verifica se tem 11 dígitos ou se são números repetidos
        if (cpf.length() != 11 || cpf.matches("(\\d)\\1{10}")){
            return false;
        }

        try {
            // Cálculo do 1º dígito verificador
            int soma = 0;
            for (int i = 0; i < 9; i++) {
                soma += (cpf.charAt(i) - '0') * (10 - i);
            }

            int digito1 = 11 - (soma % 11);
            if (digito1 > 9) digito1 = 0;

            // Cálculo do 2º dígito verificador

            soma = 0;
            for (int i = 0; i < 10; i++) {
                soma += (cpf.charAt(i) - '0') * (11 - i);
            }
            int digito2 = 11 - (soma % 11);
            if (digito2 > 9) digito2 = 0;

            return (digito1 == (cpf.charAt(9) - '0') && digito2 == (cpf.charAt(10) - '0'));
        } catch (Exception e) {
            return false;
        }
    }

    public void setCpf(String cpf) {
        if(cpf == null){ // se o cpf inserido for null...
            JOptionPane.showMessageDialog(null, "ERRO!", "Insira um CPF válido.", JOptionPane.ERROR_MESSAGE);
        }

        else {
            if(validacpf(cpf)){ // caso o cpf realmente seja válido e tenha passado pela verificação com resultado válido...
                this.cpf = cpf;
            }
        }
    }

    public List<Veiculo> getVeiculos() {
        return veiculos;
    }

    public void setVeiculos(List<Veiculo> veiculos) {
        if (veiculos != null){ // caso os veículos existam, ou seja, não são null...
            this.veiculos = new ArrayList<>(veiculos); // criamos a lista de veiculos
        }
        else JOptionPane.showMessageDialog(null, "ERRO!", "Erro ao criar veículo.", JOptionPane.ERROR_MESSAGE);
    }

    public void addVeiculos (Veiculo veiculo){
        if(veiculo != null){
            this.veiculos.add(veiculo); // aqui, caso o veículo exista, adicionamos um veículo na lista de veículos criada anteriormente
        }

        // veiculos = nome dado à lista de veículos criada
        // veiculo = um novo objeto que será inserido na lista
    }

    public String getNome_social() {
        return nome_social;
    }

    public void setNome_social(String nome_social) {
        if(nome_social != null && nome_social.length() > 0){ // se o nome não for vazio nem inválido...
            this.nome_social = nome_social;
        }
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public String getCnh() {
        return cnh;
    }

    public void setCnh(String cnh) {
        this.cnh = cnh;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome!= null && nome.length() > 0){ // se o nome não for vazio nem inválido...
            this.nome = nome;
        }
        else JOptionPane.showMessageDialog(null, "ERRO!", "Insira um nome social válido.", JOptionPane.ERROR_MESSAGE);
    }

    public String getAniversario() {
        return aniversario;
    }

    public void setAniversario(String aniversario) {
        this.aniversario = aniversario;
    }
}
