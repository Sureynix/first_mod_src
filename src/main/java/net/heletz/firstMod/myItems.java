package net.heletz.firstMod;

import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by Sureynix on 1/15/17.
 */
public final class myItems extends Item {
    public static Item first_item;
    public static void createItems() {
        GameRegistry.register(first_item = new BasicItem("first_item"));

    }

}
