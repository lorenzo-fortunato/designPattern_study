export class CartItem {
    private amount: number;
    private description: string;

    constructor(amount: number, description: string) {
        this.amount = amount;
        this.description = description;
    }

    getAmount(): number {
        return this.amount;
    }

    getDescription(): string {
        return this.description;
    }
}