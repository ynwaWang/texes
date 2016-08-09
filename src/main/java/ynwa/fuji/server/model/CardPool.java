package ynwa.fuji.server.model;

import java.util.ArrayList;
import java.util.List;

import static ynwa.fuji.server.Utils.shuffle;
/**
 * Created by ynwa on 16/8/6.
 */
public class CardPool {
    private Card[] pool;//round使用的牌池

    public Card[] getPool() {
        return pool;
    }

    public void setPool(Card[] pool) {
        this.pool = pool;
    }

    public static CardPool build() {
        CardPool pool = new CardPool();
        pool.setPool(shuffle(Card.values()));
        return pool;
    }

    public List<CardPair> deal(Integer[] players) {
        List<CardPair> cardPairs = new ArrayList<>(players.length);
        for (int i = 0; i < players.length; i++) {
            CardPair cardPair = new CardPair(players[i],deal(players[i]));
            cardPairs.add(cardPair);
        }

        return cardPairs;
    }

    private Card[] deal(int index) {
        return new Card[] {pool[2*index],pool[2*index + 1]};
    }
}
