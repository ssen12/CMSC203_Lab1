import java.util.Scanner; 
public class MovieDriver {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char yes = 'y';
		while (yes == 'y')
		{
			Movie one = new Movie (); 
			System.out.println("Enter the name of a movie");
			String name=sc.nextLine();
			one.setTitle(name);
			System.out.println("Enter the rating of the movie");
			String rating=sc.next();
			one.setRating(rating);
			System.out.println("Enter the number of tickets sold for this movie");
			int number=sc.nextInt();
			one.setSoldTickets(number);
			System.out.println(one.toString());
			System.out.println("Do you want to enter another? (y or n)");
			yes=sc.next().charAt(0);
			sc.nextLine();
			}
		System.out.println("Goodbye");
		}
	}
			
