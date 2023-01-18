public class Usuario {
    //sistema de smart tv
    public static void main(String[] args) {
        SmartTv smartTv = new SmartTv();

        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();

        smartTv.mudarCanal(13);
        System.out.println("Volume atual: " + smartTv.volume);


        System.out.println("TV ligada? " + smartTv.ligada);
        System.out.println("Canal atual: " + smartTv.canal);
        System.out.println("Volume atual: " + smartTv.volume);


        smartTv.ligar();
        System.out.println("Novo status --> TV ligada? " + smartTv.ligada);

    }
}