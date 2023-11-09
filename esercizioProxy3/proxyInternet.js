"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.ProxyInternet = void 0;
const realInternet_1 = require("./realInternet");
class ProxyInternet {
    constructor(isAdmin) {
        this.isAdmin = isAdmin;
    }
    connect(website) {
        if (this.isAdmin) {
            if (this.realInternet === null) {
                this.realInternet = new realInternet_1.RealInternet();
            }
            this.realInternet.connect(website);
        }
        else {
            console.log("You must be an Admin to connect to the dark web");
        }
    }
}
exports.ProxyInternet = ProxyInternet;
