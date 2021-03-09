package net.actuallyasmartname.x2Craft_Fabric.item;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ToolMaterial;

public class PickaxeBase extends PickaxeItem{

    public PickaxeBase(ToolMaterial material) {
        super(material, -1, -2, new Item.Settings().group(ItemGroup.TOOLS));
    }
    
}
