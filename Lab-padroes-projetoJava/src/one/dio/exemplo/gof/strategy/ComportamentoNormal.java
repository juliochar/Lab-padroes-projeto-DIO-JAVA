package one.dio.exemplo.gof.strategy;

public class ComportamentoNormal implements Comportamento {

	@Override
	public void mover() {
		System.out.println("Movendo-se Normalmente...");
		
	}

}
