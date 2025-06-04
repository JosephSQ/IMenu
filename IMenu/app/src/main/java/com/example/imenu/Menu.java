import java.util.ArrayList;

public class Menu {
    private String nombre;
    private ArrayList<Plato> platos;

    public Menu(String nombre) {
        this.nombre = nombre;
        this.platos = new ArrayList<>();
    }

    public void agregarPlato(Plato plato) {
        platos.add(plato);
    }

    public ArrayList<Plato> getPlatos() {
        return platos;
    }

    public String getNombre() {
        return nombre;
    }
}
