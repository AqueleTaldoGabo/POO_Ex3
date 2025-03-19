import java.util.*;
public class TesteLivro {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Livro livro1 = new Livro();
        Livro livro2 = new Livro();

        livro1.setTitulo(scanner.nextLine());
        livro1.setAutor(scanner.nextLine());
        livro2.setTitulo(scanner.nextLine());
        livro2.setAutor(scanner.nextLine());

        livro1.exibeDados();
        livro2.exibeDados();

        System.out.println("Titulo- " + livro1.getTitulo() + "\nAutor- " + livro1.getAutor());
        System.out.println("Titulo- " + livro2.getTitulo() + "\nAutor- " + livro2.getAutor());

    }
}
