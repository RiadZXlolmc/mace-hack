package com.example.maceclient;
import net.minecraft.client.MinecraftClient;
public abstract class Module {
    public final String name, category;
    public boolean enabled;
    protected Module(String n, String c){name=n;category=c;}
    public void toggle(){enabled=!enabled; MaceClient.msg(name+" "+(enabled?"ON":"OFF"));}
    public void tick(MinecraftClient c){}
}
