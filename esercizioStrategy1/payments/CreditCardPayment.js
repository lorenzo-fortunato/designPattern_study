"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.CreditCardPayment = void 0;
var CreditCardPayment = /** @class */ (function () {
    function CreditCardPayment() {
    }
    CreditCardPayment.prototype.pay = function (amountToPay) {
        console.log("Paying with Credit Card: the amount of ".concat(amountToPay, " will be charged on the first of the next month"));
    };
    return CreditCardPayment;
}());
exports.CreditCardPayment = CreditCardPayment;
