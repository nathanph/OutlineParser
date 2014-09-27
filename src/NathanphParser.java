public class NathanphParser {
    Lexer lexer;
    public NathanphParser(String text) {
        lexer = new FenwicksLexer(text);
        
        int token = lexer.getToken();

        if( token != Lexer.EOP && token!=Lexer.UNKNOWN_TOKEN)
            outline(token);
        else
            error();
        System.out.println("YAY");
    }
    
    private void outline(int token) {
        level1(token);
    }

    private void level1(int token) {
        if(token==Lexer.ROMAN)
            level2(lexer.getToken());
        else
            error();
    }

    private void level2(int token) {
        if(token==Lexer.DOT) {
            if(lexer.getToken()==Lexer.CAPITAL)
                level3(lexer.getToken());
            else
                error();
        }
        else if(token==Lexer.UNKNOWN_TOKEN)
            error();
    }

    private void level3(int token) {
        if(token==Lexer.DOT) {
            if(lexer.getToken()==Lexer.NUMERIC)
                level4(lexer.getToken());
            else
                error();
        }
        else if(token==Lexer.UNKNOWN_TOKEN)
                error();

    }
    
    private void level4(int token) {
        if(token==Lexer.DOT) {
            if(lexer.getToken()!=Lexer.LOWER)
                error();
        }
        else if(token==Lexer.UNKNOWN_TOKEN)
                error();

    }

    public void error() {
        System.out.println("Unable to parse.");
        System.exit(1);
    }

    public static void main(String[] args) {
        NathanphParser parser = new NathanphParser(args[0]);
    }
}
