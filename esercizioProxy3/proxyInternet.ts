import { IInternet } from "./iinternet";
import { RealInternet } from "./realInternet";

export class ProxyInternet implements IInternet{
    private isAdmin!: boolean;
    private realInternet!: RealInternet;

    constructor(isAdmin: boolean) {
        this.isAdmin = isAdmin;
    }

    connect(website: string) {
        if(this.isAdmin) {

            if(this.realInternet === null) {
                this.realInternet = new RealInternet();
            }
            this.realInternet.connect(website);

        } else {
            console.log("You must be an Admin to connect to the dark web");
        }
    }
}