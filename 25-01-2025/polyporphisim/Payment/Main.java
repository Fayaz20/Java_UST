package Payment;

// PolymorphismExample.java
public class Main {
    public static void main(String[] args) {
        Payment payment1 = new CreditCardPayment();
        Payment payment2 = new PayPalPayment();
        Payment payment3 = new CryptoPayment();

        payment1.makePayment(100.50);
        payment2.makePayment(200.75);
        payment3.makePayment(300.00);
    }
}
