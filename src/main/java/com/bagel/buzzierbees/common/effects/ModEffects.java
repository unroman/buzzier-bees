package com.bagel.buzzierbees.common.effects;

import net.minecraft.potion.Effect;
import net.minecraft.potion.EffectType;
import net.minecraft.potion.Effects;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ForgeRegistries;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEffects {
    public static Effect ANTI_SPEED;
    public static Effect ANTI_SLOWNESS;
    public static Effect ANTI_HASTE;
    public static Effect ANTI_MINING_FATIGUE;
    public static Effect ANTI_STRENGTH;
    public static Effect ANTI_JUMP_BOOST;
    public static Effect ANTI_NAUSEA;
    public static Effect ANTI_REGENERATION;
    public static Effect ANTI_RESISTANCE;
    public static Effect ANTI_FIRE_RESISTANCE;
    public static Effect ANTI_WATER_BREATHING;
    public static Effect ANTI_INVISIBILITY;
    public static Effect ANTI_BLINDNESS;
    public static Effect ANTI_NIGHT_VISION;
    public static Effect ANTI_HUNGER;
    public static Effect ANTI_WEAKNESS;
    public static Effect ANTI_POISON;
    public static Effect ANTI_WITHER;
    public static Effect ANTI_HEALTH_BOOST;
    public static Effect ANTI_ABSORPTION;
    public static Effect ANTI_SATURATION;
    public static Effect ANTI_GLOWING;
    public static Effect ANTI_LEVITATION;
    public static Effect ANTI_LUCK;
    public static Effect ANTI_UNLUCK;
    public static Effect ANTI_SLOW_FALLING;
    public static Effect ANTI_BAD_OMEN;

    @SubscribeEvent
    public static void registerEffects(RegistryEvent.Register<Effect> event)
    {
        ANTI_SPEED = registerEffect(new AntiEffect(Effects.SPEED, EffectType.HARMFUL, 0), "anti_speed");
        ANTI_SLOWNESS = registerEffect(new AntiEffect(Effects.SLOWNESS, EffectType.BENEFICIAL, 0), "anti_slowness");
        ANTI_HASTE = registerEffect(new AntiEffect(Effects.HASTE, EffectType.HARMFUL, 0), "anti_haste");
        ANTI_MINING_FATIGUE = registerEffect(new AntiEffect(Effects.MINING_FATIGUE, EffectType.BENEFICIAL, 0), "anti_mining_fatigue");
        ANTI_STRENGTH = registerEffect(new AntiEffect(Effects.STRENGTH, EffectType.HARMFUL, 0), "anti_strength");
        ANTI_JUMP_BOOST = registerEffect(new AntiEffect(Effects.JUMP_BOOST, EffectType.HARMFUL, 0), "anti_jump_boost");
        ANTI_NAUSEA = registerEffect(new AntiEffect(Effects.NAUSEA, EffectType.BENEFICIAL, 0), "anti_nausea");
        ANTI_REGENERATION = registerEffect(new AntiEffect(Effects.REGENERATION, EffectType.HARMFUL, 0), "anti_regeneration");
        ANTI_RESISTANCE = registerEffect(new AntiEffect(Effects.RESISTANCE, EffectType.HARMFUL, 0), "anti_resistance");
        ANTI_FIRE_RESISTANCE = registerEffect(new AntiEffect(Effects.FIRE_RESISTANCE, EffectType.HARMFUL, 0), "anti_fire_resistance");
        ANTI_WATER_BREATHING = registerEffect(new AntiEffect(Effects.WATER_BREATHING, EffectType.HARMFUL, 0), "anti_water_breathing");
        ANTI_INVISIBILITY = registerEffect(new AntiEffect(Effects.INVISIBILITY, EffectType.HARMFUL, 0), "anti_invisibility");
        ANTI_BLINDNESS = registerEffect(new AntiEffect(Effects.BLINDNESS, EffectType.BENEFICIAL, 0), "anti_blindness");
        ANTI_NIGHT_VISION = registerEffect(new AntiEffect(Effects.NIGHT_VISION, EffectType.HARMFUL, 0), "anti_night_vision");
        ANTI_HUNGER = registerEffect(new AntiEffect(Effects.HUNGER, EffectType.BENEFICIAL, 0), "anti_hunger");
        ANTI_WEAKNESS = registerEffect(new AntiEffect(Effects.WEAKNESS, EffectType.BENEFICIAL, 0), "anti_weakness");
        ANTI_POISON = registerEffect(new AntiEffect(Effects.POISON, EffectType.BENEFICIAL, 0), "anti_poison");
        ANTI_WITHER = registerEffect(new AntiEffect(Effects.WITHER, EffectType.BENEFICIAL, 0), "anti_wither");
        ANTI_HEALTH_BOOST = registerEffect(new AntiEffect(Effects.HEALTH_BOOST, EffectType.HARMFUL, 0), "anti_health_boost");
        ANTI_ABSORPTION = registerEffect(new AntiEffect(Effects.ABSORPTION, EffectType.HARMFUL, 0), "anti_absorption");
        ANTI_SATURATION = registerEffect(new AntiEffect(Effects.SATURATION, EffectType.HARMFUL, 0), "anti_saturation");
        ANTI_GLOWING = registerEffect(new AntiEffect(Effects.GLOWING, EffectType.HARMFUL, 0), "anti_glowing");
        ANTI_LEVITATION = registerEffect(new AntiEffect(Effects.LEVITATION, EffectType.BENEFICIAL, 0), "anti_levitation");
        ANTI_LUCK = registerEffect(new AntiEffect(Effects.LUCK, EffectType.HARMFUL, 0), "anti_luck");
        ANTI_UNLUCK = registerEffect(new AntiEffect(Effects.UNLUCK, EffectType.BENEFICIAL, 0), "anti_unluck");
        ANTI_SLOW_FALLING = registerEffect(new AntiEffect(Effects.SLOW_FALLING, EffectType.HARMFUL, 0), "anti_slow_falling");
        ANTI_BAD_OMEN = registerEffect(new AntiEffect(Effects.BAD_OMEN, EffectType.BENEFICIAL, 0), "anti_bad_omen");
    }

    public static Effect registerEffect(Effect effect, String name)
    {
        effect.setRegistryName(name);
        ForgeRegistries.POTIONS.register(effect);
        return effect;
    }
}
