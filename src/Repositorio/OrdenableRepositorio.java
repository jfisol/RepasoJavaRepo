package Repositorio;

import modelo.Cliente;

import java.util.List;

public interface OrdenableRepositorio  {

    List<Cliente> Listar(String campo, Direccion direccion);
}
