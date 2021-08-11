/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package net.minecraft.N;

import javax.annotation.Nullable;
import net.minecraft.N.A;
import net.minecraft.N.B;
import net.minecraft.N.C;
import net.minecraft.N.D;
import net.minecraft.N.E;
import net.minecraft.N.F;
import net.minecraft.N.G;
import net.minecraft.N.H;
import net.minecraft.N.I;
import net.minecraft.N.K;
import net.minecraft.N.L;
import net.minecraft.N.M;
import net.minecraft.N.O;
import net.minecraft.N.P;
import net.minecraft.N.Q;
import net.minecraft.N.R;
import net.minecraft.N.S;
import net.minecraft.N.T;
import net.minecraft.N.U;
import net.minecraft.N.V;
import net.minecraft.N.W;
import net.minecraft.N.X;
import net.minecraft.N.Y;
import net.minecraft.N.j;
import net.minecraft.N.m;
import net.minecraft.N.o;
import net.minecraft.N.v;
import net.minecraft.N.z;
import net.minecraft.P.r;
import net.minecraft.Q.ag;
import net.minecraft.W.d4;
import net.minecraft.Z.i;
import net.minecraft.ar.ae;
import net.minecraft.ar.h;
import net.minecraft.at.k;
import net.minecraft.b.d;
import net.minecraft.c.l;
import net.minecraft.k.n;
import net.minecraft.u.g;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public abstract class y {
    protected /* synthetic */ boolean f;
    private /* synthetic */ int b;
    protected /* synthetic */ net.minecraft.W.K c;
    private static final /* synthetic */ Logger g;
    private static /* synthetic */ net.minecraft.k.m[] h;
    private static final /* synthetic */ d<net.minecraft.ar.v, Class<? extends y>> e;
    protected /* synthetic */ net.minecraft.ah.z a;
    protected /* synthetic */ n d;

    public r r() {
        return this.b(new r());
    }

    public double a(double d10, double d11, double d12) {
        double d13 = (double)this.d.e() + 0.5 - d10;
        double d14 = (double)this.d.b() + 0.5 - d11;
        double d15 = (double)this.d.a() + 0.5 - d12;
        return d13 * d13 + d14 * d14 + d15 * d15;
    }

    protected void a(net.minecraft.ah.z z2) {
    }

    public void a(n n2) {
        this.d = n2.l();
    }

    public int m() {
        net.minecraft.k.m[] arrm = j.f();
        int n2 = this.b;
        if (arrm == null) {
            if (n2 == -1) {
                i i2 = this.a.d(this.d);
                this.b = i2.b().d(i2);
            }
            n2 = this.b;
        }
        return n2;
    }

    public boolean a() {
        return this.f;
    }

    @Nullable
    public k d() {
        return null;
    }

    public static net.minecraft.k.m[] p() {
        return h;
    }

    private static void a(String string, Class<? extends y> class_) {
        e.a(new net.minecraft.ar.v(string), class_);
    }

    public r a(r r2) {
        return this.b(r2);
    }

    public n j() {
        return this.d;
    }

    private static Throwable a(Throwable throwable) {
        return throwable;
    }

    public void t() {
        this.c = null;
        this.b = -1;
    }

    public boolean n() {
        return false;
    }

    public void i() {
        this.f = true;
    }

    public net.minecraft.ah.z d() {
        return this.a;
    }

    public boolean a(int n2, int n3) {
        return false;
    }

    public net.minecraft.W.K l() {
        net.minecraft.W.K k2;
        block4: {
            y y2;
            block6: {
                block5: {
                    net.minecraft.k.m[] arrm = j.f();
                    k2 = this.c;
                    if (arrm != null) break block4;
                    if (k2 != null) break block5;
                    y2 = this;
                    if (arrm != null) break block6;
                    if (y2.a != null) {
                        this.c = this.a.d(this.d).b();
                    }
                }
                y2 = this;
            }
            k2 = y2.c;
        }
        return k2;
    }

    private r b(r r2) {
        net.minecraft.ar.v v2 = e.b(this.getClass());
        net.minecraft.k.m[] arrm = j.f();
        if (arrm == null) {
            if (v2 == null) {
                throw new RuntimeException(this.getClass() + " is missing a mapping! This is a bug!");
            }
            r2.a("id", v2.toString());
            r2.b("x", this.d.e());
            r2.b("y", this.d.b());
            r2.b("z", this.d.a());
        }
        return r2;
    }

    public double q() {
        return 4096.0;
    }

    static {
        g = LogManager.getLogger();
        e = new d();
        y.a("furnace", M.class);
        y.a("chest", O.class);
        y.a("ender_chest", H.class);
        y.a("jukebox", d4.class);
        net.minecraft.k.m[] arrm = new net.minecraft.k.m[4];
        y.a("dispenser", P.class);
        y.a("dropper", Q.class);
        y.a("sign", W.class);
        y.a("mob_spawner", T.class);
        y.b(arrm);
        y.a("noteblock", U.class);
        y.a("piston", V.class);
        y.a("brewing_stand", L.class);
        y.a("enchanting_table", E.class);
        y.a("end_portal", F.class);
        y.a("beacon", K.class);
        y.a("skull", X.class);
        y.a("daylight_detector", D.class);
        y.a("hopper", R.class);
        y.a("comparator", C.class);
        y.a("flower_pot", I.class);
        y.a("banner", z.class);
        y.a("structure_block", Y.class);
        y.a("end_gateway", G.class);
        y.a("command_block", B.class);
        y.a("shulker_box", S.class);
        y.a("bed", A.class);
    }

    @Nullable
    public static net.minecraft.ar.v a(Class<? extends y> class_) {
        return e.b(class_);
    }

    public void a(h h2) {
    }

    public y() {
        this.d = n.o;
        this.b = -1;
    }

    @Nullable
    public ag k() {
        return null;
    }

    public void o() {
        this.f = false;
    }

    public void b(net.minecraft.ah.z z2) {
        this.a = z2;
    }

    public boolean h() {
        return this.a != null;
    }

    public void a(ae ae2) {
    }

    static d s() {
        return e;
    }

    public void a(l l2) {
        block3: {
            block2: {
                net.minecraft.k.m[] arrm = j.f();
                l2.a("Name", new o(this));
                net.minecraft.k.m[] arrm2 = arrm;
                if (arrm2 != null) break block2;
                if (this.a == null) break block3;
                l.a(l2, this.d, this.l(), this.m());
                l2.a("Actual block type", new m(this));
            }
            l2.a("Actual block data value", new v(this));
        }
    }

    public void c(r r2) {
        this.d = new n(r2.m("x"), r2.m("y"), r2.m("z"));
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    @Nullable
    public static y a(net.minecraft.ah.z var0, r var1_1) {
        block7: {
            var3_2 = null;
            var2_3 = j.f();
            var4_4 = var1_1.j("id");
            try {
                var5_5 = y.e.a(new net.minecraft.ar.v(var4_4));
                v0 = var5_5;
                if (var2_3 == null) {
                    if (v0 == null) break block7;
                    v0 = var5_5.newInstance();
                }
                var3_2 = (y)v0;
            }
            catch (Throwable var5_6) {
                y.g.error("Failed to create block entity {}", (Object)var4_4, (Object)var5_6);
            }
        }
        v1 = var3_2;
        if (var2_3 != null) ** GOTO lbl23
        if (v1 == null) {
            y.g.warn("Skipping BlockEntity with id {}", (Object)var4_4);
            return var3_2;
        }
        try {
            var3_2.a(var0);
            v1 = var3_2;
lbl23:
            // 2 sources

            v1.c(var1_1);
            return var3_2;
        }
        catch (Throwable var5_7) {
            y.g.error("Failed to load data for block entity {}", (Object)var4_4, (Object)var5_7);
            return null;
        }
    }

    public static void b(net.minecraft.k.m[] arrm) {
        h = arrm;
    }

    public void b() {
        block3: {
            y y2;
            block4: {
                net.minecraft.ah.z z2;
                net.minecraft.k.m[] arrm;
                block2: {
                    arrm = j.f();
                    z2 = this.a;
                    if (arrm != null) break block2;
                    if (z2 == null) break block3;
                    z2 = this.a;
                }
                i i2 = z2.d(this.d);
                this.b = i2.b().d(i2);
                this.a.a(this.d, this);
                y2 = this;
                if (arrm != null) break block4;
                if (y2.l() == net.minecraft.u.g.bf) break block3;
                y2 = this;
            }
            y2.a.b(this.d, this.l());
        }
    }
}

