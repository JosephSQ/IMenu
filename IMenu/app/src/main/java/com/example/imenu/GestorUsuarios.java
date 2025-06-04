import java.util.HashMap;

public class GestorUsuarios {
    private HashMap<String, Usuario> usuarios;

    public GestorUsuarios() {
        usuarios = new HashMap<>();
    }

    public boolean registrarUsuario(String id, String nombre, String tipo) {
        if (usuarios.containsKey(id)) return false;
        usuarios.put(id, new Usuario(id, nombre, tipo));
        return true;
    }

    public Usuario obtenerUsuario(String id) {
        return usuarios.get(id);
    }
}
