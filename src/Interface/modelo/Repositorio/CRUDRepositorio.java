package Interface.modelo.Repositorio;

import Interface.modelo.Cliente;

import java.util.List;

public interface CRUDRepositorio<T> {

    List<T>listar();
    T obtener(Integer id);//metodo GET
    void CrearCliente(T cliente);

    void EditarCliente(T cliente);//Cuando se crea un cliente se crea un cliente nuevo

    void EliminarCliente(Integer id);



}
