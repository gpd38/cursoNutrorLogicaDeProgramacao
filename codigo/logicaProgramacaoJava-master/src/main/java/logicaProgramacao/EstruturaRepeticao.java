package logicaProgramacao;

import java.util.LinkedHashMap;
import java.util.List;

public class EstruturaRepeticao {

	/** 32. Criar uma rotina de entrada que aceite somente um valor positivo. */

	/**
	 * 33. Entrar com dois valores via teclado, onde o segundo deverá ser maior que
	 * o primeiro. Caso contrário solicitar novamente apenas o segundo valor.
	 */

	/**
	 * 34. Entrar via teclado com o sexo de determinado usuário, aceitar somente “F”
	 * ou “M” como respostas válidas.
	 */

	/** 35. Exibir a tabuada do número cinco no intervalo de um a dez. */
	public void getTabuadaCinco() {
		int valor = 5;
		for (int i = 1; i < 11; i++) {
			System.out.println("5 x " + i + " = " + (valor * i));
		}
	}

	/**
	 * 36. Entrar via teclado com um valor qualquer. Travar a digitação, no sentido
	 * de aceitar somente valores positivos. Após a digitação, exibir a tabuada do
	 * valor solicitado, no intervalo de um a dez.
	 */

	/**
	 * 37. Entrar via teclado com um valor (X) qualquer. Travar a digitação, no
	 * sentido de aceitar somente valores positivos. Solicitar o intervalo que o
	 * programa que deverá calcular a tabuada do valor digitado, sendo que o segundo
	 * valor (B), deverá ser maior que o primeiro (A), caso contrário, digitar
	 * novamente somente o segundo. Após a validação dos dados, exibir a tabuada do
	 * valor digitado, no intervalo decrescente, ou seja, a tabuada de X no
	 * intervalo de B para A.
	 */

	/**
	 * 38. Exibir a tabuada dos valores de um a vinte, no intervalo de um a dez.
	 * Entre as tabuadas, solicitar que o usuário pressione uma tecla.
	 */

	/**
	 * 39. Exibir a soma dos números inteiros positivos do intervalo de um a cem.
	 */
	public void somaNumerosPositivosUmACem() {
		int soma = 0;
		for (int i = 1; i < 101; i++) {
			soma = soma + i;
		}
		System.out.println(soma);
	}

	/**
	 * 40. Exibir os trinta primeiros valores da série de Fibonacci. A série: 1, 1, 2, 3, 5, 8, ...
	 */

	/**
	 * 41. Exibir os vinte primeiros valores da série de Bergamaschi. A série: 1, 1, 1, 3, 5, 9, 17, ...
	 */

	/**
	 * 42. Calcular e exibir a soma dos “N” primeiros valores da seqüência abaixo. 
	 * O valor “N” será digitado, deverá ser positivo, mas menor que cem. 
	 * Caso o valor não satisfaça a restrição, enviar mensagem de erro e solicitar o valor
	 * novamente. 
	 * A seqüência: 2, 5, 10, 17, 26, ....
	 */

	/** 43. Calcular e exibir a soma dos “N” primeiros valores da seqüência abaixo. 
	 * O valor “N” será digitado, deverá ser positivo, mas menor que cinqüenta. 
	 * Caso o valor não satisfaça a restrição, enviar mensagem de erro e solicitar o valor novamente.
	 * A seqüência: 1/2, 2/3, 3/4, 4/5, .....
	 */

	/** 44. Calcular e exibir a soma dos “N” primeiros valores da seqüência abaixo. 
	 * O valor “N” será digitado, deverá ser positivo, mas menor que cinqüenta. 
	 * Caso o valor não satisfaça a restrição, enviar mensagem de erro e solicitar o valor novamente.
	 * A seqüência: 2, 5/8, 10/27, 17/64, .....
	 */

