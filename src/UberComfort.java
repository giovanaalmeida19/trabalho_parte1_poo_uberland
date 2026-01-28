public class UberComfort extends Veiculo {
    private boolean espaco_extra;
    private boolean banco_reclinavel;
    private boolean arcondicionado_dz;
    private double tarifa;
    private double custo_km;

    public UberComfort (String placa, String chassi, String cor, int capacidade, String marca, String modelo, boolean disponivel, boolean status, Motorista motorista, boolean espaco_extra, boolean banco_reclinavel, boolean arcondicionado_dz, double tarifa, double custo_km){
        super(placa, chassi, cor, capacidade, marca, modelo, disponivel, status, motorista);
        setEspaco_extra(espaco_extra);
        setBanco_reclinavel(banco_reclinavel);
        setArcondicionado_dz(arcondicionado_dz);
        setTarifa(tarifa);
        setCusto_km(custo_km);
    } // construtor criado para inicializar todos os atributos dos objetos do tipo UberComfort

    public double calculaValorViagemUberComfort(double nro_km) {
        if (arcondicionado_dz || espaco_extra){ // caso o carro possua ar condicionado dual zone ou espaço extra
            return nro_km * custo_km + tarifa;
        }

        return nro_km * custo_km + tarifa + 2 * tarifa;
    }

    public boolean isEspaco_extra() {
        return espaco_extra;
    }

    public void setEspaco_extra(boolean espaco_extra) {
        this.espaco_extra = espaco_extra;
    }

    public boolean isBanco_reclinavel() {
        return banco_reclinavel;
    }

    public void setBanco_reclinavel(boolean banco_reclinavel) {
        this.banco_reclinavel = banco_reclinavel;
    }

    public boolean isArcondicionado_dz() {
        return arcondicionado_dz;
    }

    public void setArcondicionado_dz(boolean arcondicionado_dz) {
        this.arcondicionado_dz = arcondicionado_dz;
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
