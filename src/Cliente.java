public class Cliente extends Usuario {

    private String tipoCliente;

    public Cliente(String username, String correo) {
        super(username, correo);
        this.tipoCliente = "Regular";
    }

    @Override
    public String obtenerPermisos() {
        return "Puede consultar productos, realizar compras y actualizar sus datos.";
    }

    @Override
    public String mostrarInformacion() {
        return super.mostrarInformacion() +
                "\nTipo: Cliente" +
                "\nCategoría: " + tipoCliente +
                "\nPermisos: " + obtenerPermisos();
    }
}
