import { CartItem } from "./CartItem";
import { IPaymentStrategy } from "./IPaymentStrategy";

export class ShoppingCart {
    private items: CartItem[];
    private paymentStrategy?: IPaymentStrategy;

    constructor() {
        this.items = [];
        
    }

    setPaymentStrategy(strategy: IPaymentStrategy) {
        this.paymentStrategy = strategy;
    }

    addItem(item: CartItem): void {
        this.items.push(item);
    }

    checkout(): void {
        if(this.paymentStrategy) {
            console.log("Paying: " + this.calculateTotalAmount());
            this.paymentStrategy.pay(this.calculateTotalAmount());
        } else {
            console.log("Define payment strategy before paying!");
        }
    }

    calculateTotalAmount(): number {
        let total = 0;
        this.items.forEach(item => {
            total += item.getAmount();
        });
        return total;
    }



}