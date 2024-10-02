import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Produto p = new Produto();
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nome do produto: ");
        p.setNome(sc.nextLine());

        System.out.println("Digite o estoque do produto");
        p.setEstoque(sc.nextInt());

        System.out.println("Digite o valor do produto");
        p.setValor(sc.nextDouble());

        System.out.println("Digite o codigo do produto");
        p.setCodigo(sc.nextInt());

        System.out.println("Digite a cor do produto");
        p.setCor(sc.next());

        System.out.println("Digite o tamanho ou peso do produto");
        p.setTamanho_peso(sc.nextDouble());

        System.out.println("Digite 1 para Pix, 2 para Cartão de Débito," +
                " 3 para Transferência, 4 para Espécie, 5 para Cartão de Crédito");

        int escolha = sc.nextInt();
        p.verificar_estoque();
        p.setPagamento(escolha);
        p.pagamento();
        sc.close();



    }
}