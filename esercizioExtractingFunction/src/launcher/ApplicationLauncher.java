package launcher;

import domain.Order;
import domain.Status;
import processor.OrderProcessor;

public class ApplicationLauncher {
    public static void main(String[] args) {
        Order myOrder = new Order(1, 200, true, Status.PENDING);
        OrderProcessor.getDiscount(myOrder);
        System.out.println(myOrder.getStatus());


    }
}
