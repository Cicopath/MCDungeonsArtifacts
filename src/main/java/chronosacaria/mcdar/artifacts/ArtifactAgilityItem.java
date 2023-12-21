package chronosacaria.mcdar.artifacts;

import chronosacaria.mcdar.enums.AgilityArtifactID;
import chronosacaria.mcdar.registries.ItemGroupRegistry;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Rarity;

public class ArtifactAgilityItem extends Item {

    public final AgilityArtifactID id;

    public ArtifactAgilityItem(AgilityArtifactID id, int artifactDurability) {
        super(new Settings().maxCount(1).maxDamage(artifactDurability));
        this.id = id;
        ItemGroupEvents.modifyEntriesEvent(ItemGroupRegistry.ARTIFACTS).register(entries -> entries.add(this.getDefaultStack()));
    }

    public Rarity getRarity(ItemStack stack) {
        return Rarity.RARE;
    }
}
