import { Checkbox } from "./checkbox";

export class MobileCheckbox implements Checkbox {

    constructor() {}

    check(): void {
       console.log("You clicked the mobile checkbox!");
    }

}