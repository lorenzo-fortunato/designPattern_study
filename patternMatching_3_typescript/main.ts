import { Book } from "./book/book";
import { BookTypeEnum } from "./book/bookTypeEnum";


const getBooks = (): Book[] => {
    const bookList: Book[] = [];
    bookList.push(new Book(BookTypeEnum.KINDLE, 10));
    bookList.push(new Book(BookTypeEnum.PAPER, 20));
    bookList.push(new Book(BookTypeEnum.PAPER, 20));
    bookList.push(new Book(BookTypeEnum.NEWSLETTER, 5));
    return bookList;
}

const main = () => {
    const recordType: Record<BookTypeEnum, boolean> = {
        PAPER: true,
        KINDLE: false,
        NEWSLETTER: false
    }

    type printBookAmount = (book: Book) => void;
    const deliveryByType: Record<BookTypeEnum, printBookAmount> = {
        PAPER: (book: Book) => {console.log(`The delivery of this book + the cost is: ${book.cost + 3}`)},
        KINDLE: (book: Book) => {console.log(`The delivery of this book + the cost is: ${book.cost + 5}`)},
        NEWSLETTER: (book: Book) => {console.log(`The delivery of this book + the cost is: ${book.cost + 10}`)},
    }

    
    const myLibrary: Book[] = getBooks();

    // const totalPaperCost = myLibrary
    //         .filter(book => recordType[book.bookType])
    //         .map(book => book.cost)
    //         .reduce((k, v) => k + v);

    let totalPaperCost: number = 0;
    myLibrary.forEach(book => {
        if(recordType[book.bookType]) {
            totalPaperCost += book.cost;
        }
    })
    
    console.log(`Total paper cost: ${totalPaperCost}`);

    const totalElectronicCost = myLibrary
            .filter(book => !recordType[book.bookType])
            .map(book => book.cost)
            .reduce((k, v) => k + v);
    
    console.log(`Total electronic cost: ${totalElectronicCost}`);

    myLibrary.forEach(book => deliveryByType[book.bookType](book));
}

main();

