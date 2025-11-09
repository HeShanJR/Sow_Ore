package name.heshanjr.sow_ore.block;

import name.heshanjr.sow_ore.item.ModItems;
import net.minecraft.block.CropBlock;
import net.minecraft.item.ItemConvertible;
import net.minecraft.world.World;

public class GoldCropBlock extends CropBlock {
    public GoldCropBlock(Settings settings) {
        super(settings);
    }

    @Override
    protected ItemConvertible getSeedsItem() {
        return ModItems.GOLD_SEEDS;
    }

    @Override
    public int getMaxAge() {
        return 7; // 与小麦相同的生长阶段
    }

    @Override
    protected int getGrowthAmount(World world) {
        return super.getGrowthAmount(world) / 2; // 使生长速度比小麦慢
    }
}