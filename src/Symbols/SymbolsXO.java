package Symbols;

public class SymbolsXO implements SymbolsXOInterface {
    public static final char X = 'X';
    public static final char O = 'O';

    @Override
    public char getX() {
        return X;
    }

    @Override
    public char getO() {
        return O;
    }

}
