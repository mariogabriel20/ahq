package NewClass;

import java.util.Scanner;
public class NewClass {

    public NewClass(float saldo) {
        this.saldo = saldo;
    }
        private float saldo;
    public float getSaldo() {
        return saldo;
    }
    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
    public NewClass(){
        this.saldo=0;
    }
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in); 
       NewClass cb=new NewClass(50000);
       NewClass cb2=new NewClass();
       
       System.out.println(cb.getSaldo());
       System.out.println(cb2.getSaldo());
       
       System.out.println("La cuenta cb tiene saldo igual a :"+ cb.getSaldo());
       System.out.println("La cuenta cb tiene saldo igual a :"+ cb2.getSaldo());
       
       System.out.println("Ingrese saldo:");
       cb2.setSaldo(sc.nextFloat());
       System.out.println("Ahora el saldo es: "+cb2.getSaldo());
    }
    
}
