/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diagnosticostevenortiz;

/**
 *
 * @author estudiante
 */
public class Logica {
    //********************Atributos******************
    private int numeroResultado;
    private String textoResultado;
    //********************Metodos********************
    /**
     * Metodo que elimina espacios y los cuenta
     * @param frase texto a eliminar espacios
     */
    public void EliminarEspacios(String frase){
        textoResultado= frase.replaceAll(" ", "");
        numeroResultado=frase.length()-textoResultado.length();
    }
    
    public void InvertirTexto(String texto){
        textoResultado="";
        for (int i = texto.length() - 1; i >= 0; i--) {
            textoResultado+= Character.toString(texto.charAt(i));
        }
    }
    
    public void ArregloCaracteres(){
        char[] arreglo = new char[6];
        arreglo[0] = 'a';
        arreglo[1] = 'b';
        arreglo[2] = 'c';
        arreglo[3] = 'd';
        arreglo[4] = 'e';
        arreglo[5] = 'f';
        System.out.println("Inicio del arreglo:");
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println("Campo "+i+": "+arreglo[i]);
        }
        System.out.println("Fin del arreglo");
    }
    public void Variables() {
        String texto = "Bienvenido gracias por su tiempo";
        int entero = 132465798;
        double decimal = 123.485498498;
        boolean boleano = true;
        char caracter = 'S';
        System.out.println("String: " + texto+"\nint: "+entero+"\ndouble: "+decimal+"\nboolean: "+boleano+"\nchar: "+caracter);
    }
    //**************Getters**************************
    public int getNumeroResultado() {
        return numeroResultado;
    }

    public String getTextoResultado() {
        return textoResultado;
    }
    //**************Setters**************************
    public void setNumeroResultado(int numeroResultado) {
        this.numeroResultado = numeroResultado;
    }

    public void setTextoResultado(String textoResultado) {
        this.textoResultado = textoResultado;
    }
}
