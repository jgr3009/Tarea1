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
	}
}
