package terminal;

import net.sf.f3270.Terminal;

public abstract class TerminalManager {

    protected ThreadLocal<Terminal> terminalThread = new ThreadLocal<>();
    protected abstract Terminal createTerminal();

    public void quitTerminal() {
        if (terminalThread.get() != null) {
            try {
                terminalThread.get().disconnect();
                terminalThread.remove();
            } catch (Exception e) {
                System.out.println("Não foi possivel finalizar o terminal.\n" + e);
            }
        }
    }

    public Terminal getTerminal() {
        if (terminalThread.get() == null) {
            terminalThread.set(this.createTerminal());
        }

        return terminalThread.get();
    }
}
