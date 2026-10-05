package com.example.maceclient;
import net.minecraft.client.MinecraftClient;
import net.minecraft.entity.player.PlayerEntity;
public class Tracker extends Module {
    public Tracker(){super("Tracker","Render");}
    public void tick(MinecraftClient c){
        if(c.player==null || c.world==null)return;
        PlayerEntity best=null; double d=Double.MAX_VALUE;
        for(PlayerEntity p:c.world.getPlayers()) if(p!=c.player){double x=p.squaredDistanceTo(c.player);if(x<d){d=x;best=p;}}
        if(best!=null && c.player.age%20==0) MaceClient.msg("Nearest: "+best.getName().getString()+" ("+(int)Math.sqrt(d)+"m)");
    }
}
