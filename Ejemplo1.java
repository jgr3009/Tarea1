/*
 * File: Ejemplo1.java
 * ----------------------------
 * La clase Ejemplo1 extiende la clase Karel b�sica
 * para Karel tome un beeper de la primera calle
 * y lo lleve al centro de la plataforma en la segunda calle
 */
import stanford.karel.*;

public class Ejemplo1 extends KarelMejorada {

	public void run() {
		move();
		pickBeeper();
		move();
		turnLeft();
		move();
		giraDerecha();
		move();
		move();
		putBeeper();
		move();

	}

		}

