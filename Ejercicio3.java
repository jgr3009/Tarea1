import stanford.karel.*;


public class Ejercicio3 extends KarelMejorada {

	public void run(){
		recogeTodosLosBeepers();
		dejaLosBeepers();
		retornaAlInicio();
	}
	private void recogeTodosLosBeepers(){
		while (frontIsClear()){
			limpiaUnaColumna();
			
		}
	}
	private void limpiaUnaColumna(){
		move();
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
			daLaVuelta();
		}
	}
	private void dejaLosBeepers(){
		while (beepersInBag()){
		putBeeper();
	}
	}
	private void retornaAlInicio(){
		daLaVuelta();
		while (frontIsClear()){
			move();
		}
		daLaVuelta();
}
	}

