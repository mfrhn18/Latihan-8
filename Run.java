package Interface;
import java.util.Scanner;
public class Run {
    public static void main(String []args){
        Scanner in = new Scanner(System.in);
        System.out.print("Input angka anda : ");
        double angka = in.nextDouble();
        Sample s = new Sample();
        s.setAngka(angka);
        s.getAngka();
    }
}
