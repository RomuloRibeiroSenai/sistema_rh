package interfaces;

public interface Calculo {
    double calcularSalario();
    double calcularFGTS(double salario);
    double calcular13(double salario);
    double calcularFerias(double salario);
    double calcularINSS(double salario);
    
}
