package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LivroFiccaoTest {

    @Test
    void devePublicarLivroFiccao() {
        ILivros livro = new LivroFiccao();
        String resultado = livro.publicar();
        assertEquals("Livro Ficção Publicado", resultado);
    }
}
