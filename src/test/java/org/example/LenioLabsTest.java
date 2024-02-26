package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class LenioLabsTest {

    @Test
    void findDuplicatedWordsExample1() {
        Assertions.assertEquals(
                Set.of("hola", "uno", "probando"),
                LenioLabs.findDuplicatedWords("hola como estas hola todo bien ? que se cuenta hola probando uno dos tres probando uno ")
        );
    }
}