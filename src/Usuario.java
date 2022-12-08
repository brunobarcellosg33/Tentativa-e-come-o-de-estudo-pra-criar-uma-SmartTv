public class Usuario {
  
    public static void main(String[] args) throws Exception {

        SmartTv smartTv = new SmartTv();

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();

        System.out.println("TV Ligada?: " + smartTv.ligada);
        System.out.println("Canal Atual?: " + smartTv.canal);
        System.out.println("Qual o volume?: " + smartTv.volume);

        smartTv.ligar ();
        System.out.println("Tv Ligada?" + smartTv.ligada);
        
        smartTv.desligar ();
        System.out.println("Tv Ligada?" + smartTv.ligada);

        smartTv.mudarCanal(13);
        System.out.print("Canal Atual: " + smartTv.canal);
    }
}
