package processor;

import domain.Order;
import domain.Status;

// hai usato la tecnica dell'extract function per rifattorizzare il codice seguente, prima era tutto accorpato nell'unica funzione processorOrder()
public class OrderProcessor {
    public static void processOrder(Order order) {
        if (order.isValidity()) {
            getDiscount(order);
        } else {
            order.setStatus(Status.CANCELLED);
        }
    }

    public static void getDiscount(Order order) {
        if (order.getAmount() > 100) {
            applyDiscountAndRequestApproval(order);
        } else {
            noDiscountOrderWillBeSent(order);
        }
    }

    public static void applyDiscountAndRequestApproval(Order order) {
        System.out.println("Appliying a discount to order: " + order.getId() + " width amount: " + order.getAmount());
        order.setAmount(order.getAmount() * 0.9);
        System.out.println("After the discount: " + order.getAmount());
        setOrderToRequestApproval(order);
    }

    public static void setOrderToRequestApproval(Order order) {
        order.setStatus(Status.REQUEST_APPROVAL);
    }

    public static void noDiscountOrderWillBeSent(Order order) {
        System.out.println("Notification the order: " + order.getId() + " will be sent");
        order.setStatus(Status.SENT);
    }
}
