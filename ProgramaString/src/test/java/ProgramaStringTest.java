import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProgramaStringTest {

    @Test
    public void procuraCaractere() {
        assertEquals(0, ProgramaString.procuraCaractere("abcde", "a"));
        assertEquals(4, ProgramaString.procuraCaractere("abcde", "e"));
    }

    @Test
    public void checaTamanho() {
        assertEquals(true, ProgramaString.checaTamanho(1));
        assertEquals(true, ProgramaString.checaTamanho(20));

        try{
            boolean checaTamanho = ProgramaString.checaTamanho(0);
            fail();
        } catch (Exception e){
            assertEquals("Tamanho menor que 1 ou maior que 20.", e.getMessage());
        }

        try{
            boolean checaTamanho = ProgramaString.checaTamanho(21);
            fail();
        } catch (Exception e){
            assertEquals("Tamanho menor que 1 ou maior que 20.", e.getMessage());
        }
    }

    @Test
    public void checaCadeia() {
        assertEquals(true, ProgramaString.checaCadeia("a", 1));

        try{
            boolean checaCadeia = ProgramaString.checaCadeia("", 0);
        } catch (Exception e){
            assertEquals("Cadeia de tamanho incorreto.", e.getMessage());
        }

        try{
            boolean checaCadeia = ProgramaString.checaCadeia("a", 2);
            fail();
        } catch (Exception e){
            assertEquals("Cadeia de tamanho incorreto.", e.getMessage());
        }
    }

    @Test
    public void checaCaractere() {
        assertEquals(true, ProgramaString.checaCaractere("a"));

        try{
            boolean checaCaractere = ProgramaString.checaCaractere("");
        } catch (Exception e){
            assertEquals("Caractere inválido.", e.getMessage());
        }

        try{
            boolean checaCaractere = ProgramaString.checaCaractere("aa");
            fail();
        } catch (Exception e){
            assertEquals("Caractere inválido.", e.getMessage());
        }
    }

    @Test
    public void progString() {
        assertEquals(0, ProgramaString.ProgString(1, "a", "a"));

        try{
            ProgramaString.ProgString(0, "a", "a");
            fail();
        } catch (Exception e){
            assertEquals("Tamanho menor que 1 ou maior que 20.", e.getMessage());
        }

        try{
            ProgramaString.ProgString(1, "aa", "a");
            fail();
        } catch (Exception e){
            assertEquals("Cadeia de tamanho incorreto.", e.getMessage());
        }

        try{
            ProgramaString.ProgString(1, "a", "aa");
            fail();
        } catch (Exception e){
            assertEquals("Caractere inválido.", e.getMessage());
        }
    }
}