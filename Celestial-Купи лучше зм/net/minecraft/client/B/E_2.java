/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.b;

import net.minecraft.ar.ay;
import net.minecraft.client.Q;
import net.minecraft.client.a.v;
import net.minecraft.client.b.aC;
import net.minecraft.client.b.q;
import net.minecraft.client.b.s;
import net.minecraft.client.e.C;
import net.minecraft.client.e.y;
import net.minecraft.k.h;

class E
extends s {
    public /* synthetic */ float w;
    private final /* synthetic */ String u;
    final /* synthetic */ aC s;
    private final /* synthetic */ ay t;
    public /* synthetic */ boolean v;

    @Override
    protected int a(boolean bl2) {
        return 0;
    }

    @Override
    public boolean a(Q q2, int n2, int n3) {
        String[] arrstring = q.b();
        boolean bl2 = super.a(q2, n2, n3);
        if (arrstring != null) {
            if (bl2) {
                this.w = (float)(n2 - (this.o + 4)) / (float)(this.i - 8);
                this.w = net.minecraft.k.h.c(this.w, 0.0f, 1.0f);
                q2.ac.a(this.t, this.w);
                q2.ac.e();
                this.m = this.u + ": " + this.s.a(this.t);
                this.v = true;
                return true;
            }
            bl2 = false;
        }
        return bl2;
    }

    @Override
    public void b(int n2, int n3) {
        String[] arrstring = q.b();
        E e10 = this;
        if (arrstring != null) {
            if (e10.v) {
                this.s.m.p().c(y.a(net.minecraft.u.E.bN, 1.0f));
            }
            e10 = this;
        }
        e10.v = false;
    }

    @Override
    public void a(C c10) {
    }

    @Override
    protected void b(Q q2, int n2, int n3) {
        block5: {
            E e10;
            block6: {
                boolean bl2;
                block4: {
                    String[] arrstring = q.b();
                    bl2 = this.l;
                    if (arrstring == null) break block4;
                    if (!bl2) break block5;
                    e10 = this;
                    if (arrstring == null) break block6;
                    bl2 = e10.v;
                }
                if (bl2) {
                    this.w = (float)(n2 - (this.o + 4)) / (float)(this.i - 8);
                    this.w = net.minecraft.k.h.c(this.w, 0.0f, 1.0f);
                    q2.ac.a(this.t, this.w);
                    q2.ac.e();
                    this.m = this.u + ": " + this.s.a(this.t);
                }
                net.minecraft.client.a.v.b(1.0f, 1.0f, 1.0f, 1.0f);
                this.a(this.o + (int)(this.w * (float)(this.i - 8)), this.r, 0, 66, 4, 20);
                e10 = this;
            }
            e10.a(this.o + (int)(this.w * (float)(this.i - 8)) + 4, this.r, 196, 66, 4, 20);
        }
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public E(aC aC2, int n2, int n3, int n4, ay ay2, boolean bl2) {
        this.s = aC2;
        super(n2, n3, n4, bl2 ? 310 : 150, 20, "");
        this.w = 1.0f;
        this.t = ay2;
        this.u = net.minecraft.client.D.h.a("soundCategory." + ay2.b(), new Object[0]);
        this.m = this.u + ": " + aC2.a(ay2);
        this.w = aC.a(aC2).a(ay2);
    }
}