	/**
	 * 45. Entrar via teclado com dez valores positivos. Consistir a digitação e enviar mensagem de erro, se necessário. Após a digitação, exibir: 
	 * a) O maior valor; 
	 * b) A soma dos valores; 
	 * c) A média aritmética dos valores;
	 */

	/**
	 * 46. Entrar via teclado com “N” valores quaisquer. 
	 * O valor “N” (que representa a quantidade de números) será digitado, deverá ser positivo, mas menor que vinte. 
	 * Caso a quantidade não satisfaça a restrição, enviar mensagem de erro e solicitar o valor novamente. Após a digitação dos “N” valores, exibir: 
	 * a) O maior valor; 
	 * b) O menor valor; 
	 * c) A soma dos valores; 
	 * d) A média aritmética dos valores; 
	 * e) A porcentagem de valores que são positivos; 
	 * f) A porcentagem de valores negativos;
	 */

	/**
	 * 47. Entrar via teclado com “N” valores quaisquer. 
	 * O valor “N” (que representa a quantidade de números) será digitado, deverá ser positivo, mas menor que vinte. 
	 * Caso a quantidade não satisfaça a restrição, enviar mensagem de erro e solicitar o valor novamente. Após a digitação dos “N” valores, exibir: 
	 * a) O maior valor; 
	 * b) O menor valor; 
	 * c) A soma dos valores; 
	 * d) A média aritmética dos valores; 
	 * e) A porcentagem de valores que são positivos; 
	 * f) A porcentagem de valores negativos; 
	 * Após exibir os dados, perguntar ao usuário de deseja ou não uma nova execução do programa. 
	 * Consistir a resposta no sentido de aceitar somente “S” ou “N” e encerrar o programa em função dessa resposta.
	 */

	/**
	 * 48. Calcular o fatorial de um valor que será digitado. Este valor não poderá ser negativo. 
	 * Enviar mensagem de erro e solicitar o valor novamente, se necessário. 
	 * Perguntar se o usuário deseja ou não fazer um novo cálculo, consistir a resposta em “S” ou “N”. 
	 * N! = N x N-1 x N-2 x N-3 x ....... x (N - (N-1)) 
	 * Ex: 5! = 5 x 4 x 3 x 2 x 1 = 120
	 */

	/**
	 * 49. O jogo da mega-sena consiste em acertar seis dos sessenta números disponíveis em um volante. 
	 * Fazer um programa para calcular a quantidade de jogos que temos que fazer, para com certeza acertar o resultado da mega-sena.
	 * Admitindo que faremos jogos de seis números por volante, o programa deverá exibir quais seriam estes números em cada volante, ou seja, 
	 * exibir todos os resultados possíveis.
	 */

	/**
	 * 50. Entrar via teclado com dois valores quaisquer. Após a digitação, exibir um seletor de opções (“menu”) com as seguintes opções: 
	 * 1 – Multiplicação 
	 * 2 – Adição 
	 * 3 – Divisão 
	 * 4 – Subtração 
	 * 5 – Fim de processo.
	 * Solicitar uma opção por parte do usuário, verificar se é ou não uma opção válida (letras ou números) e processar a respectiva operação. 
	 * Enviar mensagem de erro se a opção escolhida não existir no seletor. 
	 * Encerrar o programa somente quando o usuário escolher a opção de finalização. 
	 * Repare que a opção de número três é de divisão e o programa deverá enviar mensagem de erro, (somente nesta opção) se o denominador for zero.
	 */

	/**
	 * 51. Exibir o seguinte seletor de opções e em função de uma escolha, solicitar
	 * os dados necessários para o cálculo da respectiva área. Enviar mensagem de
	 * erro se o usuário escolher uma opção inexistente. 
	 * Encerrar o programa somente quando selecionada a opção de finalização. 
	 * 1 – Triângulo 
	 * 2 – Quadrado 
	 * 3 – Retângulo 
	 * 4 – Círculo 
	 * 5 – Fim de processo
	 */

