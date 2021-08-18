package pages;

import net.sf.f3270.Terminal;

public class SplashScreenPage {

    private Terminal terminal;

    public SplashScreenPage(Terminal terminal) {
        this.terminal = terminal;
    }

    public void goToLoginPage() {
        terminal.enter();
    }
}
