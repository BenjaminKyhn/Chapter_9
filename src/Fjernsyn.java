public class Fjernsyn {
    int channel = 1;
    int volumeLevel = 3;
    boolean on = false;

    public Fjernsyn(){
    }

    public void turnOn(){
        on = true;
        System.out.println("The TV has been turned on.");
    }

    public void turnOff(){
        on = false;
        System.out.println("The TV has been turned off.");
    }

    public void setChannel(int newChannel){
        if (newChannel > 0 && newChannel < 121)
        channel = newChannel;
        System.out.println("Channel " + channel);
    }

    public void setVolume(int newVolumeLevel){
        if (newVolumeLevel < 7 && newVolumeLevel > 0)
        volumeLevel = newVolumeLevel;
        System.out.println("Volume " + volumeLevel);
    }

    public void channelUp(){
        channel++;
        if (channel > 120)
            channel = 1;
        System.out.println("Channel " + channel);
    }

    public void channelDown(){
        channel--;
        if (channel < 1)
            channel = 120;
        System.out.println("Channel " + channel);
    }

    public void volumeUp(){
        if (volumeLevel < 7 && volumeLevel > 0)
        volumeLevel++;
        System.out.println("Volume " + volumeLevel);
    }

    public void volumeDown(){
        if (volumeLevel < 7 && volumeLevel > 0)
        volumeLevel--;
        System.out.println("Volume " + volumeLevel);
    }
}