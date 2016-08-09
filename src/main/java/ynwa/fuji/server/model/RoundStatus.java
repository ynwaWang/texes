package ynwa.fuji.server.model;

/**
 * Created by ynwa on 16/8/8.
 */
public enum RoundStatus {
    INIT(0),
    WAITING(1),
    DEALING(2),
    IDEL(3);

    private int status;
    RoundStatus(int status) {
        this.status = status;
    }
}