	/**
	 * 52. Armazenar dez números na memória do computador. Exibir os valores na ordem inversa à da digitação.
	 */
	public void exibirValorOrdemInversa(List<Integer> listaNumeros) {
		for (int i = 9; i >= 0; i--) {
			System.out.println(listaNumeros.get(i));
		}
	}

	/**
	 * 53. Armazenar dez valores na memória do computador. Após a digitação dos
	 * valores, criar uma rotina para ler os valores e achar e exibir o maior deles.
	 */

	/**
	 * 54. Armazenar vinte valores em um vetor. Após a digitação, entrar com uma
	 * constante multiplicativa que deverá multiplicar cada um dos valores do vetor
	 * e armazenar o resultado no próprio vetor, na respectiva posição.
	 */

	/**
	 * 55. Armazenar vinte valores na memória. Após a digitação, entrar com uma
	 * constante multiplicativa que deverá multiplicar cada um dos valores do vetor
	 * e armazenar o resultado em outro vetor, porém em posições equivalentes.
	 * Exibir os vetores na tela.
	 */
	public void constanteMultiplicativa(int[] vetor, int constante) {
		int[] resultado = new int[20];
		for (int i = 0; i < vetor.length; i++) {
			resultado[i] = vetor[i] * constante;
			System.out.println(vetor[i]);
			System.out.println(resultado[i]);
		}
	}

	/**
	 * 56. Armazenar um máximo de 20 valores em um vetor. 
	 * A quantidade de valores a serem armazenados será escolhida pelo usuário. 
	 * Enviar mensagem de erro, caso a quantidade de valores escolhida esteja fora da faixa possível e solicitar a quantidade novamente. 
	 * Após a digitação dos valores, criar uma rotina de consulta, onde o usuário digita um número e o programa exibe em qual posição do vetor este número está localizado. 
	 * Se o número não for encontrado, enviar mensagem “Valor não encontrado!”. 
	 * Perguntar ao usuário se deseja ou não fazer uma nova consulta, consistir a resposta e encerrar o programa em caso negativo.
	 */

	/**
	 * 57. Armazenar o nome e idade de 5 pessoas. 
	 * Após a digitação, exibir os dados (nome e idade) de todas as pessoas
	 */
	public void exibeDados(List<LinkedHashMap<String, Object>> listMap) {
		for (LinkedHashMap<String, Object> map : listMap) {
			System.out.println("nome: " + map.get("nome") + " idade: " + map.get("idade"));
		}
	}

	 /** 58. Armazenar o nome, sexo e idade de cem pessoas. 
	  * Consistir as entradas no sentido de aceitar apenas “F” ou “M” para o sexo e valores positivos para a idade. 
	  * Após a digitação dos dados, exibir os dados (nome, sexo e idade) de todas as pessoas do sexo feminino.
	 */

	/**
	 * 59. Armazenar o nome, sexo e idade de cem pessoas. 
	 * Consistir as entradas no sentido de aceitar apenas “F” ou “M” para o sexo e valores positivos para a idade. 
	 * Após a digitação, exibir os dados (nome, sexo e idade) de todas as pessoas com idade superior a dezoito anos. 
	 * Ao final da lista, exibir a quantidade de pessoas listadas.
	 */

	/**
	 * 60. Armazenar o nome, sexo e idade de cem pessoas. 
	 * Consistir as entradas no sentido de aceitar apenas “F” ou “M” para o sexo e valores positivos para a idade. 
	 * Após a digitação dos dados, exibir os dados de todas as pessoas com idade superior a vinte anos. 
	 * No final da listagem, exibir a quantidade de pessoas que foram listadas e a porcentagem que este valor representa em relação ao total de pessoas digitadas.
	 */

	/**
	 * 61. Alterar o programa anterior, no sentido de controlar o layout final de
	 * tela, para que o usuário pressione uma tecla para visualizar os dados das
	 * pessoas passo a passo, por exemplo, de dez em dez pessoas.
	 */

