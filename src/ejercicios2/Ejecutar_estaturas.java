/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios2;

/**
 *
 * @author Daniel Barrios
 */
import java.util.Scanner;
public class Ejecutar_estaturas {
    public static void main (String[]args){
        Scanner input = new Scanner(System.in);
        double []llenar=new double[25];
    Estaturas cal_e =new Estaturas();
        System.out.println("ingrese las estaturas del curso: ");
        for(int i=0;i<llenar.length;i++){
        llenar[i]= input.nextDouble();
        }
        cal_e.estaturas(llenar);
     cal_e.mostrar_e();
        System.out.println("veras la estatura mas alta y la mas baja con su posicion: ");
     cal_e.calculo_e();
    
    }
}
