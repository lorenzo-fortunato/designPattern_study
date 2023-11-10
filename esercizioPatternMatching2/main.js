var countType = {
    PAPER: true,
    ELECTRONIC: false,
    NEWSLETTER: true
};
var deliveryByType = {
    PAPER: function (book) { console.log('The delivery of this book and the amount is: ' + book.amount + 3); },
    ELECTRONIC: function (book) { console.log('The delivery of this book and the amount is: ' + book.amount); },
    NEWSLETTER: function (book) { console.log('The delivery of this book and the amount is: ' + book.amount + 2); }
};
var Book = /** @class */ (function () {
    function Book(amount, type) {
        this.amount = amount;
        this.type = type;
    }
    Book.prototype.getAmount = function () {
        return this.amount;
    };
    Book.prototype.getType = function () {
        return this.type;
    };
    return Book;
}());
var getData = function () {
    var books = [];
    books.push(new Book(10, "ELECTRONIC" /* BookType.ELECTRONIC */));
    books.push(new Book(20, "ELECTRONIC" /* BookType.ELECTRONIC */));
    books.push(new Book(30, "ELECTRONIC" /* BookType.ELECTRONIC */));
    books.push(new Book(40, "ELECTRONIC" /* BookType.ELECTRONIC */));
    books.push(new Book(10, "PAPER" /* BookType.PAPER */));
    books.push(new Book(10, "PAPER" /* BookType.PAPER */));
    books.push(new Book(10, "PAPER" /* BookType.PAPER */));
    books.push(new Book(10, "NEWSLETTER" /* BookType.NEWSLETTER */));
    books.push(new Book(20, "NEWSLETTER" /* BookType.NEWSLETTER */));
    books.push(new Book(30, "NEWSLETTER" /* BookType.NEWSLETTER */));
    books.push(new Book(40, "NEWSLETTER" /* BookType.NEWSLETTER */));
    return books;
};
var main = function () {
    var myLibrary = getData();
    var amountPaperAndNewsletter = myLibrary
        .filter(function (book) { return countType[book.type]; })
        .map(function (book) { return book.amount; })
        .reduce(function (k, v) { return k + v; });
    var amountElectronic = myLibrary
        .filter(function (book) { return !countType[book.type]; })
        .map(function (book) { return book.amount; })
        .reduce(function (k, v) { return k + v; });
    console.log("The amount of the paper and newsletter is: " + amountPaperAndNewsletter);
    console.log("The amount of the paper and newsletter is: " + amountElectronic);
    myLibrary.forEach(function (book) { return deliveryByType[book.type](book); });
    console.log("The book store");
};
main();
