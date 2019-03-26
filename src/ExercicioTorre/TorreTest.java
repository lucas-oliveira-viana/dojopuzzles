package ExercicioTorre;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TorreTest {

	@Before
	public void inicializaTest() {
		Torre.limpaContador();
	}
	@Test
	public void quantidadeDiscos() {
		Assert.assertTrue(Torre.quantidadeDiscos(5) == 5);
	}
	
	@Test
	public void discoDoTopo() {
		Assert.assertTrue(Torre.quantidadeDiscos(3) == 3);
	}
	
	@Test
	public void torreInvalida() {
		Assert.assertEquals("N�o � possivel executar a torre com 0 discos", Torre.executaTorre(0, "A", "B", "C"));
	}
	
	@Test
	public void umDisco() {
		Assert.assertEquals("S�o necess�rias 1 jogada(s)", Torre.executaTorre(1, "A", "B", "C"));
	}
	
	@Test
	public void doisDiscos() {
		Assert.assertEquals("S�o necess�rias 3 jogada(s)", Torre.executaTorre(2, "A", "B", "C"));
	}
	
	@Test
	public void retornaQuantidadeJogadas() {
		Assert.assertEquals("S�o necess�rias 7 jogada(s)", Torre.executaTorre(3, "A", "B", "C"));
	}

}
