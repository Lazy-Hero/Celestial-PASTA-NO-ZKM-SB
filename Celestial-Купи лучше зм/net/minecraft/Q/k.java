/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.Q;

import java.io.IOException;
import net.minecraft.C.K;
import net.minecraft.C.m;
import net.minecraft.Q.aD;
import net.minecraft.U.x;
import net.minecraft.n.a;

public class k
implements K<a> {
    public /* synthetic */ int c;
    public /* synthetic */ int a;
    public /* synthetic */ int d;
    private /* synthetic */ int b;

    @Override
    public void a(a a10) {
        a10.a(this);
    }

    public int b() {
        return this.b;
    }

    public k(int n2, double d10, double d11, double d12) {
        block14: {
            double d13;
            block13: {
                double d14;
                block12: {
                    boolean bl2 = aD.c();
                    boolean bl3 = bl2;
                    this.b = n2;
                    double d15 = 3.9;
                    double d16 = d10 - -3.9;
                    d14 = d16 == 0.0 ? 0 : (d16 < 0.0 ? -1 : 1);
                    if (!bl3) {
                        double d17;
                        if (d14 < 0) {
                            d10 = -3.9;
                        }
                        d14 = (d17 = d11 - -3.9) == 0.0 ? 0 : (d17 < 0.0 ? -1 : 1);
                    }
                    if (!bl3) {
                        double d18;
                        if (d14 < 0) {
                            d11 = -3.9;
                        }
                        d14 = (d18 = d12 - -3.9) == 0.0 ? 0 : (d18 < 0.0 ? -1 : 1);
                    }
                    if (!bl3) {
                        double d19;
                        if (d14 < 0) {
                            d12 = -3.9;
                        }
                        d14 = (d19 = d10 - 3.9) == 0.0 ? 0 : (d19 > 0.0 ? 1 : -1);
                    }
                    if (!bl3) {
                        double d20;
                        if (d14 > 0) {
                            d10 = 3.9;
                        }
                        d14 = (d20 = d11 - 3.9) == 0.0 ? 0 : (d20 > 0.0 ? 1 : -1);
                    }
                    if (bl3) break block12;
                    if (d14 > 0) {
                        d11 = 3.9;
                    }
                    d13 = d12;
                    if (bl3) break block13;
                    double d21 = d13 - 3.9;
                    d14 = d21 == 0.0 ? 0 : (d21 > 0.0 ? 1 : -1);
                }
                if (d14 <= 0) break block14;
                d13 = 3.9;
            }
            d12 = d13;
        }
        this.d = (int)(d10 * 8000.0);
        this.a = (int)(d11 * 8000.0);
        this.c = (int)(d12 * 8000.0);
    }

    public int c() {
        return this.a;
    }

    @Override
    public void a(m m2) throws IOException {
        this.b = m2.a();
        this.d = m2.readShort();
        this.a = m2.readShort();
        this.c = m2.readShort();
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public int d() {
        return this.c;
    }

    public int a() {
        return this.d;
    }

    @Override
    public void b(m m2) throws IOException {
        m2.d(this.b);
        m2.writeShort(this.d);
        m2.writeShort(this.a);
        m2.writeShort(this.c);
    }

    public k(x x2) {
        this(x2.W(), x2.aq, x2.G, x2.d);
    }

    public k() {
    }
}

