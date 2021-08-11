/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.ak;

import java.util.List;
import net.minecraft.U.B;
import net.minecraft.ag.W;
import net.minecraft.ak.g;
import net.minecraft.ak.h;
import net.minecraft.k.l;

public class Q
extends h {
    private final /* synthetic */ W f;
    private /* synthetic */ B c;
    private final /* synthetic */ double d;
    private /* synthetic */ int e;

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    public void b() {
        block7: {
            l l2;
            W w2;
            block8: {
                Q q2;
                String string;
                block4: {
                    block5: {
                        block6: {
                            --this.e;
                            string = h.h();
                            q2 = this;
                            if (string != null) break block4;
                            if (q2.c == null) break block5;
                            double d10 = this.f.s(this.c) - 4.0;
                            double d11 = d10 == 0.0 ? 0 : (d10 > 0.0 ? 1 : -1);
                            if (string != null) break block6;
                            if (d11 <= 0) break block7;
                            d11 = (double)this.f.l().a(this.c, this.d);
                        }
                        if (string == null) break block7;
                    }
                    q2 = this;
                }
                w2 = q2.f;
                if (string != null) break block8;
                if (!w2.l().o()) break block7;
                w2 = this.f;
            }
            if ((l2 = g.a(w2, 16, 3)) == null) {
                return;
            }
            this.f.l().a(l2.e, l2.d, l2.b, this.d);
        }
    }

    @Override
    public void a() {
        String string = h.h();
        Q q2 = this;
        if (string == null) {
            if (q2.c != null) {
                this.f.t(true);
            }
            q2 = this;
        }
        q2.e = 1000;
    }

    @Override
    public boolean c() {
        block21: {
            Q q2;
            Object object;
            block20: {
                B b10;
                block12: {
                    W w2;
                    String string;
                    block14: {
                        int n2;
                        block13: {
                            string = h.h();
                            n2 = this.f.z();
                            if (string != null) break block13;
                            if (n2 >= 0) {
                                return false;
                            }
                            w2 = this.f;
                            if (string != null) break block14;
                            n2 = w2.f().nextInt(400);
                        }
                        if (n2 != 0) {
                            return false;
                        }
                        w2 = this.f;
                    }
                    List<W> list = w2.aG.a(W.class, this.f.m().a(6.0, 3.0, 6.0));
                    double d10 = Double.MAX_VALUE;
                    object = list.iterator();
                    while (object.hasNext()) {
                        block16: {
                            double d11;
                            W w3;
                            block19: {
                                double d12;
                                W w4;
                                block18: {
                                    int n3;
                                    block17: {
                                        W w5;
                                        block15: {
                                            w3 = object.next();
                                            b10 = w3;
                                            if (string != null) break block12;
                                            if (string != null) break block15;
                                            if (b10 == this.f) break block16;
                                            w5 = w3;
                                        }
                                        n3 = w5.F();
                                        if (string != null) break block17;
                                        if (n3 != 0) break block16;
                                        w4 = w3;
                                        if (string != null) break block18;
                                        n3 = w4.z();
                                    }
                                    if (n3 >= 0) break block16;
                                    w4 = w3;
                                }
                                d11 = d12 = w4.s(this.f);
                                if (string != null) break block19;
                                if (!(d11 <= d10)) break block16;
                                d11 = d12;
                            }
                            d10 = d11;
                            this.c = w3;
                        }
                        if (string == null) continue;
                    }
                    q2 = this;
                    if (string != null) break block20;
                    b10 = q2.c;
                }
                if (b10 != null) break block21;
                q2 = this;
            }
            return (object = g.a(q2.f, 16, 3)) != null;
        }
        return true;
    }

    @Override
    public boolean e() {
        String string = h.h();
        boolean bl2 = this.e;
        if (string == null) {
            bl2 = bl2 > false;
        }
        return bl2;
    }

    @Override
    public void g() {
        this.f.t(false);
        this.c = null;
    }

    public Q(W w2, double d10) {
        this.f = w2;
        this.d = d10;
        this.a(1);
    }
}

