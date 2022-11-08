import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.lang.NullPointerException;

public class Start {
    public static void main(String[] args) throws FileNotFoundException {
       TV tv = new TV();
       Tuner tuner = new Tuner();
       tuner.include();
       tuner.change_volume_vol_minus();
       tuner.change_volume_vol_minus();
       tuner.change_volume_vol_add();
       tuner.getChannelTuner();
       tuner.ChannelList();
       tv.change_volume_vol_minus();
       tv.change_volume_vol_minus();
       tv.change_volume_vol_add();
       tv.include();
    }
}
