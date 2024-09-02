package greg;

import arc.*;
import arc.util.*;
import mindustry.game.EventType.*;
import mindustry.mod.*;
import greg.contents.*;

public class greg extends Mod{

    public greg(){
        Log.info("IM GREGGING");

        Events.on(ClientLoadEvent.class, e -> {
            
        });
    }

    @Override
    public void loadContent(){
        Log.info("IM BOUT TA GREG");
        GregItems.load();
        GregLiquids.load();
        GregLoader.load();
        GregSectors.load();
        GregTechtree.load();
    }

}