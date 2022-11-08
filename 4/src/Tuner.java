import java.io.File;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;


public class Tuner implements TvTuner {
    private byte loudness = 90;
    private PrintWriter fout = new PrintWriter(new FileOutputStream(
            new File("MyTvTuner.txt"),
            true));
    private boolean switchTuner = false;
    private byte channel = 0;
    private String[] channelTuner = new String[]{"QTV", "NLO TV", "M1", "K1", "ICTV", "TET", "UATV"};



    public Tuner() throws FileNotFoundException {
    }
    public PrintWriter getFout() {
        return fout;
    }


    public String[] getChannelTuner() {
        return channelTuner;
    }



    @Override
    public void include() {
        if (!switchTuner) {
            switchTuner = true;
            System.out.println("Tuner is ON");
           getFout().println("Tuner is ON");
        } else {
            System.out.println("Tuner was ON");
            getFout().println("Tuner was ON");
        }
        getFout().flush();
    }

    @Override
    public void exclude() {
        if (switchTuner) {
            switchTuner = false;
            System.out.println("Tuner is OFF");
            getFout().println("Tuner is OFF");

        } else {
            System.out.println("Tuner was OFF");
            getFout().println("Tuner was OFF");
        }
        getFout().flush();
    }

    @Override
    public void change_volume_vol_add() {

        if(loudness<=100){
            System.out.println("Volume is: "+(++loudness) );
            getFout().println("Volume is: "+(loudness));
        }else{
            System.out.println("Volume is MAX");
            getFout().println("Volume is MAX");
        }
        getFout().flush();
    }

    @Override
    public void change_volume_vol_minus() {

        if(loudness>=0){
            System.out.println("Volume: "+(--loudness) );
            getFout().println("Volume: "+(loudness));
        }else{
            System.out.println("Volume is MIN");
            getFout().println("Volume is MIN");
        }
        getFout().flush();
    }




    public void switchСhannel() throws FileNotFoundException {
        if (channel == new Tuner().getChannelTuner().length) {
            channel = 0;
        }
        System.out.println("channel: "+ new Tuner().getChannelTuner()[channel]);
        getFout().println("channel: "+ new Tuner().getChannelTuner()[channel]);
        channel++;
        getFout().flush();
    }

    public void ChannelList() throws FileNotFoundException {
        byte num = 1;
        System.out.println("--<list of channels>--");
        for (String el: new Tuner().getChannelTuner()){
            System.out.println("\t"+num+". " + el);
            getFout().println("\t"+num+". " + el);
            num++;
        }
        getFout().flush();

    }


}

