package logicaProgramacao;

public class OperacoesAritmeticas {
	/**
	 * 01. Entrar via teclado com a base e a altura de um retângulo, calcular e
	 * exibir sua área.
	 */
	public int getAreaRetangulo(int base, int altura) {
		int area = base * altura;
		return area;
	}

	/**
	 * 02. Calcular e exibir a área de um quadrado, a partir do valor de sua aresta
	 * que será digitado.
	 */
	public int getAreaQuadradoAresta(int aresta) {
		int area = aresta * aresta;
		return area;
	}

	/**
	 * 03. Calcular e exibir a área de um quadrado a partir do valor de sua diagonal
	 * que será digitado.
	 */
	public int getAreaQuadradoDiagonal(int diagonal) {
		int area = (diagonal * diagonal) / 2;
		return area;
	}

	/**
	 * 04. A partir dos valores da base e altura de um triângulo, calcular e exibir
	 * sua área.
	 */
	public int getAreaTriangulo(int base, int altura) {
		int area = (base * altura) / 2;
		return area;
	}

	/**
	 * 05. Calcular e exibir o volume de uma esfera a partir do valor de seu
	 * diâmetro que será digitado.
	 */
	public double getVolumeEsfera(int diametro) {
		// double raio = diametro / 2;
		// double cubo = Math.pow(raio, 3);
		// double pi = Math.PI;
		// double area = (4*pi*cubo) / 3;
		double area = (4 * (Math.PI * (Math.pow(diametro / 2, 3)))) / 3;
		return area;
	}

	/**
	 * 06. Calcular e exibir a média aritmética de quatro valores quaisquer que
	 * serão digitados.
	 */
	public float getMediaAritmetica(float a, float b, float c, float d) {
		float media = (a + b + c + d) / 4f;
		return media;
	}

	/**
	 * 07. Calcular e exibir a média geométrica de dois valores quaisquer que serão
	 * digitados.
	 */
	public double getMediaGeometrica(double a, double b) {
		double media = Math.sqrt((a * b));
		return media;
	}

	/**
	 * 08. Sabendo que uma milha marítima equivale a um mil, oitocentos e cinqüenta
	 * e dois metros e que um quilômetro possui mil metros, fazer um programa para
	 * converter milhas marítimas em quilômetros.
	 * @param milhas 
	 */
	public double getMilhaMaritimaEmKilometro(int milhas) {
		double milhaEmKm = 0;
		return milhaEmKm;
	}

	/**
	 * 09. Calcular e exibir a tensão de um determinado circuito eletrônico a partir
	 * dos valores da resistência e corrente elétrica que serão digitados. Utilize a
	 * lei de Ohm.
	 */

	/**
	 * 10. Entrar via teclado com o valor de uma temperatura em graus Celsius,
	 * calcular e exibir sua temperatura equivalente em Fahrenheit.
	 */

	/**
	 * 11. A partir do diâmetro de um círculo que será digitado, calcular e exibir
	 * sua área.
	 */

	/**
	 * 12. Calcular e exibir o volume de um cone a partir dos valores da altura e do
	 * raio da base que serão digitados.
	 */

	/**
	 * 13. Calcular e exibir a velocidade final (em km/h) de um automóvel, a partir
	 * dos valores da velocidade inicial (em m/s), da aceleração (m/s²) e do tempo
	 * de percurso (em s) que serão digitados.
	 */

	/**
	 * 14. Calcular e exibir o volume livre de um ambiente que contém uma esfera de
	 * raio “r” inscrita em um cubo perfeito de aresta “a”. Os valores de “r “ e “a”
	 * serão digitados.
	 */

	/**
	 * 15. Entrar via teclado com o valor da cotação do dólar e uma certa quantidade
	 * de dólares. Calcular e exibir o valor correspondente em Reais (R$).
	 */
	public double getReais(double cotacao, double qdDolar) {
		double reais = cotacao * qdDolar;

		return reais;
	}

	/**
	 * 16. Entrar via teclado com o valor de um ângulo em graus, calcular e exibir
	 * as seguintes funções trigonométricas: seno, coseno, tangente e secante deste
	 * ângulo. Lembre-se que uma função trigonométrica trabalha em radianos.
	 * 1 Pi Rad = 180 graus
	 */
	
	/**
	 * 17. Entrar via teclado com dois valores quaisquer “X” e “X”. Calcular e
	 * exibir o cálculo XY (“X” elevado a “Y”). Pesquisar as funções Exp e Ln.
	 */
	public double getExponencial(double x, double y) {
		double exp = Math.pow(x, y);
		return exp;
	}

	/**
	 * 18. Entrar via teclado com o valor de cinco produtos. Após as entradas,
	 * digitar um valor referente ao pagamento da somatória destes valores. Calcular
	 * e exibir o troco que deverá ser devolvido.
	 */

}
