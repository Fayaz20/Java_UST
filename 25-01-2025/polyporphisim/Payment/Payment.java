package Payment;

// Payment.java
class Payment {
    public void makePayment(double amount) {
        System.out.println("Payment of $" + amount + " processed using generic payment method.");
    }
}

class CreditCardPayment extends Payment {
    @Override
    public void makePayment(double amount) {
        System.out.println("Payment of $" + amount + " processed using Credit Card.");
    }
}

class PayPalPayment extends Payment {
    @Override
    public void makePayment(double amount) {
        System.out.println("Payment of $" + amount + " processed using PayPal.");
    }
}

class CryptoPayment extends Payment {
    @Override
    public void makePayment(double amount) {
        System.out.println("Payment of $" + amount + " processed using Cryptocurrency.");
    }
}

