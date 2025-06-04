import java.util.ArrayList;
import java.util.LinkedHashMap;

public class GestorOrdenes {
    private LinkedHashMap<String, Orden> ordenes;

    public GestorOrdenes() {
        ordenes = new LinkedHashMap<>();
    }

    public void crearOrden(Orden orden) {
        ordenes.put(orden.getIdOrden(), orden);
    }

    public Orden obtenerOrden(String idOrden) {
        return ordenes.get(idOrden);
    }

    public void actualizarEstado(String idOrden, EstadoOrden estado) {
        Orden orden = ordenes.get(idOrden);
        if (orden != null) {
            orden.cambiarEstado(estado);
        }
    }

    public ArrayList<Orden> listarOrdenes() {
        return new ArrayList<>(ordenes.values());
    }
}

