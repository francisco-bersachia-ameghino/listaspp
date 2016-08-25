import java.util.ArrayList;
import java.util.List;

/**
 * Created by damian on 18/08/16.
 */
public class MiLista<A> {
    List<A> lista;
    public MiLista(List<A> lista) {
        this.lista = lista;
    }


    public boolean existe(A i) {
        boolean ret = false;
        for (A l :this.lista ){
            if (i == l){
                ret = true;
            }
        }
        return ret;
    }

    public void borrar(A i) {
        List<A> nuevaLista = new ArrayList<A>();
        for (A l:this.lista){
            if(i != l){
                nuevaLista.add(i);
            }
        }

        this.lista = nuevaLista;
    }

    public boolean existeNumero(A i) {
        boolean ret = false;
        for (A l :this.lista ){
            if (i == l){
                ret = true;
            }
        }
        return ret;
    }


    public void borrarTodos(A i) {
        List<A> listaVacia = new ArrayList<A>();
        this.lista = listaVacia;
    }

    public boolean existeString(A s) {
        boolean ret = false;
        for (A l:this.lista){
            if(s == l){
                ret = true;
            }
        }
        return ret;
    }

    public void sumarUnoATodos() {
        List ret = new ArrayList();
        for(Integer i : (List<Integer>) this.lista){
            ret.add(i + 1);
        }
        this.lista=ret;
    }

    public void convertirAString() {
        String st;
        List<A> listaN = new ArrayList<A>();
        for(A l:this.lista){
            st = l.toString();
            listaN.add((A) st);
        }
        this.lista = listaN;

    }

}
