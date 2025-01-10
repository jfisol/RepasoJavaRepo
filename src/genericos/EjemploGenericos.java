package genericos;

import Interface.modelo.Cliente;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EjemploGenericos {
    public static void main(String[] args) {
        List<Cliente> clientes =new ArrayList();
        clientes.add(new Cliente("Rambo","Perez"));

       // Cliente Rambo = (Cliente) clientes.get(0);//esto se utiliza si no no se agrega un tipo objeto a list
        Cliente Rambo = clientes.iterator().next();

        Cliente[] clienteArray ={new Cliente("Cliente1","Cliente1"),new Cliente("Cliente2","Cliente2")};
        Integer[] enterosArray = {1,2,3,4,5,6,7,8};

        List<Cliente> clienteList = fromArrayToList(clienteArray);
        List<Integer> enteroList = fromArrayToList(enterosArray);

        clienteList.forEach(System.out::println);
        enteroList.forEach(System.out::println);

        List<String> nombres = fromArrayToList(new String[]{"a","b","c"},new Integer[]{1,2,3,4});
        nombres.forEach(System.out::println);
    }

    public static <T> List<T> fromArrayToList(T [] c){//<T> se especifica un metodo generico

        return Arrays.asList(c); //metodo que recibe un arreglo y lo combierte en lista
    }
    public static <T,G> List<T> fromArrayToList(T[] c,G[] g){//<T> se especifica un metodo generico
        for(G elemento : g){
            System.out.println(elemento);
        }
     return Arrays.asList(c); //metodo que recibe un arreglo y lo combierte en lista
    }
}
