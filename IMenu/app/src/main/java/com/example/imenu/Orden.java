import java.util.ArrayList;

public class Orden {
    private String idOrden;
    private String idUsuario;
    private ArrayList<Plato> platosSeleccionados;
    private EstadoOrden estado;

    public Orden(String idOrden, String idUsuario) {
        this.idOrden = idOrden;
        this.idUsuario = idUsuario;
        this.platosSeleccionados = new ArrayList<>();
        this.estado = EstadoOrden.PENDIENTE;
    }

    public void agregarPlato(Plato plato) {
        platosSeleccionados.add(plato);
    }

    public void cambiarEstado(EstadoOrden nuevoEstado) {
        this.estado = nuevoEstado;
    }

    public EstadoOrden getEstado() {
        return estado;
    }

    public String getIdOrden() {
        return idOrden;
    }

    public ArrayList<Plato> getPlatosSeleccionados() {
        return platosSeleccionados;
    }
}

