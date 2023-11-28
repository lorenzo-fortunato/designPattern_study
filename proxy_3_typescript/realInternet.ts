import { IInternet } from "./iinternet";

export class RealInternet implements IInternet {
    connect(website: string): void {
        console.log("Connecting to website: " + website)
    }
}