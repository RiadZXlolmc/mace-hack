package com.example.maceclient;
import net.minecraft.client.MinecraftClient;
public class BoatFly extends Module {
    public BoatFly(){super("BoatFly","Movement");}
    public void tick(MinecraftClient c){ if(c.player!=null && c.player.hasVehicle()) c.player.getVehicle().setNoGravity(true); }
}
