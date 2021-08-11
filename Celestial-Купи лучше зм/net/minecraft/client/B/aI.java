/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.b;

import net.minecraft.Q.a;
import net.minecraft.ah.R;
import net.minecraft.client.Q;
import net.minecraft.client.b.a_;
import net.minecraft.client.b.q;
import net.minecraft.k.h;

public class aI
extends R {
    protected /* synthetic */ long j;
    protected /* synthetic */ float i;

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public void a(a var1_1) {
        var2_2 = q.b();
        if (var2_2 == null) ** GOTO lbl6
        switch (a_.a[var1_1.i().ordinal()]) {
            case 1: {
                this.a(var1_1.f());
lbl6:
                // 2 sources

                if (var2_2 != null) return;
            }
            case 2: {
                this.a(var1_1.a());
                if (var2_2 != null) return;
            }
            case 3: {
                this.a(var1_1.d());
                this.a(var1_1.j());
                if (var2_2 != null) return;
            }
            case 4: {
                this.a(var1_1.e());
                this.b(var1_1.b());
                return;
            }
        }
    }

    @Override
    public void a(float f10) {
        this.d = this.e();
        this.i = f10;
        this.j = Q.aj();
    }

    public aI(a a10) {
        super(a10.g(), a10.f(), a10.d(), a10.j());
        this.i = a10.a();
        this.d = a10.a();
        this.j = Q.aj();
        this.a(a10.e());
        this.b(a10.b());
        this.c(a10.c());
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    public float e() {
        long l2 = Q.aj() - this.j;
        float f10 = net.minecraft.k.h.c((float)l2 / 100.0f, 0.0f, 1.0f);
        return this.d + (this.i - this.d) * f10;
    }
}

