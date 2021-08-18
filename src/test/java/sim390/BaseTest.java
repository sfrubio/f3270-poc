package sim390;

import net.sf.f3270.Terminal;
import org.junit.jupiter.api.BeforeAll;
import pages.LoginPage;
import pages.MainMenuPage;
import pages.SplashScreenPage;
import pages.UserIdsPage;

import static terminal.TerminalFactory.SIM390;

public abstract class BaseTest {
    static SplashScreenPage splashScreenPage;
    static LoginPage loginPage;
    static MainMenuPage mainMenuPage;
    static UserIdsPage userIdsPage;

    @BeforeAll
    public static void setUp() {
        Terminal terminal = SIM390.getTerminalManager().getTerminal();
        splashScreenPage = new SplashScreenPage(terminal);
        loginPage = new LoginPage(terminal);
        mainMenuPage = new MainMenuPage(terminal);
        userIdsPage = new UserIdsPage(terminal);
    }
}
