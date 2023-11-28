import { Button } from "./button";

export class pcButton implements Button {

    constructor() {}

    click(): void {
        console.log("You clicked the pc button!");
    }
    
}