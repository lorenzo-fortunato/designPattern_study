import { Button } from "./button";

export class MobileButton implements Button {

    constructor() {}

    click(): void {
        console.log("You clicked the mobile button!");
    }

}