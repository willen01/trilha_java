public class Main {
    public static void main(String[] args) {
        ifFlexa();
        ifSemFlexa();
        ifFerias();
        ifMenor();

        switchSemana();
        switchNUmero();
        switchFerias();
    }

    private static void ifFlexa(){
        int mes = 9;
        if(mes == 1) {
            System.out.println("Janeiro");
        } else {
            if(mes == 2) {
                System.out.println("Fevereito");
            }
        }

    }
}