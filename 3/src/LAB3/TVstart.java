package LAB3;

import java.io.FileNotFoundException;

public class TVstart {

	public static void main(String[] args) throws FileNotFoundException  {
		boolean ss = true;
        System.out.println(!ss);
        TV tv = new TV(TV.Type.OLED,"LG");
        tv.getRemoteControl().excludeTV(tv);
        tv.getRemoteControl().ChannelList(tv);
        tv.getModelAndTypeOfTV();
        tv.getRemoteControl().change_volume_vol_add(tv);
        tv.getRemoteControl().change_volume_vol_minus(tv);
        tv.getRemoteControl().change_volume_vol_minus(tv);
        tv.getRemoteControl().change_volume_vol_minus(tv);
        tv.getRemoteControl().switchСhannel(tv);
        tv.getRemoteControl().switchСhannel(tv);
        tv.getRemoteControl().switchСhannel(tv);
        TV tv2 = new TV(TV.Type.PDP,"AEG");
        tv2.getInfoAboutTV();
        tv2.getChannelTV();
        tv2.getModel();
        tv2.getModelAndTypeOfTV();
        tv.getRemoteControl().change_volume_vol_minus(tv);
        tv.getRemoteControl().change_volume_vol_minus(tv);
        tv.getRemoteControl().change_volume_vol_minus(tv);
        tv.getRemoteControl().change_volume_vol_minus(tv);
        tv.getRemoteControl().change_volume_vol_minus(tv);
        tv.getRemoteControl().change_volume_vol_minus(tv);
        

	}

}
