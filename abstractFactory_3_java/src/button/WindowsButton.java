package button;

import button.Button;

public class WindowsButton implements Button {
    @Override
    public void paint() {
        System.out.println("You have created a Windows button.");
    }
}
