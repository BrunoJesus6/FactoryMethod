package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LivroRomanceTest {

    @Test
    void devePublicarLivroRomance() {
        ILivros livro = new LivroRomance();
        String resultado = livro.publicar();
        assertEquals("Livro Romance Publicado", resultado);
    }
}
