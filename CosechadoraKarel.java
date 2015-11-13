import stanford.karel.*;



public class CosechadoraKarel extends KarelMejorada {

	public void run (){
	//limpia columnadeSubida
	// limpiaColumnadeBajada
	// retornoAlInicio

		while(frontIsClear()){
	
			limpiaColumnaDeSubida();
			limpiaColumnaDeBajada();
}
	turnLeft();
	while(frontIsClear()){
		move();
	}
	if(frontIsBlocked()){
		if(rightIsBlocked()){
			daLaVuelta();
			
		}
		while(frontIsClear()){
			move();
		}
		turnLeft();
		daLaVuelta();
	}
}
//mientras que karel tenga un muro delante,Karel
//habra llegado al final de la columna
//girara a la derecha para bajar a la siguiente columna
private void limpiaColumnaDeSubida(){
	turnLeft();
	while(frontIsClear()){
		move();
		if (beepersPresent()){
			pickBeeper();
		}
		if(frontIsBlocked()){
			daLaVuelta();
			move();
			daLaVuelta();
		}
	}
}
//metodo limpiaUnaColumnaDeBajada () hace que 
// karel vaya limpiando la columna en sentido
//de bajada .se movera recogeindo beepers 
private void limpiaColumnaDeBajada(){
	while(frontIsClear()){
		move();
		if(beepersPresent()){
			pickBeeper();
			
		}
	}

if(frontIsBlocked()){
	turnLeft();
	if(frontIsBlocked()){
	move();	
	}
	
	//turnLeft
	
}

	
}
private void retornoAlInicio(){
	daLaVuelta();
	while(frontIsClear()){
		move();
	}
}
}

