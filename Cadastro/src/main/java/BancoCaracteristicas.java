//Aline Inoue Cerqueira - RA: 2142333

import java.util.List;
import java.util.ArrayList;
import java.lang.NumberFormatException;

public class BancoCaracteristicas{
    private List<Caracteristicas> bdCaracteristicas = new ArrayList<Caracteristicas>();
    private Caracteristicas caract = new Caracteristicas();

    public List<Caracteristicas> getBdCaracteristicas(){
        return bdCaracteristicas;
    }
    public Caracteristicas consCaracteristicasCor(Caracteristicas caract){
        for(int i = 0; i<bdCaracteristicas.size(); i++){
            if(bdCaracteristicas.get(i).getCor()==caract.getCor()){
                return bdCaracteristicas.get(i);
            }
        }

        return null;

    }

    public Caracteristicas cadCaracteristicas(Caracteristicas caract){
            if(consCaracteristicasCor(caract)==null){
                bdCaracteristicas.add(caract);
                return caract;
            }else{
               return null;
            }
    }

    public void impCaracteristicas(Caracteristicas caract){
        System.out.println("\nCor do violao: "+caract.getCor());
    }

    public Caracteristicas atualizaCor(Caracteristicas caract){
        for(int i=0; i < bdCaracteristicas.size(); i++){
            if(bdCaracteristicas.get(i).getCor() == caract.getCor()){
                caract = cadCaracteristicas(caract);
                bdCaracteristicas.set(i,caract);
                bdCaracteristicas.remove(bdCaracteristicas.size()-1);
                return bdCaracteristicas.get(i);
            }
        }

        return null;
    }

    public Caracteristicas removeCor(Caracteristicas caract){
        caract = consCaracteristicasCor(caract);

        if(bdCaracteristicas.remove(caract)){
            return caract;
        }
        return null;
    }
}