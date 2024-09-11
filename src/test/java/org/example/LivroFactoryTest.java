package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LivroFactoryTest {

    @Test
    void deveObterLivroFiccao() {
        ILivros livro = LivroFactory.obterLivro("Ficcao");
        assertNotNull(livro);
        assertTrue(livro instanceof LivroFiccao);
    }

    @Test
    void deveObterLivroRomance() {
        ILivros livro = LivroFactory.obterLivro("Romance");
        assertNotNull(livro);
        assertTrue(livro instanceof LivroRomance);
    }

    @Test
    void deveLancarExcecaoParaLivroInexistente() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            LivroFactory.obterLivro("Aventura");
        });

        assertEquals("Livro inexistente", exception.getMessage());
    }

    @Test
    void deveLancarExcecaoParaClasseQueNaoImplementaILivros() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            LivroFactory.obterLivro("Suspense");
        });

        assertEquals("Livro indisponível", exception.getMessage());
    }
}
