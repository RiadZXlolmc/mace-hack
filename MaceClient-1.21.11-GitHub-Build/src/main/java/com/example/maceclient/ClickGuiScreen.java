package com.example.maceclient;

import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.widget.ButtonWidget;
import net.minecraft.text.Text;

public class ClickGuiScreen extends Screen {
    public ClickGuiScreen(){super(Text.literal("Mace Client"));}
    protected void init(){
        int x=width/2-120,y=45;
        int i=0;
        for(Module m:MaceClient.MODULES.modules){
            int yy=y+i*32;
            addDrawableChild(ButtonWidget.builder(Text.literal(m.name+"  ["+(m.enabled?"ON":"OFF")+"]"), b->{m.toggle();b.setMessage(Text.literal(m.name+"  ["+(m.enabled?"ON":"OFF")+"]"));})
                    .dimensions(x,yy,240,24).build());
            i++;
        }
    }
    public void render(DrawContext d,int mx,int my,float delta){
        renderBackground(d);
        d.drawCenteredTextWithShadow(textRenderer,Text.literal("MACE CLIENT"),width/2,18,0xFFFFFF);
        d.drawCenteredTextWithShadow(textRenderer,Text.literal("Fabric 1.21.11  •  Right Shift"),width/2,32,0xAAAAAA);
        super.render(d,mx,my,delta);
    }
    public boolean shouldPause(){return false;}
}