	/**
	 * 62. Armazenar vinte valores em um vetor. Após a digitação, exibir os valores em ordem crescente.
	 */

	/**
	 * 63. Armazenar vinte valores em um vetor. Após a digitação, exibir os valores em ordem decrescente.
	 */

	/**
	 * 64. Armazenar o nome de vinte pessoas em um vetor. Após a digitação exibir os nomes em ordem alfabética.
	 */

	/**
	 * 65. Armazenar o nome e sexo de vinte pessoas. Após a digitação, exibir os dados (nome e sexo) em ordem alfabética.
	 */

	/**
	 * 66. Armazenar o nome, sexo e idade de vinte pessoas. Após a digitação, exibir os dados (nome, sexo e idade) em ordem decrescente de idade.
	 */

	/**
	 * 67. Armazenar o nome, sexo e idade de vinte pessoas. 
	 * Após a digitação, exibir os dados (nome, sexo e idade) classificados por sexo (crescente), depois por idade (decrescente) e 
	 * finalmente por nome (alfabética). 
	 * Por exemplo: 
	 * Com as seguintes entradas: 
	 * SOLANGE F 34 
	 * MARCELO M 36 
	 * JOAO M 11 
	 * MAGNA F 34 
	 * JUNIOR M 6
	 * MARIA F 35 
	 * LUCAS M 10 
	 * GABRIEL M 7 
	 * FELIPE M 10
	 * Teremos a seguinte saída: 
	 * MARIA F 35 
	 * MAGNA F 34 
	 * SOLANGE F 34 
	 * MARCELO M 36
	 * JOAO M 11 
	 * FELIPE M 10 
	 * LUCAS M 10 
	 * GABRIEL M 7 
	 * JUNIOR M 6
	 */

	/**
	 * 68. Armazenar um máximo de 20 valores em um vetor. A quantidade de valores a serem armazenados será escolhida pelo usuário. 
	 * Enviar mensagem de erro, caso a quantidade de valores escolhida esteja fora da faixa possível e solicitar a quantidade novamente. 
	 * Após a digitação, calcular a mediana destes valores, sabendo que quando a quantidade de valores for par, a mediana é a média
	 * aritmética dos dois valores intermediários da lista e quando a quantidade de valores for ímpar, a mediana é o valor que está no ponto médio da lista. 
	 * Nos dois casos, a lista deverá estar ordenada. 
	 * Por exemplo: 
	 * Suponha os valores digitados: 7, 5, 2, 4 -> mediana = (4+5)/2 = 4,5
	 * 
	 * Suponha os valores digitados: 7, 5, 2, 4, 8 -> mediana = 5
	 */

	/**
	 * 69. Armazenar seis valores em uma matriz de ordem 2x3. Apresentar os valores na tela.
	 */

	/**
	 * 70. Armazenar seis valores em uma matriz de ordem 3x2. Apresentar os valores na tela.
	 */

	/**
	 * 71. Armazenar seis nomes em uma matriz de ordem 2x3. Apresentar os nomes na tela.
	 */

	/**
	 * 72. Entrar via teclado com doze valores e armazená-los em uma matriz de ordem 3x4. 
	 * Após a digitação dos valores solicitar uma constante multiplicativa, que deverá multiplicar cada valor matriz e armazenar o 
	 * resultado na própria matriz, nas posições correspondentes.
	 */

	/**
	 * 73. Entrar via teclado com doze valores e armazená-los em uma matriz de ordem 3x4. Após a digitação dos valores solicitar uma c
	 * onstante multiplicativa, que deverá multiplicar cada valor matriz e armazenar o resultado em outra matriz
	 * de mesma ordem, nas posições correspondentes. 
	 * Exibir as matrizes na tela, sob a forma matricial, ou seja, linhas por colunas.
	 */

