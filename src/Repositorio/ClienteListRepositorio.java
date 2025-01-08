package Repositorio;

import modelo.Cliente;

import java.util.Comparator;
import java.util.List;

public class ClienteListRepositorio implements CRUDRepositorio, OrdenableRepositorio,PaginableRepositorio {
    private List<Cliente>dataSource;

    public ClienteListRepositorio(List<Cliente> dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public List<Cliente> listar() {
        return this.dataSource;
    }
    //Obtener por ID
    @Override
    public Cliente obtener(Integer id) {
        Cliente c = null;
        for (var cli:dataSource) {
            if(cli.getId().equals(id)){
                c = cli;
                break;
            }
        }
        return c;
    }

    @Override
    public void CrearCliente(Cliente cliente) {

        this.dataSource.add(cliente);

    }

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
    public void EliminarCliente(Integer id) {
        Cliente cli = this.obtener(id);//Obtenemos el cliente que hay en la lista.
        this.dataSource.remove(cli);
    }

    @Override
    public List<Cliente> Listar(String campo, Direccion direccion) {
        //se inserta el sort de forma automatica .sort(new Compara..)
        this.dataSource.sort(new Comparator<Cliente>() {
            //metodo compareTo(comparator) retorna un entero
            @Override
            public int compare(Cliente c1, Cliente c2) {
                    int resultado = 0;
                if (direccion.equals(Direccion.ASC)){
                    switch (campo){
                        case "id" -> resultado = c1.getId().compareTo(c2.getId());
                        case "nombre" -> resultado = c1.getNombre().compareTo(c2.getNombre());
                        case "apellido" -> resultado = c1.getApellido().compareTo(c2.getApellido());
                    }

                }else if (direccion.equals(Direccion.DESC)){

                    switch (campo){
                        case "id" -> resultado = c2.getId().compareTo(c1.getId());
                        case "nombre" -> resultado = c2.getNombre().compareTo(c1.getNombre());
                        case "apellido" -> resultado = c2.getApellido().compareTo(c1.getApellido());
                    }

                }

                return resultado;
            }
        });
        return this.dataSource;
    }

    @Override
    public List<Cliente> Listar(int desde, int hasta) {
        return this.dataSource.subList(desde,hasta);//subList es una funcion de estructura List
    }
}
