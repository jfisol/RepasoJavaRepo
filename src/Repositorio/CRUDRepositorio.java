package Repositorio;

import modelo.Cliente;

import java.util.ArrayList;
import java.util.List;

public interface CRUDRepositorio {

    List<Cliente>listar();
    Cliente obtener(Integer id);//metodo GET
    void CrearCliente(Cliente cliente);

    void EditarCliente(Cliente cliente);//Cuando se crea un cliente se crea un cliente nuevo

    void EliminarCliente(Integer id);



}
