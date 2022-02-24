import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        Aluno a1 = new Aluno("Caitan", 18,16,"M");
        Aluno a2 = new Aluno("May", 20,19,"F");
        Aluno a3 = new Aluno("Martin", 22,15,"M");
        Aluno a4 = new Aluno("Gessica", 23,9,"F");
        Aluno a5 = new Aluno("Olga", 25,12,"F");
        Aluno a6 = new Aluno("Zeu", 19,8,"M");

        List<Aluno> alunos = Arrays.asList(a1,a2,a3,a4,a5,a6);
        Predicate<Aluno> aprovado = n -> n.nota >= 10;
        Predicate<Aluno> honra = n -> n.nota >= 14;
//        alunos com mais de 24 são considerados jovens adultos
        Predicate<Aluno> jovem = i -> i.idade >=18 && i.idade < 25;

        System.out.println("Alunos aprovados com Honra \uD83C\uDF89️\uD83C\uDF89️\uD83C\uDF89️\n");
        alunos.stream()
                .filter(aprovado)
                .filter(honra)
                .map(a -> a.nome + " Aprovado \uD83C\uDF93 com Honra \uD83C\uDF89️")
                .forEach(System.out::println);

//        Extra
        System.out.println("\n--- Geração de \uD83D\uDC6B alunos ---");
        alunos.stream()
                .filter(jovem)
                .map(a -> "\uD83D\uDC64 " + a.nome + " Jovem")
                .forEach(System.out::println);
    }
}
