/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.r;

import net.minecraft.T.aF;
import net.minecraft.client.C.w;
import net.minecraft.client.a.v;
import net.minecraft.client.r.a5;
import net.minecraft.client.r.al;
import net.minecraft.client.r.b;

class a
implements w<aF> {
    final /* synthetic */ al a;

    @Override
    public boolean a() {
        return false;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    private a(al al2) {
        this.a = al2;
    }

    a(al al2, a5 a52) {
        this(al2);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    public void a(aF var1_1, float var2_2, float var3_3, float var4_4, float var5_5, float var6_6, float var7_7, float var8_8) {
        v0 = b.b();
        v.M();
        var9_9 = v0;
        if (var9_9 != null) ** GOTO lbl31
        switch (a5.a[var1_1.c().ordinal()]) {
            default: {
                if (var9_9 == null) break;
            }
            case 2: {
                v.a(90.0f, 0.0f, 0.0f, 1.0f);
                v.a(90.0f, 1.0f, 0.0f, 0.0f);
                v.b(1.0f, -1.0f, 0.0f);
                v.a(180.0f, 0.0f, 1.0f, 0.0f);
                if (var9_9 == null) break;
            }
            case 3: {
                v.a(-90.0f, 0.0f, 0.0f, 1.0f);
                v.a(90.0f, 1.0f, 0.0f, 0.0f);
                v.b(-1.0f, -1.0f, 0.0f);
                v.a(180.0f, 0.0f, 1.0f, 0.0f);
                if (var9_9 == null) break;
            }
            case 4: {
                v.a(90.0f, 1.0f, 0.0f, 0.0f);
                v.b(0.0f, -1.0f, -1.0f);
                if (var9_9 == null) break;
            }
            case 5: {
                v.a(180.0f, 0.0f, 0.0f, 1.0f);
                v.a(90.0f, 1.0f, 0.0f, 0.0f);
                v.b(0.0f, -1.0f, 1.0f);
                if (var9_9 == null) break;
            }
            case 6: {
                v.a(180.0f, 1.0f, 0.0f, 0.0f);
lbl31:
                // 2 sources

                v.b(0.0f, -2.0f, 0.0f);
            }
        }
        var10_10 = this.a.a().i;
        var10_10.e = var6_6 * 0.017453292f;
        var10_10.y = var7_7 * 0.017453292f;
        this.a.b(al.z[var1_1.i().e()]);
        var10_10.b(var8_8);
        v.B();
    }
}

