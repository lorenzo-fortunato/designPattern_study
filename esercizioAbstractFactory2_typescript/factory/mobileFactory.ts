import { Button } from "../button/button";
import { MobileButton } from "../button/mobileButton";
import { Checkbox } from "../checkbox/checkbox";
import { MobileCheckbox } from "../checkbox/mobileCheckbox";
import { AbstractFactory } from "./abstractFactory";

export class MobileFactory implements AbstractFactory {

    constructor() {}

    public createButton(): Button {
        return new MobileButton();
    }
    public createCheckbox(): Checkbox {
        return new MobileCheckbox();
    }
    
}