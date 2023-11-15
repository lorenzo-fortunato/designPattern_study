export interface IPaymentStrategy {
    pay(amountToPay: number): void;
}