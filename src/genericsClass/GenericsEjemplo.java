package genericsClass;

public class GenericsEjemplo {
    public static void main(String[] args) {

        /*Ejemplo de Clases solo usando Objectos, esto condiciona el uso de casteo al querer instanciar un objeto diferente*/
       /*
       EJEMPLO USANDO TIPO OBJECT

        */
      /*


        Camion transporteCaballos = new Camion(5);

        transporteCaballos.add(new Animal("Peregrino","caballo"));
        transporteCaballos.add(new Animal("Cansino","caballo"));
        transporteCaballos.add(new Animal("Raul","caballo"));
        transporteCaballos.add(new Animal("Tornado","caballo"));
        transporteCaballos.add(new Animal("Tornado","caballo"));

       for(Object o :transporteCaballos){
           Animal a = (Animal) o;
           System.out.println("Nombre: " + a.getNombre() + " tipo: "+a.getTipo());

       }

       Camion transporteMaquinas = new Camion(3);
       transporteMaquinas.add(new Maquinaria("Buldocer"));
        transporteMaquinas.add(new Maquinaria("Grua Orquilla"));
        transporteMaquinas.add(new Maquinaria("Perforadora"));

        for(Object o : transporteMaquinas){
            Maquinaria m = (Maquinaria)  o ;
            System.out.println("Tipo: " + m.getTipo());
        }

        Camion transporteAutomovil = new Camion(2);
        transporteAutomovil.add(new Automovil("Toyota"));
        transporteAutomovil.add(new Automovil("Honda"));

        for (Object o : transporteAutomovil){
            Automovil movil = (Automovil) o;
            System.out.println("Marca: "+ movil.getMarca());
        }*/
        Camion<Animal> transporteCaballos = new Camion<>(5);

        transporteCaballos.add(new Animal("Peregrino","caballo"));
        transporteCaballos.add(new Animal("Cansino","caballo"));
        transporteCaballos.add(new Animal("Raul","caballo"));
        transporteCaballos.add(new Animal("Tornado","caballo"));
        transporteCaballos.add(new Animal("Tornado","caballo"));

         imprimir(transporteCaballos);
        Camion<Maquinaria> transporteMaquinas = new Camion<>(3);
        transporteMaquinas.add(new Maquinaria("Buldocer"));
        transporteMaquinas.add(new Maquinaria("Grua Orquilla"));
        transporteMaquinas.add(new Maquinaria("Perforadora"));

        imprimir(transporteMaquinas);

        Camion<Automovil> transporteAutomovil = new Camion<>(2);
        transporteAutomovil.add(new Automovil("Toyota"));
        transporteAutomovil.add(new Automovil("Honda"));

        imprimir(transporteAutomovil);

        }

        public static <T> void imprimir(Camion<T> generics){
          for(T t:generics){
              if(t instanceof Animal){
                  System.out.println("Nombre: "+((Animal) t).getNombre() + " Tipo: "+((Animal) t).getTipo());
              } else if (t instanceof  Automovil) {
                  System.out.println("Marca : " + ((Automovil) t).getMarca());
              } else if (t instanceof  Maquinaria) {
                  System.out.println("Maquinaria : "+ ((Maquinaria) t).getTipo());

              }
          }
        }
}
