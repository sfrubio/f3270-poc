package pages;

import net.sf.f3270.FieldIdentifier;
import net.sf.f3270.Terminal;

public class LoginPage {

    private Terminal terminal;
    private FieldIdentifier userId = new FieldIdentifier("MUSIC Userid:");
    private FieldIdentifier password = new FieldIdentifier("Password:");

    public LoginPage(Terminal terminal) {
        this.terminal = terminal;
    }

    public void accessSim390() {
        terminal.write(userId, "$000");
        terminal.write(password, "music");
        terminal.enter();
        terminal.enter();
        if (terminal.getLine(3).contains("Conditions of Use")) {
            terminal.enter();
            terminal.write("yes");
            terminal.enter();
        }
    }
}
