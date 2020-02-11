
package zellerg;


public class ZellerG {

    
    public static void main(String[] args) {
        String Days[]= new String[] {"Lunes","Martes","Miercoles","Jueves","Viernes","Sabado","Domingo"};
        int d= ZellerG(12,7,2001);
        int day = d-1;
        System.out.println(Days[day]);
        //modificamos el programa para ver el dia (Lunes, Martes...)
    }
    
    private static int ZellerG(int Day, int Month, int Year){
        int Zeller;
        Month = (Month+10) %12;
        Year= Year-1 * ((Month>10)?1:0);
        Zeller = (13*Month -1)/5 +1 +Year % 100 + (Year%100)/4 +(-2 *(Year/100))+ (Year/400)%7;
        Zeller = ((Zeller + Day)%7 + 6)%7;
        return Zeller;
    }
}
