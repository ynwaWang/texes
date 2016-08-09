package ynwa.fuji.server.model;

import java.util.List;

import static ynwa.fuji.server.model.RoundStatus.*;

/**
 * Created by ynwa on 16/8/6.
 * 局的表示
 */
public class Round {
    private final List<Player> players;
    private RoundStatus status;
    private CardPool pool;
    private List<CardPair> cardPairs;

    private Round(List<Player> players) {
        this.players = players;
        this.status = INIT;
//        this.pool = CardPool.build();
//        this.cardPairs = this.pool.deal(shuffle(new Integer[]{0,1,2,3,4,5}));
    }

    public static Round init(List<Player> players) {
        Round round = new Round(players);
        return round;
    }
}
