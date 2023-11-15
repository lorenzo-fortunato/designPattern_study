import { ProxyInternet } from "./proxyInternet";
import { RealInternet } from "./realInternet";

const mainFunction = () => {

    const proxyInternet = new ProxyInternet(false);
    proxyInternet.connect("http://thedarkweb.com")
    // const realInternet = new RealInternet();
    // realInternet.connect("http://thedarkweb.com");
}
mainFunction();