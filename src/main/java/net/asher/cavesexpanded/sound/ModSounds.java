package net.asher.cavesexpanded.sound;

import net.asher.cavesexpanded.CavesExpanded;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;

public class ModSounds {
    public static SoundEvent SNAPDRAGON_DISC_MUSIC_DISC = registerSoundEvent("snapdragon_disc_music_disc");


    private static SoundEvent registerSoundEvent(String name) {
        Identifier id = new Identifier(CavesExpanded.MOD_ID, name);
        return Registry.register(Registries.SOUND_EVENT, id, SoundEvent.of(id));
    }
}
