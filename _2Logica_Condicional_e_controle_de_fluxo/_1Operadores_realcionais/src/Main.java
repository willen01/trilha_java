public class Main {
    public static void main(String[] args) {
        int i1 = 10;
        int i2 = 20;
        float f1 = 4.5f;
        float f2 = 3.5f;
        double d1 = 59.6d;
        char c1 = 'x';
        char c2 = 'y';
        String s1 = "Fulano";
        String s2 = "Fulano";
        String s3 = "Cicrano";
        boolean b1 = true;
        boolean b2 = false;

        long l1 = 1597L;
        long l2 = 8997L;
        byte y1 = 1;
        short h1 = 25;

        //Operadores de similaridade
        System.out.println("i1 == i2" + (i1 == i1));
        System.out.println("i1 != i2" + (i1 != i2));
        System.out.println("i1 > i2" + (i1 > i2));
        System.out.println("i1 <= i2" + (i1 <= i2));

        System.out.println("f1 == f2" + (f1 == f2));
        System.out.println("f1 != f2" + (f1 != f2));
        System.out.println("f1 >= f2" + (f1 >= f2));
        System.out.println("f1 < f2" + (f1 < f2));

        System.out.println("c1 == c2" + (c1 == c2)); //esse tipo de comparação só é possivel porque um char é na verdade uma sequência de numeros, que podem ser comparados entre sí
        System.out.println("c1 != c2" + (c1 != c2));
        System.out.println("c1 > c2" + (c1 > c2));
        System.out.println("c1 <= c2" + (c1 <= c2));

        System.out.println("s1 == s2" + (s1 == s2));
        System.out.println("s1 != s2" + (s1 != s2));
        //System.out.println("s1 > s2" + (s1 > s2));  Não é possivel realizar a comparação entre tamanho de strings
        //System.out.println("s1 <= s2" + (s1 <= s2)); Não é possivel realizar a comparação entre tamanho de strings


        System.out.println("b1 == b2" + (b1 == b2));
        System.out.println("b1 != b2" + (b1 != b2));
//        System.out.println("b1 < b2" + (b1 < b2)); não se pode fazer comparação de tamanho entre boleanos
//        System.out.println("b1 >= b2" + (b1 >= b2));



    }
}