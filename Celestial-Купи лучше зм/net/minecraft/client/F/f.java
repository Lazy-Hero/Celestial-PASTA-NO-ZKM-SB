/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.F;

import net.minecraft.N.y;
import net.minecraft.U.x;
import net.minecraft.ah.z;
import net.minecraft.ar.v;
import net.minecraft.at.k;
import net.minecraft.client.F.b;
import net.minecraft.client.a.I;
import net.minecraft.client.a.as;
import net.minecraft.client.b.a5;
import net.minecraft.client.j.u;
import net.q;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public abstract class f<T extends y>
implements q {
    private static /* synthetic */ String[] b;
    protected static final /* synthetic */ v[] c;
    private /* synthetic */ v e;
    protected /* synthetic */ b f;
    private /* synthetic */ Class d;

    protected void b(v v2) {
        block3: {
            u u2;
            block2: {
                u u3 = this.f.p;
                String[] arrstring = net.minecraft.client.F.f.b();
                u2 = u3;
                if (arrstring == null) break block2;
                if (u2 == null) break block3;
                u2 = u3;
            }
            u2.b(v2);
        }
    }

    protected z c() {
        return this.f.k;
    }

    private static gP c(gP gP2) {
        return gP2;
    }

    public static String[] b() {
        return b;
    }

    @Override
    public void a(v v2) {
        this.e = v2;
    }

    public f() {
        this.d = null;
        this.e = null;
    }

    protected void a(T t2, String string, double d10, double d11, double d12, int n2) {
        x x2 = this.f.d;
        double d13 = ((y)t2).a(x2.a, x2.aF, x2.ax);
        if (d13 <= (double)(n2 * n2)) {
            float f10 = this.f.o;
            float f11 = this.f.n;
            boolean bl2 = false;
            net.minecraft.client.a.x.a(this.a(), string, (float)d10 + 0.5f, (float)d11 + 1.5f, (float)d12 + 0.5f, 0, f10, f11, false, false);
        }
    }

    public void a(b b10) {
        this.f = b10;
    }

    public a5 a() {
        return this.f.b();
    }

    protected void a(boolean bl2) {
        block4: {
            block3: {
                String[] arrstring;
                block2: {
                    String[] arrstring2 = net.minecraft.client.F.f.b();
                    net.minecraft.client.a.v.u(as.p);
                    arrstring = arrstring2;
                    if (arrstring == null) break block2;
                    if (!bl2) break block3;
                    net.minecraft.client.a.v.L();
                }
                if (arrstring != null) break block4;
            }
            net.minecraft.client.a.v.x();
        }
        net.minecraft.client.a.v.u(as.U);
    }

    public boolean a(T t2) {
        return false;
    }

    static {
        c = new v[]{new v("textures/blocks/destroy_stage_0.png"), new v("textures/blocks/destroy_stage_1.png"), new v("textures/blocks/destroy_stage_2.png"), new v("textures/blocks/destroy_stage_3.png"), new v("textures/blocks/destroy_stage_4.png"), new v("textures/blocks/destroy_stage_5.png"), new v("textures/blocks/destroy_stage_6.png"), new v("textures/blocks/destroy_stage_7.png"), new v("textures/blocks/destroy_stage_8.png"), new v("textures/blocks/destroy_stage_9.png")};
        net.minecraft.client.F.f.b(new String[4]);
    }

    @Override
    public void a(Class class_) {
        this.d = class_;
    }

    @Override
    public v a() {
        return this.e;
    }

    public static void b(String[] arrstring) {
        b = arrstring;
    }

    public void a(T t2, double d10, double d11, double d12, float f10, int n2, float f11) {
        block0: {
            k k2 = ((y)t2).d();
            if (k2 == null || this.f.q == null || !((y)t2).j().equals(this.f.q.a())) break block0;
            this.a(true);
            this.a(t2, k2.a(), d10, d11, d12, 12);
            this.a(false);
        }
    }

    @Override
    public Class b() {
        return this.d;
    }

    public void a(T t2, double d10, double d11, double d12, float f10, int n2, float f11, I i2) {
    }
}

