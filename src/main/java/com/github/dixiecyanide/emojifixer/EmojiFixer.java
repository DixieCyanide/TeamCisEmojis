package com.github.dixiecyanide.emojifixer;

import java.util.Map;

import static com.github.dixiecyanide.TeamCISEmojisClient.CONFIG;

public class EmojiFixer {
    public static String replace(String JSON) {
        Map<String, String> replaceMap = Map.copyOf(CONFIG.emojiMap);

        for (Map.Entry<String, String> entry : replaceMap.entrySet()) {
            String emojiName = ":" + entry.getKey() + ":";
            String emojiUnicode = entry.getValue();
            JSON = JSON.replace(emojiName, emojiUnicode);
        }
        return JSON;
    }
}
