package evannakita.wattledaub.enums;

import net.minecraft.util.StringIdentifiable;

public enum DaubLevel implements StringIdentifiable {
    SCATTERED_DAUB("scattered_daub"),
    COVERED_DAUB("covered_daub"),
    DAUB("daub");

    private final String name;

    private DaubLevel(String name) {
        this.name = name;
    }

    @Override
    public String asString() {
        return this.name;
    }
}
