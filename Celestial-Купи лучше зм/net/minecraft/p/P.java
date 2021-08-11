/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package net.minecraft.p;

import java.util.Random;
import javax.annotation.Nullable;
import net.minecraft.J.p;
import net.minecraft.ah.z;
import net.minecraft.k.h;
import net.minecraft.k.m;
import net.minecraft.k.n;
import net.minecraft.k.o;
import net.minecraft.p.X;
import net.minecraft.p.a;
import net.minecraft.u.g;

public class P
extends a {
    private /* synthetic */ X a;
    private /* synthetic */ boolean e;
    private /* synthetic */ n d;

    @Override
    public boolean a(z z2, Random random, n n2) {
        boolean bl2;
        block20: {
            int n3;
            block19: {
                block14: {
                    bl2 = net.minecraft.p.a.c();
                    X x2 = this.a;
                    if (bl2) {
                        if (x2 == null) {
                            throw new IllegalStateException("Decoration requires priming with a spike");
                        }
                        x2 = this.a;
                    }
                    int n4 = x2.e();
                    for (o o2 : n.a(new n(n2.e() - n4, 0, n2.a() - n4), new n(n2.e() + n4, this.a.b() + 10, n2.a() + n4))) {
                        block18: {
                            int n5;
                            int n6;
                            block17: {
                                block15: {
                                    block16: {
                                        double d10 = o2.b(n2.e(), o2.b(), n2.a()) - (double)(n4 * n4 + 1);
                                        n3 = d10 == 0.0 ? 0 : (d10 < 0.0 ? -1 : 1);
                                        if (!bl2) break block14;
                                        if (!bl2) break block15;
                                        if (n3 > 0) break block16;
                                        n6 = o2.b();
                                        n5 = this.a.b();
                                        if (!bl2) break block17;
                                        if (n6 >= n5) break block16;
                                        this.a(z2, o2, g.bP.d());
                                        if (bl2) break block18;
                                    }
                                    n6 = o2.b();
                                }
                                n5 = 65;
                            }
                            if (n6 > n5) {
                                this.a(z2, o2, g.bf.d());
                            }
                        }
                        if (bl2) continue;
                    }
                    n3 = this.a.f();
                }
                if (!bl2) break block19;
                if (n3 == 0) break block20;
                n3 = -2;
            }
            int n7 = n3;
            block1: while (true) {
                int n8 = n7;
                int n9 = 2;
                block2: while (n8 <= n9) {
                    for (int i2 = -2; i2 <= 2; ++i2) {
                        block23: {
                            block22: {
                                int n10;
                                int n11;
                                block21: {
                                    n8 = h.g(n7);
                                    n9 = 2;
                                    if (!bl2) continue block2;
                                    if (!bl2) break block21;
                                    if (n8 == n9) break block22;
                                    n11 = h.g(i2);
                                    n10 = 2;
                                }
                                if (n11 != n10) break block23;
                            }
                            this.a(z2, new n(n2.e() + n7, this.a.b(), n2.a() + i2), g.dd.d());
                            this.a(z2, new n(n2.e() + n7, this.a.b() + 1, n2.a() + i2), g.dd.d());
                            this.a(z2, new n(n2.e() + n7, this.a.b() + 2, n2.a() + i2), g.dd.d());
                        }
                        this.a(z2, new n(n2.e() + n7, this.a.b() + 3, n2.a() + i2), g.dd.d());
                        if (bl2) continue;
                    }
                    ++n7;
                    if (bl2) continue block1;
                }
                break;
            }
        }
        p p2 = new p(z2);
        p2.b(this.d);
        p2.h(this.e);
        p2.c((float)n2.e() + 0.5f, this.a.b() + 1, (float)n2.a() + 0.5f, random.nextFloat() * 360.0f, 0.0f);
        z2.f(p2);
        this.a(z2, new n(n2.e(), this.a.b(), n2.a()), g.g.d());
        if (m.c()) {
            net.minecraft.p.a.b(!bl2);
        }
        return true;
    }

    public void a(X x2) {
        this.a = x2;
    }

    public void a(boolean bl2) {
        this.e = bl2;
    }

    private static IllegalStateException a(IllegalStateException illegalStateException) {
        return illegalStateException;
    }

    public void a(@Nullable n n2) {
        this.d = n2;
    }
}

