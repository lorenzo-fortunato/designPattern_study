import { IPaymentStrategy } from "../IPaymentStrategy";

export class CashPayment implements IPaymentStrategy {
    pay(amountToPay: number): void {
        console.log(`Paying with cash: ${amountToPay}€`);
    }

}