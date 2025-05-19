package Assignment_1;
interface OrderProcessing {
    void placeOrder();
}

interface PaymentProcessing {
    void processPayment();
}

interface ECommerceService extends OrderProcessing, PaymentProcessing {
	void cancelOrder();
}

class OnlineStore implements ECommerceService {

    public void placeOrder() {
        System.out.println("Order placed successfully.");
    }

    
    public void cancelOrder() {
        System.out.println("Order canceled successfully.");
    }

    public void processPayment() {
        System.out.println("Payment processed successfully.");
    }

    void issueRefund() {
        System.out.println("Refund issued successfully.");
    }
}

public class Example1  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 OnlineStore store = new OnlineStore();
	        store.placeOrder();
	        store.processPayment();
	        store.cancelOrder();
	        store.issueRefund();

	}

}
