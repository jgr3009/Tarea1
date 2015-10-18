import stanford.karel.*;


public class Ejercicio3 extends KarelMejorada {

	public void run() {
		
	}
	private void recogeTodosLosBeepers(){
		while (frontIsClear()){
			limpiaUnaColumna();
			move();
		}
	}
	private void limpiaUnaColumna(){
		turnLeft();
		recogeBeepersUnaColumna();
		daLaVuelta();
		avanzaHastaElSuelo();
		turnLeft();
	}
	private void recogeBeepersUnaColumna(){
		while (beepersPresent()){
			pickBeeper();
			move();
		}
	}
	private void avanzaHastaElSuelo(){
		while(frontIsBlocked()){
			move();
		}
	}
	private void dejaLosBeepers(){
		while (beepersInBag()){
		putBeeper();
	}
	}
	private void retornoAlInicio(){
		daLaVuelta();
		while (frontIsClear()){
			move();
		}
		daLaVuelta();
}
}

