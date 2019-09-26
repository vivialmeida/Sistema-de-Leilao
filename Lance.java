
public class Lance {

	public double valor;
	public Pessoa licitante;
	
	public Lance (Pessoa licitante, double valor) {
		this.licitante = licitante;
		this.valor = valor;	
		
	}
	
	
	public double getValor() {
		return valor;
	}
	public Pessoa getLicitante() {
		return licitante;
	}
	
}
