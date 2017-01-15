package net.heletz.firstMod.client.render.items;

import net.heletz.firstMod.Main;
import net.heletz.firstMod.myItems;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;

/**
 * Created by Sureynix on 1/15/17.
 */
public class ItemRenderRegister {
    public static void registerItemRenderer () {
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(
                myItems.first_item,
                0,
                new ModelResourceLocation(
                        Main.modID + ":" + "first_item",
                        "inventory"));
    }
}
