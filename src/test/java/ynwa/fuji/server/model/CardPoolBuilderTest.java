package ynwa.fuji.server.model;


import org.junit.Test;
/**
 * Created by ynwa on 16/8/6.
 */
public class CardPoolBuilderTest {

    @Test
    public void testBuild() {
        CardPool pool = CardPool.build();
        assert pool != null;
    }
}
