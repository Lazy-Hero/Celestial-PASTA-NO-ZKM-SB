/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.C;

import net.minecraft.B.X;
import net.minecraft.U.B;
import net.minecraft.ar.v;
import net.minecraft.client.C.m;
import net.minecraft.client.C.w;
import net.minecraft.client.a.G;
import net.minecraft.client.a.o;
import net.minecraft.client.q.a;
import net.minecraft.client.r.s;
import net.minecraft.client.w.F;
import net.minecraft.i.j;
import net.minecraft.u.h;
import net.minecraft.w.d;

public class e
implements w<B> {
    private static final /* synthetic */ v b;
    protected final /* synthetic */ s<?> a;
    private final /* synthetic */ F c;

    public e(s<?> s2) {
        this.c = new F();
        this.a = s2;
    }

    static {
        b = new v("textures/entity/elytra.png");
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    public void a(B b10, float f10, float f11, float f12, float f13, float f14, float f15, float f16) {
        block11: {
            boolean bl2;
            d d10;
            block22: {
                Object object;
                block13: {
                    block17: {
                        v v2;
                        block21: {
                            v v3;
                            block19: {
                                Object object2;
                                block20: {
                                    boolean bl3;
                                    block18: {
                                        block14: {
                                            Object object3;
                                            block16: {
                                                block15: {
                                                    B b11;
                                                    block12: {
                                                        block10: {
                                                            d10 = b10.b(X.CHEST);
                                                            bl2 = m.c();
                                                            if (!bl2) break block10;
                                                            if (d10.w() != h.cf) break block11;
                                                            net.minecraft.client.a.v.b(1.0f, 1.0f, 1.0f, 1.0f);
                                                            net.minecraft.client.a.v.a();
                                                            net.minecraft.client.a.v.a(o.ONE, G.ZERO);
                                                        }
                                                        b11 = b10;
                                                        if (!bl2) break block12;
                                                        if (!(b11 instanceof a)) break block13;
                                                        b11 = b10;
                                                    }
                                                    object = (a)b11;
                                                    bl3 = ((a)object).d();
                                                    if (!bl2) break block14;
                                                    if (!bl3) break block15;
                                                    object3 = object;
                                                    if (!bl2) break block16;
                                                    if (((a)object3).p() == null) break block15;
                                                    this.a.b(((a)object).p());
                                                    if (bl2) break block17;
                                                }
                                                object3 = object;
                                            }
                                            bl3 = ((a)object3).f();
                                        }
                                        if (!bl2) break block18;
                                        if (!bl3) break block19;
                                        object2 = object;
                                        if (!bl2) break block20;
                                        bl3 = ((a)object2).m();
                                    }
                                    if (!bl3) break block19;
                                    object2 = object;
                                }
                                v3 = ((a)object2).i();
                                if (!bl2) break block21;
                                if (v3 == null || !((j)object).a(net.minecraft.i.a.CAPE)) break block19;
                                this.a.b(((a)object).i());
                                if (bl2) break block17;
                            }
                            v3 = v2 = b;
                        }
                        if (fU.aH()) {
                            v2 = b1.a(d10, v2);
                        }
                        this.a.b(v2);
                    }
                    if (bl2) break block22;
                }
                object = b;
                if (fU.aH()) {
                    object = b1.a(d10, (v)object);
                }
                this.a.b((v)object);
            }
            net.minecraft.client.a.v.M();
            net.minecraft.client.a.v.b(0.0f, 0.0f, 0.125f);
            this.c.a(f10, f11, f13, f14, f15, f16, b10);
            this.c.b(b10, f10, f11, f13, f14, f15, f16);
            if (bl2) {
                if (d10.r()) {
                    m.a(this.a, b10, this.c, f10, f11, f12, f13, f14, f15, f16);
                }
                net.minecraft.client.a.v.f();
            }
            net.minecraft.client.a.v.B();
        }
    }

    @Override
    public boolean a() {
        return false;
    }
}

