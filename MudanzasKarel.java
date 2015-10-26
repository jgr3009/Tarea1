import stanford.karel.*;

public class MudanzasKarel extends KarelMejorada{



	public void run(){

		while (frontIsClear()){
			move();
			while (beepersPresent()){
				pickBeeper();
			}

		}
		turnLeft();
		while (frontIsClear()){
			move();
			if (rightIsClear()){
				turnRight();

			}
			if (frontIsBlocked()){
				turnLeft();
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
				for (int i=	0;i	<16;i++)	{
					putBeeper();
				}
				move();
				
			}



		}



	}

}