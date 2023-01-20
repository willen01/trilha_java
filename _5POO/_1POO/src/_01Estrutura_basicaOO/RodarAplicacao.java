package _01Estrutura_basicaOO;

public class RodarAplicacao {
    public static void main(String[] args) {
        //Objeto carro
        Carro carro1 = new Carro();

        //mensagem
        carro1.setCor("azul");
        carro1.setModelo("BMW Série 3");
        carro1.setCapacidadeTanque(54);


        System.out.println(carro1.getModelo());
        System.out.println(carro1.getCor());
        System.out.println(carro1.getCapacidadeTanque());
        System.out.println(carro1.totalValorTanque(6.30));
    }
}
