public class Administrador extends Usuario {

    private String nivelAdministracion;

    public Administrador(String username, String correo) {
        super(username, correo);
        this.nivelAdministracion = "Completo";
    }

    @Override
    public String obtenerPermisos() {
        return "Puede administrar usuarios, modificar configuraciones y controlar el sistema.";
    }

    @Override
    public String mostrarInformacion() {
        return super.mostrarInformacion() +
                "\nTipo: Administrador" +
                "\nNivel de administración: " + nivelAdministracion +
                "\nPermisos: " + obtenerPermisos();
    }
}
