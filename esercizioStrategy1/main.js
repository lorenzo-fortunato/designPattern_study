"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
var CartItem_1 = require("./CartItem");
var ShoppingCart_1 = require("./ShoppingCart");
var main = function () {
    var cart = new ShoppingCart_1.ShoppingCart();
    cart.addItem(new CartItem_1.CartItem(1000, "Iphone"));
    cart.addItem(new CartItem_1.CartItem(2000, "Macbook"));
    cart.addItem(new CartItem_1.CartItem(3000, "Asus"));
    // cart.setPaymentStrategy(new CreditCardPayment());
    cart.checkout();
    // cart.setPaymentStrategy(new CryptoPayment());
    // cart.checkout();
    // cart.setPaymentStrategy(new CashPayment());
    // cart.checkout();
};
main();
