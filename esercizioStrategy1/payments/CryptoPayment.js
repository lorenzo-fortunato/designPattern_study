"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.CryptoPayment = void 0;
var CryptoPayment = /** @class */ (function () {
    function CryptoPayment() {
    }
    CryptoPayment.prototype.pay = function (amountToPay) {
        var cryptoAmount = amountToPay / 2000;
        console.log("Paying with crypto: ".concat(cryptoAmount, " coins"));
    };
    return CryptoPayment;
}());
exports.CryptoPayment = CryptoPayment;
