"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
const proxyInternet_1 = require("./proxyInternet");
const mainFunction = () => {
    const proxyInternet = new proxyInternet_1.ProxyInternet(false);
    proxyInternet.connect("http://thedarkweb.com");
    // const realInternet = new RealInternet();
    // realInternet.connect("http://thedarkweb.com");
};
mainFunction();
