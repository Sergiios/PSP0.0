
package PSP0;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;

/**
 * @autor Sergio Santos da Silva
 */
public class Olimpiada {
    
    private ArrayList<Integer> competidores = new ArrayList();
    private ArrayList<Integer> vitoriosos = new ArrayList();
    private int qtclassificados;
    
    public Olimpiada(ArrayList<Integer> competidores, int qtclassificados){
       
        //ordena o array de pontuações
        Collections.sort(competidores, Collections.reverseOrder());

        this.competidores = competidores;
        this.qtclassificados = qtclassificados;
      
        //definir o array dos vitoriosos
        if(qtclassificados>0){
            for(int i=0; i<this.competidores.size(); i++){
                if(i<(this.qtclassificados-1)){
                    vitoriosos.add(this.competidores.get(i));
                }
                else if (Objects.equals(this.competidores.get(i), this.competidores.get(this.qtclassificados-1))){
                    vitoriosos.add(this.competidores.get(i));
                }
                else
                    break;
            }
        }
    }
    
    public double GetMedia(){
        int soma = 0;
        for(int i=0; i<competidores.size(); i++){
            soma += competidores.get(i);
        }
        return soma/competidores.size();
    }
    
    public double GetDesvioPadrao (){
        double media = GetMedia();
        int soma = 0;
        
        for(int i=0; i<competidores.size(); i++){
            soma += Math.pow(competidores.get(i)-media,2);
        }
        return Math.sqrt(soma/competidores.size() );
    }
    
    public double GetDesvioPadraoWin (){
        double media = GetMediaWin();
        double soma = 0;
        
        for(int i=0; i<vitoriosos.size(); i++){
            soma += Math.pow(vitoriosos.get(i)-media,2);
        }
        return Math.sqrt(soma/vitoriosos.size());
    }
    
    public double GetMediaWin(){
        double soma = 0;
        for(int i=0; i<vitoriosos.size(); i++){
            soma += vitoriosos.get(i);
        }
        return soma/vitoriosos.size();
    }
    
    public int GetVitoriosos(){
        return vitoriosos.size();
    }
}
