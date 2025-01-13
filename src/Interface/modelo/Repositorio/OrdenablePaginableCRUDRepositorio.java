package Interface.modelo.Repositorio;



//Herencia Multiple de interfaces.
public interface OrdenablePaginableCRUDRepositorio<T> extends OrdenableRepositorio<T>, PaginableRepositorio<T>,CRUDRepositorio<T>, ContableRepositorio{
}
