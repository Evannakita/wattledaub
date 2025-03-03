package evannakita.wattledaub.enums;

import net.minecraft.util.StringIdentifiable;

public enum DaubType implements StringIdentifiable {
    CLAY("clay"),
    COARSE_CLAY("coarse_clay"),
    MUD("mud"),
    PACKED_MUD("packed_mud"),
    SAND("sand");

    private final String name;

    private DaubType(String name) {
        this.name = name;
    }

    @Override
    public String asString() {
        return this.name;
    }
}
