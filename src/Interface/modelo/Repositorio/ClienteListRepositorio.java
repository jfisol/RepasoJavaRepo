package Interface.modelo.Repositorio;

import Interface.modelo.Cliente;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

//ESTA CLASE PUEDE INTEGRAR CUALQUIER CLASE DE TIPO DE OBJETOS CONCRETA
public class ClienteListRepositorio extends AbstractListRepositorio<Cliente> {

/*
    //Obtener por ID
    @Override
    public Cliente obtener(Integer id) {
        Cliente c = null;
        for (var cli:dataSource) {
            if(cli.getId() != null && cli.getId().equals(id)){
                c = cli;
                break;
            }
        }
        return c;
    }*/


    @Override
    public void EditarCliente(Cliente cliente) {
      Cliente cli = this.obtener(cliente.getId());//Obtenemos el cliente que hay en la lista.
        cli.setNombre(cliente.getNombre());
        cli.setApellido(cliente.getApellido());

        //
       /* Cliente clie = this.porId(t.getId());
        clie.setNombre(t.getNombre());
        clie.setApellido(t.getApellido());
        
*/
    }


    @Override
    public List<Cliente> Listar(String campo, Direccion direccion) {
        //Si se ordena con el dataSource se afecta directamente la lista principal y afecta el listar por eso creamos otra lista
        List<Cliente> listaC = new ArrayList<>(this.dataSource);
        //se inserta el sort de forma automatica .sort(new Compara..)
        listaC.sort(new Comparator<Cliente>() {//
            //metodo compareTo(comparator) retorna un entero
            @Override
            public int compare(Cliente c1, Cliente c2) {
                    int resultado = 0;
                if (direccion.equals(Direccion.ASC)){
                  resultado = this.ordenar(c1,c2);

                }else if (direccion.equals(Direccion.DESC)){

                  resultado =  this.ordenar(c2,c1);

                }

                    return  resultado;
            }

            public int ordenar(Cliente a, Cliente b){
             int resultado = 0;
                switch (campo){
                    case "id" -> resultado = a.getId().compareTo(b.getId());
                    case "nombre" -> resultado = a.getNombre().compareTo(b.getNombre());
                    case "apellido" -> resultado = a.getApellido().compareTo(b.getApellido());
                }

                return resultado;
            }
        });
        return this.dataSource;
    }


}
