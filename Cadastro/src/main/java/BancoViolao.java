//Aline Inoue Cerqueira 

import java.util.List;
import java.util.ArrayList;
import java.lang.NumberFormatException;

public class BancoViolao{
    private List<Violao> bdViolao = new ArrayList<Violao>();
    private Violao violao = new Violao();

    public List<Violao> getBdViolao(){
        return bdViolao;
    }
    
    public Violao consViolaoValor(Violao violao){
        for(int i=0; i<bdViolao.size(); i++){
            if(bdViolao.get(i).getValor()==violao.getValor()){
                return bdViolao.get(i);
            }
        }
        return null;
    }

    public Violao cadViolao(Violao violao){
            if(consViolaoValor(violao)==null){
                bdViolao.add(violao);
                return violao;
            }else{
               return null;
            }
     }

    
    public void impViolao(Violao violao){
        System.out.println("\nMarca do violao: " + violao.getMarca()+" - Ano de fabricacao: " +violao.getAno()+" - Valor: R$ " +violao.getValor());
    }

    public Violao atualizaViolao(Violao violao){
        for(int i=0; i < bdViolao.size(); i++){
            if(bdViolao.get(i).getValor() == violao.getValor()){
                violao = cadViolao(violao);
                bdViolao.set(i,violao);
                bdViolao.remove(bdViolao.size()-1);
                return bdViolao.get(i);
            }
        }
        return null;
    }

    public Violao removeViolao(Violao violao){
        violao = consViolaoValor(violao);

        if(bdViolao.remove(violao)){
            return violao;
        }

        return null;
    }
}