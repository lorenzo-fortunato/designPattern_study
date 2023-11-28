import { Checkbox } from "./checkbox";

export class PcCheckbox implements Checkbox {

    constructor() {}

    check(): void {
        console.log("You clicked the pc checkbox!");
    }

}