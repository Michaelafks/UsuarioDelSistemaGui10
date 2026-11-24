public class Desarrollador extends Usuario {

    private String especialidad;

    public Desarrollador(String username, String correo) {
        super(username, correo);
        this.especialidad = "Desarrollo de software";
    }

    @Override
    public String obtenerPermisos() {
        return "Puede desarrollar, modificar y probar funcionalidades del sistema.";
    }

    @Override
    public String mostrarInformacion() {
        return super.mostrarInformacion() +
                "\nTipo: Desarrollador" +
                "\nEspecialidad: " + especialidad +
                "\nPermisos: " + obtenerPermisos();
    }
}
