package tierraMedia;

public class PromocionPorcentual extends Promocion {

	private static final int CIEN = 100;
	private double descuento;

	public PromocionPorcentual(String nombre, Atraccion a1, Atraccion a2, Atraccion a3, double descuento) {
		super(nombre);
		super.atraccionesEnPromocion = new Atraccion[] { a1, a2, a3 };
		this.descuento = descuento / CIEN;
	}

	public PromocionPorcentual(String nombre, Atraccion a1, Atraccion a2, double descuento) {
		super(nombre);
		super.atraccionesEnPromocion = new Atraccion[] { a1, a2};
		this.descuento = descuento / CIEN;
	}

	@Override
	protected void costoPromocion() {
		int costo = 0;
		for (int i = 0; i < super.atraccionesEnPromocion.length; i++) {
			costo += super.atraccionesEnPromocion[i].costo;
		}
		super.costo = (int) (costo * (1-this.descuento));
	}

}
