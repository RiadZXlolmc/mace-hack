package com.example.maceclient;
import net.minecraft.client.MinecraftClient;
public class ESP extends Module {
    public ESP(){super("ESP","Render");}
    public void tick(MinecraftClient c){ }
    // Rendering hook can be added with WorldRenderEvents; this module is intentionally kept API-light for 1.21.11.
}
