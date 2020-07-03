public class CritEstoqueCresc implements Criterio {

    public boolean getCondicao(Produto [] p, Produto x, int j, boolean maior){

        if(maior){
            if(p[j].getQtdEstoque() < x.getQtdEstoque()) return true;
            return false;
        }
        if(p[j].getQtdEstoque() > x.getQtdEstoque()) return true;
        return false;
    }
    
    public boolean crescente(){

        return true;
    }
}