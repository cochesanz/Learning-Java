import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int Bsu,Aba, altura, res=0,Aux=0, Max;
        int dia=1;
        altura=scanner.nextInt();
        Bsu=scanner.nextInt();
        Aba=scanner.nextInt();
        Max=Bsu;
        while( Max<altura) {
            res= Bsu-Aba+Aux;
            Aux=(Bsu-Aba)*dia;
            Max=res+Bsu;
           dia=dia+1;
        }
        System.out.println(dia);

    }
}



