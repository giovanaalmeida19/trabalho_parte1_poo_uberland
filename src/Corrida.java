public class Corrida {
    private String origem;
    private String destino;
    private String data;
    private String hora;

    public double calculaValorViagem(double km){
        return 0.0; //nro_km * custo_km + tarifa;
    }


    public Corrida (Cliente cliente, Veiculo veiculo, String origem, String destino, String data, String hora){
        setData(data);
        setDestino(destino);
        setHora(hora);
        setOrigem(origem);
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

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }
}
