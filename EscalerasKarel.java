
/*
 * Escaleras Karel es un ejercicio muy sencillo 
 * en el que Karel tiene que subir unas escaleras
 * En cada peldaño hay un beeper
 * y tiene que cogerlos todos. 
 * 
 */

public class EscalerasKarel extends KarelMejorada{

	public void run(){

		//Encontrar la base de las escaleras
		encuentraLaBase();

		//Repetir 4 veces;
		for (int i=0; i<4; i++){
			//limpiar una escalera
			limpiaUnPeldaño();
		}
	}
	private void limpiaUnPeldaño(){
		//este método limpia un peldaño de la escalera
		//Karel está mirando hacia el Este y en la base del peldaño
		turnLeft();
		move();
		turnRight();
		move();
		pickBeeper();
	}
	private void encuentraLaBase(){
		//este método parte de Karel mirando al Este en la esquina inicial
		//y busca la base de la escalera
		while (frontIsClear()){
			move();
		}
	}
}
