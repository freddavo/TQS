package STACK.ua;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;
import java.util.logging.Logger;

import static org.junit.jupiter.api.Assertions.*;

class StackTest {

    private  Logger log = Logger.getLogger("TQS Stack");
    private  Stack<Integer> testStack;

    @BeforeEach
    void setUp() {
        log.info("Preparação para novo teste");
        testStack = new Stack<>();
    }

    @DisplayName("Stack vazia em Construção")
    @Test

    void emptyOnConstruction() {
        log.info(" Testar se a stack está vazia em construção");
        assertTrue(testStack.isEmpty());

        log.info("Teste concluido com sucesso");
    }

    // alinea b

    @DisplayName("Stack has Size 0 on Construction")
    @Test
    void sizeOnConstruction() {
        log.info(" Testar size=0 em construção");
        assertEquals(0, testStack.size());

        log.info("Teste concluido com sucesso");
    }

    @DisplayName("Tamanho depois de fazer push")
    @Test
    void sizeAfterPush() {
        log.info("Testar se o tamanho corresponde à quantidade de elementos que foram inseridos na pilha");

        // 5 elementos na stack
        for(int e = 0 ; e < 5 ; e++){
            testStack.push(e);
        }

        assertFalse(testStack.isEmpty());
        assertEquals(5, testStack.size());
        // assertEquals(10, testStack.size()); só para testar, deu erro, tal como o esperado.


        log.info("Teste concluido com sucesso");
    }


    @DisplayName("Push-Pop x")
    @Test
    void pushThenPop() {
        log.info("======Testing if Value Pushed then immediately Popped is the same======");


        testStack.push(10);
        assertEquals(10,testStack.pop());
        //assertEquals(400,testStack.pop());  só para testar

        log.info("Teste concluido com sucesso");
    }

    @DisplayName("Push-Peek Check Size")
    @Test
    void valSizeAfterPushPeek() {
        log.info("======Testing if Value Pushed then immediately Popped is the same======");


        testStack.push(10);
        int currentSize = testStack.size();

        assertEquals(10,testStack.peek());
        assertEquals(currentSize,testStack.size());

        log.info("Teste concluido com sucesso");
    }
    void popEmpty() {
        log.info("======Testing Exception when Popping empty stack======");

        assertThrows(NoSuchElementException.class, () -> {
            testStack.pop();
        });

        log.info("Teste concluido com sucesso");
    }

    @DisplayName("Peek from empty")
    @Test

    void peekEmpty() {
        log.info("======Testing Exception when Peeking empty stack======");

        assertThrows(NoSuchElementException.class, () -> {
            testStack.peek();
        });

        log.info("Teste concluido com sucesso");
    }

    @DisplayName("Push to full")
    @Test

    void pushFull() {
        log.info("======Testing Exception when Pushing into Full Stack======");

        testStack = new Stack<>(10); // stack com limite 10

        for(int e = 0 ; e < 10 ; e++){  //10 elementos p stack
            testStack.push(e);
        }

        assertThrows(IllegalStateException.class, () -> {
            testStack.push(3);
        });

        log.info("Teste concluido com sucesso");
    }



}