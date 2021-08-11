/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.C;

import net.minecraft.T.ak;
import net.minecraft.client.C.w;
import net.minecraft.client.a.v;
import net.minecraft.client.r.s;

public class c
implements w<ak> {
    private static final /* synthetic */ net.minecraft.ar.v a;
    private final /* synthetic */ s<?> b;
    private final /* synthetic */ net.minecraft.client.w.s c;

    @Override
    public void a(ak ak2, float f10, float f11, float f12, float f13, float f14, float f15, float f16) {
        this.c.a(this.b.b());
        this.c.a(ak2, f10, f11, f12);
        v.b(1.0f, 1.0f, 1.0f, 1.0f);
        this.b.b(a);
        this.c.b(ak2, f10, f11, f13, f14, f15, f16);
    }

    public c(s<?> s2) {
        this.c = new net.minecraft.client.w.s(0.25f, true);
        this.b = s2;
    }

    static {
        a = new net.minecraft.ar.v("textures/entity/skeleton/stray_overlay.png");
    }

    @Override
    public boolean a() {
        return true;
    }
}

