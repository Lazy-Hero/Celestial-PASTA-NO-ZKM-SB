/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.w;

import net.minecraft.at.l;

public enum h {
    COMMON(l.WHITE, "Common"),
    UNCOMMON(l.YELLOW, "Uncommon"),
    RARE(l.AQUA, "Rare"),
    EPIC(l.LIGHT_PURPLE, "Epic");

    public final /* synthetic */ l rarityColor;
    public final /* synthetic */ String rarityName;

    private h(l l2, String string2) {
        this.rarityColor = l2;
        this.rarityName = string2;
    }
}

