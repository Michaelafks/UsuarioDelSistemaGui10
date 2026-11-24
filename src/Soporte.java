public class Soporte extends Usuario {

    private String areaSoporte;

    public Soporte(String username, String correo) {
        super(username, correo);
        this.areaSoporte = "Atención técnica";
    }

    @Override
    public String obtenerPermisos() {
        return "Puede atender solicitudes, resolver problemas y brindar asistencia técnica.";
    }

    @Override
    public String mostrarInformacion() {
        return super.mostrarInformacion() +
                "\nTipo: Soporte" +
                "\nÁrea: " + areaSoporte +
                "\nPermisos: " + obtenerPermisos();
    }
}
