package terminal;

import net.sf.f3270.HostCharset;
import net.sf.f3270.Terminal;
import net.sf.f3270.TerminalModel;
import net.sf.f3270.TerminalType;

public class Pub400TerminalManager extends TerminalManager {

    @Override
    protected Terminal createTerminal() {
        System.out.println("Starting SIM390 Terminal");
        Terminal terminal = new Terminal(
                "s3270/s3270",
                "127.0.0.1",
                23,
                TerminalType.TYPE_3279,
                TerminalModel.MODE_80_24,
                HostCharset.US_INTL,
                true);
        terminal.connect();

        return terminal;
    }
}
