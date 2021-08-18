package terminal;

public enum TerminalFactory {

    SIM390 {
        @Override
        public TerminalManager getTerminalManager() {
            return new Sim390TerminalManager();
        }
    },
    PUB400 {
        @Override
        public TerminalManager getTerminalManager() {
            return new Pub400TerminalManager();
        }
    };

    public abstract TerminalManager getTerminalManager();
}
