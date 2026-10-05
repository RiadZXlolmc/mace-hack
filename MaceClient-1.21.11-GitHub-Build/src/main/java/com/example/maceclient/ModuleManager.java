package com.example.maceclient;
import java.util.*;
import net.minecraft.client.MinecraftClient;
public class ModuleManager {
    public final List<Module> modules = new ArrayList<>();
    public final MaceDamage maceDamage = new MaceDamage();
    public ModuleManager(){
        modules.add(new ClickTP()); modules.add(maceDamage); modules.add(new Fly());
        modules.add(new BoatFly()); modules.add(new Tracker()); modules.add(new ESP());
        modules.add(new Speed()); modules.add(new Reach());
    }
    public void tick(MinecraftClient c){for(Module m:modules) if(m.enabled)m.tick(c);}
}
