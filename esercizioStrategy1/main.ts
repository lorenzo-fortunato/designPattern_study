import { CartItem } from "./CartItem";
import { ShoppingCart } from "./ShoppingCart";
import { CashPayment } from "./payments/CashPayment";
import { CreditCardPayment } from "./payments/CreditCardPayment";
import { CryptoPayment } from "./payments/CryptoPayment";

const main = () => {
    const cart = new ShoppingCart();

    cart.addItem(new CartItem(1000, "Iphone"));
    cart.addItem(new CartItem(2000, "Macbook"));
    cart.addItem(new CartItem(3000, "Asus"));

    cart.setPaymentStrategy(new CreditCardPayment());
    cart.checkout();
 
    cart.setPaymentStrategy(new CryptoPayment());
    cart.checkout();

    cart.setPaymentStrategy(new CashPayment());
    cart.checkout();



}

main();