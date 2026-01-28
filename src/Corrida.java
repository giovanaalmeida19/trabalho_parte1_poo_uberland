import javax.swing.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Duration; // utilizado para indicar o tempo de duração de uma viagem
import java.time.LocalDate; // utilziado para indicar a hora que a viagem começa e que hora a viagem termina

public class Corrida {

    // "Strings" que representam qual é o status da corrida

    private String viagem_andamento = "Viagem em andamento.";
    private String viagem_cancelada_andamento = "Viagem cancelada durante andamento.";
    private String viagem_finalizada = "Viagem finalizada.";

    // Objetos necessários para que uma viagem aconteça

    private Cliente cliente;
    private Veiculo veiculo;
    private Motorista motorista;

    // Informações que precisam ser armazenadas relativamente à própria corrida em si

    private String origem;
    private String destino;
    private LocalDate data;
    private LocalTime hora_chegada_origem;
    private LocalTime hora_chegada_destino;
    private LocalTime tempo_de_viagem;
    private double distancia_percorrida; // distância percorrida durante a corrida em km


    // Atributos relacionados à parte financeira das viagens

    private double valor_motorista;
    private double valor_UberLand;
    private double valor_corrida;
    private double valor_pago_cliente;
    private String forma_pagamento;
    private double gorjeta; // valor extra, caso o cliente queira

    // Atributo separado para guardar o nome de quem cancelou a viagem: o motorista ou o cliente que solicitou a viagem

    private String cancelamento;

    public Corrida(Cliente cliente, Veiculo veiculo, String origem, String destino, LocalDate data, LocalTime hora) {
        setData(data);
        setDestino(destino);
        setHora_chegada_origem(hora_chegada_origem);
        setHora_chegada_destino(hora_chegada_destino);
        setTempo_de_viagem(tempo_de_viagem);
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public LocalTime getHora_chegada_origem() {
        return hora_chegada_origem;
    }

    public void setHora_chegada_origem(LocalTime hora_chegada_origem) {
        this.hora_chegada_origem = hora_chegada_origem;
    }

    public LocalTime getHora_chegada_destino() {
        return hora_chegada_destino;
    }

    public void setHora_chegada_destino(LocalTime hora_chegada_destino) {
        this.hora_chegada_destino = hora_chegada_destino;
    }

    public LocalTime getTempo_de_viagem() {
        return tempo_de_viagem;
    }

    public void setTempo_de_viagem(LocalTime tempo_de_viagem) {
        this.tempo_de_viagem = tempo_de_viagem;
    }

    public String getViagem_andamento() {
        return viagem_andamento;
    }

    public void setViagem_andamento(String viagem_andamento) {
        this.viagem_andamento = viagem_andamento;
    }

    public String getViagem_cancelada_andamento() {
        return viagem_cancelada_andamento;
    }

    public void setViagem_cancelada_andamento(String viagem_cancelada_andamento) {
        this.viagem_cancelada_andamento = viagem_cancelada_andamento;
    }

    public String getViagem_finalizada() {
        return viagem_finalizada;
    }

    public void setViagem_finalizada(String viagem_finalizada) {
        this.viagem_finalizada = viagem_finalizada;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public Motorista getMotorista() {
        return motorista;
    }

    public void setMotorista(Motorista motorista) {
        this.motorista = motorista;
    }

    public double getValor_motorista() {
        return valor_motorista;
    }

    public void setValor_motorista(double valor_motorista) {
        this.valor_motorista = valor_motorista;
    }

    public double getValor_UberLand() {
        return valor_UberLand;
    }

    public void setValor_UberLand(double valor_UberLand) {
        this.valor_UberLand = valor_UberLand;
    }

    public double getValor_corrida() {
        return valor_corrida;
    }

    public void setValor_corrida(double valor_corrida) {
        this.valor_corrida = valor_corrida;
    }

    public double getValor_pago_cliente() {
        return valor_pago_cliente;
    }

    public void setValor_pago_cliente(double valor_pago_cliente) {
        this.valor_pago_cliente = valor_pago_cliente;
    }

    public String getForma_pagamento() {
        return forma_pagamento;
    }

    public void setForma_pagamento(String forma_pagamento) {
        if(forma_pagamento == null){
            JOptionPane.showMessageDialog(null, "ERRO!", "Insira um método de pagamento.", JOptionPane.ERROR_MESSAGE);
        }
        else this.forma_pagamento = forma_pagamento;
    }

    public double getGorjeta() {
        return gorjeta;
    }

    public void setGorjeta(double gorjeta) {
        if (gorjeta > 0){
            this.gorjeta = gorjeta;
        }
    }

    public double getDistancia_percorrida() {
        return distancia_percorrida;
    }

    public void setDistancia_percorrida(double distancia_percorrida) {
        this.distancia_percorrida = distancia_percorrida;
    }

    public String getCancelamento() {
        return cancelamento;
    }

    public void setCancelamento(String cancelamento) {
        this.cancelamento = cancelamento;
    }
}


