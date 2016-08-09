package ynwa.fuji.server.model;

/**
 * Created by ynwa on 16/8/8.
 */
public class CardPair {
    private final Card[] cards;//round使用的牌池
    private final int index;

    public CardPair(int index,Card[] cards) {
        this.index = index;
        this.cards = cards;
    }
}
