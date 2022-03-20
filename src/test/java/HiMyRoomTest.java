import org.junit.jupiter.api.Test;

import java.awt.event.HierarchyBoundsAdapter;

import static org.junit.jupiter.api.Assertions.assertEquals;
//code review
class HiMyRoomTest {

    @Test
    void checkSum() {
        int result = HiMyRoom.SumOfNumber(5,11);
        assertEquals(16, result);
    }
}