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
		State.Current_State = State.Idle;
		
		if(current_Floor<dest_Floor) {
			go_up();
		}else if(current_Floor==dest_Floor) {
			exit();
		}else if(current_Floor>dest_Floor) {
			go_down();
		}
	}

	private void go_down() {
		State.Current_State = State.Moving_down;
		current_Floor--;
		System.out.println("You are moving down. Your current Floor is " + current_Floor);
		
		if(current_Floor>dest_Floor) {
			go_down();
		}else if (current_Floor==dest_Floor) {
			arrive_atFloor();
		}
		
	}

	private void exit() {
		State.Current_State = State.Idle;
		System.out.println("You have arrived at your destination.");
		
	}

	private void go_up() {
		State.Current_State = State.Moving_up;
		current_Floor++;
		System.out.println("You are moving up. Your current Floor is " + current_Floor);
		
		if(current_Floor<dest_Floor) {
			go_up();
		}else if (current_Floor==dest_Floor) {
			arrive_atFloor();
		}
	}

	
}
