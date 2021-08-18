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
    }
}
