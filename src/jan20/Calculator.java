package jan20;

public class Calculator {
    public int sum(int a, int b){
        return a + b;
    }
    public int sum(int a, int b, int c){
        return a + b + c;
    }
    public int sum(int a, int b, int c, int d){
        return a + b + c + d;
    }
    public int difference(int a, int b){
        return a - b;
    }
    public int difference(int a, int b, int c){
        return a - b - c;
    }
    public int product(int a, int b){
        return a * b;
    }
    public int product(int a, int b, int c){
        return a * b * c;
    }
    public int division(int a, int b){
        return a / b;
    }
    public int division(int a, int b, int c){
        return a / b / c;
    }
    public int modulus(int a, int b){
        return a % b;
    }
    public int modulus(int a, int b, int c){
        return a % b % c;
    }
}
