import java.util.ArrayList;

public class SistemaUsuarios {

    private ArrayList<Usuario> usuarios;

    public SistemaUsuarios() {
        usuarios = new ArrayList<>();
    }

    public void agregarUsuario(Usuario usuario) {
        if (usuario != null) {
            usuarios.add(usuario);
        }
    }

    public Usuario buscarUsuario(String username) {
        for (Usuario usuario : usuarios) {
            if (usuario.getUsername().equals(username)) {
                return usuario;
            }
        }

        return null;
    }

    public boolean eliminarUsuario(String username) {
        Usuario usuario = buscarUsuario(username);

        if (usuario != null) {
            return usuarios.remove(usuario);
        }

        return false;
    }

    public String mostrarUsuarios() {
        String resultado = "===== LISTA DE USUARIOS =====\n";

        if (usuarios.isEmpty()) {
            return resultado + "No hay usuarios registrados.";
        }

        for (Usuario usuario : usuarios) {
            resultado += "\n-------------------------\n";
            resultado += usuario.mostrarInformacion() + "\n";
        }

        return resultado;
    }
}
