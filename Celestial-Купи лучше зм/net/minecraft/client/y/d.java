/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.y;

public enum d {
    POSITION("Position"),
    NORMAL("Normal"),
    COLOR("Vertex Color"),
    UV("UV"),
    MATRIX("Bone Matrix"),
    BLEND_WEIGHT("Blend Weight"),
    PADDING("Padding");

    private final /* synthetic */ String b;

    public String a() {
        return this.b;
    }

    private d(String string2) {
        this.b = string2;
    }
}

