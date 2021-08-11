/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.ar;

public enum R {
    POSITIVE(1, "Towards positive"),
    NEGATIVE(-1, "Towards negative");

    private final /* synthetic */ int a;
    private final /* synthetic */ String b;

    private R(int n3, String string2) {
        this.a = n3;
        this.b = string2;
    }

    public String toString() {
        return this.b;
    }

    public int a() {
        return this.a;
    }
}

