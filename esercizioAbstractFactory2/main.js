"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
const abstractFactory_1 = require("./factory/abstractFactory");
const main = (factoryType) => {
    const abstractFactory = (0, abstractFactory_1.createFactory)(factoryType);
    console.log(abstractFactory.createButton().click());
};
main("Pc");
