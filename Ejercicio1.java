
/*
 * Consiste en que Karel de vueltas por el mundo
 */

public class Ejercicio1 extends KarelMejorada{

	public void run(){
		while (frontIsClear()){
			while (frontIsClear()){
				move();
			}
			turnLeft();
		}
	}
}
