package factory;

import button.Button;
import checkbox.Checkbox;

public interface GUIAbstractFactory {
    Button createButton();
    Checkbox createCheckbox();
}
