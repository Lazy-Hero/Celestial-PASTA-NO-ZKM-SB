/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.R;

import net.minecraft.R.b;
import net.minecraft.ar.u;
import net.minecraft.k.m;

class c
implements u {
    final /* synthetic */ b b;
    private /* synthetic */ long a;

    @Override
    public void a(String string) {
    }

    @Override
    public void d() {
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    c(b b10) {
        this.b = b10;
        this.a = System.currentTimeMillis();
    }

    @Override
    public void c(String string) {
    }

    @Override
    public void a(int n2) {
        block3: {
            block2: {
                m[] arrm = net.minecraft.R.b.U();
                if (arrm == null) break block2;
                if (System.currentTimeMillis() - this.a < 1000L) break block3;
                this.a = System.currentTimeMillis();
            }
            net.minecraft.R.b.ae().info("Converting... {}%", (Object)n2);
        }
    }

    @Override
    public void b(String string) {
    }
}

