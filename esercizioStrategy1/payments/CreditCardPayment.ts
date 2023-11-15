import { IPaymentStrategy } from "../IPaymentStrategy";

export class CreditCardPayment implements IPaymentStrategy {
    pay(amountToPay: number): void {
        console.log(`Paying with Credit Card: the amount of ${amountToPay} will be charged on the first of the next month`);
    }
    
}