import javax.swing.*;
import java.lang.String;
import java.time.LocalDate; // usado para indicar a data de nascimento do cliente

public class Cliente {
    private String nome;
    private String fone;
    private String cpf;
    private String email;
    private LocalDate aniversario;
    private String sexo;
    private String pagamento;
    private double nota;
    public int nro_corridas;


    public Cliente (){

    } // construtor padrão, sem parâmetros

    public Cliente (String nome, String cpf){
        setNome(nome);
        setCpf(cpf);
    } // construtor padrão com os atributos nome e cpf, encapsulados pelo uso dos "setters"

    public Cliente (String nome, String fone, String cpf, String email, LocalDate aniversario, String sexo, String pagamento, double nota, int nro_corridas){
        setNome(nome);
        setFone(fone);
        setCpf(cpf);
        setEmail(email);
        setAniversario(aniversario);
        setSexo(sexo);
        setPagamento(pagamento);
        setNota(nota);
        setNro_corridas(nro_corridas);
    } // construtor criado por nós para inicializar todos os atributos dos clientes, além dos já criados por exigência dos requisitos dados para o desenvolvimento do código

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if(nome != null && nome.length() > 0){ // verificação por meio do comprimento da palavra inserida
            this.nome = nome;
        }
        else JOptionPane.showMessageDialog(null, "ERRO!", "Insira um nome válido.", JOptionPane.ERROR_MESSAGE);
    }

    public String getFone() {
        return fone;
    }

    public void setFone(String fone) {
        this.fone = fone;
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
            JOptionPane.showMessageDialog(null, "ERRO!", "Insira um CPF válido.", JOptionPane.ERROR_MESSAGE);
        }

        else {
            if(validacpf(cpf)){ /*método implementado acima para validar se o cpf inserido pelo cliente é válido*/
                this.cpf = cpf;
            }
        }
    }

    public boolean cliente_vip(int nro_corridas){
        return (nro_corridas > 100); // caso o cliente tenha mais do que 100 corridas no aplicativo da uberland, ele se torna um cliente vip
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getAniversario() {
        return aniversario;
    }

    public void setAniversario(LocalDate aniversario) {
        this.aniversario = aniversario;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getPagamento() {
        return pagamento;
    }

    public void setPagamento(String pagamento) {
        this.pagamento = pagamento;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public int getNro_corridas() {
        return nro_corridas;
    }

    public void setNro_corridas(int nro_corridas) {
        this.nro_corridas = nro_corridas;
    }
}
