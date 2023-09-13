package copProjects;

public class currentTime {

	public static void main(String[] args) {
		long totalMilli = System.currentTimeMillis();
		
		long seconds = totalMilli / 1000, minutes = seconds / 60, hours = minutes / 60;
		hours = hours % 24;
		minutes = minutes % 60;

		
		System.out.println("The current time is: " + hours + ":" + minutes);
		
	}

}