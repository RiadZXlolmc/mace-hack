package com.example.maceclient;
import net.minecraft.client.MinecraftClient;
public class Speed extends Module {
    public double multiplier=1.35;
    public Speed(){super("Speed","Movement");}
    public void tick(MinecraftClient c){
        if(c.player==null || !c.player.isOnGround())return;
        var v=c.player.getVelocity(); if(c.player.forwardSpeed!=0 || c.player.sidewaysSpeed!=0) c.player.setVelocity(v.x*multiplier,v.y,v.z*multiplier);
    }
}
