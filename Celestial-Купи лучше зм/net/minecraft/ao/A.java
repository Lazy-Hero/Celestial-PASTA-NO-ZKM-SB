/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.ao;

import java.util.Map;
import java.util.Random;
import net.minecraft.P.r;
import net.minecraft.ah.z;
import net.minecraft.ao.ar;
import net.minecraft.ao.b;
import net.minecraft.ao.u;
import net.minecraft.ap.j;
import net.minecraft.ap.k;
import net.minecraft.ar.aA;
import net.minecraft.ar.ae;
import net.minecraft.k.n;
import net.minecraft.u.g;

public abstract class A
extends u {
    protected /* synthetic */ net.minecraft.ap.g h;
    protected /* synthetic */ k g;
    private static final /* synthetic */ k j;
    protected /* synthetic */ n i;

    @Override
    public void a(int n2, int n3, int n4) {
        super.a(n2, n3, n4);
        this.i = this.i.a(n2, n3, n4);
    }

    public A(int n2) {
        super(n2);
        this.g = j.b(true).a(net.minecraft.u.g.bf);
    }

    static {
        j = new k();
    }

    @Override
    public boolean a(z z2, Random random, b b10) {
        this.g.a(b10);
        String[] arrstring = u.b();
        this.h.a(z2, this.i, this.g, 18);
        String[] arrstring2 = arrstring;
        Map<n, String> map = this.h.a(this.i, this.g);
        for (Map.Entry<n, String> entry : map.entrySet()) {
            String string = entry.getValue();
            this.a(string, entry.getKey(), z2, random, b10);
            if (arrstring2 != null) continue;
        }
        return true;
    }

    private static gP b(gP gP2) {
        return gP2;
    }

    @Override
    protected void a(r r2, j j2) {
        this.i = new n(r2.m("TPX"), r2.m("TPY"), r2.m("TPZ"));
    }

    protected void a(net.minecraft.ap.g g10, n n2, k k2) {
        this.h = g10;
        this.a(aA.NORTH);
        this.i = n2;
        this.g = k2;
        this.a();
    }

    protected abstract void a(String var1, n var2, z var3, Random var4, b var5);

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    private void a() {
        var2_1 = this.g.g();
        var1_2 = u.b();
        var3_3 = this.h.a(var2_1);
        var4_4 = this.g.d();
        v0 = this;
        if (var1_2 == null) ** GOTO lbl19
        v0.e = new b(0, 0, 0, var3_3.e(), var3_3.b() - 1, var3_3.a());
        switch (ar.a[var2_1.ordinal()]) {
            default: {
                if (var1_2 != null) break;
            }
            case 2: {
                this.e.a(-var3_3.e(), 0, 0);
                if (var1_2 != null) break;
            }
            case 3: {
                this.e.a(0, 0, -var3_3.a());
                if (var1_2 != null) break;
            }
            case 4: {
                v0 = this;
lbl19:
                // 2 sources

                v0.e.a(-var3_3.e(), 0, -var3_3.a());
            }
        }
        switch (ar.b[var4_4.ordinal()]) {
            default: {
                if (var1_2 != null) break;
            }
            case 2: {
                var5_5 = n.o;
                v1 = var2_1;
                v2 = ae.CLOCKWISE_90;
                if (var1_2 == null) ** GOTO lbl31
                if (v1 == v2) ** GOTO lbl40
                v1 = var2_1;
                v2 = ae.COUNTERCLOCKWISE_90;
lbl31:
                // 2 sources

                if (var1_2 == null) ** GOTO lbl35
                if (v1 == v2) ** GOTO lbl40
                v1 = var2_1;
                v2 = ae.CLOCKWISE_180;
lbl35:
                // 2 sources

                if (v1 != v2) ** GOTO lbl38
                var5_5 = var5_5.a(aA.EAST, var3_3.e());
                if (var1_2 != null) ** GOTO lbl41
lbl38:
                // 2 sources

                var5_5 = var5_5.a(aA.WEST, var3_3.e());
                if (var1_2 != null) ** GOTO lbl41
lbl40:
                // 3 sources

                var5_5 = var5_5.a(var2_1.a(aA.WEST), var3_3.a());
lbl41:
                // 3 sources

                this.e.a(var5_5.e(), 0, var5_5.a());
                if (var1_2 != null) break;
            }
            case 3: {
                var6_6 = n.o;
                v3 = var2_1;
                v4 = ae.CLOCKWISE_90;
                if (var1_2 == null) ** GOTO lbl51
                if (v3 == v4) ** GOTO lbl60
                v3 = var2_1;
                v4 = ae.COUNTERCLOCKWISE_90;
lbl51:
                // 2 sources

                if (var1_2 == null) ** GOTO lbl55
                if (v3 == v4) ** GOTO lbl60
                v3 = var2_1;
                v4 = ae.CLOCKWISE_180;
lbl55:
                // 2 sources

                if (v3 != v4) ** GOTO lbl58
                var6_6 = var6_6.a(aA.SOUTH, var3_3.a());
                if (var1_2 != null) ** GOTO lbl61
lbl58:
                // 2 sources

                var6_6 = var6_6.a(aA.NORTH, var3_3.a());
                if (var1_2 != null) ** GOTO lbl61
lbl60:
                // 3 sources

                var6_6 = var6_6.a(var2_1.a(aA.NORTH), var3_3.e());
lbl61:
                // 3 sources

                this.e.a(var6_6.e(), 0, var6_6.a());
            }
        }
        this.e.a(this.i.e(), this.i.b(), this.i.a());
    }

    public A() {
        this.g = j.b(true).a(net.minecraft.u.g.bf);
    }

    @Override
    protected void a(r r2) {
        r2.b("TPX", this.i.e());
        r2.b("TPY", this.i.b());
        r2.b("TPZ", this.i.a());
    }
}

