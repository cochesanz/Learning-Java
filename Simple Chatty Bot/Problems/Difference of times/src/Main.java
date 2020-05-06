import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hor1,min1,seg1,hor2,min2,seg2;
        int Entretiempo;

        hor1=scanner.nextInt();
        min1=scanner.nextInt();
        seg1=scanner.nextInt();
        hor2=scanner.nextInt();
        min2=scanner.nextInt();
        seg2=scanner.nextInt();


        int mom1=seg1+(min1*60)+(hor1*3600);

        int mom2= seg2+(min2*60)+(hor2*3600);

        Entretiempo=mom2-mom1;

        System.out.println(Entretiempo);



    }
}