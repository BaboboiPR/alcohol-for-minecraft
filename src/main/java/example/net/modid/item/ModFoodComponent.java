package example.net.modid.item;

import net.minecraft.component.type.FoodComponent;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;

public class ModFoodComponent {
    public static final FoodComponent PLUM_BRANDY = new FoodComponent.Builder()
            .nutrition(3000)
            .saturationModifier(1000.25f)
            .alwaysEdible()
            .statusEffect(new StatusEffectInstance(StatusEffects.LUCK,10000 ,3 ),1f)
            .statusEffect(new StatusEffectInstance(StatusEffects.HEALTH_BOOST,10000 ,3 ),1f)
            .statusEffect(new StatusEffectInstance(StatusEffects.NAUSEA,10000 ,255 ),1f).build();
}
