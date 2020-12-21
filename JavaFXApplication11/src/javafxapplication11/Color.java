/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication11;

/**
 *
 * @author Francisco
 */
public class Color {
    private int rojo;
    private int verde;
    private int azul;

    public Color(){ 
        rojo=0;
        verde=0;
        azul=0;
    }

    public Color(Color c){ 
        rojo     =c.rojo;
        verde   =c.verde;
        azul    =c.azul;  
    }

    public Color(int r, int g, int b){ 
        if (r>255 || g>255 || b>255){
            System.out.print("Incorrecto. ");
            rojo = 0;
            verde = 0;
            azul = 0;
        }
        else {
            rojo = r;
            verde = g;
            azul = b;
            }
        
    }
      public int getRojo(){

        return rojo;
    }

    public int getVerde(){

        return verde;
    }

    public int getAzul(){

        return azul;
    }


    public void setRed(int rojo){
    if (rojo>255)
        System.out.println("Valor de cambio incorrecto. No se cambiara. \n");
    else
        this.rojo = rojo;
    }

    public void setGreen(int verde){
    if (verde>255)
        System.out.println("Valor de cambio incorrecto. No se cambiara. \n");
    else
        this.verde = verde;
    }

    public void setAzul(int azul){
    if (azul>255)
        System.out.println("Valor de cambio incorrecto. No se cambiara. \n");
    else
        this.azul = azul;
    }


    @Override
    public String toString(){

          String r = Integer.toHexString(this.rojo);
          String g = Integer.toHexString(this.verde);
          String b = Integer.toHexString(this.azul);

          String x = "{"+r+","+g+","+b+"}";
          return x;       
    } 
}
