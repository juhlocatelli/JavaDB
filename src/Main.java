import java.util.*;

public class Main {
    @SuppressWarnings("ConvertToTrywithResources")
    public static void main(String[] args) {
        CategoriaDAO dao = new CategoriaDAO();
        Scanner sc = new Scanner(System.in);

        System.out.println(
        "1- Inserir |  2- Listar |  3- Atualizar | 4- Deletar"
        );
        int opcao = sc.nextInt();
        sc.nextLine();
        
        switch (opcao) {
            case 1:
                System.out.print("Nome: ");
                String nome = sc.nextLine();
                System.out.print("Ativo: ");
                boolean ativo =  sc.nextBoolean();
                Categoria p = new Categoria (nome, ativo);
                dao.inserir(p);
                break;
            case 2:
                for (Categoria cate: dao.listar()) {
                System.out.println(
                cate.getId() + " - " +
                cate.getNome() + "- " +
                cate.getisAtivo());
            }
            break;
            case 3:
                System.out.print("ID do produto: ");
                int id = sc.nextInt();
                sc.nextLine();
                System.out.print("Novo nome: ");
                nome = sc.nextLine();
                System.out.print("Novo estado: ");
                ativo = sc.nextBoolean();
                p = new Categoria (nome, ativo);
                p.setId(id);
                dao.atualizar(p);
            break;
            case 4:
                System.out.print("ID: ");
                id = sc.nextInt();
                dao.deletar(id);
            break;
            default:
                System.out.println("Opção invalida.");
        }
        sc.close();
    }
}