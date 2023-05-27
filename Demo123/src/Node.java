import java.util.*;

public class Node {
    // Initialize theater seats
    static HashMap<Integer, ArrayList<String>> seats = new HashMap<Integer, ArrayList<String>>();
    static {
        seats.put(320, new ArrayList<String>(Arrays.asList("A1", "A2", "A3", "A4", "A5", "A6", "A7", "A8", "A9")));
        seats.put(280, new ArrayList<String>(Arrays.asList("B1", "B2", "B3", "B4", "B5", "B6")));
        seats.put(240, new ArrayList<String>(Arrays.asList("C2", "C3", "C4", "C5", "C6", "C7")));
    }

    // Initialize revenue and taxes
    static double revenue = 0;
    static double serviceTax = 0;
    static double sbc = 0;
    static double kkc = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int showNo, seatPrice;
        String seat;
        
        // Show available seats for all shows
        System.out.println("Show 1 Running in Audi 1: " + seats.get(320));
        System.out.println("Show 2 Running in Audi 2: " + seats.get(280));
        System.out.println("Show 3 Running in Audi 3: " + seats.get(240));
        
        // Book seats for customers
        while (true) {
            // Get show number and seat price
            System.out.print("Enter show number: ");
            showNo = sc.nextInt();
            if (showNo == 1) {
                seatPrice = 320;
            } else if (showNo == 2) {
                seatPrice = 280;
            } else if (showNo == 3) {
                seatPrice = 240;
            } else {
                System.out.println("Invalid show number. Please try again.");
                continue;
            }
            
            // Get seat number
            System.out.print("Enter seat number: ");
            seat = sc.next().toUpperCase();
            if (!seats.get(seatPrice).contains(seat)) {
                System.out.println("Seat not available. Please try again.");
                continue;
            }

            // Book the seat and calculate cost
            seats.get(seatPrice).remove(seat);
            revenue += seatPrice;
            serviceTax += (seatPrice * 0.14);
            sbc += (seatPrice * 0.005);
            kkc += (seatPrice * 0.005);
            double totalCost = (seatPrice * 1.15);
            
            // Print booking details and total cost
            System.out.println("Seat booked. Total cost including taxes: Rs. " + totalCost);
            System.out.println("Available seats for Show " + showNo + ": " + seats.get(seatPrice));
            
            // Ask for next booking
            System.out.print("Do you want to book another seat? (y/n): ");
            String choice = sc.next().toLowerCase();
            if (choice.equals("n")) {
                break;
            }
        }
        
        // Print final revenue and taxes
        System.out.println("Revenue: Rs. " + revenue);
        System.out.println("Service Tax: Rs. " + serviceTax);
        System.out.println("Swachh Bharat Cess: Rs. " + sbc);
        System.out.println("Krishi Kalyan Cess: Rs. " + kkc);
    }
}
