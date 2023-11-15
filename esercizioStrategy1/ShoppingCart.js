"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.ShoppingCart = void 0;
var ShoppingCart = /** @class */ (function () {
    function ShoppingCart() {
        this.items = [];
    }
    ShoppingCart.prototype.setPaymentStrategy = function (strategy) {
        this.paymentStrategy = strategy;
    };
    ShoppingCart.prototype.addItem = function (item) {
        this.items.push(item);
    };
    ShoppingCart.prototype.checkout = function () {
        if (this.paymentStrategy) {
            console.log("Paying: " + this.calculateTotalAmount());
            this.paymentStrategy.pay(this.calculateTotalAmount());
        }
        else {
            console.log("Define payment strategy before paying!");
        }
    };
    ShoppingCart.prototype.calculateTotalAmount = function () {
        var total = 0;
        this.items.forEach(function (item) {
            total += item.getAmount();
        });
        return total;
    };
    return ShoppingCart;
}());
exports.ShoppingCart = ShoppingCart;
