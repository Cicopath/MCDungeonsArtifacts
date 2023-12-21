/*
package chronosacaria.mcdar.artifacts;

import chronosacaria.mcdar.Mcdar;
import chronosacaria.mcdar.api.AbilityHelper;
import chronosacaria.mcdar.api.CleanlinessHelper;
import chronosacaria.mcdar.api.EnchantmentHelper;
import chronosacaria.mcdar.enums.DefensiveArtifactID;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;

import java.util.List;

public class SatchelOfElixirsItem extends ArtifactDefensiveItem{
    public SatchelOfElixirsItem() {
        super(
                DefensiveArtifactID.SATCHEL_OF_ELIXIRS,
                Mcdar.CONFIG.mcdarArtifactsStatsConfig.DEFENSIVE_ARTIFACT_STATS
                        .get(DefensiveArtifactID.SATCHEL_OF_ELIXIRS).mcdar$getDurability()
        );
    }

    public TypedActionResult<ItemStack> use (World world, PlayerEntity user, Hand hand){
        ItemStack itemStack = user.getStackInHand(hand);
        ItemStack potionToDrop =
                AbilityHelper.SATCHEL_OF_ELIXIRS_LIST.get(user.getRandom().nextInt(AbilityHelper.SATCHEL_OF_ELIXIRS_LIST.size()));

        CleanlinessHelper.mcdar$dropItem(user, potionToDrop);

        if (!user.isCreative())
            itemStack.damage(1, user, (entity) -> entity.sendToolBreakStatus(hand));

        EnchantmentHelper.mcdar$cooldownHelper(
                user,
                this,
                Mcdar.CONFIG.mcdarArtifactsStatsConfig.DEFENSIVE_ARTIFACT_STATS
                        .get(DefensiveArtifactID.SATCHEL_OF_ELIXIRS)
                        .mcdar$getMaxCooldownEnchantmentTime()
        );

        return new TypedActionResult<>(ActionResult.SUCCESS, itemStack);
    }

    @Override
    public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext tooltipContext){
        CleanlinessHelper.createLoreTTips(stack, tooltip);
    }
}

 */
