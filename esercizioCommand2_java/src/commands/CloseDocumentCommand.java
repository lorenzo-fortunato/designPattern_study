package commands;

import text.MyDocument;

public class CloseDocumentCommand implements Command {
    private MyDocument document;

    public CloseDocumentCommand(MyDocument document) {
        this.document = document;
    }

    @Override
    public void execute() {
        document.close();
    }
}
