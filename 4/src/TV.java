import java.io.File;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class TV implements TvTuner {
    private byte loudness = 50;
    private PrintWriter fout = new PrintWriter(new FileOutputStream(
            new File("MyTvTuner.txt"),
            true));

    private boolean switchTV = false;
    private byte channel = 0;

    public TV() throws FileNotFoundException {
    }

    public PrintWriter getFout(){
        return fout;
    }


    @Override
    public void include() {
        if (!switchTV){
            switchTV = true;
            System.out.println("TV is ON");
            getFout().println("TV is ON");
        }else {
            System.out.println("TV was ON");
            getFout().println("TV was ON");
        }
        getFout().flush();
    }

    @Override
    public void exclude() {
        if (switchTV){
            switchTV = false;
            System.out.println("TV is OFF");
            getFout().println("TV is OFF");

        }else {
            System.out.println("TV was OFF");
            getFout().println("TV was OFF");

        }
        getFout().flush();

    }


    @Override
    public void change_volume_vol_add() {
        if(loudness<=100){
            System.out.println("Volume: "+(++loudness) );
            getFout().println("Volume: "+(loudness));
        }else{
            System.out.println("Volume MAX");
            getFout().println("Volume MAX");
        }
        getFout().flush();
        
    }

    @Override
    public void change_volume_vol_minus() {
        if(loudness>=0){
            System.out.println("Volume: "+(--loudness));
            getFout().println("Volume: "+(loudness));
        }else{
            System.out.println("Volume MIN");
            getFout().println("Volume MIN");
        }
        getFout().flush();
    }

}
