package LAB3;

import java.io.FileNotFoundException;

public class RemoteControl {
    private boolean switchTV = false;
    private byte channel = 0;

    public byte getChannel() {
        return channel;
    }

    public Dynamics getDynamics() {
        return dynamics;
    }

    private Dynamics dynamics = new Dynamics();
    public void includeTV(TV tv) throws FileNotFoundException {
        if (!switchTV){
            switchTV = true;
            System.out.println("TV is ON");
            tv.getFout().println("TV is ON");
        }else {
            System.out.println("TV was ON");
            tv.getFout().println("TV was ON");
        }
        tv.getFout().flush();
    }
    public void excludeTV(TV tv){
        if (switchTV){
            switchTV = false;
            System.out.println("TV is OFF");
            tv.getFout().println("TV is OFF");
        }else {
            System.out.println("TV was OFF");
            tv.getFout().println("TV was OFF");
        }
        tv.getFout().flush();
    }
    public void change_volume_vol_add(TV tv){
        if (dynamics.getLoudness() < 100){
            dynamics.setLoudness((byte) (dynamics.getLoudness()+5));
            System.out.println("Volume: "+dynamics.getLoudness());
            tv.getFout().println("Volume: "+dynamics.getLoudness());
        }else {
            System.out.println("Volume MAX");
            tv.getFout().println("Volume MAX");
        }
        tv.getFout().flush();

    }
    public void change_volume_vol_minus(TV tv){
        if (dynamics.getLoudness() > 0){
            dynamics.setLoudness((byte) (dynamics.getLoudness()-5));
            System.out.println("Volume: "+dynamics.getLoudness());
            tv.getFout().println("Volume: "+dynamics.getLoudness());
        }else {
            System.out.println("Volume MIN");
            tv.getFout().println("Volume MIN");
        }
        tv.getFout().flush();
    }
    public void switchСhannel(TV tv) throws FileNotFoundException {
        if (channel == new TV().getChannelTV().length ) {
            channel = 0;
        }
        System.out.println("Channel: "+ new TV().getChannelTV()[channel]);
        tv.getFout().println("Channel: "+ new TV().getChannelTV()[channel]);
        tv.getFout().flush();
        channel++;

    }
    public void ChannelList(TV tv) throws FileNotFoundException {
        byte num = 1;
        System.out.println("--<List of channels>--");
        tv.getFout().println("--<List of channels>--");
        for (String el: new TV().getChannelTV()){
            System.out.println("\t"+num+". " + el);
            tv.getFout().println("\t"+num+". " + el);
            num++;
        }
        tv.getFout().flush();
    }
}
