package basics;

public class abs {

        // Abstract class (Abstraction)
        static abstract class Payment {

            abstract void pay(double amount);

            void printReceipt() {
                System.out.println("Payment completed successfully");
            }
        }

        // Concrete class (Implementation)
        static class UpiPayment extends Payment {

            @Override
            void pay(double amount) {
                System.out.println("Paid ₹" + amount + " using UPI");
            }
        }

        // Main method
        public static void main(String[] args) {

            // Using abstraction
            Payment payment = new UpiPayment();

            payment.pay(1000);
            payment.printReceipt();
        }
    }


