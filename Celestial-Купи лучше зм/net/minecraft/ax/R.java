/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.ax;

public enum R {
    ALL("all", 1, 11, 20),
    FIRE("fire", 10, 8, 12),
    FALL("fall", 5, 6, 10),
    EXPLOSION("explosion", 5, 8, 12),
    PROJECTILE("projectile", 3, 6, 15);

    private final /* synthetic */ int a;
    private final /* synthetic */ int c;
    private final /* synthetic */ String d;
    private final /* synthetic */ int b;

    public int c() {
        return this.c;
    }

    private R(String string2, int n3, int n4, int n5) {
        this.d = string2;
        this.c = n3;
        this.a = n4;
        this.b = n5;
    }

    public int a() {
        return this.a;
    }

    public String b() {
        return this.d;
    }
}

