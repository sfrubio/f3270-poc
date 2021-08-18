package pages;

import net.sf.f3270.FieldIdentifier;
import net.sf.f3270.Terminal;

public class MainMenuPage {

    private Terminal terminal;
    private FieldIdentifier option = new FieldIdentifier("SELECT OPTION", 2);

    public MainMenuPage(Terminal terminal) {
        this.terminal = terminal;
    }

    public void accessUserIds() {
        terminal.write(option, "2");
        terminal.enter();
    }
}
