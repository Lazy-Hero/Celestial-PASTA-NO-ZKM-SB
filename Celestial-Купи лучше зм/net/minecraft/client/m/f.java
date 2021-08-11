/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
package net.minecraft.client.m;

import com.google.common.collect.Lists;
import java.util.Iterator;
import net.minecraft.W.K;
import net.minecraft.client.Q;
import net.minecraft.client.a.W;
import net.minecraft.client.m.b;
import net.minecraft.client.m.c;
import net.minecraft.client.m.d;
import net.minecraft.l.m;
import net.minecraft.w.k;

class f
extends d {
    final /* synthetic */ b D;

    public f(b b10, Q q2) {
        block6: {
            this.D = b10;
            super(b10, q2);
            this.B = Lists.newArrayList();
            Iterator<net.minecraft.l.f> iterator = net.minecraft.l.m.T.iterator();
            String string = K.c();
            while (iterator.hasNext()) {
                int n2;
                net.minecraft.l.f f10;
                block19: {
                    int n3;
                    block9: {
                        net.minecraft.l.d d10;
                        k k2;
                        block16: {
                            block17: {
                                block18: {
                                    block13: {
                                        block14: {
                                            block15: {
                                                block10: {
                                                    block11: {
                                                        block12: {
                                                            block8: {
                                                                block7: {
                                                                    f10 = iterator.next();
                                                                    n3 = 0;
                                                                    k2 = f10.a();
                                                                    if (string == null) break block6;
                                                                    int n4 = net.minecraft.client.m.b.p(b10).a(f10);
                                                                    if (string == null) break block7;
                                                                    if (n4 <= 0) break block8;
                                                                    n4 = n3 = 1;
                                                                }
                                                                if (string != null) break block9;
                                                            }
                                                            d10 = net.minecraft.l.m.a(k2);
                                                            if (string == null) break block10;
                                                            if (d10 == null) break block11;
                                                            int n5 = net.minecraft.client.m.b.p(b10).a(net.minecraft.l.m.a(k2));
                                                            if (string == null) break block12;
                                                            if (n5 <= 0) break block11;
                                                            n5 = n3 = 1;
                                                        }
                                                        if (string != null) break block9;
                                                    }
                                                    d10 = net.minecraft.l.m.c(k2);
                                                }
                                                if (string == null) break block13;
                                                if (d10 == null) break block14;
                                                int n6 = net.minecraft.client.m.b.p(b10).a(net.minecraft.l.m.c(k2));
                                                if (string == null) break block15;
                                                if (n6 <= 0) break block14;
                                                n6 = n3 = 1;
                                            }
                                            if (string != null) break block9;
                                        }
                                        d10 = net.minecraft.l.m.f(k2);
                                    }
                                    if (string == null) break block16;
                                    if (d10 == null) break block17;
                                    int n7 = net.minecraft.client.m.b.p(b10).a(net.minecraft.l.m.f(k2));
                                    if (string == null) break block18;
                                    if (n7 <= 0) break block17;
                                    n7 = n3 = 1;
                                }
                                if (string != null) break block9;
                            }
                            d10 = net.minecraft.l.m.e(k2);
                        }
                        if (d10 == null) break block9;
                        n2 = net.minecraft.client.m.b.p(b10).a(net.minecraft.l.m.e(k2));
                        if (string == null) break block19;
                        if (n2 > 0) {
                            n3 = 1;
                        }
                    }
                    n2 = n3;
                }
                if (string != null && n2 != 0) {
                    n2 = this.B.add(f10) ? 1 : 0;
                }
                if (string != null) continue;
            }
            this.C = new c(this, b10);
        }
    }

    @Override
    protected void a(int n2, int n3, int n4, int n5, int n6, int n7, float f10) {
        net.minecraft.l.f f11 = this.a(n2);
        k k2 = f11.a();
        String string = K.c();
        net.minecraft.client.m.b.a(this.D, n3 + 40, n4, k2);
        net.minecraft.l.d d10 = net.minecraft.l.m.a(k2);
        boolean bl2 = n2 % 2;
        if (string != null) {
            bl2 = !bl2;
        }
        this.a(d10, n3 + 115, n4, bl2);
        net.minecraft.l.d d11 = net.minecraft.l.m.c(k2);
        boolean bl3 = n2 % 2;
        if (string != null) {
            bl3 = !bl3;
        }
        this.a(d11, n3 + 165, n4, bl3);
        boolean bl4 = n2 % 2;
        if (string != null) {
            bl4 = !bl4;
        }
        this.a(f11, n3 + 215, n4, bl4);
        net.minecraft.l.d d12 = net.minecraft.l.m.f(k2);
        boolean bl5 = n2 % 2;
        if (string != null) {
            bl5 = !bl5;
        }
        this.a(d12, n3 + 265, n4, bl5);
        net.minecraft.l.d d13 = net.minecraft.l.m.e(k2);
        boolean bl6 = n2 % 2;
        if (string != null) {
            bl6 = !bl6;
        }
        this.a(d13, n3 + 315, n4, bl6);
    }

    @Override
    protected String b(int n2) {
        String string = K.c();
        int n3 = n2;
        int n4 = 1;
        if (string != null) {
            if (n3 == n4) {
                return "stat.crafted";
            }
            n3 = n2;
            n4 = 2;
        }
        if (string != null) {
            if (n3 == n4) {
                return "stat.used";
            }
            n3 = n2;
            n4 = 3;
        }
        if (string != null) {
            if (n3 == n4) {
                return "stat.pickup";
            }
            n3 = n2;
            n4 = 4;
        }
        return n3 == n4 ? "stat.dropped" : "stat.depleted";
    }

    @Override
    protected void a(int n2, int n3, W w2) {
        block24: {
            f f10;
            block22: {
                block23: {
                    String string;
                    block21: {
                        f f11;
                        block19: {
                            block20: {
                                block18: {
                                    f f12;
                                    block16: {
                                        block17: {
                                            block15: {
                                                f f13;
                                                block13: {
                                                    block14: {
                                                        block12: {
                                                            f f14;
                                                            block10: {
                                                                block11: {
                                                                    String string2 = K.c();
                                                                    super.a(n2, n3, w2);
                                                                    string = string2;
                                                                    f14 = this;
                                                                    if (string == null) break block10;
                                                                    if (f14.z != 0) break block11;
                                                                    net.minecraft.client.m.b.a(this.D, n2 + 115 - 18 + 1, n3 + 1 + 1, 72, 18);
                                                                    if (string != null) break block12;
                                                                }
                                                                f14 = this;
                                                            }
                                                            net.minecraft.client.m.b.a(f14.D, n2 + 115 - 18, n3 + 1, 72, 18);
                                                        }
                                                        f13 = this;
                                                        if (string == null) break block13;
                                                        if (f13.z != 1) break block14;
                                                        net.minecraft.client.m.b.a(this.D, n2 + 165 - 18 + 1, n3 + 1 + 1, 18, 18);
                                                        if (string != null) break block15;
                                                    }
                                                    f13 = this;
                                                }
                                                net.minecraft.client.m.b.a(f13.D, n2 + 165 - 18, n3 + 1, 18, 18);
                                            }
                                            f12 = this;
                                            if (string == null) break block16;
                                            if (f12.z != 2) break block17;
                                            net.minecraft.client.m.b.a(this.D, n2 + 215 - 18 + 1, n3 + 1 + 1, 36, 18);
                                            if (string != null) break block18;
                                        }
                                        f12 = this;
                                    }
                                    net.minecraft.client.m.b.a(f12.D, n2 + 215 - 18, n3 + 1, 36, 18);
                                }
                                f11 = this;
                                if (string == null) break block19;
                                if (f11.z != 3) break block20;
                                net.minecraft.client.m.b.a(this.D, n2 + 265 - 18 + 1, n3 + 1 + 1, 90, 18);
                                if (string != null) break block21;
                            }
                            f11 = this;
                        }
                        net.minecraft.client.m.b.a(f11.D, n2 + 265 - 18, n3 + 1, 90, 18);
                    }
                    f10 = this;
                    if (string == null) break block22;
                    if (f10.z != 4) break block23;
                    net.minecraft.client.m.b.a(this.D, n2 + 315 - 18 + 1, n3 + 1 + 1, 108, 18);
                    if (string != null) break block24;
                }
                f10 = this;
            }
            net.minecraft.client.m.b.a(f10.D, n2 + 315 - 18, n3 + 1, 108, 18);
        }
    }

    private static gP c(gP gP2) {
        return gP2;
    }
}

