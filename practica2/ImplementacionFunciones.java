import java.io.*;
import java.util.*;
import MCalculadora.*;

public class ImplementacionFunciones extends ICalculadoraPOA {
    public ImplementacionFunciones() {
        super();
    }

    public int sumar(Operadores ops) {
        return ops.a + ops.b;
    }

    public int restar(Operadores ops) {
        return ops.a - ops.b;
    }

    public int multiplicar(Operadores ops) {
        return ops.a * ops.b;
    }

    public int dividir(Operadores ops) {
        return ops.a / ops.b;
    }

    public double exponencial(Operadores ops) {
        return (double) Math.exp(ops.a);
    }

    public double raiz(Operadores ops) {
        return (int) Math.sqrt(ops.a);
    }

    public double modulo(Operadores ops) {
        return ops.a % ops.b;
    }

    public double factorial(Operadores ops) {
        int fact = 1;
        for (int i = 1; i <= ops.a; i++) {
            fact = fact * i;
        }
        return fact;
    }

    public double potencia(Operadores ops) {
        return (double) Math.pow(ops.a, ops.b);
    }

    public double logaritmo(Operadores ops) {
        return (double) Math.log(ops.a);
    }

    public double logaritmoBase10(Operadores ops) {
        return (double) Math.log10(ops.a);
    }

    public double seno(Operadores ops) {
        return (double) Math.sin(ops.a);
    }

    public double coseno(Operadores ops) {
        return (double) Math.cos(ops.a);
    }

    public double tangente(Operadores ops) {
        return (double) Math.tan(ops.a);
    }

    public double cosecante(Operadores ops) {
        return (double) 1 / Math.sin(ops.a);
    }

    public double secante(Operadores ops) {
        return (double) 1 / Math.cos(ops.a);
    }

    public double cotangente(Operadores ops) {
        return (double) 1 / Math.tan(ops.a);
    }


 

}