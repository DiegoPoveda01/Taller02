
import java.util.ArrayList;

public class Buses {
	private String patente;
	private int añosTrabajados;
	private String marca;
	private String modelo;
	public Conductores conductores;
	public ArrayList<Viajes> viajes = new ArrayList<Viajes>();

	public String getPatente() {
		return this.patente;
	}

	public void setPatente(String patente) {
		this.patente = patente;
	}

	public int getAñosTrabajados() {
		return this.añosTrabajados;
	}

	public void setAñosTrabajados(int añosTrabajados) {
		this.añosTrabajados = añosTrabajados;
	}

	public String getMarca() {
		return this.marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return this.modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
}