import { IPaymentStrategy } from "../IPaymentStrategy";

export class CryptoPayment implements IPaymentStrategy {
    pay(amountToPay: number): void {
        const cryptoAmount = amountToPay / 2000;
        console.log(`Paying with crypto: ${cryptoAmount} coins`);
    }
    
}