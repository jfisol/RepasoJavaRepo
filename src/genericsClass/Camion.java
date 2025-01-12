package genericsClass;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//Ejemplo de clases genericas
public class Camion implements Iterable {

    private List objetos;
    private int max;
    public Camion(int max) {
        this.max = max;
        objetos = new ArrayList();
    }
    public Camion(List objetos, int max) {
        this.objetos = objetos;
        this.max = max;
    }

    public void add(Object obj){
        if(this.objetos.size() <= max) {
            this.objetos.add(obj);
        }
        else{
            throw new RuntimeException("no hay mas espacio");
        }
    }

    @Override
    public Iterator iterator() {
        return this.objetos.iterator();
    }
}
