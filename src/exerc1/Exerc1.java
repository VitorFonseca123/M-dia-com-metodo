/*
Escreva um programa que leia o nome e duas notas de um aluno. Deverá 
Ser calculada a média e ao final deverá ser informada a média calculada e o se aluno foi
aprovado ou reprovado (considerar média 7,0 ou superior para aprovação). No programa
deverá ser implementado um método chamado lerNota que será responsável por realizar a
leitura de um valor real e outro método chamado calcularMedia que deverá retornar o
cálculo para o método principal.

 */
package exerc1;
import javax.swing.JOptionPane;
/**
 *
 * @author Vitor Fonseca
 */
public class Exerc1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int y=0;
        double nota1=0;
        double nota2=0;
        String nome = JOptionPane.showInputDialog("Digite o nome do aluno:");
                nota1=lernota();
                nota2=lernota();
        if(calcularmedia(nota1, nota2)>=7){
            System.out.println(nome+" Está aprovado");
            System.out.println("Média: "+calcularmedia(nota1, nota2));
        }else{
            System.out.println(nome+"Está reprovado");
            System.out.println("Média: "+calcularmedia(nota1, nota2));
        }
    }
   static double lernota(){
       double nota=0;
       nota=Double.parseDouble(JOptionPane.showInputDialog("Digite as notas:"));
       return nota;
   }  
    static double calcularmedia(double n1, double n2) {
        double media=0;
        media= (n1+n2)/2;
        return media;
    }
   }
   
