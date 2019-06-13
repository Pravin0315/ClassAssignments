package animals;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class TigerTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    private final PrintStream originalErr = System.err;

    @Before
    public void setUp() throws Exception {
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
    }

    @After
    public void restoreStreams() {
        System.setOut(originalOut);
        System.setErr(originalErr);
    }


    @Test
    public void eating() {
        Tiger tiger = new Tiger("tiger", "Animalia", "Chordata");
        tiger.eating();
        assertEquals("The Tiger devours a chicken!\n", outContent.toString());
    }

    @Test
    public void kingdomInfo() {
        Tiger tiger = new Tiger("tiger", "Animalia", "Chordata");
        tiger.kingdomInfo();
        assertEquals("I am a Tiger\n" + "I am part of the Chordata phylum.\n" + "I am part of the Animalia kingdom.\n", outContent.toString());
    }

    @Test
    public void sleeping() {
        Tiger tiger = new Tiger("tiger", "Animalia", "Chordata");
        tiger.sleeping();
        assertEquals("The Tiger sleeps in a tree.\n", outContent.toString());
    }

    @Test
    public void swimming() {
        Tiger tiger = new Tiger("tiger", "Animalia", "Chordata");
        tiger.swimming();
        assertEquals("Tigers love swimming!\n", outContent.toString());
    }
}