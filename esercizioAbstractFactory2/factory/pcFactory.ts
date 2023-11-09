import { Button } from "../button/button";
import { pcButton } from "../button/pcButton";
import { Checkbox } from "../checkbox/checkbox";
import { PcCheckbox } from "../checkbox/pcCheckbox";
import { AbstractFactory } from "./abstractFactory";

export class PcFactory implements AbstractFactory {

    constructor() {}

    public createButton(): Button {
        return new pcButton();
    }
    public createCheckbox(): Checkbox {
        return new PcCheckbox();
    }
    
}