
package PSP0;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @autor Sergio Santos da Silva
 */
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int qtm;
        // quantidade minima de classificados
        int qtc;
        // quantidade de competidores
        System.out.print("Digite a quantidade de competidores:");
        qtc = input.nextInt();
        System.out.print("Digite a quantidade de classificados:");
        qtm = input.nextInt();
        
        ArrayList<Integer> competidores = new ArrayList();
        // vetor com a nota dos competidores
        System.out.println("Digite a nota dos competidores");
        for(int i=0; i<qtc; i++){
            competidores.add(input.nextInt());
        }
       
        Olimpiada OBI = new Olimpiada(competidores, qtm);
     
        System.out.println(OBI.GetVitoriosos());
        
        System.out.printf("%.2f\n",OBI.GetDesvioPadraoWin());
        System.out.printf("%.2f\n",OBI.GetMediaWin());
       
        System.out.printf("%.2f\n", OBI.GetDesvioPadrao());
        System.out.printf("%.2f\n",OBI.GetMedia());
    }
}
