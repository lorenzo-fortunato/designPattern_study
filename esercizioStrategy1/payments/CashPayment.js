"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.CashPayment = void 0;
var CashPayment = /** @class */ (function () {
    function CashPayment() {
    }
    CashPayment.prototype.pay = function (amountToPay) {
        console.log("Paying with cash: ".concat(amountToPay, "\u20AC"));
    };
    return CashPayment;
}());
exports.CashPayment = CashPayment;
