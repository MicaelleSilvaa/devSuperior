package curso_programacao;

public class BarCustomer {
    private String sexo;
    private int qtdCervejas;
    private int qtdRefrigerantes;
    private int qtdEspetinhos;

    public BarCustomer(String s, int cervejas, int refrigerantes, int espetinhos) {
        sexo = s;
        qtdCervejas = cervejas;
        qtdRefrigerantes = refrigerantes;
        qtdEspetinhos = espetinhos;
    }

    public double calcularConsumo() {
        return (qtdCervejas * 5) + (qtdRefrigerantes * 3) + (qtdEspetinhos * 7);
    }

    public double calcularCouvert() {
        return calcularConsumo() > 30 ? 0 : 4;
    }

    public double calcularIngresso() {
        return sexo.equalsIgnoreCase("F") ? 8 : 10;
    }

    public double calcularTotal() {
        return calcularConsumo() + calcularCouvert() + calcularIngresso();
    }

    public void imprimirRelatorio() {
        System.out.printf("\nRELATÓRIO:\n");
        System.out.printf("Consumo = R$ %.2f\n", calcularConsumo());
        System.out.printf("Couvert = %s\n", calcularCouvert() > 0 ? "R$ 4.00" : "Isento");
        System.out.printf("Ingresso = R$ %.2f\n", calcularIngresso());
        System.out.printf("Valor a pagar = R$ %.2f\n", calcularTotal());
    }
}
