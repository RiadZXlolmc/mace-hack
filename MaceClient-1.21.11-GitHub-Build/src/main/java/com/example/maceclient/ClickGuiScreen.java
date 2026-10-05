package com.example.maceclient;

import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.widget.ButtonWidget;
import net.minecraft.text.Text;

public class ClickGuiScreen extends Screen {
    public ClickGuiScreen() {
        super(Text.literal("Mace Client"));
    }

    @Override
    protected void init() {
        super.init();

        int x = width / 2 - 120;
        int y = 45;
        int i = 0;

        for (Module m : MaceClient.MODULES.modules) {
            int yy = y + i * 32;
            addDrawableChild(ButtonWidget.builder(
                    Text.literal(m.name + "  [" + (m.enabled ? "ON" : "OFF") + "]"),
                    b -> {
                        m.toggle();
                        b.setMessage(Text.literal(m.name + "  [" + (m.enabled ? "ON" : "OFF") + "]"));
                    })
                    .dimensions(x, yy, 240, 24)
                    .build());
            i++;
        }
    }

    @Override
    public void render(DrawContext d, int mx, int my, float delta) {
        renderBackground(d, mx, my, delta);

        // DIAGNOSTIC: Red rectangle and test text - if this appears, render() is firing
        d.fill(50, 50, 250, 150, 0xFFFF0000);
        d.drawCenteredTextWithShadow(textRenderer, Text.literal("MACE TEST"), width / 2, 60, 0xFFFFFFFF);

        super.render(d, mx, my, delta);

        d.drawCenteredTextWithShadow(textRenderer, Text.literal("MACE CLIENT"), width / 2, 18, 0xFFFFFFFF);
        d.drawCenteredTextWithShadow(textRenderer, Text.literal("Fabric 1.21.11  •  Right Shift"), width / 2, 32, 0xFFAAAAAA);
    }

    @Override
    public boolean shouldPause() {
        return false;
    }
}
