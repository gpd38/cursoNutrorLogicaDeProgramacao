package logicaProgramacao;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class OperacoesAritmeticaTest {
	OperacoesAritmeticas opAritmeticas = new OperacoesAritmeticas();

	/** Teste 01 */
	@Test
	public void validaAreaRetangulo() {
		int area;
		area = opAritmeticas.getAreaRetangulo(10, 10);
		assertEquals(100, area);
	}

	/** Teste 02 */
	@Test
	public void validaAreaQuadradoPelaAresta() {
		int aresta;
		aresta = opAritmeticas.getAreaQuadradoAresta(9);
		assertEquals(81, aresta);
	}

	/** Teste 03 */
	@Test
	public void validaAreaQuadradoPelaDiagonal() {
		int diagonal;
		diagonal = opAritmeticas.getAreaQuadradoDiagonal(10);
		assertEquals(50, diagonal);
	}

	/** Teste 04 */
	@Test
	public void validaAreaTriangulo() {
		int area;
		area = opAritmeticas.getAreaTriangulo(3, 8);
		assertEquals(12, area);
	}

	/** Teste 05 */
	@Test
	public void validaVolumeEsfera() {
		double volume = opAritmeticas.getVolumeEsfera(4);
		assertEquals(33.49, volume, 2);
	}

	/** Teste 06 */
	@Test
	public void validaMediaAritmetica() {
		float media = opAritmeticas.getMediaAritmetica(5, 7, 9, 6);

		assertEquals(6.75, media, 0);
	}

	/** Teste 07 */
	@Test
	public void validaMediaGeometrica() {
		double media = opAritmeticas.getMediaGeometrica(2, 18);
		assertEquals(6, media, 0);
	}

	/** Teste 08 */

	/** Teste 09 */

	/** Teste 10 */

	/** Teste 11 */

	/** Teste 12 */

	/** Teste 13 */

	/** Teste 14 */

	/** Teste 15 */
	@Test
	public void conversaoReais() {
		double reais = opAritmeticas.getReais(5.29, 5);
		assertEquals(26.45, reais, 0);
	}

	/** Teste 16 */

	/** Teste 17 */
	@Test
	public void exponencial() {
		double exp = opAritmeticas.getExponencial(2, 3);
		assertEquals(8, exp, 0);

	}

	/** Teste 18 */

}
