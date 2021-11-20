import java.util.Scanner;

public class Nocturno {
    public static void main(String[] args) {
        ato1();
    }

    public static void ato1(){
        System.out.println("Ola jogador... qual seu nome?");
        Scanner replayPlayer = new Scanner(System.in);

        String nomePlayer = replayPlayer.nextLine();

        if(replayPlayer.equals("")){ System.out.println("Seus dedos parecem fracos... nao entendi...");}
        else{
            System.out.println("Hum!... "+nomePlayer+"... interessante...");
        }

        System.out.println("" +
                "Tenho algo aqui, mas devemos nos encontrar mais tarde\n" +
                "voce prefe que seja DIA ou NOITE ?");
        String escolha1Player = replayPlayer.nextLine();

        escolha1(escolha1Player);
    }

    public static void escolha1(String escolha){
    escolha = escolha.toUpperCase();
        Scanner replayPlayer = new Scanner(System.in);
        if(escolha.equals("DIA")){
            System.out.println("Escolha interessante... "+escolha+"... interessante... \n" +
                    "nos encontraremos de DIA");
            parte2Nocturno();
        }else if(escolha.equals("NOITE")){
            System.out.println("Boa escolha... "+escolha+"... interessante... \n" +
                    "nos encontraremos de NOITE");
            parte2Nocturno();
        }else{
            System.out.println("Voce deve escolher DIA ou NOITE");
            String escolha1Player = replayPlayer.nextLine();
            escolha1(escolha1Player);
        }
    }
    public static void parte2Nocturno(){
        System.out.println("\n\n...Nao perca a proxima atualizacao... FIM???\n\n");
        ato1();
    }
}
