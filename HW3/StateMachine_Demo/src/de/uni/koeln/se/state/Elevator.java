package de.uni.koeln.se.state;


public class Elevator{
	
	public static int current_Floor=5;
	int dest_Floor;
	
	private Elv_States State = new Elv_States();
	
	public Elevator (int dest_floor)
	{
		this.dest_Floor=dest_floor;
	System.out.println("*** Destination floor is: "+ dest_Floor);
	arrive_atFloor();


	}

	private void arrive_atFloor() {
		if(current_Floor<dest_Floor) {
			go_up();
			arrive_atFloor();
		}else if(current_Floor==dest_Floor) {
			exitFloor();
		}else if(current_Floor>dest_Floor) {
			go_down();
			arrive_atFloor();
		}
	}

	private void go_down() {
		State.Current_State = State.Moving_down;
		current_Floor--;
		System.out.println("You are moving down. Your current Floor is " + current_Floor);
		
	}

	private void exitFloor() {
		State.Current_State = State.Idle;
		System.out.println("You have arrived at your destination.");
		
	}

	private void go_up() {
		State.Current_State = State.Moving_up;
		current_Floor++;
		System.out.println("You are moving up. Your current Floor is " + current_Floor);
		
	}

	
}
