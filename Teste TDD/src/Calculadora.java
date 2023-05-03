public class Calculadora {
    private int a, b;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int diferenca(){
        //throw new java.lang.UnsupportedOperationException("Erro");
        return a-b;
    }

    public int divisao( ){
        //throw new java.lang.UnsupportedOperationException("Erro");
        return a/b;
    }

    public int produto( ){
        //throw new java.lang.UnsupportedOperationException("Erro");
        return a*b;
    }

    public int soma(){
        //throw new java.lang.UnsupportedOperationException("Erro");
        return a+b;
    }
}
