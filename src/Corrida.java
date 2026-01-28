import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Duration; // utilizado para indicar o tempo de duração de uma viagem
import java.time.LocalDate; // utilziado para indicar a hora que a viagem começa e que hora a viagem termina

public class Corrida {
    private String origem;
    private String destino;
    private LocalDate data;
    private LocalTime hora_chegada_origem;
    private LocalTime hora_chegada_destino;
    private LocalTime tempo_de_viagem;

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
}


