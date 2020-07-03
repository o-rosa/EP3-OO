
public class CritPrecoDecresc implements Criterio {

    @Override
    public boolean getCondicao(Produto [] p, Produto x, int j, boolean maior){
        if(maior){
            if(x.getPreco() > p[j].getPreco()) return true;
            return false;
        }
        if(x.getPreco() < p[j].getPreco()) return true;
        return false;

    }

    @Override
    public boolean crescente(){
        return false;
    }


    
}