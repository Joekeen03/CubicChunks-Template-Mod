package com.authorname.modid.core.mixins;

import com.authorname.modid.MainModClass;
import net.minecraft.client.gui.GuiMainMenu;
import net.minecraft.client.gui.GuiScreen;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(GuiMainMenu.class)
public class Mixin_GuiMainMenu extends GuiScreen {
    @Inject(method="initGui", at=@At("HEAD"))
    public void testMixin(CallbackInfo ci) {
        MainModClass.info("Hello from GuiMainMenu.initGui");
    }
}
