
package boletin.pkg5.pkg0;


public class Boletin50 {


    public static void main(String[] args) {
     int valor;
     int menos;
     
     Coche coche1=new Coche();
     coche1.acelerar(20);
        System.out.println("acelerar= "+ coche1.getVelocidade());
        coche1.frenar(10);
        System.out.println("frenar= "+ coche1.getVelocidade());
    }
    
}
