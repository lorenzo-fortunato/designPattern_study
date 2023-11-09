"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.createFactory = void 0;
const mobileFactory_1 = require("./mobileFactory");
const pcFactory_1 = require("./pcFactory");
const createFactory = (factoryType) => {
    if (factoryType === "Mobile") {
        return new mobileFactory_1.MobileFactory();
    }
    return new pcFactory_1.PcFactory();
};
exports.createFactory = createFactory;
