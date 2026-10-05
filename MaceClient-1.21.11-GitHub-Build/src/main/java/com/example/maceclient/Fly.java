package com.example.maceclient;
import net.minecraft.client.MinecraftClient;
public class Fly extends Module {
    public double speed=0.6;
    public Fly(){super("Fly","Movement");}
    public void tick(MinecraftClient c){
        if(c.player==null)return;
        c.player.setNoGravity(true);
        double y=0; if(c.options.jumpKey.isPressed())y+=speed; if(c.options.sneakKey.isPressed())y-=speed;
        var v=c.player.getVelocity(); c.player.setVelocity(v.x,y,v.z);
    }
}
