import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int deskClassA = 0;
        int deskClassB = 0 ;
        int deskClassC = 0;

        int total = 0;

        int classA=scanner.nextInt();
        int classB=scanner.nextInt();
        int classC=scanner.nextInt();

        if (classA % 2 > 0) {
            deskClassA = classA / 2 + 1;
        } else {
            deskClassA = classA / 2;
        }

        total = total + deskClassA;

        if (classB % 2 > 0) {
            deskClassB = classB / 2 + 1;
        } else {
            deskClassB = classB / 2;
        }

        total = total + deskClassB;

        if (classC % 2 > 0) {
            deskClassC = classC / 2 + 1;
        } else {
            deskClassC = classC / 2;
        }

        total = total + deskClassC;

        System.out.println(total);


        /*
        int res1= classA/2;
        if(res1%2==0){
            deskClassA=res1;
        } else {
            deskClassA=(res1+1);
        }

        int res2= classB/2;
        if(res2%2==0){
             aux2=res2;
        } else {
            aux2=(res2+1);
        }

        int res3= classC/2;
        if(res3%2==0){
            deskClassC=(res3);
        } else {deskClassC=(res3+1);}

        int desk= deskClassA+aux2+deskClassC;

        System.out.println(desk);

         */
    }
}