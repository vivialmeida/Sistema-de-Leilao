

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Iterator;


public class Interface {

	private Leilao meuLeilao;
	
	private int modoAtual;

	public Interface () {
		this.meuLeilao = new Leilao();
	}

	public void iniciaOperacao() {
		int opcao;
		opcao = this.getOpcao();
		
		while (opcao != 6) {
			switch (opcao) {
			case 1:
				meuLeilao.adicionaLote(getString("Descriçao"));
				break;
							
			case 2:
			meuLeilao.removeLote(getInt("Informe Lote a ser removido"));
			
			break;
				
			case 3:
				meuLeilao.close();
				break;
			
				
			case 4:
				Lote lotes = meuLeilao.getLote(getInt("Numero do lote"));
				Pessoa pessoa =new Pessoa (getString("Nome do Licitante"));
				lotes.lancePara(pessoa, (double) getInt( "Valor do lance"));
				 break;
				
			
			case 5:
				this.setModo(1); 
				break;		
						 
			 
				
			}
			opcao = getOpcao();
		}
	}

	public void setModo(int modo) {
		if (modo == 0 || modo == 1) {
			this.modoAtual = modo;
		}
	}

	private int getOpcao() {
		int opcao;
		do {
			if (this.modoAtual == 0) {
				opcao = getInt(
						"Opcao: 1 - Adicionar Lote, 2 - Remover Lote ,   3- Fechar Lote ,  5- Mudar Modo, 6- Sair");
				if (opcao != 1 & opcao != 2 & opcao != 3 & opcao != 4 & opcao != 5) {
					opcao = 0;
				}
			} else {
				opcao = getInt(" 4- Dar lance 6- Sair" );
				if (opcao != 4 & opcao != 6) {
					opcao = 0;
				} 
			}
		} while (opcao == 0);
		return opcao;
	}

	private int getInt(String string) {
		Scanner r = new Scanner(System.in);
		System.out.println("Entre com " + string);
		if (r.hasNextInt()) {
			return r.nextInt();
		}
		String st = r.next();
		System.out.println("Erro na Leitura de Dados");
		return 0;
	}
	
	private String getString(String string) {
		Scanner r = new Scanner(System.in);
		System.out.println("Entre com " + string);
		if (r.hasNext()) {
			return r.next();
		}
		String st = r.next();
		
		return ("Erro na Leitura de Dados");
	}
}

