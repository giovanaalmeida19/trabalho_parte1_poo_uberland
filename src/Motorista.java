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
        //setVeiculos(veiculos);
    }

    public void desativar() {
        this.ativo = false;
        for (int i = 0; i < veiculos.size(); i++) {
            Veiculo veiculo = veiculos.get(i);
        }
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public List<Veiculo> getVeiculos() {
        return veiculos;
    }

    /*public void setVeiculos(List<Veiculo> veiculos) {
        this.veiculos = veiculos;
    }*/

    public String getNome_social() {
        return nome_social;
    }

    public void setNome_social(String nome_social) {
        if(nome_social.length() > 0){
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
        if (nome.length() > 0){
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
