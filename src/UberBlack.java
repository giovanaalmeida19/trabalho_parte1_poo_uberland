public class UberBlack extends Veiculo {
    private double tarifa;
    private double custo_km;
    private double capacidade_malas;
    private boolean interior_premium;
    private boolean rodas_liga_leve;

    public UberBlack(String placa, String chassi, String cor, int capacidade, String marca, String modelo, boolean disponivel, boolean status, Motorista motorista, boolean arcondicionado, double tarifa, double custo_km) {
        super(placa, chassi, cor, capacidade, marca, modelo, disponivel, status, motorista);
        setTarifa(tarifa);
        setCusto_km(custo_km);
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

    public double getCapacidade_malas() {
        return capacidade_malas;
    }

    public void setCapacidade_malas(double capacidade_malas) {
        this.capacidade_malas = capacidade_malas;
    }
}
