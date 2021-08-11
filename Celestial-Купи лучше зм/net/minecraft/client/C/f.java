/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package net.minecraft.client.C;

import java.util.UUID;
import javax.annotation.Nullable;
import net.minecraft.P.r;
import net.minecraft.U.B;
import net.minecraft.U.h;
import net.minecraft.ag.U;
import net.minecraft.ar.v;
import net.minecraft.client.C.E;
import net.minecraft.client.C.m;
import net.minecraft.client.C.w;
import net.minecraft.client.r.Z;
import net.minecraft.client.r.a4;
import net.minecraft.client.r.b;
import net.minecraft.client.r.s;
import net.minecraft.client.w.T;
import net.minecraft.i.j;

public class f
implements w<j> {
    private /* synthetic */ v h;
    private /* synthetic */ UUID i;
    private /* synthetic */ Class<?> f;
    private /* synthetic */ v g;
    protected /* synthetic */ s<? extends B> b;
    protected /* synthetic */ s<? extends B> j;
    private /* synthetic */ net.minecraft.client.w.j a;
    private final /* synthetic */ a4 e;
    private /* synthetic */ UUID k;
    private /* synthetic */ Class<?> c;
    private /* synthetic */ net.minecraft.client.w.j d;

    public f(a4 a42) {
        this.e = a42;
    }

    private E a(j j2, @Nullable UUID uUID, r r2, s<? extends B> z2, net.minecraft.client.w.j j3, v v2, Class<?> class_, float f10, float f11, float f12, float f13, float f14, float f15, float f16, boolean bl2) {
        boolean bl3;
        boolean bl4;
        block8: {
            block10: {
                block9: {
                    UUID uUID2;
                    block6: {
                        block7: {
                            bl4 = m.d();
                            uUID2 = uUID;
                            if (bl4) break block6;
                            if (uUID2 == null) break block7;
                            bl3 = uUID.equals(r2.l("UUID"));
                            if (bl4) break block8;
                            if (bl3) break block9;
                        }
                        uUID2 = r2.l("UUID");
                    }
                    uUID = uUID2;
                    class_ = net.minecraft.U.h.a(r2.j("id"));
                    if (bl4) break block10;
                    if (class_ == U.class) {
                        z2 = new Z(this.e);
                        j3 = new T();
                        v2 = Z.z[r2.m("Variant")];
                    }
                }
                ((b)z2).b(v2);
                net.minecraft.client.a.v.M();
            }
            bl3 = j2.a4();
        }
        float f17 = bl3 ? -1.3f : -1.5f;
        float f18 = bl2 ? 0.4f : -0.4f;
        net.minecraft.client.a.v.b(f18, f17, 0.0f);
        if (!bl4) {
            if (class_ == U.class) {
                f13 = 0.0f;
            }
            j3.a(j2, f10, f11, f12);
            j3.a(f10, f11, f13, f14, f15, f16, j2);
            j3.b(j2, f10, f11, f13, f14, f15, f16);
            net.minecraft.client.a.v.B();
        }
        return new E(this, uUID, z2, j3, v2, class_);
    }

    @Override
    public boolean a() {
        return false;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    public void a(j j2, float f10, float f11, float f12, float f13, float f14, float f15, float f16) {
        block8: {
            Object object;
            r r2;
            r r3;
            boolean bl2;
            block6: {
                block7: {
                    bl2 = m.d();
                    r3 = j2.r();
                    if (bl2) break block6;
                    if (r3 != null) break block7;
                    r3 = j2.p();
                    if (bl2) break block6;
                    if (r3 == null) break block8;
                }
                net.minecraft.client.a.v.q();
                net.minecraft.client.a.v.b(1.0f, 1.0f, 1.0f, 1.0f);
                r3 = j2.r();
            }
            r r4 = r2 = r3;
            if (!bl2) {
                if (!r4.c()) {
                    object = this.a(j2, this.k, r2, this.j, this.d, this.h, this.f, f10, f11, f12, f13, f14, f15, f16, true);
                    this.k = ((E)object).d;
                    this.j = ((E)object).c;
                    this.h = ((E)object).a;
                    this.d = ((E)object).f;
                    this.f = ((E)object).b;
                }
                r4 = j2.p();
            }
            if (!((r)(object = r4)).c()) {
                E e10 = this.a(j2, this.i, (r)object, this.b, this.a, this.g, this.c, f10, f11, f12, f13, f14, f15, f16, false);
                this.i = e10.d;
                this.b = e10.c;
                this.g = e10.a;
                this.a = e10.f;
                this.c = e10.b;
            }
            net.minecraft.client.a.v.u();
        }
    }
}

