/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package net.minecraft.ah;

import java.util.Iterator;
import javax.annotation.Nullable;
import net.minecraft.Q.a6;
import net.minecraft.Q.o;
import net.minecraft.R.b;
import net.minecraft.U.x;
import net.minecraft.Z.i;
import net.minecraft.ah.A;
import net.minecraft.ah.k;
import net.minecraft.ah.z;
import net.minecraft.ar.ay;
import net.minecraft.ar.d;
import net.minecraft.k.n;

public class j
implements k {
    private final /* synthetic */ b b;
    private final /* synthetic */ A a;

    @Override
    public void a(z z2, n n2, i i2, i i3, int n3) {
        this.a.g().a(n2);
    }

    @Override
    public void a(int n2, int n3, int n4, int n5, int n6, int n7) {
    }

    @Override
    public void a(net.minecraft.i.j j2, int n2, n n3, int n4) {
        this.b.O().a(j2, n3.e(), n3.b(), n3.a(), 64.0, this.a.D.r().a(), new net.minecraft.Q.A(n2, n3, n4, false));
    }

    @Override
    public void a(int n2, boolean bl2, boolean bl3, double d10, double d11, double d12, double d13, double d14, double d15, int ... arrn) {
    }

    public j(b b10, A a10) {
        this.b = b10;
        this.a = a10;
    }

    @Override
    public void a(x x2) {
        block3: {
            A a10;
            block2: {
                String string = z.I();
                a10 = this.a;
                if (string == null) break block2;
                a10.x().a(x2);
                if (!(x2 instanceof net.minecraft.i.k)) break block3;
                a10 = this.a;
            }
            a10.D.b((net.minecraft.i.k)x2);
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    public void a(@Nullable net.minecraft.i.j var1_1, d var2_2, ay var3_3, double var4_4, double var6_5, double var8_6, float var10_7, float var11_8) {
        var12_9 = z.I();
        v0 = this.b.O();
        v1 = var10_7;
        v2 = 1.0f;
        if (var12_9 == null) ** GOTO lbl9
        if (v1 > v2) {
            v1 = 16.0f;
            v2 = var10_7;
lbl9:
            // 2 sources

            v3 = v1 * v2;
        } else {
            v3 = 16.0;
        }
        v0.a(var1_1, var4_4, var6_5, var8_6, v3, this.a.D.r().a(), new a6(var2_2, var3_3, var4_4, var6_5, var8_6, var10_7, var11_8));
    }

    @Override
    public void b(x x2) {
        block3: {
            A a10;
            block2: {
                String string = z.I();
                this.a.x().b(x2);
                String string2 = string;
                a10 = this.a;
                if (string2 == null) break block2;
                a10.c().a(x2);
                if (!(x2 instanceof net.minecraft.i.k)) break block3;
                a10 = this.a;
            }
            a10.D.a((net.minecraft.i.k)x2);
        }
    }

    @Override
    public void b(int n2, n n3, int n4) {
        this.b.O().a(new net.minecraft.Q.A(n2, n3, n4, true));
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    public void a(int n2, n n3, int n4) {
        Iterator<net.minecraft.i.k> iterator = this.b.O().u().iterator();
        String string = z.I();
        while (iterator.hasNext()) {
            block6: {
                double d10;
                double d11;
                double d12;
                int n5;
                net.minecraft.i.k k2;
                block8: {
                    net.minecraft.i.k k3;
                    block7: {
                        block5: {
                            k3 = k2 = iterator.next();
                            if (string == null) break block5;
                            if (k3 == null) break block6;
                            k3 = k2;
                        }
                        if (string == null) break block7;
                        if (k3.aG != this.a) break block6;
                        k3 = k2;
                    }
                    n5 = k3.W();
                    if (string == null) break block8;
                    if (n5 == n2) break block6;
                    n5 = n3.e();
                }
                if ((d12 = (double)n5 - k2.a) * d12 + (d11 = (double)n3.b() - k2.aF) * d11 + (d10 = (double)n3.a() - k2.ax) * d10 < 1024.0) {
                    k2.cD.a(new o(n2, n3, n4));
                }
            }
            if (string != null) continue;
        }
    }

    @Override
    public void a(d d10, n n2) {
    }

    @Override
    public void a(int n2, boolean bl2, double d10, double d11, double d12, double d13, double d14, double d15, int ... arrn) {
    }

    @Override
    public void a(n n2) {
    }
}

