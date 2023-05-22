package Aula17;

public class GerenciadorContatoTeste {
		public static void main(String[] args) {
			
			//aqui traz um outro objeto e instancia, a partir dele, outro objeto para manipular nessa classe, o gc
			GerenciadorContatoArrayList gc = new GerenciadorContatoArrayList();
			gc.adicionar(new Contato("Natalia", "13 3233-2990"));
			gc.adicionar(new Contato("Duarte", "11 44152497"));
			gc.adicionar(new Contato("Josephina", "15 55296713"));
			gc.mostrar();
			gc.remover(0);
			gc.mostrar();
			gc.atualizar(1);
		}
	}

