package genericos;

import Interface.modelo.Cliente;
import Interface.modelo.ClientePremium;

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



        //IMPRIMIR LOS DATOS CON LA FUNCION PARA IMPRIMIR LISTA
        System.out.println("Imprimir clientes de la funcion para clipboars");
        imprimirClientes(clientes);
        imprimirClientes(clienteList);

        //CREANDO CLASE CLIENTE PREMIUM (CLASE HIJA)
        List<ClientePremium> clientePremium = new ArrayList<>();
        clientePremium.add(new ClientePremium("Cliente","Premium"));
        clientePremium.add(new ClientePremium("Cliente2","Premium2"));
        clientePremium.add(new ClientePremium("Cliente3","Premium3"));

        //USAMOS LA FUNCION IMPRIMIRCLIENTES DONDE SE AGREGA EL ? PARA IMPRIMIR CLASES HIJAS
        System.out.println("Clientes Premium");
        imprimirClientes(clientePremium);

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

    /*Limitar los tipos genericos se agrega un extends con el tipo de numeros que se quiera limitar*/
    //Bounded Generics
  /*  public static <T extends Number> List<T> fromArrayToList(T [] c){//<T> se especifica un metodo generico

        return Arrays.asList(c); //metodo que recibe un arreglo y lo combierte en lista
    }*/


    /*Tambien se puede limitar a una interfaz por ejemplo comparable */
    public static <T extends Number & Comparable> List<T> fromArrayToList(T [] c){//<T> se especifica un metodo generico

        return Arrays.asList(c); //metodo que recibe un arreglo y lo combierte en lista
    }

    /*Waildcards Genercis*/

    public static void imprimirClientes(List<? extends Cliente> clientes){//aca solo se puede imprimir los clientes de la clase padre
        //Al colocarle el ? permite pasarle cualquier tipo de cliente (clases hijas)
        clientes.forEach(System.out::println);
    }

}
