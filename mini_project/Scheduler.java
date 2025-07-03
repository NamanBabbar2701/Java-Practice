package mini_project;

import java.util.Scanner;

public class Scheduler {
    static Batch[] batches = new Batch[5];
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        batches[0] = new Batch("7 AM - 8 AM", 4);
        batches[1] = new Batch("8 AM - 9 AM", 2);
        batches[2] = new Batch("9 AM - 10 AM", 3);
        batches[3] = new Batch("5 PM - 6 PM", 2);
        batches[4] = new Batch("6 AM - 7 PM", 3);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        User user = new User(name);

        int choice;
        do {
            System.out.println("====Badminton Class Scheduler====");
            System.out.println("1.View Available Slots");
            System.out.println("2. Book a Slot");
            System.out.println("3. Cancel Slot");
            System.out.println("4. View my Booking");
            System.out.println("5. Exit");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    viewSlots();
                    break;
                case 2:
                    bookSlot(user);
                    break;
                case 3:
                    cancelBooking(user);
                    break;
                case 4:
                    viewBooking(user);
                    break;
                case 5:
                    System.out.println("Thank you for using scheduler");
                    break;
                default:
                    System.out.println("Invalid Choice");
            }
        } while (choice != 5);
    }

    static void viewSlots() {
        System.out.println("Available Batches");
        for (int i = 0; i < batches.length; i++) {
            System.out.println((i + 1) + ". " + batches[i]);
        }
    }

    static void bookSlot(User user) {
//        if (user.bookedBatchIndex != -1) {
//            System.out.println("You have already booked: " + batches[user.bookedBatchIndex].slot);
//            return;
//        }

        viewSlots();
        System.out.print("Enter the batch number to book:");
        int index = scanner.nextInt() - 1;

        if(index < 0 || index >= batches.length){
            System.out.println("Invalid Batch Number");
            return;
        }

        if(batches[index].spots > 0 && batches[index].spots <= batches.length){
            batches[index].spots--;
            user.bookedBatchIndex = index;
            System.out.println("Booking Successful for Batch: " + batches[index].slot);
        }else{
            System.out.println("Sorry, the selected batch is full");
        }
    }

    static void cancelBooking(User user){
        if(user.bookedBatchIndex == -1){
            System.out.println("No Booking found to cancel");
            return;
        }
        batches[user.bookedBatchIndex].spots++;
        System.out.println("Booking for " + batches[user.bookedBatchIndex].slot + "has been Cancelled");
        user.bookedBatchIndex = -1;
    }

    static void viewBooking(User user){
        if(user.bookedBatchIndex == -1){
            System.out.println("No Booking Found");
            return;
        }else{
            System.out.println("You have booked: " + batches[user.bookedBatchIndex].slot);
        }
    }
}