	/**
	 * 74. Entrar com uma matriz de ordem MxN, onde a ordem também será escolhida pelo usuário, sendo que no máximo 10x10. A matriz não precisa ser quadrática.
	 * Após a digitação dos elementos, calcular e exibir a matriz transposta.
	 */

	/**
	 * 75. Entrar com uma matriz de ordem MxM, onde a ordem também será escolhida pelo usuário, sendo que no máximo será de ordem 10 e quadrática. 
	 * Após a digitação dos elementos, calcular e exibir a matriz inversa. 
	 * Exibir as matrizes na tela, sob a forma matricial (linhas x colunas).
	 */

	/**
	 * 76. Entrar com uma matriz de ordem MxM, onde a ordem também será escolhida pelo usuário, sendo que no máximo será de ordem 10 e quadrática. 
	 * Após a digitação dos elementos, calcular e exibir determinante da matriz.
	 */

	/**
	 * 77. Entrar com uma matriz de ordem MxN, onde a ordem também será escolhida pelo usuário, sendo que no máximo 10x10. 
	 * A matriz não precisa ser quadrática.
	 * Após a digitação dos elementos, criar uma rotina de consulta, onde o usuário digita um valor e a rotina exibe em qual (ou quais) 
	 * posição da matriz, o valor escolhido se encontra. 
	 * Enviar mensagem comunicando se por acaso o valor não estiver armazenado na matriz. 
	 * Perguntar ao usuário, se deseja ou não fazer nova consulta.
	 */

	/**
	 * 78. Criar um programa que represente um “Jogo da Velha”, onde o programa solicita os nomes dos jogadores e passa a administrar a 
	 * jogada de cada um. Solicitar de cada jogador, a posição do “tabuleiro” que deseja jogar e consistir esta posição. 
	 * Evidentemente que não poderão ser feitas jogadas em posições já ocupadas. 
	 * Exibir mensagem divulgando o nome do vencedor ou então “empate”, se for o caso. 
	 * Perguntar se o usuário deseja ou não uma nova partida.
	 */

	/**
	 * 79. Vamos fazer uma excursão para Penápolis. Para isto, vamos de ônibus, e precisaremos controlar as reservas de lugares do ônibus. 
	 * Sabe-se que o ônibus possui quatro fileiras de dez cadeiras cada. Fazer um programa para solicitar o nome do usuário e o 
	 * lugar que pretende reservar (fileira e cadeira), e se este lugar estiver disponível o programa deverá concretizar a reserva, 
	 * caso contrário, enviar mensagem comunicando que esta poltrona já está ocupada.
	 * Perguntar se existe mais alguém que queira viajar para a metrópole, e em caso negativo exibir um “mapa” mostrando os nomes e 
	 * lugares de cada passageiro que efetuou a reserva, assim como os lugares que permanecem livres. 
	 * Lembre-se que o ônibus possui uma capacidade limitada de poltronas e que o programa deverá encerrar estas reservas, caso esta capacidade tenha sido alcançada.
	 */

	/**
	 * 80. Criar um programa para controlar as reservas de poltronas de uma peça teatral, “Marcelo e suas Mainframes”, 
	 * sabendo que a peça será apresentada em três sessões, manhã, tarde e noite e que o teatro possui “X” fileiras de “Y”
	 * cadeiras cada. Os valores de “X” e “Y” serão digitados. O usuário digita seu nome, lança a sessão, o número da fileira e 
	 * da cadeira que pretende reservar, e se estiver livre a reserva será efetuada, caso contrário, o programa deverá
	 * enviar mensagem comunicando que a poltrona está ocupada e solicitar outro lugar. 
	 * Perguntar ao usuário se mais alguém pretende fazer reservas. 
	 * As reservas poderão ser efetuadas até completar um máximo de quatro quintos da capacidade total do teatro. 
	 * No final do programa de reservas, exibir um “mapa” mostrando as poltronas do teatro, por sessão, com os nomes de cada
	 * ocupante, ou ainda com a informação “Poltrona livre”.
	 */

}
