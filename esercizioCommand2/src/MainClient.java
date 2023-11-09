import commands.CloseDocumentCommand;
import commands.Command;
import commands.OpenDocumentCommand;
import commands.SaveDocumentCommand;
import text.MyDocument;
import text.TextEditor;

public class MainClient {
    public static void main(String[] args) {
        MyDocument document = new MyDocument("SampleDocument.txt");

        Command openCommand = new OpenDocumentCommand(document);
        Command saveCommand = new SaveDocumentCommand(document);
        Command closeCommand = new CloseDocumentCommand(document);

        TextEditor textEditor = new TextEditor();
        textEditor.addCommand(openCommand);
        textEditor.addCommand(saveCommand);
        textEditor.addCommand(closeCommand);

        textEditor.executeCommands();
    }
}
