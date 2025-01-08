import Repositorio.ClienteListRepositorio;
import modelo.Cliente;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Cliente nuevo = new Cliente("Amarrillo", "Patito");
        Cliente nuevo1 = new Cliente("C2", "C2");

        //System.out.println(nuevo);
        Cliente nuevo2 = new Cliente();
        nuevo2.setNombre("Anastasio");
        nuevo2.setApellido("Pelaez");
       // System.out.println("Solo impresion de Clientes");
       // System.out.println(nuevo2);
        List<Cliente> listaClientes = new ArrayList<>();

      /*  listaClientes.add(nuevo);
        listaClientes.add(nuevo2);
        System.out.println("Lectura de clientes");
        for (var listar:listaClientes) {
            System.out.println(listar);
        }*/

        System.out.println("==== Usando ClienteRepositorio para array List==== ");
        ClienteListRepositorio repo = new ClienteListRepositorio(listaClientes);
        repo.CrearCliente(nuevo);
        repo.CrearCliente(nuevo1);
        repo.CrearCliente(nuevo2);

        System.out.println("==== LISTAR CLIENTE ==== \n");
        List<Cliente> CopiaCliente = repo.listar();
        CopiaCliente.forEach(System.out::println);
       System.out.println("==== EDITAR CLIENTE ==== \n");
        Cliente clienteEditar = new Cliente("EDITAR","Sancadilla");
        clienteEditar.setId(1);
        repo.EditarCliente(clienteEditar);
        CopiaCliente.forEach(System.out::println);

        System.out.println("===== CREAR CLIENTE =====");
       // Cliente n = new Cliente("Nuevo", "Patito");
       // Cliente n1 = new Cliente("Nuevo2", "maz");
        repo.CrearCliente(new Cliente("Probando","cliente"));
      System.out.println("=== Eliminar cliente ===");
        System.out.println("Cliente :" + repo.obtener(1)+" ELIMINADO");
        repo.EliminarCliente(1);
        CopiaCliente.forEach(System.out::println);
        System.out.println("==== LISTAR CLIENTE ==== \n");
        CopiaCliente.forEach(System.out::println);

        System.out.println("----------- Paginacion ------------");
        List<Cliente>paginable = repo.Listar(1,3);
        paginable.forEach(System.out::println);





    }
    }
