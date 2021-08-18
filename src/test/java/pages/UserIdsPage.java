package pages;

import net.sf.f3270.Terminal;

public class UserIdsPage {

    private Terminal terminal;

    public UserIdsPage(Terminal terminal) {
        this.terminal = terminal;
    }

    public String getPageTitle() {
        return terminal.getLine(0);
    }
}
