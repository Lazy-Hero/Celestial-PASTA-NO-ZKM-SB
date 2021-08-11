/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.aw;

import net.minecraft.aw.w;
import net.minecraft.k.h;

public enum C {
    PLAYER(false),
    FRAME(true),
    RED_MARKER(false),
    BLUE_MARKER(false),
    TARGET_X(true),
    TARGET_POINT(true),
    PLAYER_OFF_MAP(false),
    PLAYER_OFF_LIMITS(false),
    MANSION(true, 5393476),
    MONUMENT(true, 3830373);

    private final /* synthetic */ byte c;
    private final /* synthetic */ boolean d;
    private final /* synthetic */ int b;

    public static C a(byte by2) {
        return C.values()[h.c(by2, 0, C.values().length - 1)];
    }

    public boolean d() {
        return this.d;
    }

    public boolean a() {
        String[] arrstring = w.d();
        boolean bl2 = this.b;
        if (arrstring != null) {
            bl2 = bl2 >= false;
        }
        return bl2;
    }

    private C(boolean bl2) {
        this(bl2, -1);
    }

    private C(boolean bl2, int n3) {
        this.c = (byte)this.ordinal();
        this.d = bl2;
        this.b = n3;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public int b() {
        return this.b;
    }

    public byte c() {
        return this.c;
    }
}

