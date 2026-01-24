import java.lang.String;
import java.util.ArrayList;
import java.time.LocalDate;
import java.util.List;

public class Motorista {
    private String cpf;
    private Endereco endereco;
    private String cnh;
    private String nome;
    private String aniversario;
    private String nome_social;
    private boolean ativo;
    private ArrayList<Veiculo> veiculos;

    public Motorista (String cpf, Endereco endereco, String cnh, String nome, String aniversario, String nome_social, Veiculo veiculos){
        setCpf(cpf);
        setEndereco(endereco);
        setCnh(cnh);
        setNome(nome);
        setAniversario(aniversario);
        setNome_social(nome_social);
        setAtivo(ativo);
        setVeiculos((List<Veiculo>) veiculos);
    }

    public void desativar() {
        this.ativo = false;
        for (int i = 0; i < veiculos.size(); i++) {
            Veiculo veiculo = veiculos.get(i);
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
        if(cpf == null){
            return;
        }

        else {
            if(validacpf(cpf)){
                this.cpf = cpf;
            }
        }
    }

    public List<Veiculo> getVeiculos() {
        return veiculos;
    }

    public void setVeiculos(List<Veiculo> veiculos) {
        if (veiculos != null){
            this.veiculos = new ArrayList<>(veiculos);
        }
    }

    public void addVeiculos (Veiculo veiculo){
        if(veiculo != null){
            this.veiculos.add(veiculo);
        }
    }

    public String getNome_social() {
        return nome_social;
    }

    public void setNome_social(String nome_social) {
        if(nome_social != null && nome_social.length() > 0){
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
        if (nome!= null && nome.length() > 0){
            this.nome = nome;
        }
    }

    public String getAniversario() {
        return aniversario;
    }

    public void setAniversario(String aniversario) {
        this.aniversario = aniversario;
    }
}
