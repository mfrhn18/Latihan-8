package Interface;
public class Sample implements I1, D1{
    long angka;
    public Sample(){
        angka = 0;
    }
    public void setAngka(double angka){
        if(angka%1==0){
            methodI1();
        }else{
            methodD1();
        }
    }
    public double getAngka(){
        return angka;
    }
    public void methodI1(){
        System.out.println("Angka yang anda inputkan bertipe data Integer.");
    }
    public void methodD1(){
        System.out.println("Angka yang anda inputkan bertipe data Double.");
    }
}
