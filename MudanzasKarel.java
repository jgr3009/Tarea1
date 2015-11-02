
/*
 * Autor: JORGE GARCÍA ROJO
 * 
 * Este ejercicio Karel empieza en la esquina inferior izquierda y mirando al este, y
 *  consiste en que Karel coja todos los beepers del lado 
 * izquierdo de la aguja en el siguiente orden (6,3,0,2,8,1,16), pase hacia 
 * el otro lado de la aguja y vaya dejando los beepers en el siguiente orden (6,3,2,8,1,16). 
 * Y cuando deje el último beeper vuelva a su posición inicial (esquina inferior izquierda y mirando al este).
 */



import stanford.karel.*;

public class MudanzasKarel extends KarelMejorada{



	public void run(){

		cogeLosBeeper();
		saltaAguja();
		ponerTodosLosBeeper();
		vueltaAlInicio();
	}


	//Con este método Karel recoge todos los beepers que hay 
	//en el lado izquierdo de la aguja en el siguiente orden (6,3,0,2,8,1,16).
	private void cogeLosBeeper(){
		while (frontIsClear()){
			move();
			while (beepersPresent()){
				pickBeeper();
			}
		}
	}

	//Con este método Karel salta la aguja, es decir, sube por el lado
	//izquierdo y cuando llega al final de la aguja la baja por el lado derecho.
	private void saltaAguja(){
		turnLeft();
		while (frontIsClear()){
			move();

			if (rightIsClear()){
				turnRight();
			}
		}
		turnLeft();
	}

	//Con este método Karel pone todos los beepers que lleva en la bolsa
	//en el siguiente orden (6,3,2,8,1,16).
	private void ponerTodosLosBeeper(){
		for (int i=	0;i	<6;i++)	{
			putBeeper();
		}

		move();
		for (int i=	0;i	<3;i++)	{
			putBeeper();
		}
		move();
		for (int i=	0;i	<2;i++)	{
			putBeeper();
		}
		move();	
		for (int i=	0;i	<8;i++)	{
			putBeeper();
		}
		move();	
		for (int i=	0;i	<1;i++)	{
			putBeeper();
		}
		move();	
		for (int i=	0;i	<16;i++) {
			putBeeper();
		}
	}

	//Con este método Karel vuelve al inicio bordeando el mundo
	//hasta que llega a la esquina inferior izquierda y se queda mirando al este.
	private void vueltaAlInicio(){
		while (frontIsClear()){
			move();
			if (frontIsBlocked()&&notFacingSouth()){
				turnLeft();
			}
		}
		turnLeft();
	}
}