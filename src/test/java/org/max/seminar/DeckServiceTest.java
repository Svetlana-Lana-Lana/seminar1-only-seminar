package org.max.seminar;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DeckServiceTest {

    @Test
    void testDeckServiceGetDeck() {
        //given
        DeckService deckService = new DeckService();
        //when
        Deck deck = deckService.getNewDeck();
        //then
        Assertions.assertEquals(52,  deck.getCards().size());
    }
}
