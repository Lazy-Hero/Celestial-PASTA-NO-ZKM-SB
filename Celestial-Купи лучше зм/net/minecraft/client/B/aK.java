/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.b;

enum aK {
    LOCKED(0, 146),
    LOCKED_HOVER(0, 166),
    LOCKED_DISABLED(0, 186),
    UNLOCKED(20, 146),
    UNLOCKED_HOVER(20, 166),
    UNLOCKED_DISABLED(20, 186);

    private final /* synthetic */ int b;
    private final /* synthetic */ int c;

    public int b() {
        return this.b;
    }

    private aK(int n3, int n4) {
        this.b = n3;
        this.c = n4;
    }

    public int a() {
        return this.c;
    }
}

