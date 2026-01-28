public class Veiculo {
    /*
    Strings para indicar qual é o status do veículo, se está disponível, em viagem, indisponível ou terminando uma viagem.
     */

    private String disponivel = "Disponível";
    private String indisponivel = "Indisponível";
    private String em_viagem = "Em viagem";
    private String finalizando_viagem = "Finalizando viagem";

    // Atributos para qualquer tipo de veículo na UberLand

    private String placa;
    private String chassi;
    private String cor;
    private int capacidade;
    private int ano;
    private String marca;
    private String modelo;
    private String status; // se o carro estará disponível, não disponível, em viagem ou finalizando viagem
    private boolean ativo;
    private Motorista motorista;

    public Veiculo (String placa, String chassi, String cor, int capacidade, String marca, String modelo, boolean disponivel, boolean status, Motorista motorista){
        setPlaca(placa);
        setChassi(chassi);
        setCor(cor);
        setCapacidade(capacidade);
        setAno(ano);
        setMarca(marca);
        setModelo(modelo);
        setStatus(status);
        setMotorista(motorista);
    }

    public void ativar(){
        this.ativo = true; // o carro acaba de ser ativado no aplicativo,
        this.status = disponivel; // ou seja, acaba de se tornar disponível para realizar uma viagem
    }

    public void desativar(){
        this.ativo = false; // o carro não está ativo no aplicativo,
        this.status = indisponivel; // ou seja, não está disponível para realizar viagens
    }

    public void cadastrarVeiculo(){
            if (this.placa != null && !this.placa.isEmpty()) { // se a placa não for inválida, e não tiver um nome vazio...
               /* this.ativo = true;
                this.status = disponivel; */
                ativar();
            } else {
                new IllegalArgumentException("Placa inválida"); // interface gráfica que irá alertar o usuário que não é possível cadastrar devido à placa ter sido inserida de forma incorreta
            }
        }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getChassi() {
        return chassi;
    }

    public void setChassi(String chassi) {
        this.chassi = chassi;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String isDisponivel() {
        return disponivel;
    }

    public String getFinalizando_viagem() {
        return finalizando_viagem;
    }

    public void setFinalizando_viagem(String finalizando_viagem) {
        this.finalizando_viagem = finalizando_viagem;
    }

    public String getIndisponivel() {
        return indisponivel;
    }

    public void setIndisponivel(String indisponivel) {
        this.indisponivel = indisponivel;
    }

    public String getEm_viagem() {
        return em_viagem;
    }

    public void setEm_viagem(String em_viagem) {
        this.em_viagem = em_viagem;
    }

    public void setDisponivel(String disponivel) {
        this.status = disponivel;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setStatus(boolean status) {
        this.ativo = ativo;
    }

    public Motorista getMotorista() {
        return motorista;
    }

    public void setMotorista(Motorista motorista) {
        this.motorista = motorista;
    }
}
