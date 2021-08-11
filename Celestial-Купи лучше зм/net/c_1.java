/*
 * Decompiled with CFR 0.150.
 */
package net;

import net.G;
import net.minecraft.client.Q;
import net.minecraft.client.r.a4;
import net.minecraft.client.r.b;
import net.minecraft.client.r.s;
import net.r;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public enum c implements r
{
    LIMB_SWING("limb_swing"),
    LIMB_SWING_SPEED("limb_speed"),
    AGE("age"),
    HEAD_YAW("head_yaw"),
    HEAD_PITCH("head_pitch"),
    SCALE("scale");

    private static final /* synthetic */ c[] d;
    private final /* synthetic */ a4 b;
    private final /* synthetic */ String a;

    static {
        d = net.c.values();
    }

    @Override
    public float a() {
        block14: {
            b b10;
            block13: {
                b b11 = this.b.o;
                int[] arrn = G.c();
                b10 = b11;
                if (arrn == null) {
                    if (b10 == null) {
                        return 0.0f;
                    }
                    b10 = b11;
                }
                if (arrn != null) break block13;
                if (!(b10 instanceof s)) break block14;
                b10 = b11;
            }
            s s2 = (s)b10;
            switch (this) {
                case LIMB_SWING: {
                    return s2.p;
                }
                case LIMB_SWING_SPEED: {
                    return s2.v;
                }
                case AGE: {
                    return s2.r;
                }
                case HEAD_YAW: {
                    return s2.k;
                }
                case HEAD_PITCH: {
                    return s2.w;
                }
                case SCALE: {
                    return s2.l;
                }
            }
        }
        return 0.0f;
    }

    public static c a(String string) {
        int[] arrn = G.c();
        if (string == null) {
            return null;
        }
        int n2 = 0;
        while (n2 < d.length) {
            c c10 = d[n2];
            if (arrn == null) {
                if (c10.a().equals(string)) {
                    return c10;
                }
                ++n2;
            }
            if (arrn == null) continue;
        }
        return null;
    }

    public String a() {
        return this.a;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    private c(String string2) {
        this.a = string2;
        this.b = Q.P().aQ();
    }
}

