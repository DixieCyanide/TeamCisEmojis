package com.github.dixiecyanide;

import com.github.dixiecyanide.config.Config;

import net.fabricmc.api.ModInitializer;

import me.shedaniel.autoconfig.AutoConfig;
import me.shedaniel.autoconfig.serializer.Toml4jConfigSerializer;

public class TeamCISEmojisClient implements ModInitializer {
	public static Config CONFIG;

	@Override
	public void onInitialize() {
		AutoConfig.register(Config.class, Toml4jConfigSerializer::new);
        CONFIG = AutoConfig.getConfigHolder(Config.class).getConfig();
	}
}