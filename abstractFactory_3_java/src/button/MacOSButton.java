package button;

import button.Button;

public class MacOSButton implements Button {
    @Override
    public void paint() {
        System.out.println("You have created a MacOS button.");
    }
}
