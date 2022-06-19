import java.util.Scanner;

public class PersonalThings{



     public static void main(String[] args) {
        
        
        Scanner src = new Scanner(System.in);
        boolean isRunning = true;
        String[] toSafe = new String[3];
        Storager sto = new Storager();

        while(isRunning){
            switch (src.nextInt()){

                case 1: 
                    System.out.println("Loc do ficheiro: ");
                    String path = src.next();
                    System.out.println("Conteudo a guardar");
                    toSafe[0] = src.next();
                    sto.

            }

        }


    }
}