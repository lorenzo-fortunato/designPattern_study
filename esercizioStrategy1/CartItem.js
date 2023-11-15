"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.CartItem = void 0;
var CartItem = /** @class */ (function () {
    function CartItem(amount, description) {
        this.amount = amount;
        this.description = description;
    }
    CartItem.prototype.getAmount = function () {
        return this.amount;
    };
    CartItem.prototype.getDescription = function () {
        return this.description;
    };
    return CartItem;
}());
exports.CartItem = CartItem;
