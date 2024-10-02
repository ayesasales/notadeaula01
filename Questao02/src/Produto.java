import java.util.Scanner;

public class Produto {
    private int codigo;
    private String nome;
    private double tamanho_peso;
    private String cor;
    private double valor;
    private int estoque;
    private int pagamento;
    private int verificar_estoque;
    private double valor_recebido;

    public void setCodigo(int codigo){
        this.codigo = codigo;
    }
    public int getCodigo(){
        return codigo;
    }

    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return nome;
    }

    public void setTamanho_peso(double tamanho_peso){
        this.tamanho_peso = tamanho_peso;
    }
    public double getTamanho_peso(){
        return tamanho_peso;
    }

    public void setCor(String cor){
        this.cor = cor;
    }
    public String getCor(){
        return cor;
    }

    public void setValor(double valor){
        this.valor = valor;
    }
    public double getValor(){
        return valor;
    }

    public void setEstoque(int estoque){
        this.estoque = estoque;
    }

    public int getEstoque(){
        return estoque;
    }

    public void setPagamento(int pagamento){
        this.pagamento = pagamento;
    }

    public int setPagamento(){
        return pagamento;
    }

    public void getVerificar_estoque(int verificar_estoque){
        this.verificar_estoque = verificar_estoque;
    }

    public int setVerificar_estoque(){
        return verificar_estoque;
    }

    public void getValor_recebido(double valor_recebido){
        this.valor_recebido = valor_recebido;
    }

    public double setValor_recebido(){
        return valor_recebido;
    }


    public void verificar_estoque(){
        if(estoque >0) {
            System.out.println("Tem o produto do estoque");
        } else {
            System.out.println("Não tem o produto no estoque");

        }
    }

    public void venda (){
        estoque =-1;
        System.out.println("Estoque do produto: " + estoque);
    }

    public void exibirProduto(){
        venda();

        System.out.println("Nome:" + nome);
        System.out.println("Codigo:" + codigo);
        System.out.println("Tamanho/Peso:" + tamanho_peso);
        System.out.println("Cor:" + cor );
        System.out.println("Valor:" + valor);
        System.out.println("Estoque:" + estoque);
    }

    public void pagamento(){
        double troco = 0;
        Scanner sc = new Scanner(System.in);

        switch (pagamento){
            case 1:
                System.out.println("Pagamento pix realizado com sucesso");
                System.out.println("Valor do desconto foi: " + valor * 0.05);
                break;

            case 2:
                System.out.println("Pagamento no cartão de débito realizado com sucesso");
                System.out.println("Valor do desconto foi: " + valor * 0.05);
                break;

            case 3:
                System.out.println("Pagamento em tranferência realizado com sucesso");
                System.out.println("Valor do desconto foi: " + valor * 0.05);
                break;

            case 4:
                System.out.println("Qual o valor em espécie?");
                double recebido = sc.nextDouble();
                troco = recebido - valor;
                System.out.println("O troco foi de " + troco);
                System.out.println("Pagamento em espécie foi realizado com sucesso");
                System.out.println("Valor do desconto foi: " + valor * 0.05);
                break;

            case 5:
                System.out.println("Deseja parcelar em 3x? (s/n)");
                char parcelar = sc.next().charAt(0);
                if (parcelar =='s'||parcelar =='S') {
                    double valorParcela = valor / 3;
                    System.out.println("Valor de cada parcela: %2f\n" + valorParcela);
                    System.out.println("Total a pagar em 3x" + valor);
                    System.out.println("Pagamento no cartão de credito realzado com sucesso");
                    break;

                }

        }

    }

}
