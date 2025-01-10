package Interface.modelo;

public class Cliente extends BaseEntity {


    private String nombre;
    private String apellido;


    public Cliente(){

    }

    public Cliente( String nombre, String apellido) {
        super();
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }


    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    @Override
    public String toString() {
        return
                "id "+ id +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' ;
    }

    //implementando metodo equals (generado automatico)

}
