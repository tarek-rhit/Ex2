
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Donner le nombre des vetements");
        Scanner sc = new Scanner(System.in);
        int nbr = sc.nextInt();

        Vetement[] vetements = new Vetement[nbr];

        for (int i=0;i< vetements.length;i++){
            Vetement vetement = new Vetement();
            vetement.codeBar = sc.nextInt();
            vetement.marque = sc.next();
            vetement.prix=sc.nextFloat();
            vetement.qtt= sc.nextInt();
            vetement.color=sc.next();
        }
        for (int i=0; i< vetements.length;i++){
            if(vetements[i].qtt< 5){
            System.out.println(vetements[i]);
         }
        }
    }
}
