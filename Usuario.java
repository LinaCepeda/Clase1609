/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto2;

/**
 *
 * @author linac
 */
public class Usuario {
    
    String Nombre;
    int Identificacion;
    String Email;
    int Edad;
    String Area;
    boolean Jefe;
    int Total_devengado;
    int Salario_Minimo;
    double Salud_pension;
    double Fondo;
    double nomina;
    
     public Usuario (String Nombre, int Identificacion, String Email, int Edad, String Area, boolean Jefe )
     {
        this.Nombre = Nombre;
        this.Identificacion = Identificacion;
        this.Email = Email;
        this.Edad = Edad;
        this.Area = Area;
       this.Jefe = Jefe;
         
         
         Total_devengado = 0;
         if ("desarrollo".equals(Area)){
            //Total_devengado = 4500000;
            
             if (this.Jefe == true )
             {
             Total_devengado = 4500000 + 2500000;
             }
             else 
             {
             Total_devengado = 4500000;
             }
             
             
             
        }
        
        else if ("administrativa".equals(Area)){
            //Total_devengado = 3500000;
            
            if (this.Jefe == true)
             {
             Total_devengado = 3500000 + 3000000;
             }   
            
            
            else
             {
             Total_devengado = 3500000;
             }
                   
            
        }
             
           Salario_Minimo = 908526;
           Salud_pension = Total_devengado*0.08;
            
            if (Total_devengado/Salario_Minimo >= 4){
             Fondo =   Total_devengado * 0.01;
             
             }
            
            else {
              Fondo = 0;   
            }
               
             
            nomina = Total_devengado - Salud_pension - Fondo;
            
        
        

     
 }
 
             public void info(){
             System.out.println("[Usuario]:");
             System.out.println("Nombre: " + this.Nombre);
             System.out.println("Identificacion: " + this.Identificacion);
             System.out.println("Email: " + this.Email);
             System.out.println("Edad: " + this.Edad);
             System.out.println("Area: " + this.Area);
             System.out.println("Salario: " + this.nomina); 
             
             }
             
                 
     
}
