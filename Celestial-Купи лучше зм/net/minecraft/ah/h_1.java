/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  javax.annotation.concurrent.Immutable
 */
package net.minecraft.ah;

import javax.annotation.concurrent.Immutable;
import net.minecraft.ah.e;
import net.minecraft.ah.z;

@Immutable
public class h {
    private final /* synthetic */ e a;
    private final /* synthetic */ float b;

    private static gP a(gP gP2) {
        return gP2;
    }

    public float a() {
        return this.b;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public float b() {
        float f10;
        float f11;
        block6: {
            float f12;
            block5: {
                String string = z.I();
                float f13 = this.b - 2.0f;
                f12 = f13 == 0.0f ? 0 : (f13 < 0.0f ? -1 : 1);
                if (string == null) break block5;
                if (f12 < 0) {
                    return 0.0f;
                }
                f11 = this.b;
                f10 = 4.0f;
                if (string == null) break block6;
                float f14 = f11 - f10;
                f12 = f14 == 0.0f ? 0 : (f14 > 0.0f ? 1 : -1);
            }
            if (f12 > 0) {
                return 1.0f;
            }
            f11 = this.b - 2.0f;
            f10 = 2.0f;
        }
        float f15 = f11 / f10;
        return f15;
    }

    public h(e e10, long l2, long l3, float f10) {
        this.a = e10;
        this.b = this.a(e10, l2, l3, f10);
    }

    private float a(e e10, long l2, long l3, float f10) {
        String string = z.I();
        e e11 = e10;
        e e12 = e.PEACEFUL;
        if (string != null) {
            if (e11 == e12) {
                return 0.0f;
            }
            e11 = e10;
            e12 = e.HARD;
        }
        boolean bl2 = e11 == e12;
        float f11 = 0.75f;
        float f12 = net.minecraft.k.h.c(((float)l2 + -72000.0f) / 1440000.0f, 0.0f, 1.0f) * 0.25f;
        f11 += f12;
        float f13 = 0.0f;
        float f14 = (float)l3 / 3600000.0f;
        float f15 = 0.0f;
        if (string != null) {
            f14 = net.minecraft.k.h.c(f14, f15, 1.0f);
            f15 = bl2 ? 1.0f : 0.75f;
        }
        f13 += f14 * f15;
        f13 += net.minecraft.k.h.c(f10 * 0.25f, 0.0f, f12);
        e e13 = e10;
        if (string != null) {
            if (e13 == e.EASY) {
                f13 *= 0.5f;
            }
            f11 += f13;
            e13 = e10;
        }
        return (float)e13.a() * f11;
    }

    public boolean a(float f10) {
        String string = z.I();
        float f11 = this.b - f10;
        float f12 = f11 == 0.0f ? 0 : (f11 > 0.0f ? 1 : -1);
        if (string != null) {
            f12 = f12 > 0 ? 1.0f : 0.0f;
        }
        return (boolean)f12;
    }
}

