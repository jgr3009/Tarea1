import stanford.karel.*;

public class MudanzasKarel extends KarelMejorada{



	public void run(){

		cogeLosBeeper();
		saltaAguja();
		ponerTodosLosBeeper();
		vueltaAlInicio();
	}



	private void cogeLosBeeper(){
		while (frontIsClear()){
			move();
			while (beepersPresent()){
				pickBeeper();
			}
		}
		turnLeft();
	}

	private void saltaAguja(){
		while (frontIsClear()){
			move();

			if (rightIsClear()){
				turnRight();
			}
		}
		turnLeft();
	}


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
		move();
	}

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