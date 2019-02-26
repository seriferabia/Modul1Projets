package prWeek7.ex2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class NicknameTest {
    private Nickname nickName = new Nickname();

    @Test
    void testGetNickname() {
        String nickname = nickName.getNickname("House");
        Assertions.assertEquals("Ho", nickname);
    }
    @Test
    void testEmptyNickname() {
        String nickname = nickName.getNickname("");
        Assertions.assertEquals("", nickname);
    }

}