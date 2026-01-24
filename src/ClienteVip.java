public class ClienteVip extends Cliente{

    public ClienteVip(String nome, String cpf){
        super(nome, cpf);
    }

    // o cliente vip tem um desconto nas viagens, caso o cliente
    //se torne um ClienteVip, será importante armazenar a porcentagem de desconto que esse
    //Cliente terá. A porcentagem de desconto segue uma estratégia confidencial da UberLand.
    //Crie a regra para essa estratégia.

    // o desconto vai aumentando de 0.01 em 0.01 a cada 100 viagens que ele fizer -> regra de negócio confidencial da uberland


}
