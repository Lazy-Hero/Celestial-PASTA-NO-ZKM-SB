/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.b;

import net.minecraft.client.Q;
import net.minecraft.client.a.v;
import net.minecraft.client.b.q;
import net.minecraft.client.b.s;
import net.minecraft.client.l.f;
import net.minecraft.k.h;

public class C
extends s {
    public /* synthetic */ boolean v;
    private final /* synthetic */ f w;
    private final /* synthetic */ float t;
    private final /* synthetic */ float s;
    private /* synthetic */ float u;

    @Override
    protected int a(boolean bl2) {
        return 0;
    }

    public C(int n2, int n3, int n4, f f10, float f11, float f12) {
        super(n2, n3, n4, 150, 20, "");
        this.u = 1.0f;
        this.w = f10;
        this.s = f11;
        this.t = f12;
        Q q2 = Q.P();
        this.u = f10.e(q2.ac.b(f10));
        this.m = q2.ac.c(f10);
    }

    @Override
    public boolean a(Q q2, int n2, int n3) {
        String[] arrstring = q.b();
        boolean bl2 = super.a(q2, n2, n3);
        if (arrstring != null) {
            if (bl2) {
                this.u = (float)(n2 - (this.o + 4)) / (float)(this.i - 8);
                this.u = net.minecraft.k.h.c(this.u, 0.0f, 1.0f);
                q2.ac.a(this.w, this.w.b(this.u));
                this.m = q2.ac.c(this.w);
                this.v = true;
                return true;
            }
            bl2 = false;
        }
        return bl2;
    }

    public C(int n2, int n3, int n4, f f10) {
        this(n2, n3, n4, f10, 0.0f, 1.0f);
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    protected void b(Q q2, int n2, int n3) {
        block5: {
            C c10;
            block6: {
                boolean bl2;
                block4: {
                    String[] arrstring = q.b();
                    bl2 = this.l;
                    if (arrstring == null) break block4;
                    if (!bl2) break block5;
                    c10 = this;
                    if (arrstring == null) break block6;
                    bl2 = c10.v;
                }
                if (bl2) {
                    this.u = (float)(n2 - (this.o + 4)) / (float)(this.i - 8);
                    this.u = net.minecraft.k.h.c(this.u, 0.0f, 1.0f);
                    float f10 = this.w.b(this.u);
                    q2.ac.a(this.w, f10);
                    this.u = this.w.e(f10);
                    this.m = q2.ac.c(this.w);
                }
                q2.aN().b(j);
                net.minecraft.client.a.v.b(1.0f, 1.0f, 1.0f, 1.0f);
                this.a(this.o + (int)(this.u * (float)(this.i - 8)), this.r, 0, 66, 4, 20);
                c10 = this;
            }
            c10.a(this.o + (int)(this.u * (float)(this.i - 8)) + 4, this.r, 196, 66, 4, 20);
        }
    }

    @Override
    public void b(int n2, int n3) {
        this.v = false;
    }
}

