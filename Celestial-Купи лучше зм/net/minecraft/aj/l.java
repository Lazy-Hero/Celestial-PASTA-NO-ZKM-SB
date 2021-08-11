/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.aj;

import java.util.Random;
import net.minecraft.aj.j;
import net.minecraft.k.h;
import net.minecraft.k.m;

public class l {
    private final /* synthetic */ float a;
    private final /* synthetic */ float b;

    static float b(l l2) {
        return l2.a;
    }

    /*
     * Enabled aggressive block sorting
     */
    public boolean a(int n2) {
        float f10;
        block5: {
            m[] arrm;
            block4: {
                arrm = j.b();
                float f11 = (float)n2 - this.b;
                f10 = f11 == 0.0f ? 0 : (f11 < 0.0f ? -1 : 1);
                if (arrm == null) break block4;
                if (f10 > 0) break block5;
                float f12 = (float)n2 - this.a;
                f10 = f12 == 0.0f ? 0 : (f12 > 0.0f ? 1 : -1);
            }
            if (arrm == null) return (boolean)f10;
            if (f10 >= 0) {
                f10 = 1.0f;
                return (boolean)f10;
            }
        }
        f10 = 0.0f;
        return (boolean)f10;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    static float a(l l2) {
        return l2.b;
    }

    public l(float f10) {
        this.a = f10;
        this.b = f10;
    }

    public float b(Random random) {
        return h.a(random, this.a, this.b);
    }

    public l(float f10, float f11) {
        this.a = f10;
        this.b = f11;
    }

    public int a(Random random) {
        return h.a(random, h.d(this.a), h.d(this.b));
    }

    public float a() {
        return this.b;
    }

    public float b() {
        return this.a;
    }
}

