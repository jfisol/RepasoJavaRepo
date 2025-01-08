package Repositorio;

import modelo.Cliente;

import java.util.List;

public interface PaginableRepositorio {

    List<Cliente> Listar(int desde, int hasta);

}
