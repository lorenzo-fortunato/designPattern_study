import { Button } from "../button/button";
import { Checkbox } from "../checkbox/checkbox";
import { MobileFactory } from "./mobileFactory";
import { PcFactory } from "./pcFactory";

export interface AbstractFactory {
    
    createButton(): Button;
    createCheckbox(): Checkbox;

}

export const createFactory = (factoryType: string): AbstractFactory => {
    if (factoryType === "Mobile") {
        return new MobileFactory();
    }
    return new PcFactory();
}
// prova