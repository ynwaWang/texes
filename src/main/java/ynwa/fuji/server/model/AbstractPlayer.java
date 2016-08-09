package ynwa.fuji.server.model;

/**
 * Created by ynwa on 16/8/8.
 */
public abstract class AbstractPlayer {
    public abstract void entry(int hash);//进入房间
    public abstract void exit(int level);//退出 0-桌子 1-房间 2-游戏
    public abstract void earn(int amount);//获得金币
}
