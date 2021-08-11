/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.mojang.authlib.GameProfile
 *  io.netty.buffer.Unpooled
 *  javax.annotation.Nullable
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package net.minecraft.i;

import com.google.common.collect.Lists;
import com.mojang.authlib.GameProfile;
import io.netty.buffer.Unpooled;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import javax.annotation.Nullable;
import net.minecraft.B.C;
import net.minecraft.B.P;
import net.minecraft.B.w;
import net.minecraft.C.K;
import net.minecraft.D.e;
import net.minecraft.N.B;
import net.minecraft.N.W;
import net.minecraft.N.y;
import net.minecraft.P.r;
import net.minecraft.Q.A;
import net.minecraft.Q.H;
import net.minecraft.Q.L;
import net.minecraft.Q.X;
import net.minecraft.Q.a5;
import net.minecraft.Q.a9;
import net.minecraft.Q.aA;
import net.minecraft.Q.aG;
import net.minecraft.Q.aN;
import net.minecraft.Q.aZ;
import net.minecraft.Q.ag;
import net.minecraft.Q.ah;
import net.minecraft.Q.an;
import net.minecraft.Q.az;
import net.minecraft.Q.u;
import net.minecraft.U.x;
import net.minecraft.W.bA;
import net.minecraft.W.bG;
import net.minecraft.W.ch;
import net.minecraft.a.p;
import net.minecraft.a4;
import net.minecraft.a6;
import net.minecraft.ac.c;
import net.minecraft.ag.D;
import net.minecraft.ah.l;
import net.minecraft.ah.o;
import net.minecraft.ah.s;
import net.minecraft.ah.z;
import net.minecraft.aj.q;
import net.minecraft.ar.G;
import net.minecraft.ar.Z;
import net.minecraft.ar.a2;
import net.minecraft.ar.a3;
import net.minecraft.ar.ay;
import net.minecraft.ar.v;
import net.minecraft.at.a;
import net.minecraft.az.t;
import net.minecraft.d.m;
import net.minecraft.i.b;
import net.minecraft.i.f;
import net.minecraft.i.g;
import net.minecraft.i.i;
import net.minecraft.i.j;
import net.minecraft.k.n;
import net.minecraft.l.d;
import net.minecraft.l.h;
import net.minecraft.u.E;
import net.minecraft.w.aX;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class k
extends j
implements net.minecraft.B.j {
    private /* synthetic */ int c8;
    private /* synthetic */ int cG;
    private /* synthetic */ int cZ;
    private /* synthetic */ net.minecraft.k.l cJ;
    private /* synthetic */ boolean cV;
    private final /* synthetic */ a4 cT;
    private final /* synthetic */ h c2;
    public /* synthetic */ boolean c5;
    private /* synthetic */ int cW;
    public /* synthetic */ double cU;
    private /* synthetic */ int cC;
    private /* synthetic */ boolean cX;
    public /* synthetic */ int cM;
    public /* synthetic */ boolean cK;
    private /* synthetic */ float cP;
    private /* synthetic */ int c_;
    public /* synthetic */ net.minecraft.C.a cD;
    private /* synthetic */ int c6;
    private /* synthetic */ int cS;
    private /* synthetic */ b cQ;
    private /* synthetic */ boolean cI;
    private static final /* synthetic */ Logger cR;
    private /* synthetic */ int cO;
    private /* synthetic */ String c0;
    private /* synthetic */ float c9;
    public final /* synthetic */ p c7;
    private /* synthetic */ net.minecraft.k.l cH;
    private /* synthetic */ x cE;
    private final /* synthetic */ List<Integer> cL;
    private /* synthetic */ long c1;
    private /* synthetic */ boolean c4;
    private final /* synthetic */ net.minecraft.l.j cF;
    public /* synthetic */ double da;
    private /* synthetic */ int cN;
    private /* synthetic */ boolean cY;
    public final /* synthetic */ net.minecraft.R.b c3;

    @Override
    protected net.minecraft.ar.y F() {
        return new net.minecraft.ar.z(this);
    }

    @Override
    public void b(x x2) {
        block4: {
            k k2;
            block2: {
                block3: {
                    String string = net.minecraft.i.g.b();
                    k2 = this;
                    if (string != null) break block2;
                    if (k2.c7.e() != net.minecraft.ah.s.SPECTATOR) break block3;
                    this.i(x2);
                    if (string == null) break block4;
                }
                k2 = this;
            }
            super.b(x2);
        }
    }

    @Override
    public void a(net.minecraft.at.k k2, boolean bl2) {
        this.cD.a(new ah(k2, bl2 ? net.minecraft.at.a.GAME_INFO : net.minecraft.at.a.CHAT));
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean c(k k2) {
        String string = net.minecraft.i.g.b();
        boolean bl2 = k2.ae();
        if (string == null) {
            if (bl2) {
                if (this.I() != this) return false;
                return true;
            }
            bl2 = this.ae();
        }
        if (string == null) {
            if (bl2) return false;
            bl2 = super.c(k2);
        }
        if (string != null) return bl2;
        if (!bl2) return false;
        return true;
    }

    @Override
    public void a(net.minecraft.U.e e10) {
        this.A();
        this.cm = new w(this.cB, e10, this.aG);
        this.cm.b = this.cW;
        this.cm.b(this);
        C c10 = ((w)this.cm).a();
        net.minecraft.at.k k2 = e10.d();
        this.cD.a(new H(this.cW, "minecraft:villager", k2, c10.e()));
        net.minecraft.y.a a10 = e10.a(this);
        if (a10 != null) {
            net.minecraft.C.m m2 = new net.minecraft.C.m(Unpooled.buffer());
            m2.writeInt(this.cW);
            a10.a(m2);
            this.cD.a(new X("MC|TrList", m2));
        }
    }

    public a4 Y() {
        return this.cT;
    }

    @Override
    public void a(d d10, int n2) {
        block4: {
            String string;
            block3: {
                string = net.minecraft.i.g.b();
                if (string != null) break block3;
                if (d10 == null) break block4;
                this.c2.a(this, d10, n2);
            }
            for (net.minecraft.D.h h2 : this.d().a(d10.d())) {
                this.d().d(this.g(), h2).b(n2);
                if (string == null) continue;
            }
        }
    }

    public net.minecraft.ah.A n() {
        return (net.minecraft.ah.A)this.aG;
    }

    @Override
    protected void a(double d10, boolean bl2, net.minecraft.Z.i i2, n n2) {
    }

    public void k(x x2) {
        block2: {
            boolean bl2;
            block3: {
                String string = net.minecraft.i.g.b();
                bl2 = x2 instanceof j;
                if (string != null) break block2;
                if (!bl2) break block3;
                this.cD.a(new u(x2.W()));
                if (string == null) break block2;
            }
            bl2 = this.cL.add(x2.W());
        }
    }

    @Override
    public void a(o o2) {
        block5: {
            k k2;
            block4: {
                block2: {
                    block3: {
                        String string = net.minecraft.i.g.b();
                        if (string != null) break block2;
                        if (!(o2 instanceof q) || ((q)((Object)o2)).a() == null) break block3;
                        k2 = this;
                        if (string != null) break block4;
                        if (!k2.ae()) break block3;
                        this.a(new net.minecraft.at.h("container.spectatorCantOpen", new Object[0]).a(new net.minecraft.at.i().a(net.minecraft.at.l.RED)), true);
                        if (string == null) break block5;
                    }
                    this.A();
                    this.cD.a(new H(this.cW, o2.a(), o2.d()));
                    this.cm = o2.a(this.cB, this);
                    this.cm.b = this.cW;
                }
                k2 = this;
            }
            k2.cm.b(this);
        }
    }

    public void a(double d10, boolean bl2) {
        block2: {
            net.minecraft.Z.i i2;
            n n2;
            block3: {
                net.minecraft.Z.i i3;
                block4: {
                    n n3;
                    block5: {
                        boolean bl3;
                        block6: {
                            int n4 = net.minecraft.k.h.f(this.a);
                            String string = net.minecraft.i.g.b();
                            int n5 = net.minecraft.k.h.f(this.aF - (double)0.2f);
                            int n6 = net.minecraft.k.h.f(this.ax);
                            n2 = new n(n4, n5, n6);
                            i2 = this.aG.d(n2);
                            if (string != null) break block2;
                            if (i2.o() != c.A) break block3;
                            n3 = n2.k();
                            i3 = this.aG.d(n3);
                            net.minecraft.W.K k2 = i3.b();
                            if (string != null) break block4;
                            if (k2 instanceof bA) break block5;
                            bl3 = k2 instanceof ch;
                            if (string != null) break block6;
                            if (bl3) break block5;
                            bl3 = k2 instanceof bG;
                        }
                        if (!bl3) break block3;
                    }
                    n2 = n3;
                }
                i2 = i3;
            }
            super.a(d10, bl2, i2, n2);
        }
    }

    @Override
    public void f(int n2) {
        super.f(n2);
        this.c_ = -1;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void F() {
        var1_1 = net.minecraft.i.g.b();
        try {
            super.ae();
            var2_2 = 0;
lbl5:
            // 2 sources

            while (var2_2 < this.cB.e()) {
                var3_4 = this.cB.a(var2_2);
                if (var1_1 != null) ** GOTO lbl27
                v0 = (float)var3_4.G();
                if (var1_1 != null) ** GOTO lbl-1000
                ** GOTO lbl-1000
            }
            ** GOTO lbl28
        }
        catch (Throwable var2_3) {
            var3_4 = net.minecraft.c.f.a(var2_3, "Ticking player");
            var4_5 = var3_4.a("Player being ticked");
            this.a((net.minecraft.c.l)var4_5);
            throw new Z((net.minecraft.c.f)var3_4);
        }
lbl-1000:
        // 1 sources

        {
            if (v0 != false) ** GOTO lbl-1000
        }
        {
            v1 = var3_4.w();
            if (var1_1 != null) ** GOTO lbl-1000
        }
        {
            if (!v1.p()) ** GOTO lbl-1000
        }
        {
            v1 = var3_4.w();
        }
lbl-1000:
        // 2 sources

        {
            var4_5 = ((aX)v1).a((net.minecraft.w.d)var3_4, this.aG, this);
            if (var1_1 != null) ** GOTO lbl27
            if (var4_5 == null) ** GOTO lbl-1000
        }
        {
            this.cD.a((K<?>)var4_5);
        }
lbl-1000:
        // 4 sources

        {
            ++var2_2;
lbl27:
            // 3 sources

            if (var1_1 == null) ** GOTO lbl5
lbl28:
            // 2 sources

            v2 = this;
            if (var1_1 != null) ** GOTO lbl-1000
            cfr_temp_0 = v2.V() - this.c9;
            v0 = cfr_temp_0 == 0.0f ? 0 : (cfr_temp_0 > 0.0f ? 1 : -1);
        }
lbl-1000:
        // 2 sources

        {
            if (v0 != false) ** GOTO lbl41
            v2 = this;
            if (var1_1 != null) ** GOTO lbl-1000
        }
        {
            if (v2.cS != this.b6.b()) ** GOTO lbl41
        }
        {
            cfr_temp_1 = this.b6.c() - 0.0f;
            v3 = cfr_temp_1 == 0.0f ? 0 : (cfr_temp_1 > 0.0f ? 1 : -1);
            if (var1_1 != null) ** GOTO lbl-1000
        }
        {
            v3 = v3 == false ? (float)true : (float)false;
        }
lbl-1000:
        // 2 sources

        {
            if (v3 == this.cX) ** GOTO lbl49
lbl41:
            // 3 sources

            this.cD.a(new net.minecraft.Q.G(this.V(), this.b6.b(), this.b6.c()));
            this.c9 = this.V();
            this.cS = this.b6.b();
            v2 = this;
        }
lbl-1000:
        // 3 sources

        {
            v4 = (cfr_temp_2 = this.b6.c() - 0.0f) == 0.0f ? 0 : (cfr_temp_2 > 0.0f ? 1 : -1);
            if (var1_1 != null) ** GOTO lbl-1000
            v4 = v4 == false ? (float)true : (float)false;
        }
lbl-1000:
        // 2 sources

        {
            v2.cX = v4;
lbl49:
            // 2 sources

            v5 = (cfr_temp_3 = this.V() + this.ax() - this.cP) == 0.0f ? 0 : (cfr_temp_3 > 0.0f ? 1 : -1);
            if (var1_1 != null) ** GOTO lbl55
            if (v5 == false) ** GOTO lbl-1000
        }
        {
            this.cP = this.V() + this.ax();
            this.a(net.minecraft.D.a.d, net.minecraft.k.h.f(this.cP));
        }
lbl-1000:
        // 2 sources

        {
            v5 = this.b6.b();
lbl55:
            // 2 sources

            v6 = this.cC;
            if (var1_1 != null) ** GOTO lbl62
            if (v5 == v6) ** GOTO lbl-1000
        }
        {
            this.cC = this.b6.b();
            this.a(net.minecraft.D.a.k, net.minecraft.k.h.f((float)this.cC));
        }
lbl-1000:
        // 2 sources

        {
            v5 = this.P();
            v6 = this.cO;
lbl62:
            // 2 sources

            if (var1_1 != null) ** GOTO lbl68
            if (v5 == v6) ** GOTO lbl-1000
        }
        {
            this.cO = this.P();
            this.a(net.minecraft.D.a.h, net.minecraft.k.h.f((float)this.cO));
        }
lbl-1000:
        // 2 sources

        {
            v5 = this.n();
            v6 = this.cG;
lbl68:
            // 2 sources

            if (var1_1 != null) ** GOTO lbl74
            if (v5 == v6) ** GOTO lbl-1000
        }
        {
            this.cG = this.n();
            this.a(net.minecraft.D.a.j, net.minecraft.k.h.f((float)this.cG));
        }
lbl-1000:
        // 2 sources

        {
            v5 = this.b8;
            v6 = this.c6;
lbl74:
            // 2 sources

            if (var1_1 != null) ** GOTO lbl80
            if (v5 == v6) ** GOTO lbl-1000
        }
        {
            this.c6 = this.b8;
            this.a(net.minecraft.D.a.e, net.minecraft.k.h.f((float)this.c6));
        }
lbl-1000:
        // 2 sources

        {
            v5 = this.b4;
            v6 = this.cN;
lbl80:
            // 2 sources

            if (var1_1 != null) ** GOTO lbl86
            if (v5 == v6) ** GOTO lbl-1000
        }
        {
            this.cN = this.b4;
            this.a(net.minecraft.D.a.m, net.minecraft.k.h.f((float)this.cN));
        }
lbl-1000:
        // 2 sources

        {
            v5 = this.b8;
            v6 = this.c_;
lbl86:
            // 2 sources

            if (var1_1 != null) ** GOTO lbl92
            if (v5 == v6) ** GOTO lbl-1000
        }
        {
            this.c_ = this.b8;
            this.cD.a(new net.minecraft.Q.f(this.b7, this.b8, this.b4));
        }
lbl-1000:
        // 2 sources

        {
            v5 = this.H;
            v6 = 20;
lbl92:
            // 2 sources

            if (v5 % v6 != false) return;
            a6.n.a(this);
            return;
        }
    }

    @Override
    public void l() {
        block3: {
            net.minecraft.C.a a10;
            block2: {
                String string = net.minecraft.i.g.b();
                a10 = this.cD;
                if (string != null) break block2;
                if (a10 == null) break block3;
                a10 = this.cD;
            }
            a10.a(new net.minecraft.Q.t(this.cw));
            this.M();
        }
    }

    @Override
    public void f(r r2) {
        block6: {
            block7: {
                Object object;
                x x2;
                Object object2;
                block8: {
                    String string = net.minecraft.i.g.b();
                    super.f(r2);
                    r2.b("playerGameType", this.c7.e().c());
                    String string2 = string;
                    r2.a("seenCredits", this.cY);
                    x x3 = this;
                    if (string2 == null) {
                        if (x3.cJ != null) {
                            object2 = new r();
                            ((r)object2).a("x", this.cJ.e);
                            ((r)object2).a("y", this.cJ.d);
                            ((r)object2).a("z", this.cJ.b);
                            r2.a("enteredNetherPosition", (net.minecraft.P.i)object2);
                        }
                        x3 = this.aX();
                    }
                    object2 = x3;
                    x2 = this.as();
                    if (string2 != null) break block6;
                    if (x2 == null) break block7;
                    object = object2;
                    if (string2 != null) break block8;
                    if (object == this) break block7;
                    object = object2;
                }
                if (((x)object).a(k.class).size() == 1) {
                    r r3 = new r();
                    r r4 = new r();
                    ((x)object2).e(r4);
                    r3.a("Attach", x2.u());
                    r3.a("Entity", r4);
                    r2.a("RootVehicle", r3);
                }
            }
            r2.a("recipeBook", this.cF.a());
        }
    }

    @Override
    protected void a(net.minecraft.K.j j2, boolean bl2) {
        super.a(j2, bl2);
        this.cD.a(new aA(this.W(), j2));
        a6.j.a(this);
    }

    @Override
    protected void a(net.minecraft.Z.i i2) {
        a6.d.a(this, i2);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    public void a(net.minecraft.B.a var1_1) {
        block38: {
            block36: {
                block37: {
                    block34: {
                        block35: {
                            block33: {
                                block32: {
                                    block31: {
                                        block30: {
                                            block29: {
                                                var2_2 = net.minecraft.i.g.b();
                                                v0 = var1_1;
                                                if (var2_2 != null) break block29;
                                                if (!(v0 instanceof q)) break block30;
                                                v0 = var1_1;
                                            }
                                            if (((q)v0).a() == null) break block30;
                                            v1 = this;
                                            if (var2_2 != null) break block31;
                                            if (v1.ae()) {
                                                this.a(new net.minecraft.at.h("container.spectatorCantOpen", new Object[0]).a(new net.minecraft.at.i().a(net.minecraft.at.l.RED)), true);
                                                if (var2_2 == null) return;
                                            }
                                        }
                                        v1 = this;
                                    }
                                    if (var2_2 != null) break block32;
                                    if (v1.cm == this.cu) break block33;
                                    v1 = this;
                                }
                                v1.ag();
                            }
                            v2 = var1_1 instanceof l;
                            if (var2_2 != null) break block34;
                            if (!v2) break block35;
                            var3_3 = (l)var1_1;
                            v2 = var3_3.e();
                            if (var2_2 != null) break block34;
                            if (!v2) break block35;
                            v2 = this.a(var3_3.a());
                            if (var2_2 == null) {
                                if (!v2) {
                                    v2 = this.ae();
                                    if (var2_2 == null) {
                                        if (!v2) {
                                            this.cD.a(new ah(new net.minecraft.at.h("container.isLocked", new Object[]{var1_1.d()}), net.minecraft.at.a.GAME_INFO));
                                            this.cD.a(new net.minecraft.Q.a6(net.minecraft.u.E.gW, ay.BLOCKS, this.a, this.aF, this.ax, 1.0f, 1.0f));
                                            return;
                                        } else {
                                            ** GOTO lbl41
                                        }
                                    } else {
                                        ** GOTO lbl40
                                    }
                                } else {
                                    ** GOTO lbl39
                                }
                            }
                            break block34;
lbl39:
                            // 2 sources

                            break block35;
lbl40:
                            // 2 sources

                            break block34;
                        }
                        this.A();
                        if (var2_2 != null) break block36;
                        v2 = var1_1 instanceof o;
                    }
                    if (!v2) break block37;
                    this.cD.a(new H(this.cW, ((o)var1_1).a(), var1_1.d(), var1_1.e()));
                    this.cm = ((o)var1_1).a(this.cB, this);
                    if (var2_2 == null) break block38;
                }
                this.cD.a(new H(this.cW, "minecraft:container", var1_1.d(), var1_1.e()));
            }
            this.cm = new net.minecraft.B.q(this.cB, var1_1, this);
        }
        this.cm.b = this.cW;
        this.cm.b(this);
    }

    public void a(k k2, boolean bl2) {
        block7: {
            boolean bl3;
            block4: {
                k k3;
                block5: {
                    block6: {
                        boolean bl4;
                        String string;
                        block2: {
                            block3: {
                                string = net.minecraft.i.g.b();
                                bl4 = bl2;
                                if (string != null) break block2;
                                if (!bl4) break block3;
                                this.cB.a(k2.cB);
                                this.f(k2.V());
                                this.b6 = k2.b6;
                                this.b4 = k2.b4;
                                this.b8 = k2.b8;
                                this.b7 = k2.b7;
                                this.k(k2.ad());
                                this.ag = k2.ag;
                                this.w = k2.w;
                                this.aB = k2.aB;
                                if (string == null) break block4;
                            }
                            k3 = this;
                            if (string != null) break block5;
                            bl4 = k3.aG.M().c("keepInventory");
                        }
                        if (bl4) break block6;
                        bl3 = k2.ae();
                        if (string != null) break block7;
                        if (!bl3) break block4;
                    }
                    this.cB.a(k2.cB);
                    this.b4 = k2.b4;
                    this.b8 = k2.b8;
                    this.b7 = k2.b7;
                    k3 = this;
                }
                k3.k(k2.ad());
            }
            this.bY = k2.bY;
            this.ck = k2.ck;
            this.E().b(cd, k2.E().b(cd));
            this.c_ = -1;
            this.c9 = -1.0f;
            this.cS = -1;
            this.cF.a(k2.cF);
            bl3 = this.cL.addAll(k2.cL);
        }
        this.cY = k2.cY;
        this.cJ = k2.cJ;
        this.g(k2.r());
        this.c(k2.p());
    }

    @Override
    public void a(net.minecraft.at.k k2) {
        this.cD.a(new ah(k2));
    }

    @Override
    protected void d(net.minecraft.K.j j2) {
        String string = net.minecraft.i.g.b();
        super.d(j2);
        String string2 = string;
        this.cD.a(new aA(this.W(), j2));
        if (string2 == null) {
            if (j2.g() == net.minecraft.u.c.m) {
                this.c8 = this.H;
                this.cH = new net.minecraft.k.l(this.a, this.aF, this.ax);
            }
            a6.j.a(this);
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean a(j j2) {
        String string = net.minecraft.i.g.b();
        boolean bl2 = this.m();
        if (string == null) {
            if (!bl2) return false;
            bl2 = super.a(j2);
        }
        if (string != null) return bl2;
        if (!bl2) return false;
        return true;
    }

    public void S() {
        this.c9 = -1.0E8f;
    }

    @Override
    public n f() {
        return new n(this.a, this.aF + 0.5, this.ax);
    }

    @Override
    public void a(s s2) {
        block4: {
            k k2;
            block2: {
                block3: {
                    String string = net.minecraft.i.g.b();
                    this.c7.a(s2);
                    String string2 = string;
                    k2 = this;
                    if (string2 != null) break block2;
                    k2.cD.a(new az(3, s2.c()));
                    if (s2 != net.minecraft.ah.s.SPECTATOR) break block3;
                    this.P();
                    this.aO();
                    if (string2 == null) break block4;
                }
                k2 = this;
            }
            k2.i(this);
        }
        this.l();
        this.U();
    }

    @Override
    protected void a(net.minecraft.K.j j2) {
        String string = net.minecraft.i.g.b();
        super.a(j2);
        String string2 = string;
        this.cD.a(new aN(this.W(), j2.g()));
        if (string2 == null) {
            if (j2.g() == net.minecraft.u.c.m) {
                this.cH = null;
            }
            a6.j.a(this);
        }
    }

    @Nullable
    public net.minecraft.at.k H() {
        return null;
    }

    @Override
    public void a(List<net.minecraft.az.k> list) {
        this.cF.b(list, this);
    }

    @Override
    protected void M() {
        block4: {
            k k2;
            block2: {
                block3: {
                    String string = net.minecraft.i.g.b();
                    k2 = this;
                    if (string != null) break block2;
                    if (!k2.ae()) break block3;
                    this.t();
                    this.g(true);
                    if (string == null) break block4;
                }
                k2 = this;
            }
            super.M();
        }
        this.n().x().b(this);
    }

    @Override
    public void c(double d10, double d11, double d12) {
        this.cD.a(d10, d11, d12, this.e, this.at);
    }

    public void i(x x2) {
        block3: {
            block2: {
                x x3 = this.I();
                String string = net.minecraft.i.g.b();
                x x4 = this.cE = x2 == null ? this : x2;
                if (string != null) break block2;
                if (x3 == this.cE) break block3;
                this.cD.a(new L(this.cE));
            }
            this.c(this.cE.a, this.cE.aF, this.cE.ax);
        }
    }

    @Override
    public boolean C() {
        return this.c7.e() == net.minecraft.ah.s.CREATIVE;
    }

    @Override
    public void a(x x2, int n2, G g10) {
        block6: {
            Collection<net.minecraft.D.h> collection;
            String string;
            block10: {
                block9: {
                    block8: {
                        block7: {
                            string = net.minecraft.i.g.b();
                            if (string != null) break block7;
                            if (x2 == this) break block6;
                            super.a(x2, n2, g10);
                            this.a(n2);
                        }
                        collection = this.d().a(net.minecraft.D.a.n);
                        boolean bl2 = x2 instanceof j;
                        if (string != null) break block8;
                        if (!bl2) break block9;
                        this.b(net.minecraft.l.m.H);
                        bl2 = collection.addAll(this.d().a(net.minecraft.D.a.b));
                    }
                    if (string == null) break block10;
                }
                this.b(net.minecraft.l.m.D);
            }
            collection.addAll(this.m(x2));
            for (net.minecraft.D.h h2 : collection) {
                this.d().d(this.g(), h2).e();
                if (string == null) {
                    if (string == null) continue;
                }
                break block6;
            }
            a6.q.a(this, x2, g10);
        }
    }

    @Override
    public void O() {
        super.O();
        this.cD.a(new net.minecraft.Q.P(this.aC(), net.minecraft.Q.B.END_COMBAT));
    }

    @Override
    public void a(W w2) {
        w2.a(this);
        this.cD.a(new net.minecraft.Q.z(w2.j()));
    }

    public k(net.minecraft.R.b b10, net.minecraft.ah.A a10, GameProfile gameProfile, p p2) {
        block11: {
            n n2;
            String string;
            block6: {
                block7: {
                    int n3;
                    block10: {
                        int n4;
                        block9: {
                            int n5;
                            block8: {
                                int n6;
                                super(a10, gameProfile);
                                this.c0 = "en_US";
                                this.cL = Lists.newLinkedList();
                                this.cP = Float.MIN_VALUE;
                                this.cC = Integer.MIN_VALUE;
                                this.cO = Integer.MIN_VALUE;
                                this.cG = Integer.MIN_VALUE;
                                this.cN = Integer.MIN_VALUE;
                                this.c6 = Integer.MIN_VALUE;
                                this.c9 = -1.0E8f;
                                this.cS = -99999999;
                                this.cX = true;
                                this.c_ = -99999999;
                                this.cZ = 60;
                                this.cV = true;
                                this.c1 = System.currentTimeMillis();
                                string = net.minecraft.i.g.b();
                                this.cF = new net.minecraft.l.j();
                                p2.i = this;
                                this.c7 = p2;
                                n2 = a10.G();
                                if (string != null) break block6;
                                if (!a10.D.h() || a10.b().g() == net.minecraft.ah.s.ADVENTURE) break block7;
                                n3 = Math.max(0, b10.a(a10));
                                n4 = n6 = net.minecraft.k.h.f(a10.O().a(n2.e(), n2.a()));
                                n5 = n3;
                                if (string != null) break block8;
                                if (n4 < n5) {
                                    n3 = n6;
                                }
                                n4 = n6;
                                if (string != null) break block9;
                                n5 = 1;
                            }
                            if (n4 > n5) break block10;
                            n4 = 1;
                        }
                        n3 = n4;
                    }
                    n2 = a10.c(n2.a(this.g.nextInt(n3 * 2 + 1) - n3, 0, this.g.nextInt(n3 * 2 + 1) - n3));
                }
                this.c3 = b10;
                this.c2 = b10.O().a((j)this);
                this.cT = b10.O().h(this);
                this.aI = 1.0f;
            }
            this.a(n2, 0.0f, 0.0f);
            while (!a10.a((x)this, this.m()).isEmpty()) {
                k k2 = this;
                if (string == null) {
                    if (!(k2.aF < 255.0)) break;
                    k2 = this;
                }
                k2.g(this.a, this.aF + 1.0, this.ax);
                if (string == null) continue;
            }
            if (!net.minecraft.k.m.c()) break block11;
            net.minecraft.i.g.b("moJUmb");
        }
    }

    public void v() {
        block3: {
            k k2;
            block2: {
                String string = net.minecraft.i.g.b();
                k2 = this;
                if (string != null) break block2;
                if (k2.c5) break block3;
                k2 = this;
            }
            k2.cD.a(new aZ(-1, -1, this.cB.h()));
        }
    }

    @Override
    public void a(D d10, net.minecraft.B.a a10) {
        String string = net.minecraft.i.g.b();
        net.minecraft.B.n n2 = this.cm;
        k k2 = this;
        if (string == null) {
            if (n2 != k2.cu) {
                this.ag();
            }
            this.A();
            this.cD.a(new H(this.cW, "EntityHorse", a10.d(), a10.e(), d10.W()));
            this.cm = new net.minecraft.B.v(this.cB, a10, d10, this);
            this.cm.b = this.cW;
            n2 = this.cm;
            k2 = this;
        }
        n2.b(k2);
    }

    public void a(float f10, float f11, boolean bl2, boolean bl3) {
        block9: {
            block13: {
                int n2;
                block12: {
                    String string;
                    block10: {
                        float f12;
                        block11: {
                            block8: {
                                string = net.minecraft.i.g.b();
                                n2 = this.N();
                                if (string != null) break block8;
                                if (n2 == 0) break block9;
                                float f13 = f10 - -1.0f;
                                n2 = f13 == 0.0f ? 0 : (f13 > 0.0f ? 1 : -1);
                            }
                            if (string != null) break block10;
                            if (n2 < 0) break block11;
                            float f14 = f10 - 1.0f;
                            n2 = f14 == 0.0f ? 0 : (f14 < 0.0f ? -1 : 1);
                            if (string != null) break block10;
                            if (n2 <= 0) {
                                this.bu = f10;
                            }
                        }
                        n2 = (f12 = f11 - -1.0f) == 0.0f ? 0 : (f12 > 0.0f ? 1 : -1);
                    }
                    if (string != null) break block12;
                    if (n2 < 0) break block13;
                    float f15 = f11 - 1.0f;
                    n2 = f15 == 0.0f ? 0 : (f15 < 0.0f ? -1 : 1);
                }
                if (n2 <= 0) {
                    this.bU = f11;
                }
            }
            this.aL = bl2;
            this.f(bl3);
        }
    }

    @Nullable
    public net.minecraft.k.l o() {
        return this.cJ;
    }

    public net.minecraft.l.j G() {
        return this.cF;
    }

    private void a(y y2) {
        block2: {
            ag ag2;
            y y3;
            block1: {
                String string = net.minecraft.i.g.b();
                y3 = y2;
                if (string != null) break block1;
                if (y3 == null) break block2;
                y3 = y2;
            }
            if ((ag2 = y3.k()) != null) {
                this.cD.a(ag2);
            }
        }
    }

    public void R() {
        this.c1 = net.minecraft.R.b.R();
    }

    public void Q() {
        this.a(7, true);
        this.a(7, false);
    }

    @Override
    public void b(net.minecraft.w.d d10, int n2) {
        super.b(d10, n2);
        this.c_ = -1;
    }

    @Override
    protected void aD() {
        block3: {
            k k2;
            block4: {
                int n2;
                block2: {
                    String string = net.minecraft.i.g.b();
                    n2 = this.aw;
                    if (string != null) break block2;
                    if (n2 <= 0) break block3;
                    k2 = this;
                    if (string != null) break block4;
                    n2 = k2.cI ? 1 : 0;
                }
                if (n2 != 0) break block3;
                k2 = this;
            }
            --k2.aw;
        }
    }

    public void a(m m2) {
        this.c0 = m2.c();
        String string = net.minecraft.i.g.b();
        this.cQ = m2.d();
        this.cV = m2.a();
        net.minecraft.q.m m3 = this.E();
        net.minecraft.q.r r2 = cd;
        byte by2 = (byte)m2.b();
        if (string == null) {
            m3.b(r2, by2);
            m3 = this.E();
            r2 = cy;
            by2 = m2.e() == net.minecraft.ar.b.LEFT ? (byte)0 : 1;
        }
        m3.b(r2, by2);
    }

    @Override
    public void a(net.minecraft.B.n n2, int n3, int n4) {
        this.cD.a(new net.minecraft.Q.w(n2.b, n3, n4));
    }

    public void q() {
        this.a(7, true);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    public boolean a(int var1_1, String var2_2) {
        block11: {
            block10: {
                var3_3 = net.minecraft.i.g.b();
                v0 = "seed".equals(var2_2);
                if (var3_3 == null) {
                    if (v0) {
                        v0 = this.c3.J();
                        if (var3_3 == null) {
                            if (!v0) {
                                return true;
                            } else {
                                ** GOTO lbl-1000
                            }
                        }
                    } else lbl-1000:
                    // 3 sources

                    {
                        v0 = "tell".equals(var2_2);
                    }
                }
                if (var3_3 != null) return v0;
                if (v0 != false) return true;
                v0 = "help".equals(var2_2);
                if (var3_3 != null) return v0;
                if (v0 != false) return true;
                v0 = "me".equals(var2_2);
                if (var3_3 != null) return v0;
                if (v0 != false) return true;
                v0 = "trigger".equals(var2_2);
                if (var3_3 != null) return v0;
                if (v0 != false) return true;
                v1 = this.c3.O().e(this.m());
                if (var3_3 != null) return v1;
                if (!v1) {
                    return false;
                }
                v2 = var4_4 = (net.minecraft.a.f)this.c3.O().v().a(this.m());
                if (var3_3 != null) break block10;
                if (v2 == null) break block11;
                v2 = var4_4;
            }
            v3 = v2.b();
            if (var3_3 != null) return v3;
            if (v3 < var1_1) return false;
            return true;
        }
        v4 = this.c3.r();
        if (var3_3 != null) return v4;
        if (v4 < var1_1) return false;
        return true;
    }

    @Override
    public void a(boolean bl2, boolean bl3, boolean bl4) {
        block6: {
            net.minecraft.C.a a10;
            block5: {
                String string = net.minecraft.i.g.b();
                k k2 = this;
                if (string == null) {
                    if (k2.as()) {
                        this.n().x().b(this, new net.minecraft.Q.C(this, 2));
                    }
                    super.a(bl2, bl3, bl4);
                    k2 = this;
                }
                a10 = k2.cD;
                if (string != null) break block5;
                if (a10 == null) break block6;
                a10 = this.cD;
            }
            a10.a(this.a, this.aF, this.ax, this.e, this.at);
        }
    }

    public void r() {
        this.cm.b(this);
        this.cm = this.cu;
    }

    @Override
    public void a(r r2) {
        block13: {
            k k2;
            block12: {
                boolean bl2;
                block11: {
                    String string;
                    block7: {
                        block8: {
                            k k3;
                            block9: {
                                block10: {
                                    String string2 = net.minecraft.i.g.b();
                                    super.a(r2);
                                    string = string2;
                                    bl2 = r2.a("playerGameType", 99);
                                    if (string != null) break block7;
                                    if (!bl2) break block8;
                                    k3 = this;
                                    if (string != null) break block9;
                                    if (!k3.e().af()) break block10;
                                    this.c7.a(this.e().X());
                                    if (string == null) break block8;
                                }
                                k3 = this;
                            }
                            k3.c7.a(net.minecraft.ah.s.a(r2.m("playerGameType")));
                        }
                        bl2 = r2.a("enteredNetherPosition", 10);
                    }
                    if (string != null) break block11;
                    if (bl2) {
                        r r3 = r2.h("enteredNetherPosition");
                        this.cJ = new net.minecraft.k.l(r3.e("x"), r3.e("y"), r3.e("z"));
                    }
                    k2 = this;
                    if (string != null) break block12;
                    k2.cY = r2.f("seenCredits");
                    bl2 = r2.a("recipeBook", 10);
                }
                if (!bl2) break block13;
                k2 = this;
            }
            k2.cF.a(r2.h("recipeBook"));
        }
    }

    public b X() {
        return this.cQ;
    }

    @Override
    public void b(a3 a32) {
        super.b(a32);
        this.u();
    }

    public static void c(net.minecraft.av.b b10) {
        b10.a(net.minecraft.av.f.PLAYER, (net.minecraft.av.g)new i());
    }

    @Override
    public boolean ae() {
        return this.c7.e() == net.minecraft.ah.s.SPECTATOR;
    }

    @Override
    public void a(G g10) {
        Object object;
        Object object2;
        String string;
        block14: {
            Object object3;
            z z2;
            block22: {
                k k2;
                block24: {
                    block23: {
                        boolean bl2;
                        block15: {
                            block16: {
                                block18: {
                                    net.minecraft.D.j j2;
                                    net.minecraft.D.j j3;
                                    block20: {
                                        block21: {
                                            block19: {
                                                Object object4;
                                                block17: {
                                                    boolean bl3 = this.aG.M().c("showDeathMessages");
                                                    string = net.minecraft.i.g.b();
                                                    this.cD.a(new net.minecraft.Q.P(this.aC(), net.minecraft.Q.B.ENTITY_DIED, bl3));
                                                    bl2 = bl3;
                                                    if (string != null) break block15;
                                                    if (!bl2) break block16;
                                                    object4 = object2 = this.aM();
                                                    if (string != null) break block17;
                                                    if (object4 == null) break block18;
                                                    object4 = object2;
                                                }
                                                j3 = ((net.minecraft.D.l)object4).j();
                                                j2 = net.minecraft.D.j.ALWAYS;
                                                if (string != null) break block19;
                                                if (j3 == j2) break block18;
                                                j3 = ((net.minecraft.D.l)object2).j();
                                                j2 = net.minecraft.D.j.HIDE_FOR_OTHER_TEAMS;
                                            }
                                            if (string != null) break block20;
                                            if (j3 != j2) break block21;
                                            this.c3.O().a((j)this, this.aC().h());
                                            if (string == null) break block16;
                                        }
                                        j3 = ((net.minecraft.D.l)object2).j();
                                        j2 = net.minecraft.D.j.HIDE_FOR_OWN_TEAM;
                                    }
                                    if (j3 != j2) break block16;
                                    this.c3.O().b((j)this, this.aC().h());
                                    if (string == null) break block16;
                                }
                                this.c3.O().a(this.aC().h());
                            }
                            this.P();
                            z2 = this.aG;
                            if (string != null) break block22;
                            bl2 = z2.M().c("keepInventory");
                        }
                        if (bl2) break block23;
                        k2 = this;
                        if (string != null) break block24;
                        if (!k2.ae()) {
                            this.H();
                            this.cB.i();
                        }
                    }
                    k2 = this;
                }
                z2 = k2.aG;
            }
            object2 = z2.c().a(net.minecraft.D.a.l).iterator();
            while (object2.hasNext()) {
                object = (net.minecraft.D.h)object2.next();
                object3 = this;
                if (string == null) {
                    e e10 = ((j)object3).d().d(this.g(), (net.minecraft.D.h)object);
                    e10.e();
                    if (string == null) continue;
                }
                break block14;
            }
            object3 = object2 = this.m();
        }
        if (string == null) {
            if (object2 != null) {
                object = net.minecraft.U.h.g.get(net.minecraft.U.h.a((x)object2));
                if (object != null) {
                    this.b(((net.minecraft.U.q)object).b);
                }
                ((x)object2).a((x)this, this.bO, g10);
            }
            this.b(net.minecraft.l.m.L);
            this.a(net.minecraft.l.m.V);
            this.T();
            this.a(0, false);
            this.aC().f();
        }
    }

    @Override
    public boolean a(x x2, boolean bl2) {
        block5: {
            net.minecraft.C.a a10;
            block6: {
                k k2;
                x x3 = this.as();
                String string = net.minecraft.i.g.b();
                x x4 = this;
                if (string == null) {
                    if (!super.a(x2, bl2)) {
                        return false;
                    }
                    x4 = this.as();
                }
                if ((k2 = x4) == x3) break block5;
                a10 = this.cD;
                if (string != null) break block6;
                if (a10 == null) break block5;
                a10 = this.cD;
            }
            a10.a(this.a, this.aF, this.ax, this.e, this.at);
        }
        return true;
    }

    @Override
    public void g(x x2) {
        this.n().x().b(this, new net.minecraft.Q.C(x2, 5));
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    @Nullable
    public x e(int var1_1) {
        block24: {
            block25: {
                block23: {
                    block21: {
                        block22: {
                            block20: {
                                block19: {
                                    block17: {
                                        block18: {
                                            this.cI = true;
                                            var2_2 = net.minecraft.i.g.b();
                                            v0 = this.p;
                                            if (var2_2 != null) break block17;
                                            if (v0 != 0) break block18;
                                            v0 = var1_1;
                                            v1 = -1;
                                            if (var2_2 != null) break block19;
                                            if (v0 != v1) break block18;
                                            this.cJ = new net.minecraft.k.l(this.a, this.aF, this.ax);
                                            if (var2_2 == null) break block20;
                                        }
                                        v0 = this.p;
                                    }
                                    v1 = -1;
                                }
                                if (var2_2 != null) break block21;
                                if (v0 == v1) break block20;
                                v0 = var1_1;
                                if (var2_2 != null) break block22;
                                if (v0 != 0) {
                                    this.cJ = null;
                                }
                            }
                            v0 = this.p;
                        }
                        if (var2_2 != null) break block23;
                        v1 = 1;
                    }
                    if (v0 == v1) {
                        v0 = var1_1;
                        if (var2_2 == null) {
                            if (v0 == 1) {
                                this.aG.c(this);
                                v2 = this;
                                if (var2_2 != null) return v2;
                                if (!v2.cK) {
                                    this.cK = true;
                                    this.cD.a(new az(4, this.cY != false ? 0.0f : 1.0f));
                                    this.cY = true;
                                }
                                v2 = this;
                                return v2;
                            } else {
                                ** GOTO lbl-1000
                            }
                        }
                    } else lbl-1000:
                    // 3 sources

                    {
                        v3 = this;
                        if (var2_2 != null) return v3;
                        v0 = v3.p;
                    }
                }
                if (v0 != 0) break block24;
                v4 = var1_1;
                if (var2_2 != null) break block25;
                if (v4 != 1) break block24;
                v4 = 1;
            }
            var1_1 = v4;
        }
        this.c3.O().a(this, var1_1);
        this.cD.a(new A(1032, net.minecraft.k.n.o, 0, false));
        this.c_ = -1;
        this.c9 = -1.0f;
        this.cS = -1;
        v3 = this;
        return v3;
    }

    @Override
    protected void b(n n2) {
        block3: {
            k k2;
            block2: {
                String string = net.minecraft.i.g.b();
                k2 = this;
                if (string != null) break block2;
                if (k2.ae()) break block3;
                k2 = this;
            }
            super.b(n2);
        }
    }

    private boolean m() {
        return this.c3.m();
    }

    /*
     * Exception decompiling
     */
    @Override
    public boolean a(G var1_1, float var2_2) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * org.benf.cfr.reader.util.ConfusedCFRException: Statement already marked as first in another block
         * org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.markFirstStatementInBlock(Op03SimpleStatement.java:453)
         * org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.Misc.markWholeBlock(Misc.java:232)
         * org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.ConditionalRewriter.considerAsSimpleIf(ConditionalRewriter.java:646)
         * org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.ConditionalRewriter.identifyNonjumpingConditionals(ConditionalRewriter.java:52)
         * org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:681)
         * org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:258)
         * org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:192)
         * org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         * org.benf.cfr.reader.entities.Method.analyse(Method.java:521)
         * org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1035)
         * org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:922)
         * org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:253)
         * org.benf.cfr.reader.Driver.doJar(Driver.java:135)
         * org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:65)
         * org.benf.cfr.reader.Main.main(Main.java:49)
         */
        throw new IllegalStateException(Decompilation failed);
    }

    @Override
    public void d() {
        super.d();
        this.cD.a(new net.minecraft.Q.P(this.aC(), net.minecraft.Q.B.ENTER_COMBAT));
    }

    public h W() {
        return this.c2;
    }

    public void V() {
        this.cI = false;
    }

    public void a(String string, String string2) {
        this.cD.a(new a9(string, string2));
    }

    public void p() {
        block3: {
            k k2;
            block2: {
                this.c4 = true;
                String string = net.minecraft.i.g.b();
                this.at();
                k2 = this;
                if (string != null) break block2;
                if (!k2.b2) break block3;
                k2 = this;
            }
            k2.a(true, false, false);
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean a(G g10) {
        String string = net.minecraft.i.g.b();
        boolean bl2 = super.a(g10);
        if (string != null) return bl2;
        if (bl2) return true;
        bl2 = this.w();
        if (string != null) return bl2;
        if (!bl2) return false;
        return true;
    }

    @Override
    public void ag() {
        this.cD.a(new aG(this.cm.b));
        this.r();
    }

    @Override
    public void aO() {
        block2: {
            net.minecraft.C.a a10;
            block3: {
                x x2 = this.as();
                super.aO();
                x x3 = this.as();
                String string = net.minecraft.i.g.b();
                if (x3 == x2) break block2;
                a10 = this.cD;
                if (string != null) break block3;
                if (a10 == null) break block2;
                a10 = this.cD;
            }
            a10.a(this.a, this.aF, this.ax, this.e, this.at);
        }
    }

    @Override
    public void a(v[] arrv) {
        block2: {
            ArrayList arrayList = Lists.newArrayList();
            v[] arrv2 = arrv;
            String string = net.minecraft.i.g.b();
            for (v v2 : arrv2) {
                arrayList.add(net.minecraft.az.t.a(v2));
                if (string == null) {
                    if (string == null) continue;
                }
                break block2;
            }
            this.b(arrayList);
        }
    }

    @Override
    public void K() {
        block3: {
            k k2;
            block4: {
                boolean bl2;
                block2: {
                    String string = net.minecraft.i.g.b();
                    bl2 = this.aX.G();
                    if (string != null) break block2;
                    if (bl2) break block3;
                    k2 = this;
                    if (string != null) break block4;
                    bl2 = k2.aq();
                }
                if (!bl2) break block3;
                this.cD.a(new a5(this, 9));
                k2 = this;
            }
            super.K();
        }
    }

    private void A() {
        this.cW = this.cW % 100 + 1;
    }

    public String e() {
        String string = this.cD.C.a().toString();
        string = string.substring(string.indexOf("/") + 1);
        string = string.substring(0, string.indexOf(":"));
        return string;
    }

    @Override
    public f a(n n2) {
        f f10 = super.a(n2);
        String string = net.minecraft.i.g.b();
        f f11 = f10;
        if (string == null) {
            if (f11 == net.minecraft.i.f.OK) {
                this.b(net.minecraft.l.m.e);
                an an2 = new an(this, n2);
                this.n().x().a((x)this, an2);
                this.cD.a(this.a, this.aF, this.ax, this.e, this.at);
                this.cD.a(an2);
                a6.o.a(this);
            }
            f11 = f10;
        }
        return f11;
    }

    @Override
    public void a(B b10) {
        b10.b(true);
        this.a((y)b10);
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    @Override
    public void ae() {
        k k2;
        String string;
        block19: {
            block15: {
                block16: {
                    block18: {
                        boolean bl2;
                        block17: {
                            x x2;
                            block12: {
                                x x3;
                                this.c7.a();
                                --this.cZ;
                                string = net.minecraft.i.g.b();
                                int n2 = this.Q--;
                                if (string == null) {
                                    if (n2 > 0) {
                                        // empty if block
                                    }
                                    this.cm.a();
                                    n2 = this.aG.C ? 1 : 0;
                                }
                                boolean bl3 = true;
                                do {
                                    int[] arrn;
                                    block14: {
                                        block13: {
                                            if (!bl3 || (bl3 = false)) break block13;
                                            if (string != null) break block14;
                                            if (n2 != 0) break block13;
                                            n2 = this.cm.a(this) ? 1 : 0;
                                            if (string != null) break block14;
                                            if (n2 == 0) {
                                                this.ag();
                                                this.cm = this.cu;
                                            }
                                        }
                                        n2 = this.cL.isEmpty() ? 1 : 0;
                                    }
                                    if (n2 != 0) break;
                                    int n3 = this.cL.size();
                                    int n4 = Integer.MAX_VALUE;
                                    block1: while (true) {
                                        int n5 = Math.min(n3, n4);
                                        arrn = new int[n5];
                                        x3 = this;
                                        if (string != null) break block12;
                                        Iterator<Integer> iterator = ((k)x3).cL.iterator();
                                        int n6 = 0;
                                        while (iterator.hasNext()) {
                                            n3 = n6;
                                            n4 = n5;
                                            if (string != null) continue block1;
                                            if (n3 >= n4) break block1;
                                            arrn[n6++] = iterator.next();
                                            iterator.remove();
                                            if (string == null) continue;
                                        }
                                        break;
                                    }
                                    this.cD.a(new u(arrn));
                                } while (string == null);
                                x3 = x2 = this.I();
                            }
                            if (string != null) break block15;
                            if (x2 == this) break block16;
                            bl2 = x2.aL();
                            if (string != null) break block17;
                            if (!bl2) break block18;
                            this.b(x2.a, x2.aF, x2.ax, x2.e, x2.at);
                            this.c3.O().a(this);
                            k2 = this;
                            if (string != null) break block19;
                            bl2 = k2.a4();
                        }
                        if (!bl2) break block16;
                        this.i(this);
                        if (string == null) break block16;
                    }
                    this.i(this);
                }
                a6.c.a(this);
            }
            k2 = this;
        }
        if (string == null) {
            if (k2.cH != null) {
                a6.h.a(this, this.cH, this.H - this.c8);
            }
            k2 = this;
        }
        k2.cT.a(this);
    }

    @Override
    public void a(net.minecraft.B.n n2, net.minecraft.B.a a10) {
        String string = net.minecraft.i.g.b();
        for (int i2 = 0; i2 < a10.a(); ++i2) {
            this.cD.a(new net.minecraft.Q.w(n2.b, i2, a10.c(i2)));
            if (string == null) continue;
        }
    }

    @Override
    public void a(net.minecraft.B.n n2, a2<net.minecraft.w.d> a22) {
        this.cD.a(new net.minecraft.Q.d(n2.b, a22));
        this.cD.a(new aZ(-1, -1, this.cB.h()));
    }

    @Override
    public void b(List<net.minecraft.az.k> list) {
        this.cF.a(list, this);
    }

    @Override
    public void a(x x2, int n2) {
        super.a(x2, n2);
        this.cm.a();
    }

    public long x() {
        return this.c1;
    }

    public boolean d() {
        return this.c4;
    }

    private static Throwable a(Throwable throwable) {
        return throwable;
    }

    @Override
    public void h(x x2) {
        this.n().x().b(this, new net.minecraft.Q.C(x2, 4));
    }

    public void a(net.minecraft.B.n n2) {
        this.a(n2, n2.e());
    }

    /*
     * Exception decompiling
     */
    private Collection<net.minecraft.D.h> m(x var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * org.benf.cfr.reader.util.ConfusedCFRException: Statement already marked as first in another block
         * org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.markFirstStatementInBlock(Op03SimpleStatement.java:453)
         * org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.Misc.markWholeBlock(Misc.java:232)
         * org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.ConditionalRewriter.considerAsSimpleIf(ConditionalRewriter.java:646)
         * org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.ConditionalRewriter.identifyNonjumpingConditionals(ConditionalRewriter.java:52)
         * org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:681)
         * org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:258)
         * org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:192)
         * org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         * org.benf.cfr.reader.entities.Method.analyse(Method.java:521)
         * org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1035)
         * org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:922)
         * org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:253)
         * org.benf.cfr.reader.Driver.doJar(Driver.java:135)
         * org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:65)
         * org.benf.cfr.reader.Main.main(Main.java:49)
         */
        throw new IllegalStateException(Decompilation failed);
    }

    private void a(net.minecraft.D.a a10, int n2) {
        Iterator<net.minecraft.D.h> iterator = this.d().a(a10).iterator();
        String string = net.minecraft.i.g.b();
        while (iterator.hasNext()) {
            net.minecraft.D.h h2 = iterator.next();
            e e10 = this.d().d(this.g(), h2);
            e10.a(n2);
            if (string == null) continue;
        }
    }

    @Override
    public void a(net.minecraft.B.n n2, int n3, net.minecraft.w.d d10) {
        block5: {
            k k2;
            block6: {
                net.minecraft.B.n n4;
                String string;
                block4: {
                    string = net.minecraft.i.g.b();
                    n4 = n2;
                    if (string != null) break block4;
                    if (n4.a(n3) instanceof P) break block5;
                    n4 = n2;
                }
                if (n4 == this.cu) {
                    a6.e.a(this, this.cB);
                }
                k2 = this;
                if (string != null) break block6;
                if (k2.c5) break block5;
                k2 = this;
            }
            k2.cD.a(new aZ(n2.b, n3, d10));
        }
    }

    public void l(x x2) {
        this.cL.remove((Object)x2.W());
    }

    public boolean w() {
        return this.cI;
    }

    public void h() {
        this.cm.b(this);
    }

    /*
     * Enabled aggressive block sorting
     */
    public x I() {
        x x2;
        String string = net.minecraft.i.g.b();
        k k2 = this;
        if (string == null) {
            if (k2.cE == null) {
                x2 = this;
                return x2;
            }
            k2 = this;
        }
        x2 = k2.cE;
        return x2;
    }

    static {
        cR = LogManager.getLogger();
    }

    @Override
    public void a(d d10) {
        block4: {
            String string;
            block3: {
                string = net.minecraft.i.g.b();
                if (string != null) break block3;
                if (d10 == null) break block4;
                this.c2.b(this, d10, 0);
            }
            for (net.minecraft.D.h h2 : this.d().a(d10.d())) {
                this.d().d(this.g(), h2).a(0);
                if (string == null) continue;
            }
        }
    }

    @Override
    public void a(net.minecraft.w.d d10, a3 a32) {
        net.minecraft.w.k k2 = d10.w();
        if (k2 == net.minecraft.u.h.as) {
            net.minecraft.C.m m2 = new net.minecraft.C.m(Unpooled.buffer());
            m2.a(a32);
            this.cD.a(new X("MC|BOpen", m2));
        }
    }
}

