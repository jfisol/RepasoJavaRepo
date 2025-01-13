package Interface.modelo.Repositorio;

import Interface.modelo.Cliente;

import java.util.List;

public interface OrdenableRepositorio<T> {

    List<T> Listar(String campo, Direccion direccion);
}
