/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.w;

import net.minecraft.U.x;
import net.minecraft.client.a.v;
import net.minecraft.client.w.c;
import net.minecraft.client.w.j;

public class G
extends j {
    private final /* synthetic */ c i;
    private /* synthetic */ c j;
    private final /* synthetic */ c k;

    public G(float f10, boolean bl2) {
        block3: {
            block2: {
                int[] arrn = net.minecraft.client.w.j.b();
                this.i = new c(this, "glass");
                this.i.b(0, 0).a(-4.0f, -4.0f, -4.0f, 8, 8, 8);
                int[] arrn2 = arrn;
                this.k = new c(this, "cube");
                this.k.b(32, 0).a(-4.0f, -4.0f, -4.0f, 8, 8, 8);
                if (arrn2 != null) break block2;
                if (!bl2) break block3;
                this.j = new c(this, "base");
            }
            this.j.b(0, 16).a(-6.0f, 0.0f, -6.0f, 12, 4, 12);
        }
    }

    @Override
    public void b(x x2, float f10, float f11, float f12, float f13, float f14, float f15) {
        int[] arrn = net.minecraft.client.w.j.b();
        v.M();
        v.d(2.0f, 2.0f, 2.0f);
        int[] arrn2 = arrn;
        v.b(0.0f, -0.5f, 0.0f);
        c c10 = this.j;
        if (arrn2 == null) {
            if (c10 != null) {
                this.j.b(f15);
            }
            v.a(f11, 0.0f, 1.0f, 0.0f);
            v.b(0.0f, 0.8f + f12, 0.0f);
            v.a(60.0f, 0.7071f, 0.0f, 0.7071f);
            c10 = this.i;
        }
        c10.b(f15);
        float f16 = 0.875f;
        v.d(0.875f, 0.875f, 0.875f);
        v.a(60.0f, 0.7071f, 0.0f, 0.7071f);
        v.a(f11, 0.0f, 1.0f, 0.0f);
        this.i.b(f15);
        v.d(0.875f, 0.875f, 0.875f);
        v.a(60.0f, 0.7071f, 0.0f, 0.7071f);
        v.a(f11, 0.0f, 1.0f, 0.0f);
        this.k.b(f15);
        v.B();
    }

    private static gP a(gP gP2) {
        return gP2;
    }
}

