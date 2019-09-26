import java.util.ArrayList;
import java.util.Iterator;

public class Leilao {
	private ArrayList lotes;
	private int numeroProxLote;

	public Leilao() {
		this.lotes = new ArrayList();
		this.numeroProxLote = 1;
	}

	public void adicionaLote(String descricao) {
		this.lotes.add(new Lote(this.numeroProxLote, descricao));
		this.numeroProxLote++;
	}
	
	public void removeLote(int numero) {
		if (numero>=1 && numero < this.numeroProxLote) {
			Lote  escolhidoLote = (Lote) lotes.get(numero -1);
			if (escolhidoLote.getNumero() != numero){
				System.out.println("Numero do lote não identificado" );
			}
			lotes.remove(numero);
			System.out.println("Lote removido");
		}
		else {
			System.out.println("Lote não existe");
		}
		
	}

	public void mostraLotes() {
		Iterator it = this.lotes.iterator();
		while (it.hasNext()) {
			Lote lote = (Lote) it.next();
			System.out.println(lote.getNumero() + ": " + lote.getDescricao());
			Lance melhorLance = lote.getMaiorLance();
			if (melhorLance != null) {
				System.out.println("   Lance:" + melhorLance.getValor());
			} else {
				System.out.println("   (Nenhum Lance)");
			}
		}
	}

	public Lote getLote(int numero) {
		if ((numero >= 1) && (numero < this.numeroProxLote)) {
			Lote loteSelecionado = (Lote) this.lotes.get(numero - 1);
			if (loteSelecionado.getNumero() != numero) {
				System.out.println("Erro!!");
			}
			return loteSelecionado;
		} else {
			System.out.println("Lote numero " + numero + "não existe");
			return null;
		}
	}
	
	public void close()
	{
	 Iterator it = lotes.iterator();
	 while (it.hasNext())
	 {
	 Lote lotes = (Lote) it.next();
	 Lance lances = lotes.getMaiorLance();
	 if (lances != null)
	 {
	 System.out.println("Pessoa: " + lances.getLicitante() +
	" Valor " + lances.getValor());
	 }
	 else
	 {
	 System.out.println("Esse lote ainda não foi vendido!");
	 }
	 }
	} 
	
	
	public ArrayList getNaoVendidos() {
		ArrayList Lista;
		
		Lista = new ArrayList();
		Iterator it = lotes.iterator();
		
		while (it.hasNext()) {
			Lote lotes = (Lote) it.next();
			if (lotes.getMaiorLance()!= null) {
				Lista.add(lotes);
			}
			
		}
		
		return Lista;
	}

	public Iterator iterator() {
		// TODO Auto-generated method stub
		return null;
	}
		
		
		
		
	

}
