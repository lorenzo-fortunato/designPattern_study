package commands;

import text.MyDocument;

public class OpenDocumentCommand implements Command {
    private MyDocument document;

    public OpenDocumentCommand(MyDocument document) {
        this.document = document;
    }

    @Override
    public void execute() {
        document.open();
    }
}
