package pub400;

import net.sf.f3270.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class Pub400Test {

    private static Terminal terminal;

    @BeforeAll
    public static void setUp() {
        terminal = new Terminal(
                "s3270/s3270",
                "pub400.com",
                23,
                TerminalType.TYPE_3279,
                TerminalModel.MODE_80_24,
                HostCharset.US_INTL,
                true);
        terminal.connect();
    }

    @Test
    public void login() {
        terminal.write("xxx");
        terminal.tab();
        terminal.write("xxx");
        terminal.enter();
    }
}
