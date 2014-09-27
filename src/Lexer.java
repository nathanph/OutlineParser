
public abstract class Lexer {
    abstract int getToken();

    public static final int EOP = 0;
    public static final int UNKNOWN_TOKEN = 1;
    public static final int DOT = 2;
    public static final int ROMAN = 3;
    public static final int CAPITAL = 4;
    public static final int NUMERIC = 5;
    public static final int LOWER = 6;
    public String tokenName(int token) {
	switch (token) {
	case EOP: return "End Of Program";
	case UNKNOWN_TOKEN: return "Unknown symbol";
	case DOT: return "dot";
	case ROMAN: return "ROMAN";
	case CAPITAL: return "CAPITAL";
	case NUMERIC: return "NUMERIC";
	case LOWER: return "LOWER";
	default: return "??";
	}
    }
}
