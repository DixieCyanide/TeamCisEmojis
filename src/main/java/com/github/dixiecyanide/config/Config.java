package com.github.dixiecyanide.config;

import java.util.Map;

import me.shedaniel.autoconfig.ConfigData;

@me.shedaniel.autoconfig.annotation.Config(name = "TeamCISEmojis")
public class Config implements ConfigData {
	public Map<String, String> emojiMap = Map.of();
}