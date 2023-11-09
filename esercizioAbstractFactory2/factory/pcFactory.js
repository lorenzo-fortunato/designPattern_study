"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.PcFactory = void 0;
const pcButton_1 = require("../button/pcButton");
const pcCheckbox_1 = require("../checkbox/pcCheckbox");
class PcFactory {
    constructor() { }
    createButton() {
        return new pcButton_1.pcButton();
    }
    createCheckbox() {
        return new pcCheckbox_1.PcCheckbox();
    }
}
exports.PcFactory = PcFactory;
