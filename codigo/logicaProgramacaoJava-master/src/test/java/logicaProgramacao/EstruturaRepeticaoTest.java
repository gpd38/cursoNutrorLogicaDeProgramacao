package logicaProgramacao;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

import org.junit.Test;

public class EstruturaRepeticaoTest {
	EstruturaRepeticao estruturaRepeticao = new EstruturaRepeticao();

	/** Teste 32 */

	/** Teste 33 */

	/** Teste 34 */

	/** Teste 35 */
	@Test
	public void exibeTabuadaCinco() {
		estruturaRepeticao.getTabuadaCinco();
	}

	/** Teste 36 */

	/** Teste 37 */

	/** Teste 38 */

	/** Teste 39 */
	@Test
	public void exibeSomaInteirosUmACem() {
		estruturaRepeticao.somaNumerosPositivosUmACem();
	}

	/** Teste 40 */

	/** Teste 41 */

	/** Teste 42 */

	/** Teste 43 */

	/** Teste 44 */

	/** Teste 45 */

	/** Teste 46 */

	/** Teste 47 */

	/** Teste 48 */

	/** Teste 49 */

	/** Teste 50 */

	/** Teste 51 */

	/** Teste 52 */
	@Test
	public void exibeValorInverso() {
		List<Integer> listaNumeros = new ArrayList<Integer>();
		listaNumeros.add(2);
		listaNumeros.add(5);
		listaNumeros.add(7);
		listaNumeros.add(8);
		listaNumeros.add(12);
		listaNumeros.add(13);
		listaNumeros.add(17);
		listaNumeros.add(21);
		listaNumeros.add(25);
		listaNumeros.add(28);
		estruturaRepeticao.exibirValorOrdemInversa(listaNumeros);
	}

	/** Teste 53 */

	/** Teste 54 */

	/** Teste 55 */
	@Test
	public void ExibeConstanteMultiplicativa() {
		int[] vetor = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };
		int constante = 5;
		estruturaRepeticao.constanteMultiplicativa(vetor, constante);

	}

	/** Teste 56 */

	/** Teste 57 */
	@Test
	public void exibeListaNomeIdade() {
		List<LinkedHashMap<String, Object>> listMap = new ArrayList<LinkedHashMap<String, Object>>();
		LinkedHashMap<String, Object> map1 = new LinkedHashMap<>();
		LinkedHashMap<String, Object> map2 = new LinkedHashMap<>();
		LinkedHashMap<String, Object> map3 = new LinkedHashMap<>();
		LinkedHashMap<String, Object> map4 = new LinkedHashMap<>();
		LinkedHashMap<String, Object> map5 = new LinkedHashMap<>();
		map1.put("nome", "Joao");
		map1.put("idade", "35");
		map2.put("nome", "Thiago");
		map2.put("idade", "45");
		map3.put("nome", "Leia");
		map3.put("idade", "51");
		map4.put("nome", "Adam");
		map4.put("idade", "28");
		map5.put("nome", "Jose");
		map5.put("idade", "21");
		listMap.add(map1);
		listMap.add(map2);
		listMap.add(map3);
		listMap.add(map4);
		listMap.add(map5);

		estruturaRepeticao.exibeDados(listMap);
	}
	/** Teste 58 */

	/** Teste 59 */

	/** Teste 60 */

	/** Teste 61 */

	/** Teste 62 */

	/** Teste 63 */

	/** Teste 64 */

	/** Teste 65 */

	/** Teste 66 */

	/** Teste 67 */

	/** Teste 68 */

	/** Teste 69 */

	/** Teste 70 */

	/** Teste 71 */

	/** Teste 72 */

	/** Teste 73 */

	/** Teste 74 */

	/** Teste 75 */

	/** Teste 76 */

	/** Teste 77 */

	/** Teste 78 */

	/** Teste 79 */

	/** Teste 80 */
}
