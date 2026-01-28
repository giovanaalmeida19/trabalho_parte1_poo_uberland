import java.time.LocalDate;

public class ClienteVip extends Cliente{
    private double percentualDesconto;

    public ClienteVip(String nome, String fone, String cpf, String email, LocalDate aniversario, String sexo, String pagamento, double nota, int nro_corridas){
        super(nome, fone, cpf, email, aniversario, sexo, pagamento, nota, nro_corridas);
        setPercentualDesconto(percentualDesconto);
    } // constutor criado com todos os atributos que um cliente VIP deve ter, assim como o cliente normal.

    public double getPercentualDesconto() {
        return percentualDesconto;
    }

    public void setPercentualDesconto(double percentualDesconto) {
        if(nro_corridas == 1.01 * nro_corridas){
            this.percentualDesconto = percentualDesconto;
        }
    }

    // O cliente vip tem um desconto nas viagens, caso o cliente
    //se torne um ClienteVip, será importante armazenar a porcentagem de desconto que esse
    //Cliente terá. A porcentagem de desconto segue uma estratégia confidencial da UberLand.
    //Crie a regra para essa estratégia.

    // o desconto vai aumentando de 0.01 em 0.01 a cada 100 viagens que ele fizer -> regra de negócio confidencial da uberland


}
