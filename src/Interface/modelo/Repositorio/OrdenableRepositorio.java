package Interface.modelo.Repositorio;

import Interface.modelo.Cliente;

import java.util.List;

public interface OrdenableRepositorio  {

    List<Cliente> Listar(String campo, Direccion direccion);
}
