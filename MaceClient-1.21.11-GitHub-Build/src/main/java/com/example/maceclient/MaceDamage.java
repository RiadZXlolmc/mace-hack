package com.example.maceclient;
import net.minecraft.client.MinecraftClient;
public class MaceDamage extends Module {
    public double virtualHeight=100.0;
    public MaceDamage(){super("MaceDamage","Combat");}
    public void tick(MinecraftClient c){
        // Client-side fall simulation for testing. Remote servers remain authoritative.
        if(c.player!=null && c.player.getMainHandStack().getItem().toString().toLowerCase().contains("mace") && c.player.fallDistance>2){
            c.player.fallDistance=(float)Math.max(c.player.fallDistance, virtualHeight);
        }
    }
}
