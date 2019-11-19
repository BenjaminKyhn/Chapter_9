import junit.framework.TestCase;

public class FjernsynTest extends TestCase {

    public void testTurnOn() {
        Fjernsyn fjernsyn = new Fjernsyn();
        fjernsyn.turnOn();
        assertEquals(true, fjernsyn.on);
    }

    public void testTurnOff() {
        Fjernsyn fjernsyn = new Fjernsyn();
        fjernsyn.turnOff();
        assertEquals(false, fjernsyn.on);
    }

    public void testSetChannel() {
        Fjernsyn fjernsyn = new Fjernsyn();
        fjernsyn.setChannel(18);
        assertEquals(18, fjernsyn.channel);
    }

    // Channel over 120
    public void testSetChannelOver120() {
        Fjernsyn fjernsyn = new Fjernsyn();
        fjernsyn.setChannel(121);
        assertEquals(1, fjernsyn.channel);
    }

    // Channel over under 1
    public void testSetChannelUnder1() {
        Fjernsyn fjernsyn = new Fjernsyn();
        fjernsyn.setChannel(-20);
        assertEquals(1, fjernsyn.channel);
    }

    public void testSetVolume() {
        Fjernsyn fjernsyn = new Fjernsyn();
        fjernsyn.setVolume(5);
        assertEquals(5, fjernsyn.volumeLevel);
    }

    // Volume over 7
    public void testSetVolumeOver7() {
        Fjernsyn fjernsyn = new Fjernsyn();
        fjernsyn.setVolume(8);
        assertEquals(3, fjernsyn.volumeLevel);
    }

    // Volume under 1
    public void testSetVolumeUnder1() {
        Fjernsyn fjernsyn = new Fjernsyn();
        fjernsyn.setVolume(-5);
        assertEquals(3, fjernsyn.volumeLevel);
    }

    public void testChannelUp() {
        Fjernsyn fjernsyn = new Fjernsyn();
        fjernsyn.channelUp();
        assertEquals(2, fjernsyn.channel);
    }

    public void testChannelDown() {
        Fjernsyn fjernsyn = new Fjernsyn();
        fjernsyn.channelDown();
        assertEquals(0, fjernsyn.channel);
    }

    public void testVolumeUp() {
        Fjernsyn fjernsyn = new Fjernsyn();
        fjernsyn.volumeUp();
        assertEquals(4, fjernsyn.volumeLevel);
    }

    // Volume up over 120
    public void testVolumeUpOver7() {
        Fjernsyn fjernsyn = new Fjernsyn();

        for (int i = 0; i < 15; i++) {
            fjernsyn.volumeUp();
        }
        assertEquals(7, fjernsyn.volumeLevel);
    }

    public void testVolumeDown() {
        Fjernsyn fjernsyn = new Fjernsyn();
        fjernsyn.volumeDown();
        assertEquals(2, fjernsyn.volumeLevel);
    }
}