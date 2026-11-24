public class Main {

    public static void main(String[] args) {

        // Crear usuarios independientemente
        Usuario u1 = new Administrador("admin1", "admin@demo.com");
        Usuario u2 = new Desarrollador("dev1", "dev@demo.com");
        Usuario u3 = new Cliente("cliente1", "cliente@demo.com");
        Usuario u4 = new Soporte("soporte1", "soporte@demo.com");

        // Crear sistema
        SistemaUsuarios sistema = new SistemaUsuarios();

        // Mostrar sistema vacío
        System.out.println("===== SISTEMA VACÍO =====");
        System.out.println(sistema.mostrarUsuarios());

        // Agregar usuarios
        sistema.agregarUsuario(u1);
        sistema.agregarUsuario(u2);
        sistema.agregarUsuario(u3);
        sistema.agregarUsuario(u4);

        // Mostrar usuarios
        System.out.println("\n===== USUARIOS REGISTRADOS =====");
        System.out.println(sistema.mostrarUsuarios());

        // Mostrar permisos
        System.out.println("\n===== PERMISOS DE USUARIOS =====");
        System.out.println("Administrador: " + u1.obtenerPermisos());
        System.out.println("Desarrollador: " + u2.obtenerPermisos());
        System.out.println("Cliente: " + u3.obtenerPermisos());
        System.out.println("Soporte: " + u4.obtenerPermisos());

        // Buscar usuario existente
        System.out.println("\n===== BUSCAR USUARIO EXISTENTE =====");
        Usuario encontrado = sistema.buscarUsuario("dev1");

        if (encontrado != null) {
            System.out.println(encontrado.mostrarInformacion());
        } else {
            System.out.println("Usuario no encontrado.");
        }

        // Buscar usuario inexistente
        System.out.println("\n===== BUSCAR USUARIO INEXISTENTE =====");
        encontrado = sistema.buscarUsuario("usuario99");

        if (encontrado != null) {
            System.out.println(encontrado.mostrarInformacion());
        } else {
            System.out.println("Usuario no encontrado.");
        }

        // Eliminar usuario existente
        System.out.println("\n===== ELIMINAR USUARIO EXISTENTE =====");
        System.out.println("Eliminado: " + sistema.eliminarUsuario("cliente1"));

        // Eliminar usuario inexistente
        System.out.println("\n===== ELIMINAR USUARIO INEXISTENTE =====");
        System.out.println("Eliminado: " + sistema.eliminarUsuario("usuario99"));

        // Mostrar lista final
        System.out.println("\n===== LISTA FINAL DE USUARIOS =====");
        System.out.println(sistema.mostrarUsuarios());
    }
}
