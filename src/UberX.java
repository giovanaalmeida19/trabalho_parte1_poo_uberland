public class UberX extends Veiculo{
    private boolean arcondicionado;
    private boolean conforto_basico;
    private double tarifa;
    private double custo_km;

    public UberX(String placa, String chassi, String cor, int capacidade, String marca, String modelo, boolean disponivel, boolean status, Motorista motorista, double tarifa, double custo_km){
        super(placa, chassi, cor, capacidade, marca, modelo, disponivel, status, motorista);
        setArcondicionado(arcondicionado);
        setConforto_basico(conforto_basico);
        setTarifa(tarifa);
        setCusto_km(custo_km);
    }

    public double calculaValorViagem(double nro_km) {
        return nro_km * custo_km + tarifa;
    }

    public boolean isArcondicionado() {
        return arcondicionado;
    }

    public void setArcondicionado(boolean arcondicionado) {
        this.arcondicionado = arcondicionado;
    }

    public boolean isConforto_basico() {
        return conforto_basico;
    }

    public void setConforto_basico(boolean conforto_basico) {
        this.conforto_basico = conforto_basico;
    }

    public double getTarifa() {
        return tarifa;
    }

    public void setTarifa(double tarifa) {
        this.tarifa = tarifa;
    }

    public double getCusto_km() {
        return custo_km;
    }

    public void setCusto_km(double custo_km) {
        this.custo_km = custo_km;
    }
}
