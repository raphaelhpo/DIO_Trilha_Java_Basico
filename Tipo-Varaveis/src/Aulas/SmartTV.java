package Aulas;

public class SmartTV {
    int canal=1;
    int volume=25;
    boolean ligada=false;

    public void ligar(){
        if (ligada==false){
            ligada = true;
        }else{
            System.out.println("TV ja ligada");
        }
    }
    public void desligar(){
        if(ligada==true){
            ligada = false;
        }else{
            System.out.println("TV ja desligada");
        }
    }

    public void aumentarVolume(){
        volume++;
    }

    public void diminuirVolume(){
        volume--;
    }
    public void trocarCanal(int novoCanal){
        if(canal == novoCanal){
            System.out.println("Canal ja selecionado");
        }else{
            canal = novoCanal;
            System.out.println("Canal "+novoCanal+" selecionado");
        }
    } 

    public static void main(String[] args) {
        
        SmartTV smartTV = new SmartTV();

        smartTV.ligar();
        System.out.println("Smart TV ligada? " + smartTV.ligada);
        
        smartTV.desligar();
        System.out.println("Smart TV ligada? " + smartTV.ligada);

        System.out.println("Volume"+smartTV.volume);
        smartTV.aumentarVolume();
        smartTV.aumentarVolume();
        System.out.println("Volume: " + smartTV.volume);

        System.out.println("Canal: " + smartTV.canal);
        smartTV.trocarCanal(13);
        System.out.println("Canal: " + smartTV.canal);
    }
}
