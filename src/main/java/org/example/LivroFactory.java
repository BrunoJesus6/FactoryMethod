package org.example;

public class LivroFactory {

    public static ILivros obterLivro(String livro) {
        Object objeto;
        try {
            Class classe = null;
            objeto = null;

            classe = Class.forName("org.example.Livro" + livro);
            objeto = classe.newInstance();
        } catch (Exception ex) {
            throw new IllegalArgumentException("Livro inexistente");
        }
        if (!(objeto instanceof ILivros)) {
            throw new IllegalArgumentException("Livro indisponível");
        }
        return (ILivros) objeto;
    }
}
