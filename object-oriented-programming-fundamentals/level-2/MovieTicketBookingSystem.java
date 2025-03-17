import java.util.Scanner;

public class MovieTicketBookingSystem
{
    public static void main(String[] args)
    {
        MovieTicket user = new MovieTicket();
        user.bookTicket();
        user.publishTickets();
    }
}

class MovieTicket
{
    String movieName;
    String seatNumber;
    int price = 150;
    int quantity;

    void displayMovie()
    {
        System.out.println("Welcome to movie show");
        System.out.println("The available shows are: \n'Interstellar' \n'Chaava' \n'Mickey17' \n'Fighter'");
    }

    String movieSelect(String text)
    {
        switch (text.toLowerCase())
        {
            case "interstellar":
                System.out.println("You have booked Interstellar movie");
                break;
            case "chaava":
                System.out.println("You have booked Chaava movie");
                break;
            case "mickey17":
                System.out.println("You have booked Mickey17 movie");
                break;
            case "fighter":
                System.out.println("You have booked Fighter movie");
                break;
            default:
                System.out.println("Invalid Movie Name or Movie not available");
        }
        return text;
    }

    String generateSeat()
    {
        int column = (int)(Math.random() * 20 +1);
        char row = (char)((int)(Math.random() * 14 +65));
        this.seatNumber = String.valueOf(column) + row;
        return this.seatNumber;
    }

    void printSeat(int num)
    {
        if(num > 1)
        {
            for(int i=1; i<= num; i++)
            {
                System.out.println("Seat no " + i + " - " +generateSeat());
            }
        }
        else
        {
            generateSeat();
        }
    }

    void bookTicket()
    {
        Scanner input = new Scanner(System.in);
        displayMovie();
        System.out.println("Enter the movie name: ");
        String movieInput = input.nextLine();
        this.movieName = movieSelect(movieInput);
        System.out.println("Enter the No of seats to be booked: ");
        this.quantity = input.nextInt();
    }

    float moneyCalculation()
    {
        return (float) (this.quantity * price);
    }

    void publishTickets()
    {
        System.out.println("Movie show Name: " + this.movieName);
        printSeat(this.quantity);
        System.out.println("The total Money to be paid: " + moneyCalculation());
    }
}
