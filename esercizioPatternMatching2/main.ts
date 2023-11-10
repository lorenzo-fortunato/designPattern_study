const enum BookType {
    PAPER = 'PAPER',
    ELECTRONIC = 'ELECTRONIC',
    NEWSLETTER = 'NEWSLETTER'
}

const countType: Record<BookType, boolean> = {
    PAPER: true,
    ELECTRONIC: false,
    NEWSLETTER: true
}

const deliveryByType: Record<BookType, printBookAmount> = {
    PAPER: (book) => {console.log('The delivery of this book and the amount is: ' + book.amount + 3)},
    ELECTRONIC: (book) => {console.log('The delivery of this book and the amount is: ' + book.amount)},
    NEWSLETTER: (book) => {console.log('The delivery of this book and the amount is: ' + book.amount + 2)}
}

type printBookAmount = (book: Book) => void;

class Book {
    amount: number;
    type: BookType;

    constructor(amount: number, type: BookType) {
        this.amount = amount;
        this.type = type;
    }

    getAmount(): number {
        return this.amount;
    }

    getType(): BookType {
        return this.type;
    }
}

const getData = (): Book[] => {
    const books: Book[] = [];
    books.push(new Book(10, BookType.ELECTRONIC));
    books.push(new Book(20, BookType.ELECTRONIC));
    books.push(new Book(30, BookType.ELECTRONIC));
    books.push(new Book(40, BookType.ELECTRONIC));
    books.push(new Book(10, BookType.PAPER));
    books.push(new Book(10, BookType.PAPER));
    books.push(new Book(10, BookType.PAPER));
    books.push(new Book(10, BookType.NEWSLETTER));
    books.push(new Book(20, BookType.NEWSLETTER));
    books.push(new Book(30, BookType.NEWSLETTER));
    books.push(new Book(40, BookType.NEWSLETTER));
    return books;
}


const main = () => {
    const myLibrary: Book[] = getData();

    const amountPaperAndNewsletter = myLibrary
        .filter(book => countType[book.type])
        .map(book => book.amount)
        .reduce((k, v) => k + v);

    const amountElectronic = myLibrary
        .filter(book => !countType[book.type])
        .map(book => book.amount)
        .reduce((k, v) => k + v);
    
    console.log("The amount of the paper and newsletter is: " + amountPaperAndNewsletter);
    console.log("The amount of the paper and newsletter is: " + amountElectronic);

    myLibrary.forEach(book => deliveryByType[book.type](book));

    console.log("The book store")
}

main();