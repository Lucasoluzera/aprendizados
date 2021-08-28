package com.cursosteste;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.InOrder;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;


public class MockitoTests {

    @Mock
    List<String> lista;

    @Test
    public void primeiroTesteMockito() {
        lista.size();
        lista.add("");


        InOrder inOrder = Mockito.inOrder(lista);
        inOrder.verify(lista).size();
        inOrder.verify(lista).add("");

    }


}