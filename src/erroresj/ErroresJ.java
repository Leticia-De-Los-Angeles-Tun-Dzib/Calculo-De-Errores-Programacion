package ErroresJ;
import java.util.Scanner;
import java.lang.Math;
public class ErroresJ {

    public static void main(String[] args) {
        Scanner Leer=new Scanner(System.in);
        System.out.println("------------------------------------------------");
        System.out.println("Valor Real:");
        double ValorReal = Leer.nextDouble();
        System.out.println("Valor Aproximado:"); 
        double ValorAproximado = Leer.nextDouble();
        System.out.println("------------------------------------------------");
        Errores e1=new Errores(ValorReal,ValorAproximado);
        System.out.println("");
        System.out.println("*************************************************");
        System.out.println("Error Absoluto: "+e1.ErrorAbsoluto()); 
        System.out.println("Error Relativo: "+e1.ErrorRelativo());
        System.out.println("Error Relativo Porcentual: "+e1.ErrorRelativoPorcentual());
        System.out.println("*************************************************");
        
        
    }
    
}
class Errores{
    private double ValorReal,ValorAproximado;
    Errores(double VR,double VA){
        this.ValorReal=VR; 
        this.ValorAproximado=VA; 
    }
    public double ErrorRelativo(){
        return ErrorAbsoluto()/getValorReal();
       
    }
    public double ErrorAbsoluto(){
        return Math.abs (getValorReal()-getAproximado());
        
    }
    public double ErrorRelativoPorcentual(){
        return ErrorRelativo()*100;
    }
    public void setValorReal(double a1){
        ValorReal=a1;
    }
    public void setValorAproximado(double b1){
        ValorAproximado=b1;
    }
    public double getValorReal(){
        return ValorReal;
    }
    public double getAproximado(){
        return ValorAproximado;
    }
        
}
