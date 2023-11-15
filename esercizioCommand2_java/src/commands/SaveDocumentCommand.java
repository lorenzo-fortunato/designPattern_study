package commands;

import text.MyDocument;

public class SaveDocumentCommand implements Command {
    private MyDocument document;

    public SaveDocumentCommand(MyDocument document) {
        this.document = document;
    }

    @Override
    public void execute() {
        document.save();
    }
}
