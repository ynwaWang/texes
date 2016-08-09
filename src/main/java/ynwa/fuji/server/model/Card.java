package ynwa.fuji.server.model;

/**
 * Created by ynwa on 16/8/6.
 * 纸牌
 */
public enum Card {
    HEART_10(11),
    HEART_J(12),
    HEART_Q(13),
    HEART_K(14),
    HEART_A(15),
    SPADE_10(21),
    SPADE_J(22),
    SPADE_Q(23),
    SPADE_K(24),
    SPADE_A(25),
    CLUB_10(31),
    CLUB_J(32),
    CLUB_Q(33),
    CLUB_K(34),
    CLUB_A(35),
    DIAMOND_10(41),
    DIAMOND_J(42),
    DIAMOND_Q(43),
    DIAMOND_K(44),
    DIAMOND_A(45);

    private int card;
    Card(int card) {
        this.card = card;
    }
//    private int point;//点数
//    private int color;//花色
}
