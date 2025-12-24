package StructureDesign.Mediator.ChatRoom;

import java.util.ArrayList;
import java.util.List;

public class Mediator implements Imediator{

    private List<Icollegaue> icollegauelist;
    private List<Pair<String , String>>mutes;

    public Mediator() {
       icollegauelist = new ArrayList<>();
       mutes = new ArrayList<>();
    }


    public void mute(String who , String whom){
        mutes.add(new Pair<>(whom,who));
    }

    @Override
    public void sendMessageToAll(String from, String message) {
        System.out.println("[" + from + " broadcasts]: " + message);
        for(Icollegaue icollegaue:icollegauelist){
            if(icollegaue.getName().equals(from)){
                continue;
            }
            boolean isMuted = false;

            for(Pair<String , String>mute:mutes){
                if (from.equals(mute.second) && icollegaue.getName().equals(mute.first)){
                    isMuted = true;
                    break;
                }
            }
            if(!isMuted){
                icollegaue.receiveMessage(from,message);
            }
        }
    }

    @Override
    public void sendMessageToPrivate(String from, String to, String message) {
        System.out.println("[" + from + "→" + to + "]: " + message);
        for (Icollegaue c : icollegauelist) {
            if (c.getName().equals(to)) {
                for (Pair<String, String> p : mutes) {
                    //Dont send if muted
                    if (from.equals(p.second) && to.equals(p.first)) {
                        System.out.println("\n[Message is muted]\n");
                        return;
                    }
                }
                c.receiveMessage(from, message);
                return;
            }
        }
        System.out.println("[Mediator] User \"" + to + "\" not found]");
    }

    @Override
    public void registerColleague(Icollegaue colleague) {
      icollegauelist.add(colleague);
    }
}
