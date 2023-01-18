public class conta {

    //variável da classe conta
    double saldo = 10.00;

    public void sacar(double valor) {
        //variável local do método.
        double novoSaldo = saldo - valor;
    }

    public void imprimirSaldo() {
        //disponível em toda a classe
        System.out.println(saldo);

        //somente o o método sacar conhece esta variável
        //System.out.println(novoSaldo);
    }

    public double calcularDividaExponencial() {
        //variável local do método
        double valorParcela = 50.00;
        double valorMontante = 0.00;

        for (int x = 1; x <= 5; x++){
            double valorCalculado = valorParcela * x;
            valorMontante += valorCalculado;
        }
    }
}
