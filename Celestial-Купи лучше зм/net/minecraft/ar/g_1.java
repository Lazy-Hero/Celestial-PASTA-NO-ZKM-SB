/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.ar;

import net.minecraft.k.h;

public class g {
    public static float a(float f10, float f11, float f12) {
        float f13 = 2.0f + f12 / 4.0f;
        float f14 = h.c(f11 - f10 / f13, f11 * 0.2f, 20.0f);
        return f10 * (1.0f - f14 / 25.0f);
    }

    public static float a(float f10, float f11) {
        float f12 = h.c(f11, 0.0f, 20.0f);
        return f10 * (1.0f - f12 / 25.0f);
    }
}

