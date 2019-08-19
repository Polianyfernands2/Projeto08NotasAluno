/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto08notasaluno;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class Projeto08NotasAluno {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        Solicite ao usuario que informe as tres Notas (de 0 a 10), 
        e calcule a media e teste as condicoes:
        1) se a media for menor ou igual a 5.0 (Reprovado)
        2) se a media for menor ou igual a 7.0 (Aprovado)
        3) se a media for menor ou igual a 9.0 (Muito Bom)
        4) se a media for maior do que 9.0 (Excelente)
       
        */
        
        Scanner entrada = new Scanner(System.in);
      
        int nota1, nota2, nota3;
        int media, i;
        for (i = 0; i < 3; i++){
        System.out.println("Digite a Primeira Nota:");
        nota1 = entrada.nextInt();
        System.out.println("Digite a Segunda Nota:");
        nota2 = entrada.nextInt();
        System.out.println("Digite a Terceira Nota:");
        nota3 = entrada.nextInt();
        media = (nota1 + nota2 + nota3) / 3;
        System.out.println("Media:" + media);
        System.out.println("Valor NOTA1:" + nota1);
        System.out.println("Valor NOTA2:" + nota2);
        System.out.println("Valor NOTA3:" + nota3);
        
        if ( media <= 5 );{
        System.out.println("Reprovado");
        }
        
        else if ( media <= 7); {
            System.out.println("Aprovado");
        }
        
        else if ( media <= 9); {
            System.out.println("Muito Bom!");
        }
        
        else if (media > 9); {
            System.out.println("Excelente!");
                }
        
       
        }
    }
    
}
