

import java.util.Date;

public class Viajes {
	private Buses busAsociado;
	private Date horaSalida;
	private Date horaLlegada;
	public CiudadOrigen ciudadorigen;
	public CiudadDestino ciudaddestino;

	public Date getHoraSalida() {
		return this.horaSalida;
	}

	public void setHoraSalida(Date horaSalida) {
		this.horaSalida = horaSalida;
	}

	public Date getHoraLlegada() {
		return this.horaLlegada;
	}

	public void setHoraLlegada(Date horaLlegada) {
		this.horaLlegada = horaLlegada;
	}
	public Buses getBusAsociado(){
		return this.busAsociado;
	}

	public void setBusAsociado(Buses busAsociado) {
		this.busAsociado = busAsociado;
	}
}