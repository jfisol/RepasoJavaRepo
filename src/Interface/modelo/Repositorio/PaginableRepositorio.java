package Interface.modelo.Repositorio;

import Interface.modelo.Cliente;

import java.util.List;

public interface PaginableRepositorio<T> {

    List<T> Listar(int desde, int hasta);

}
