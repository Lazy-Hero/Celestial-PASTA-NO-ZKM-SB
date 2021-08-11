/*
 * Decompiled with CFR 0.150.
 */
package net;

import net.G;
import net.minecraft.client.w.c;

public enum v {
    POS_X("tx"),
    POS_Y("ty"),
    POS_Z("tz"),
    ANGLE_X("rx"),
    ANGLE_Y("ry"),
    ANGLE_Z("rz"),
    OFFSET_X("ox"),
    OFFSET_Y("oy"),
    OFFSET_Z("oz"),
    SCALE_X("sx"),
    SCALE_Y("sy"),
    SCALE_Z("sz");

    private final /* synthetic */ String a;
    public static /* synthetic */ v[] VALUES;

    public String a() {
        return this.a;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public static v a(String string) {
        int n2 = 0;
        int[] arrn = G.c();
        while (n2 < VALUES.length) {
            v v2 = VALUES[n2];
            if (arrn == null) {
                if (v2.a().equals(string)) {
                    return v2;
                }
                ++n2;
            }
            if (arrn == null) continue;
        }
        return null;
    }

    public void a(c c10, float f10) {
        int[] arrn = G.c();
        if (arrn == null) {
            switch (this) {
                case POS_X: {
                    c10.v = f10;
                    return;
                }
                case POS_Y: {
                    c10.h = f10;
                    return;
                }
                case POS_Z: {
                    c10.u = f10;
                    return;
                }
                case ANGLE_X: {
                    c10.y = f10;
                    return;
                }
                case ANGLE_Y: {
                    c10.e = f10;
                    return;
                }
                case ANGLE_Z: {
                    c10.r = f10;
                    return;
                }
                case OFFSET_X: {
                    c10.i = f10;
                    return;
                }
                case OFFSET_Y: {
                    c10.F = f10;
                    return;
                }
                case OFFSET_Z: {
                    c10.E = f10;
                    return;
                }
                case SCALE_X: {
                    c10.m = f10;
                    return;
                }
                case SCALE_Y: {
                    c10.c = f10;
                    return;
                }
                case SCALE_Z: {
                    c10.b = f10;
                    return;
                }
            }
            fU.h("SetFloat not supported for: " + (Object)((Object)this));
        }
    }

    private v(String string2) {
        this.a = string2;
    }

    public float a(c c10) {
        int[] arrn = G.c();
        if (arrn == null) {
            switch (this) {
                case POS_X: {
                    return c10.v;
                }
                case POS_Y: {
                    return c10.h;
                }
                case POS_Z: {
                    return c10.u;
                }
                case ANGLE_X: {
                    return c10.y;
                }
                case ANGLE_Y: {
                    return c10.e;
                }
                case ANGLE_Z: {
                    return c10.r;
                }
                case OFFSET_X: {
                    return c10.i;
                }
                case OFFSET_Y: {
                    return c10.F;
                }
                case OFFSET_Z: {
                    return c10.E;
                }
                case SCALE_X: {
                    return c10.m;
                }
                case SCALE_Y: {
                    return c10.c;
                }
                case SCALE_Z: {
                    return c10.b;
                }
            }
            fU.h("GetFloat not supported for: " + (Object)((Object)this));
        }
        return 0.0f;
    }

    static {
        VALUES = v.values();
    }
}

