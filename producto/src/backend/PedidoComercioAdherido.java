import java.math.BigDecimal;
import java.util.Iterator;
import java.util.List;

public class PedidoComercioAdherido {
	
	private List<DetallePedido> detalle;
	
	public PedidoComercioAdherido() {
		this.detalle = new ArrayList<>();
	}
	
	public BigDecimal calcularTotal() {
		BigDecimal total = BigDecimal.ZERO;
		Iterator<DetallePedido> iter = detalle.iterator();
		while (iter.hashNext()) {
			total = total.add(iter.next().calculatSubtotal());
		}
		return total;
	}

	public int cantidadDeProductos() {
		int total = 0;
		Iterator<DetallePedido> iter = detalle.iterator();
		while(iter.hasNext()) {
			total += iter.next().cantidad;
		}
		return total;
	}
	
}
