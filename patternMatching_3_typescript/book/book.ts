import { BookTypeEnum } from "./bookTypeEnum";

export class Book {
    bookType: BookTypeEnum;
    cost: number;

    constructor(bookType: BookTypeEnum, cost: number) {
        this.bookType = bookType;
        this.cost = cost
    }
}