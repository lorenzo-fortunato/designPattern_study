"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.MobileFactory = void 0;
const mobileButton_1 = require("../button/mobileButton");
const mobileCheckbox_1 = require("../checkbox/mobileCheckbox");
class MobileFactory {
    constructor() { }
    createButton() {
        return new mobileButton_1.MobileButton();
    }
    createCheckbox() {
        return new mobileCheckbox_1.MobileCheckbox();
    }
}
exports.MobileFactory = MobileFactory;
