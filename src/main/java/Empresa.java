
import java.util.ArrayList;

public class Empresa {
	private String nombre;
	private int cantidadBuses;
	private String ciudadDestino;
	private String rut;
	private String direccion;
	private String redes;
	public ArrayList<Buses> buses = new ArrayList<Buses>();
	public ArrayList<Conductores> conductores = new ArrayList<Conductores>();

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCantidadBuses() {
		return this.cantidadBuses;
	}

	public void setCantidadBuses(int cantidadBuses) {
		this.cantidadBuses = cantidadBuses;
	}

	public String getCiudadDestino() {
		return this.ciudadDestino;
	}

	public void setCiudadDestino(String ciudadDestino) {
		this.ciudadDestino = ciudadDestino;
	}

	public String getRut() {
		return this.rut;
	}

	public void setRut(String rut) {
		this.rut = rut;
	}

	public String getDireccion() {
		return this.direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getRedes() {
		return this.redes;
	}

	public void setRedes(String redes) {
		this.redes = redes;
	}

	public void agregarBus(String patente) {
		Buses busEncontrado = buscarBus(patente);
		if (busEncontrado != null) {
			System.out.println("El bus con patente " + patente + " ya está registrado.");
		} else {
			Buses nuevoBus = new Buses();
			nuevoBus.setPatente(patente);
			buses.add(nuevoBus);
			System.out.println("Se agregó un nuevo bus con patente: " + patente);
		}
	}


	public void agregarConductor(String tipoLicencia) {
		Conductores conductorEncontrado = buscarConductor(tipoLicencia);
		if (conductorEncontrado == null) {
			Conductores nuevoConductor = new Conductores();
			nuevoConductor.setTipoLicencia(tipoLicencia);
			conductores.add(nuevoConductor);
			System.out.println("Se agregó un nuevo conductor con tipo de licencia: " + tipoLicencia);
		} else {
			System.out.println("Ya existe un conductor con el tipo de licencia: " + tipoLicencia);
		}
	}

	public void viajesAsociados(Viajes viaje, String patenteBus) {
		Buses busAsociado = buscarBus(patenteBus);
		if (busAsociado != null) {
			viaje.setBusAsociado(busAsociado);
			System.out.println("Se asoció el viaje al bus con patente: " + patenteBus);
		} else {
			System.out.println("No se encontró ningún bus con la patente: " + patenteBus);
		}
	}


	public void eliminarBus(String patente) {
		Buses busEncontrado = buscarBus(patente);
		if (busEncontrado != null) {
			buses.remove(busEncontrado);
			System.out.println("El bus con patente " + patente + " ha sido eliminado.");
		} else {
			System.out.println("No se encontró ningún bus con la patente: " + patente);
		}
	}

	public void busesViajando() {
		throw new UnsupportedOperationException();
	}
	public Buses buscarBus(String patente) {
		for (Buses bus : buses) {
			if (bus.getPatente().equals(patente)) {
				return bus;
			}
		}
		return null;
	}
	public Conductores buscarConductor(String tipoLicencia) {
		for (Conductores conductor : conductores) {
			if (conductor.getTipoLicencia().equals(tipoLicencia)) {
				return conductor;
			}
		}
		return null;
	}
}