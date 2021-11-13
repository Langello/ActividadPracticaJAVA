/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package actividadpracticaobligatoria;
import java.util.Scanner;

/**
 *
 * @author julian
 */
public class ActividadPracticaObligatoria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Ingrese nombre:");
        String nombre = sc.nextLine();
        System.out.println("Ingrese apellido:");
        String apellido = sc.nextLine();
        System.out.println("Ingrese edad:");
        String edad = sc.nextLine();
        System.out.println("Ingrese hobbie:");
        String hobbie = sc.nextLine();
        System.out.println("Ingrese editor de código favorito:");
        String editorcodigo = sc.nextLine();
        System.out.println("Ingrese sistema operativo que utiliza");
        String sistemaoperativo = sc.nextLine();
        
        System.out.println("Nombre: "+nombre+" \nApellido: "+apellido+" \nEdad: "+edad+" \nHobbie: "+hobbie+" \nEditor de codigo favorito: "+editorcodigo+" \nSistema operativo que utiliza: "+sistemaoperativo);
        
        
        
        
        
    }
    
}
