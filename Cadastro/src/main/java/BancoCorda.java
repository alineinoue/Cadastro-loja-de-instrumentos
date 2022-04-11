//Aline Inoue Cerqueira - RA: 2142333

import java.util.List;
import java.util.ArrayList;
import java.lang.NumberFormatException;
import java.text.NumberFormat;

public class BancoCorda{
    private List<Corda> bdCorda = new ArrayList<Corda>();
    private Corda corda = new Corda();

    public List<Corda> getBdCorda(){
        return bdCorda;
    }
    
    public Corda consCordaNum(Corda corda){
        for(int i = 0; i<bdCorda.size(); i++){
            if(bdCorda.get(i).getNum()==corda.getNum()){
                return bdCorda.get(i);
            }
        }

        return null;

    }

    public Corda cadCorda(Corda corda){
            if(consCordaNum(corda)==null){
                bdCorda.add(corda);
                return corda;
            }else{
               return null;
            }
    }

    public void impCorda(Corda corda){
        System.out.println("\nNumero de cordas: "+corda.getNum()+ " - Tipo da corda: " +corda.getTipo());
    }

    public Corda atualizaCorda(Corda corda){
        for(int i=0; i < bdCorda.size(); i++){
            if(bdCorda.get(i).getNum() == corda.getNum()){
                corda = cadCorda(corda);
                bdCorda.set(i,corda);
                bdCorda.remove(bdCorda.size()-1);
                return bdCorda.get(i);
            }
        }

        return null;
    }

    public Corda removeCorda(Corda corda){
        corda = consCordaNum(corda);

        if(bdCorda.remove(corda)){
            return corda;
        }
        return null;
    }
}