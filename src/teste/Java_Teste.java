package teste;

class Cachorro {
	public void latir() {
		System.out.println("Au Au");
	}
}

class Carro {
	public void ligar() {
		System.out.println("Vrum Vrum");
	}
}

class Livro {
	public String titulo;
	public String autor;
	public int anoDePublicacao;
}

class Calculadora {
	public int somar(int a, int b) {
		return a + b;
	}
}

public class Java_Teste {
	public static void main(String[] args) {
		Cachorro Thor = new Cachorro();
		Thor.latir();
		
		Carro Uno_Quadrado = new Carro();
		Uno_Quadrado.ligar();
		
		Livro livro1 = new Livro();
		livro1.titulo = "Pequeno Principe";
		livro1.autor = "Antoine de Saint-Exupery";
		livro1.anoDePublicacao = 1976;
		
		System.out.println(livro1.titulo);
		System.out.println(livro1.autor);
		System.out.println(livro1.anoDePublicacao);
		
		Calculadora calculadora = new Calculadora();
		int resultado = calculadora.somar(18, 37);
		System.out.println(resultado);
	}
}