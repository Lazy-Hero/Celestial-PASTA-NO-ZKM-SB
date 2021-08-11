/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.J;

import net.minecraft.J.H;
import net.minecraft.J.e;
import net.minecraft.J.j;
import net.minecraft.J.u;
import net.minecraft.Z.i;
import net.minecraft.ah.z;
import net.minecraft.ar.a3;
import net.minecraft.at.k;
import net.minecraft.av.b;
import net.minecraft.av.f;
import net.minecraft.q.h;
import net.minecraft.q.m;
import net.minecraft.q.r;
import net.minecraft.u.g;

public class v
extends u {
    private final /* synthetic */ net.minecraft.N.j a2;
    private static final /* synthetic */ r<k> a1;
    private /* synthetic */ int a4;
    private static final /* synthetic */ r<String> a3;

    @Override
    public void a(r<?> r2) {
        block5: {
            int n2 = net.minecraft.J.j.d();
            super.a(r2);
            int n3 = n2;
            boolean bl2 = a1.equals(r2);
            if (n3 != 0) {
                if (bl2) {
                    try {
                        this.a2.b(this.E().b(a1));
                        break block5;
                    }
                    catch (Throwable throwable) {
                        if (n3 != 0) break block5;
                    }
                }
                bl2 = a3.equals(r2);
            }
            if (bl2) {
                this.a2.a(this.E().b(a3));
            }
        }
    }

    @Override
    public j o() {
        return net.minecraft.J.j.COMMAND_BLOCK;
    }

    static r c() {
        return a3;
    }

    public v(z z2, double d10, double d11, double d12) {
        super(z2, d10, d11, d12);
        this.a2 = new e(this);
    }

    private static Throwable a(Throwable throwable) {
        return throwable;
    }

    @Override
    public boolean aa() {
        return true;
    }

    @Override
    protected void f(net.minecraft.P.r r2) {
        super.f(r2);
        this.a2.b(r2);
    }

    public static void b(b b10) {
        net.minecraft.J.u.a(b10, v.class);
        b10.a(net.minecraft.av.f.ENTITY, (net.minecraft.av.g)new H());
    }

    public net.minecraft.N.j b() {
        return this.a2;
    }

    @Override
    protected void a(net.minecraft.P.r r2) {
        super.a(r2);
        this.a2.a(r2);
        this.E().b(a3, this.b().d());
        this.E().b(a1, this.b().e());
    }

    static r a() {
        return a1;
    }

    static {
        a3 = net.minecraft.q.m.a(v.class, h.b);
        a1 = net.minecraft.q.m.a(v.class, h.d);
    }

    @Override
    protected void ab() {
        super.ab();
        this.E().c(a3, "");
        this.E().c(a1, new net.minecraft.at.g(""));
    }

    public v(z z2) {
        super(z2);
        this.a2 = new e(this);
    }

    @Override
    public i n() {
        return net.minecraft.u.g.de.d();
    }

    @Override
    public void a(int n2, int n3, int n4, boolean n5) {
        block3: {
            block4: {
                int n6;
                int n7;
                block2: {
                    n7 = net.minecraft.J.j.c();
                    n6 = n5;
                    if (n7 != 0) break block2;
                    if (n6 == 0) break block3;
                    n6 = this.H - this.a4;
                }
                if (n7 != 0) break block4;
                if (n6 < 4) break block3;
                n6 = this.b().a(this.aG) ? 1 : 0;
            }
            this.a4 = this.H;
        }
    }

    @Override
    public boolean a(net.minecraft.i.j j2, a3 a32) {
        this.a2.a(j2);
        return false;
    }
}

