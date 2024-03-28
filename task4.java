import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Room 
{
    private int roomNumber;
    private String category;
    private boolean available;
    public Room(int roomNumber, String category) 
    {
        this.roomNumber = roomNumber;
        this.category = category;
        this.available = true;
    }
    // this method returns the room number
    public int getRoomNumber() 
    {
        return roomNumber;
    }
    // this method returns the category of the room
    public String getCategory() 
    {
        return category;
    }
    // this method returns the avalability of the rooms
    public boolean isAvailable() 
    {
        return available;
    }
    public void bookRoom() 
    {
        available = false;
    }
    public void releaseRoom() 
    {
        available = true;
    }
}
class Hotel 
{
    // list of the rooms
    private List<Room> rooms;
    public Hotel() 
    {
        rooms = new ArrayList<>();
        rooms.add(new Room(101, "Standard"));
        rooms.add(new Room(102, "Standard"));
        rooms.add(new Room(103, "Standard"));
        rooms.add(new Room(104, "Deluxe"));
        rooms.add(new Room(105, "Deluxe"));
        rooms.add(new Room(106, "Deluxe"));
    }
    public List<Room> getAvailableRooms() 
    {
        List<Room> availableRooms = new ArrayList<>();
        for (Room room : rooms) 
        {
            if (room.isAvailable()) 
            {
                availableRooms.add(room);
            }
        }
        return availableRooms;
    }
    public void bookRoom(int roomNumber)
    {
        for (Room room : rooms) 
        {
            if (room.getRoomNumber() == roomNumber && room.isAvailable()) 
            {
                room.bookRoom();
                System.out.println("Room " + roomNumber + " booked successfully.");
                return;
            }
        }
        System.out.println("Room " + roomNumber + " is not available.");
    }
    public void releaseRoom(int roomNumber) 
    {
        for (Room room : rooms) 
        {
            if (room.getRoomNumber() == roomNumber && !room.isAvailable()) 
            {
                room.releaseRoom();
                System.out.println("Room " + roomNumber + " released successfully.");
                return;
            }
        }
        System.out.println("Room " + roomNumber + " is already available.");
    }
    public void displayAvailableRooms() 
    {
        System.out.println("Available Rooms:");
        for (Room room : rooms) 
        {
            if (room.isAvailable()) 
            {
                System.out.println("Room Number: " + room.getRoomNumber() + ", Category: " + room.getCategory());
            }
        }
    }
}
public class task4 
{
    public static void main(String[] args) 
    {
        Hotel hotel = new Hotel();
        Scanner scanner = new Scanner(System.in);
        while (true) 
        {
            System.out.println("\nHotel Reservation System");
            System.out.println("1. Search for available rooms");
            System.out.println("2. Book a room");
            System.out.println("3. Release a room");
            System.out.println("4. View available rooms");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            switch (choice) 
            {
                case 1:
                    List<Room> availableRooms = hotel.getAvailableRooms();
                    if (availableRooms.isEmpty()) 
                    {
                        System.out.println("No rooms available.");
                    }
                    else 
                    {
                        System.out.println("Available Rooms:");
                        for (Room room : availableRooms) 
                        {
                            System.out.println("Room Number: " + room.getRoomNumber() + ", Category: " + room.getCategory());
                        }
                    }
                    break;
                case 2:
                    System.out.print("Enter room number to book: ");
                    int roomToBook = scanner.nextInt();
                    hotel.bookRoom(roomToBook);
                    break;
                case 3:
                    System.out.print("Enter room number to release: ");
                    int roomToRelease = scanner.nextInt();
                    hotel.releaseRoom(roomToRelease);
                    break;
                case 4:
                    hotel.displayAvailableRooms();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}