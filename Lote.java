
public class Lote {
	private int numero;
	private String descricao;
	private Lance maiorLance;

	public Lote(int numero, String descricao) {
		this.numero = numero;
		this.descricao = descricao;
	}

	public void lancePara(Pessoa licitante, double valor) {
		if (this.maiorLance == null || (this.maiorLance.getValor() < valor)) {
			
			this.setMaiorLance(new Lance(licitante, valor));
			
		} 
		else{
			System.out.println("Lote nº: " + this.getNumero() + "(" + this.getDescricao() + ")"
					+ "Atualmente tem um lance de: " + this.maiorLance.getValor());
		}
	}

	public Lance getMaiorLance() {
		return maiorLance;
	}

	public void setMaiorLance(Lance maiorLance) {
		this.maiorLance = maiorLance;
	}

	public int getNumero() {
		return numero;
	}

	public String getDescricao() {
		return descricao;
	}
	
	

}
