package _02Heranca_associacao_interface._02Polimorfismo_e_Sobreescrita;

public class RodarAplicacao {
    public static void main(String[] args) {
        ClasseMae[] classes = new ClasseMae[]{
                new ClasseFilha_01(),
                new ClasseFilha_02(),
                new ClasseMae()
        };

        //foreach
        for (ClasseMae classe: classes) {
            //polimorfismo - método1 vai se comportar de diferentes maneiras
            classe.metodo1();
        }

        System.out.println(".");

        for (ClasseMae classe: classes){
            classe.metodo2();
        }

        System.out.println(".");

        //sobreescrita pura = o método2() faz um sobrescrita no método da classe mãe extendida
        ClasseFilha_02 classeFilha02 = new ClasseFilha_02();
        classeFilha02.metodo2();
    }
}
