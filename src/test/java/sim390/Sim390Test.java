package sim390;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Sim390Test extends BaseTest {

    @Test
    public void workingWithUserIds() {
        splashScreenPage.goToLoginPage();
        loginPage.accessSim390();
        mainMenuPage.accessUserIds();
        String pageTitle = userIdsPage.getPageTitle();
        Assertions.assertTrue(pageTitle.contains("Userid Tasks"));
    }
}


