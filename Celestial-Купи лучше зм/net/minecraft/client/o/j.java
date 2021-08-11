/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  com.google.common.util.concurrent.FutureCallback
 *  com.google.common.util.concurrent.Futures
 *  com.mojang.authlib.GameProfile
 *  io.netty.buffer.Unpooled
 *  javax.annotation.Nullable
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package net.minecraft.client.o;

import com.google.common.collect.Maps;
import com.google.common.util.concurrent.FutureCallback;
import com.google.common.util.concurrent.Futures;
import com.mojang.authlib.GameProfile;
import io.netty.buffer.Unpooled;
import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.UUID;
import javax.annotation.Nullable;
import net.minecraft.C.H;
import net.minecraft.C.u;
import net.minecraft.J.F;
import net.minecraft.J.G;
import net.minecraft.J.o;
import net.minecraft.J.t;
import net.minecraft.N.W;
import net.minecraft.N.y;
import net.minecraft.P.r;
import net.minecraft.Q.I;
import net.minecraft.Q.L;
import net.minecraft.Q.O;
import net.minecraft.Q.P;
import net.minecraft.Q.R;
import net.minecraft.Q.S;
import net.minecraft.Q.T;
import net.minecraft.Q.X;
import net.minecraft.Q.a0;
import net.minecraft.Q.a1;
import net.minecraft.Q.a2;
import net.minecraft.Q.a3;
import net.minecraft.Q.a4;
import net.minecraft.Q.a5;
import net.minecraft.Q.a6;
import net.minecraft.Q.a7;
import net.minecraft.Q.a9;
import net.minecraft.Q.aA;
import net.minecraft.Q.aC;
import net.minecraft.Q.aD;
import net.minecraft.Q.aE;
import net.minecraft.Q.aF;
import net.minecraft.Q.aG;
import net.minecraft.Q.aH;
import net.minecraft.Q.aO;
import net.minecraft.Q.aR;
import net.minecraft.Q.aS;
import net.minecraft.Q.aW;
import net.minecraft.Q.aX;
import net.minecraft.Q.aZ;
import net.minecraft.Q.a_;
import net.minecraft.Q.aa;
import net.minecraft.Q.ab;
import net.minecraft.Q.ae;
import net.minecraft.Q.ag;
import net.minecraft.Q.ah;
import net.minecraft.Q.ak;
import net.minecraft.Q.al;
import net.minecraft.Q.am;
import net.minecraft.Q.an;
import net.minecraft.Q.ao;
import net.minecraft.Q.aq;
import net.minecraft.Q.at;
import net.minecraft.Q.au;
import net.minecraft.Q.aw;
import net.minecraft.Q.az;
import net.minecraft.Q.w;
import net.minecraft.U.A;
import net.minecraft.U.B;
import net.minecraft.U.C;
import net.minecraft.U.N;
import net.minecraft.U.x;
import net.minecraft.aN;
import net.minecraft.ag.D;
import net.minecraft.ah.J;
import net.minecraft.ah.U;
import net.minecraft.ah.s;
import net.minecraft.ah.z;
import net.minecraft.ar.ay;
import net.minecraft.ar.q;
import net.minecraft.ar.v;
import net.minecraft.client.I.p;
import net.minecraft.client.K;
import net.minecraft.client.Q;
import net.minecraft.client.b.V;
import net.minecraft.client.b.Y;
import net.minecraft.client.b.av;
import net.minecraft.client.f.i;
import net.minecraft.client.h.a;
import net.minecraft.client.o.e;
import net.minecraft.client.o.h;
import net.minecraft.client.o.k;
import net.minecraft.client.o.n;
import net.minecraft.client.q.b;
import net.minecraft.client.q.c;
import net.minecraft.d.M;
import net.minecraft.d.l;
import net.minecraft.j.g;
import net.minecraft.k.m;
import net.minecraft.u.E;
import net.minecraft.w.d;
import net.minecraft.z.f;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class j
implements net.minecraft.n.a {
    private /* synthetic */ boolean a;
    private final /* synthetic */ Map<UUID, e> e;
    private final /* synthetic */ net.minecraft.client.E.i g;
    private final /* synthetic */ u m;
    public /* synthetic */ int f;
    private /* synthetic */ boolean k;
    private final /* synthetic */ Random d;
    private static /* synthetic */ int[] c;
    private /* synthetic */ Q l;
    private final /* synthetic */ GameProfile j;
    private final /* synthetic */ net.minecraft.client.b.L i;
    private static final /* synthetic */ Logger b;
    public /* synthetic */ net.minecraft.client.E.l h;

    @Override
    public void a(ah ah2) {
        H.a(ah2, this, this.l);
        this.l.n.a(ah2.a(), ah2.c());
    }

    @Override
    public void a(net.minecraft.Q.m m2) {
        H.a(m2, this, this.l);
        this.l.e.a(m2.c(), m2.a(), m2.d(), m2.b());
    }

    @Override
    public void a(a6 a62) {
        H.a(a62, this, this.l);
        this.l.e.a(this.l.s, a62.c(), a62.a(), a62.b(), a62.e(), a62.g(), a62.d(), a62.f());
    }

    public j(Q q2, net.minecraft.client.b.L l2, u u2, GameProfile gameProfile) {
        this.e = Maps.newHashMap();
        this.f = 20;
        this.d = new Random();
        this.l = q2;
        this.i = l2;
        this.m = u2;
        this.j = gameProfile;
        this.g = new net.minecraft.client.E.i(q2);
    }

    @Override
    public void a(w w2) {
        block3: {
            net.minecraft.B.n n2;
            block4: {
                c c10;
                int[] arrn;
                block2: {
                    int[] arrn2 = net.minecraft.client.o.j.b();
                    H.a(w2, this, this.l);
                    arrn = arrn2;
                    c10 = this.l.s;
                    n2 = c10.cm;
                    if (arrn == null) break block2;
                    if (n2 == null) break block3;
                    n2 = c10.cm;
                }
                if (arrn == null) break block4;
                if (n2.b != w2.c()) break block3;
                n2 = c10.cm;
            }
            n2.a(w2.b(), w2.a());
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    public void a(aO var1_1) {
        H.a(var1_1, this, this.l);
        var3_2 = null;
        var2_3 = net.minecraft.client.o.j.b();
        var4_4 = this.l.s;
        v0 = var1_1.a();
        if (var2_3 == null) ** GOTO lbl11
        if (v0 == 0) {
            var3_2 = var4_4.cu;
        } else {
            v0 = var1_1.a();
lbl11:
            // 2 sources

            if (v0 == var4_4.cm.b) {
                var3_2 = var4_4.cm;
            }
        }
        if (var3_2 == null) return;
        if (var1_1.c() != false) return;
        this.a(new net.minecraft.d.p(var1_1.a(), var1_1.b(), true));
    }

    @Override
    public void a(net.minecraft.Q.f f10) {
        H.a(f10, this, this.l);
        this.l.s.a(f10.a(), f10.c(), f10.b());
    }

    @Override
    public void a(net.minecraft.Q.N n2) {
        block10: {
            net.minecraft.client.b.L l2;
            block9: {
                int n3;
                block8: {
                    H.a(n2, this, this.l);
                    int[] arrn = net.minecraft.client.o.j.b();
                    net.minecraft.l.i i2 = this.l.s.G();
                    i2.b(n2.b());
                    i2.a(n2.d());
                    int[] arrn2 = arrn;
                    O o2 = n2.e();
                    n3 = net.minecraft.client.o.h.b[o2.ordinal()];
                    if (arrn2 == null) break block8;
                    block0 : switch (n3) {
                        case 1: {
                            Iterator<net.minecraft.az.k> iterator = n2.a().iterator();
                            while (iterator.hasNext() || arrn2 == null) {
                                net.minecraft.az.k k2 = iterator.next();
                                i2.e(k2);
                                if (arrn2 != null) continue;
                            }
                            break;
                        }
                        {
                            case 2: {
                                n2.a().forEach(i2::g);
                                n2.c().forEach(i2::b);
                                if (arrn2 != null) break block0;
                            }
                            case 3: {
                                n2.a().forEach(arg_0 -> this.lambda$func_191980_a$1(i2, arg_0));
                                break block0;
                                break;
                            }
                        }
                    }
                    net.minecraft.client.B.j.f.forEach(arg_0 -> j.lambda$func_191980_a$2(i2, arg_0));
                    l2 = this.l.aO;
                    if (arrn2 == null) break block9;
                    n3 = l2 instanceof a;
                }
                if (n3 == 0) break block10;
                l2 = this.l.aO;
            }
            ((a)((Object)l2)).c();
        }
    }

    @Override
    public void a(aZ aZ2) {
        block8: {
            int n2;
            d d10;
            c c10;
            block20: {
                int n3;
                block19: {
                    int n4;
                    int[] arrn;
                    block18: {
                        int n5;
                        block13: {
                            block11: {
                                block12: {
                                    block15: {
                                        Object object;
                                        block16: {
                                            block17: {
                                                d d11;
                                                Object object2;
                                                block14: {
                                                    int n6;
                                                    block9: {
                                                        block10: {
                                                            int n7;
                                                            block6: {
                                                                block7: {
                                                                    int[] arrn2 = net.minecraft.client.o.j.b();
                                                                    H.a(aZ2, this, this.l);
                                                                    arrn = arrn2;
                                                                    c10 = this.l.s;
                                                                    d10 = aZ2.a();
                                                                    n2 = aZ2.b();
                                                                    this.l.aI().a(d10);
                                                                    n6 = aZ2.c();
                                                                    n7 = -1;
                                                                    if (arrn == null) break block6;
                                                                    if (n6 != n7) break block7;
                                                                    c10.cB.e(d10);
                                                                    if (arrn != null) break block8;
                                                                }
                                                                n6 = aZ2.c();
                                                                if (arrn == null) break block9;
                                                                n7 = -2;
                                                            }
                                                            if (n6 != n7) break block10;
                                                            c10.cB.a(n2, d10);
                                                            if (arrn != null) break block8;
                                                        }
                                                        n6 = 0;
                                                    }
                                                    n4 = n6;
                                                    n3 = this.l.aO instanceof p;
                                                    if (arrn != null) {
                                                        if (n3 != 0) {
                                                            object2 = (p)this.l.aO;
                                                            int n8 = ((p)object2).b();
                                                            if (arrn != null) {
                                                                n8 = n8 != net.minecraft.ad.a.g.h() ? 1 : 0;
                                                            }
                                                            n4 = n8;
                                                        }
                                                        n3 = aZ2.c();
                                                    }
                                                    if (arrn == null) break block11;
                                                    if (n3 != 0) break block12;
                                                    n3 = aZ2.b();
                                                    n5 = 36;
                                                    if (arrn == null) break block13;
                                                    if (n3 < n5) break block12;
                                                    n3 = n2;
                                                    n5 = 45;
                                                    if (arrn == null) break block13;
                                                    if (n3 >= n5) break block12;
                                                    d11 = d10;
                                                    if (arrn == null) break block14;
                                                    if (d11.G()) break block15;
                                                    d11 = c10.cu.a(n2).d();
                                                }
                                                object = object2 = d11;
                                                if (arrn == null) break block16;
                                                if (((d)object).G()) break block17;
                                                object = object2;
                                                if (arrn == null) break block16;
                                                if (((d)object).t() >= d10.t()) break block15;
                                            }
                                            object = d10;
                                        }
                                        ((d)object).f(5);
                                    }
                                    c10.cu.a(n2, d10);
                                    if (arrn != null) break block8;
                                }
                                n3 = aZ2.c();
                            }
                            if (arrn == null) break block18;
                            n5 = c10.cm.b;
                        }
                        if (n3 != n5) break block8;
                        n3 = aZ2.c();
                    }
                    if (arrn == null) break block19;
                    if (n3 != 0) break block20;
                    n3 = n4;
                }
                if (n3 != 0) break block8;
            }
            c10.cm.a(n2, d10);
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    public void a(aa var1_1) {
        block28: {
            block16: {
                block26: {
                    block27: {
                        block24: {
                            block25: {
                                block21: {
                                    block23: {
                                        block22: {
                                            block19: {
                                                block20: {
                                                    block18: {
                                                        block17: {
                                                            v0 = net.minecraft.client.o.j.b();
                                                            H.a(var1_1, this, this.l);
                                                            var3_2 = this.h.c();
                                                            var2_3 = v0;
                                                            if (var1_1.d() != 0) break block17;
                                                            var4_4 = var3_2.e(var1_1.g());
                                                            if (var2_3 != null) break block18;
                                                        }
                                                        var4_4 = var3_2.g(var1_1.g());
                                                    }
                                                    v1 = var1_1;
                                                    if (var2_3 == null) break block19;
                                                    if (v1.d() == 0) break block20;
                                                    v2 = var1_1.d();
                                                    if (var2_3 == null) break block21;
                                                    if (v2 != 2) break block22;
                                                }
                                                var4_4.c(var1_1.h());
                                                var4_4.a(var1_1.i());
                                                var4_4.b(var1_1.e());
                                                var4_4.a(net.minecraft.at.l.a(var1_1.a()));
                                                var4_4.a(var1_1.b());
                                                v1 = var1_1;
                                            }
                                            if ((var5_5 = net.minecraft.D.j.a(v1.f())) != null) {
                                                var4_4.b((net.minecraft.D.j)var5_5);
                                            }
                                            v3 = var1_1;
                                            if (var2_3 == null) break block23;
                                            var6_6 = net.minecraft.D.i.a(v3.c());
                                            if (var6_6 != null) {
                                                var4_4.a(var6_6);
                                            }
                                        }
                                        v3 = var1_1;
                                    }
                                    if (var2_3 == null) break block24;
                                    v2 = v3.d();
                                }
                                if (v2 == 0) break block25;
                                v4 = var1_1.d();
                                v5 = 3;
                                if (var2_3 == null) break block26;
                                if (v4 != v5) break block27;
                            }
                            v3 = var1_1;
                        }
                        for (String var6_8 : v3.j()) {
                            var3_2.a(var6_8, var1_1.g());
                            if (var2_3 != null) {
                                if (var2_3 != null) continue;
                            }
                            break block16;
                        }
                    }
                    v4 = var1_1.d();
                    v5 = 4;
                }
                if (var2_3 != null) {
                    if (v4 == v5) {
                        for (String var6_10 : var1_1.j()) {
                            var3_2.a(var6_10, var4_4);
                            if (var2_3 == null) return;
                            if (var2_3 != null) continue;
                        }
                    } else {
                        ** GOTO lbl63
                    }
                }
                break block28;
            }
            v4 = var1_1.d();
            v5 = 1;
        }
        if (v4 != v5) return;
        var3_2.c(var4_4);
    }

    static Q c(j j2) {
        return j2.l;
    }

    @Override
    public void a(net.minecraft.Q.d d10) {
        block3: {
            int n2;
            c c10;
            block1: {
                block2: {
                    int[] arrn = net.minecraft.client.o.j.b();
                    H.a(d10, this, this.l);
                    int[] arrn2 = arrn;
                    c10 = this.l.s;
                    n2 = d10.a();
                    if (arrn2 == null) break block1;
                    if (n2 != 0) break block2;
                    c10.cu.a(d10.b());
                    if (arrn2 != null) break block3;
                }
                n2 = d10.a();
            }
            if (n2 == c10.cm.b) {
                c10.cm.a(d10.b());
            }
        }
    }

    public e a(UUID uUID) {
        return this.e.get(uUID);
    }

    @Override
    public void a(aH aH2) {
        block0: {
            H.a(aH2, this, this.l);
            x x2 = this.h.a(aH2.b());
            if (x2 == null || aH2.a() == null) break block0;
            x2.E().a(aH2.a());
        }
    }

    @Override
    public void a(R r2) {
        block3: {
            x x2;
            block4: {
                x x3;
                block5: {
                    x x4;
                    int[] arrn;
                    block2: {
                        H.a(r2, this, this.l);
                        x3 = this.h.a(r2.a());
                        arrn = net.minecraft.client.o.j.b();
                        x4 = this.h.a(r2.b());
                        x2 = x3;
                        if (arrn == null) break block2;
                        if (!(x2 instanceof C)) break block3;
                        x2 = x4;
                    }
                    if (arrn == null) break block4;
                    if (x2 == null) break block5;
                    ((C)x3).a(x4, false);
                    if (arrn != null) break block3;
                }
                x2 = x3;
            }
            ((C)x2).a(false, false);
        }
    }

    @Override
    public void a(net.minecraft.Q.i i2) {
        block3: {
            net.minecraft.client.b.L l2;
            net.minecraft.B.n n2;
            block5: {
                int n3;
                block4: {
                    int[] arrn;
                    block2: {
                        int[] arrn2 = net.minecraft.client.o.j.b();
                        H.a(i2, this, this.l);
                        n2 = this.l.s.cm;
                        arrn = arrn2;
                        n3 = n2.b;
                        if (arrn == null) break block2;
                        if (n3 != i2.a()) break block3;
                        n3 = n2.c(this.l.s) ? 1 : 0;
                    }
                    if (arrn == null) break block4;
                    if (n3 == 0) break block3;
                    l2 = this.l.aO;
                    if (arrn == null) break block5;
                    n3 = l2 instanceof a;
                }
                if (n3 == 0) break block3;
                l2 = this.l.aO;
            }
            net.minecraft.client.h.e e10 = ((a)((Object)l2)).d();
            e10.a(i2.b(), n2.f);
        }
    }

    @Override
    public void a(aX aX2) {
        int[] arrn = net.minecraft.client.o.j.b();
        H.a(aX2, this, this.l);
        Iterator<net.minecraft.Q.g> iterator = aX2.a().iterator();
        int[] arrn2 = arrn;
        while (iterator.hasNext()) {
            block14: {
                Object object;
                net.minecraft.Q.g g10;
                block12: {
                    block13: {
                        g10 = iterator.next();
                        object = aX2.b();
                        if (arrn2 == null) break block12;
                        if (object != net.minecraft.Q.v.REMOVE_PLAYER) break block13;
                        this.e.remove(g10.d().getId());
                        if (arrn2 != null) break block14;
                    }
                    object = this.e.get(g10.d().getId());
                }
                e e10 = (e)object;
                Object object2 = aX2.b();
                if (arrn2 != null && object2 == net.minecraft.Q.v.ADD_PLAYER) {
                    e10 = new e(g10);
                    object2 = this.e.put(e10.p().getId(), e10);
                }
                if (e10 != null) {
                    switch (aX2.b()) {
                        case ADD_PLAYER: {
                            e10.a(g10.b());
                            e10.c(g10.a());
                            if (arrn2 != null) break;
                        }
                        case UPDATE_GAME_MODE: {
                            e10.a(g10.b());
                            if (arrn2 != null) break;
                        }
                        case UPDATE_LATENCY: {
                            e10.c(g10.a());
                            if (arrn2 != null) break;
                        }
                        case UPDATE_DISPLAY_NAME: {
                            e10.a(g10.c());
                            break;
                        }
                    }
                }
            }
            if (arrn2 != null) continue;
        }
    }

    @Override
    public void a(ao ao2) {
        block10: {
            x x2;
            int[] arrn;
            x x3;
            block9: {
                H.a(ao2, this, this.l);
                x3 = this.h.a(ao2.a());
                arrn = net.minecraft.client.o.j.b();
                x2 = x3;
                if (arrn == null) break block9;
                if (x2 == null) break block10;
                x2 = x3;
            }
            if (arrn != null) {
                if (!(x2 instanceof B)) {
                    throw new IllegalStateException("Server tried to update attributes of a non-living entity (actually: " + x3 + ")");
                }
                x2 = x3;
            }
            g g10 = ((B)x2).ao();
            block0: for (aF aF2 : ao2.b()) {
                net.minecraft.j.b b10;
                net.minecraft.j.b b11 = b10 = g10.a(aF2.c());
                if (arrn != null) {
                    if (b11 == null) {
                        b10 = g10.b(new net.minecraft.j.e(null, aF2.c(), 0.0, Double.MIN_NORMAL, Double.MAX_VALUE));
                    }
                    b10.a(aF2.b());
                    b11 = b10;
                }
                b11.c();
                for (net.minecraft.j.f f10 : aF2.a()) {
                    b10.b(f10);
                    if (arrn == null) continue block0;
                    if (arrn != null) continue;
                }
                if (arrn != null) continue;
            }
        }
    }

    @Override
    public void a(aR aR2) {
        block2: {
            net.minecraft.aw.s s2;
            net.minecraft.client.b.af af2;
            block3: {
                String string;
                block5: {
                    net.minecraft.aw.s s3;
                    block6: {
                        net.minecraft.aw.s s4;
                        net.minecraft.client.b.af af3;
                        int[] arrn;
                        block4: {
                            H.a(aR2, this, this.l);
                            af2 = this.l.Y.k();
                            s2 = net.minecraft.w.an.a(aR2.a(), this.l.e);
                            arrn = net.minecraft.client.o.j.b();
                            if (arrn == null) break block2;
                            if (s2 != null) break block3;
                            string = "map_" + aR2.a();
                            s2 = new net.minecraft.aw.s(string);
                            af3 = af2;
                            if (arrn == null) break block4;
                            if (af3.a(string) == null) break block5;
                            af3 = af2;
                        }
                        s3 = s4 = af3.a(af2.a(string));
                        if (arrn == null) break block6;
                        if (s3 == null) break block5;
                        s3 = s4;
                    }
                    s2 = s3;
                }
                this.l.e.a(string, s2);
            }
            aR2.a(s2);
            af2.b(s2);
        }
    }

    public u e() {
        return this.m;
    }

    @Override
    public void a(a3 a32) {
        H.a(a32, this, this.l);
        this.h.a(a32.a(), a32.b(), false);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    public void a(aD var1_1) {
        H.a(var1_1, this, this.l);
        var3_2 = var1_1.a(this.h);
        var2_3 = net.minecraft.client.o.j.b();
        v0 = var3_2;
        if (var2_3 != null) {
            if (v0 == null) return;
            var3_2.u += (long)var1_1.d();
            var3_2.i += (long)var1_1.j();
            var3_2.F += (long)var1_1.f();
            v0 = var3_2;
        }
        var4_4 = (double)v0.u / 4096.0;
        var6_5 = (double)var3_2.i / 4096.0;
        var8_6 = (double)var3_2.F / 4096.0;
        v1 = var3_2.a1();
        if (var2_3 != null) {
            if (v1 != 0) return;
            v1 = var1_1.a();
        }
        if (var2_3 == null) ** GOTO lbl21
        if (v1 != 0) {
            v1 = var1_1.g() * 360;
lbl21:
            // 2 sources

            v2 = (float)v1 / 256.0f;
        } else {
            v2 = var3_2.e;
        }
        var10_7 = v2;
        v3 = var1_1.a();
        if (var2_3 == null) ** GOTO lbl29
        if (v3 != 0) {
            v3 = var1_1.h() * 360;
lbl29:
            // 2 sources

            v4 = (float)v3 / 256.0f;
        } else {
            v4 = var3_2.at;
        }
        var11_8 = v4;
        var3_2.a(var4_4, var6_5, var8_6, var10_7, var11_8, 3, false);
        var3_2.A = var1_1.e();
    }

    @Override
    public void a(net.minecraft.Q.l l2) {
        block2: {
            block1: {
                int[] arrn;
                block0: {
                    int[] arrn2 = net.minecraft.client.o.j.b();
                    H.a(l2, this, this.l);
                    arrn = arrn2;
                    if (arrn == null) break block0;
                    if (l2.b() != 0) break block1;
                    this.l.s.o().b(l2.a());
                }
                if (arrn != null) break block2;
            }
            this.l.s.o().b(l2.a(), l2.b());
        }
    }

    @Override
    public void a(net.minecraft.Q.y y2) {
        block0: {
            H.a(y2, this, this.l);
            double d10 = y2.a();
            double d11 = y2.h();
            double d12 = y2.g();
            float f10 = (float)(y2.e() * 360) / 256.0f;
            float f11 = (float)(y2.f() * 360) / 256.0f;
            b b10 = new b(this.l.e, this.a(y2.b()).p());
            b10.N = d10;
            b10.am = d10;
            b10.L = d11;
            b10.af = d11;
            b10.k = d12;
            b10.n = d12;
            N.a(b10, d10, d11, d12);
            b10.b(d10, d11, d12, f10, f11);
            this.h.a(y2.d(), (x)b10);
            List<net.minecraft.q.s<?>> list = y2.c();
            if (list == null) break block0;
            b10.E().a(list);
        }
    }

    @Override
    public void a(ae ae2) {
        block5: {
            x x2;
            x x3;
            block4: {
                int[] arrn = net.minecraft.client.o.j.b();
                H.a(ae2, this, this.l);
                int[] arrn2 = arrn;
                double d10 = ae2.e();
                double d11 = ae2.b();
                double d12 = ae2.d();
                x3 = null;
                if (ae2.c() == 1) {
                    x3 = new net.minecraft.an.b(this.h, d10, d11, d12, false);
                }
                x2 = x3;
                if (arrn2 == null) break block4;
                if (x2 == null) break block5;
                N.a(x3, d10, d11, d12);
                x3.e = 0.0f;
                x3.at = 0.0f;
                x2 = x3;
            }
            x2.g(ae2.a());
            this.h.d(x3);
        }
    }

    @Override
    public void a(net.minecraft.Q.q q2) {
        block8: {
            int[] arrn;
            B b10;
            x x2;
            block10: {
                block9: {
                    x x3;
                    block7: {
                        H.a(q2, this, this.l);
                        x2 = this.h.a(q2.a());
                        b10 = (B)this.h.a(q2.b());
                        arrn = net.minecraft.client.o.j.b();
                        x3 = b10;
                        if (arrn != null) {
                            if (x3 == null) {
                                b10 = this.l.s;
                            }
                            x3 = x2;
                        }
                        if (arrn == null) break block7;
                        if (x3 == null) break block8;
                        x3 = x2;
                    }
                    if (!(x3 instanceof net.minecraft.J.E)) break block9;
                    this.h.a(x2.a, x2.aF, x2.ax, E.ec, ay.PLAYERS, 0.1f, (this.d.nextFloat() - this.d.nextFloat()) * 0.35f + 0.9f, false);
                    if (arrn != null) break block10;
                }
                this.h.a(x2.a, x2.aF, x2.ax, E.ak, ay.PLAYERS, 0.2f, (this.d.nextFloat() - this.d.nextFloat()) * 1.4f + 2.0f, false);
            }
            x x4 = x2;
            if (arrn != null) {
                if (x4 instanceof t) {
                    ((t)x2).m().c(q2.c());
                }
                this.l.au.a(new net.minecraft.client.u.a2((z)this.h, x2, b10, 0.5f));
                x4 = this.h.b(q2.a());
            }
        }
    }

    @Override
    public void a(aW aW2) {
        H.a(aW2, this, this.l);
        double d10 = aW2.d();
        double d11 = aW2.b();
        double d12 = aW2.c();
        net.minecraft.J.E e10 = new net.minecraft.J.E(this.h, d10, d11, d12, aW2.e());
        N.a(e10, d10, d11, d12);
        e10.e = 0.0f;
        e10.at = 0.0f;
        e10.g(aW2.a());
        this.h.a(aW2.a(), (x)e10);
    }

    static FutureCallback a(j j2) {
        return j2.g();
    }

    @Override
    public void a(net.minecraft.Q.u u2) {
        int[] arrn = net.minecraft.client.o.j.b();
        H.a(u2, this, this.l);
        int[] arrn2 = arrn;
        for (int i2 = 0; i2 < u2.a().length; ++i2) {
            this.h.b(u2.a()[i2]);
            if (arrn2 != null) continue;
        }
    }

    @Override
    public void a(I i2) {
        H.a(i2, this, this.l);
        i2.a(this.h.O());
    }

    @Override
    public void a(aw aw2) {
        block4: {
            net.minecraft.D.b b10;
            block3: {
                int[] arrn;
                block2: {
                    H.a(aw2, this, this.l);
                    b10 = this.h.c();
                    arrn = net.minecraft.client.o.j.b();
                    if (arrn == null) break block2;
                    if (!aw2.a().isEmpty()) break block3;
                    b10.a(aw2.b(), null);
                }
                if (arrn != null) break block4;
            }
            net.minecraft.D.h h2 = b10.h(aw2.a());
            b10.a(aw2.b(), h2);
        }
    }

    private void lambda$handleChangeGameState$0() {
        this.l.s.c9.a(new net.minecraft.d.s(net.minecraft.d.J.PERFORM_RESPAWN));
    }

    private static Throwable a(Throwable throwable) {
        return throwable;
    }

    @Override
    public void a(aq aq2) {
        block7: {
            x x2;
            int[] arrn;
            x x3;
            block5: {
                block6: {
                    int[] arrn2 = net.minecraft.client.o.j.b();
                    H.a(aq2, this, this.l);
                    x3 = this.h.a(aq2.b());
                    arrn = arrn2;
                    x2 = x3;
                    if (arrn == null) break block5;
                    if (x2 != null) break block6;
                    b.warn("Received passengers for unknown entity");
                    if (arrn != null) break block7;
                }
                x2 = x3;
            }
            boolean bl2 = x2.b((x)this.l.s);
            x3.at();
            int[] arrn3 = aq2.a();
            int n2 = arrn3.length;
            int n3 = 0;
            while (n3 < n2) {
                block8: {
                    block9: {
                        int n4 = arrn3[n3];
                        x x4 = this.h.a(n4);
                        if (arrn == null) break block8;
                        if (x4 == null) break block9;
                        x4.a(x3, true);
                        if (arrn == null) break block8;
                        if (x4 == this.l.s && !bl2) {
                            this.l.n.a(net.minecraft.client.D.h.a("mount.onboard", net.minecraft.client.l.c.a(this.l.ac.bc.e())), false);
                        }
                    }
                    ++n3;
                }
                if (arrn != null) continue;
            }
        }
    }

    @Override
    public void a(az az2) {
        block18: {
            int n2;
            int n3;
            c c10;
            block40: {
                int n4;
                block41: {
                    int[] arrn;
                    float f10;
                    block38: {
                        block39: {
                            block36: {
                                block37: {
                                    block27: {
                                        block28: {
                                            block31: {
                                                float f11;
                                                net.minecraft.client.l.c c11;
                                                block34: {
                                                    float f12;
                                                    block35: {
                                                        block32: {
                                                            float f13;
                                                            block33: {
                                                                block29: {
                                                                    float f14;
                                                                    block30: {
                                                                        block23: {
                                                                            block24: {
                                                                                int n5;
                                                                                block25: {
                                                                                    int n6;
                                                                                    block26: {
                                                                                        block21: {
                                                                                            block22: {
                                                                                                block19: {
                                                                                                    block20: {
                                                                                                        block16: {
                                                                                                            block17: {
                                                                                                                block15: {
                                                                                                                    block13: {
                                                                                                                        block14: {
                                                                                                                            H.a(az2, this, this.l);
                                                                                                                            c10 = this.l.s;
                                                                                                                            n4 = az2.b();
                                                                                                                            f10 = az2.a();
                                                                                                                            arrn = net.minecraft.client.o.j.b();
                                                                                                                            n6 = net.minecraft.k.h.d(f10 + 0.5f);
                                                                                                                            n3 = n4;
                                                                                                                            if (arrn == null) break block13;
                                                                                                                            if (n3 < 0) break block14;
                                                                                                                            n3 = n4;
                                                                                                                            n2 = az.a.length;
                                                                                                                            if (arrn == null) break block15;
                                                                                                                            if (n3 < n2 && az.a[n4] != null) {
                                                                                                                                ((net.minecraft.i.j)c10).a(new net.minecraft.at.h(az.a[n4], new Object[0]), false);
                                                                                                                            }
                                                                                                                        }
                                                                                                                        n3 = n4;
                                                                                                                    }
                                                                                                                    n2 = 1;
                                                                                                                }
                                                                                                                if (arrn == null) break block16;
                                                                                                                if (n3 != n2) break block17;
                                                                                                                this.h.b().c(true);
                                                                                                                this.h.f(0.0f);
                                                                                                                if (arrn != null) break block18;
                                                                                                            }
                                                                                                            n3 = n4;
                                                                                                            n2 = 2;
                                                                                                        }
                                                                                                        if (arrn == null) break block19;
                                                                                                        if (n3 != n2) break block20;
                                                                                                        this.h.b().c(false);
                                                                                                        this.h.f(1.0f);
                                                                                                        if (arrn != null) break block18;
                                                                                                    }
                                                                                                    n3 = n4;
                                                                                                    n2 = 3;
                                                                                                }
                                                                                                if (arrn == null) break block21;
                                                                                                if (n3 != n2) break block22;
                                                                                                this.l.aW.a(s.a(n6));
                                                                                                if (arrn != null) break block18;
                                                                                            }
                                                                                            n3 = n4;
                                                                                            n2 = 4;
                                                                                        }
                                                                                        if (arrn == null) break block23;
                                                                                        if (n3 != n2) break block24;
                                                                                        n5 = n6;
                                                                                        if (arrn == null) break block25;
                                                                                        if (n5 != 0) break block26;
                                                                                        this.l.s.c9.a(new net.minecraft.d.s(net.minecraft.d.J.PERFORM_RESPAWN));
                                                                                        this.l.a(new V());
                                                                                        if (arrn != null) break block18;
                                                                                    }
                                                                                    n5 = n6;
                                                                                }
                                                                                if (n5 != 1) break block18;
                                                                                this.l.a(new net.minecraft.client.b.ae(true, this::lambda$handleChangeGameState$0));
                                                                                if (arrn != null) break block18;
                                                                            }
                                                                            n3 = n4;
                                                                            n2 = 5;
                                                                        }
                                                                        if (arrn == null) break block27;
                                                                        if (n3 != n2) break block28;
                                                                        c11 = this.l.ac;
                                                                        float f15 = f10 - 0.0f;
                                                                        f11 = f15 == 0.0f ? 0 : (f15 > 0.0f ? 1 : -1);
                                                                        if (arrn == null) break block29;
                                                                        if (f11 != false) break block30;
                                                                        this.l.a(new net.minecraft.client.b.aA());
                                                                        if (arrn != null) break block31;
                                                                    }
                                                                    f11 = (f14 = f10 - 101.0f) == 0.0f ? 0 : (f14 > 0.0f ? 1 : -1);
                                                                }
                                                                if (arrn == null) break block32;
                                                                if (f11 != false) break block33;
                                                                this.l.n.f().a(new net.minecraft.at.h("demo.help.movement", net.minecraft.client.l.c.a(c11.aW.e()), net.minecraft.client.l.c.a(c11.C.e()), net.minecraft.client.l.c.a(c11.O.e()), net.minecraft.client.l.c.a(c11.G.e())));
                                                                if (arrn != null) break block31;
                                                            }
                                                            f11 = (f13 = f10 - 102.0f) == 0.0f ? 0 : (f13 > 0.0f ? 1 : -1);
                                                        }
                                                        if (arrn == null) break block34;
                                                        if (f11 != false) break block35;
                                                        this.l.n.f().a(new net.minecraft.at.h("demo.help.jump", net.minecraft.client.l.c.a(c11.v.e())));
                                                        if (arrn != null) break block31;
                                                    }
                                                    f11 = (f12 = f10 - 103.0f) == 0.0f ? 0 : (f12 > 0.0f ? 1 : -1);
                                                }
                                                if (f11 == false) {
                                                    this.l.n.f().a(new net.minecraft.at.h("demo.help.inventory", net.minecraft.client.l.c.a(c11.bW.e())));
                                                }
                                            }
                                            if (arrn != null) break block18;
                                        }
                                        n3 = n4;
                                        n2 = 6;
                                    }
                                    if (arrn == null) break block36;
                                    if (n3 != n2) break block37;
                                    this.h.a(c10, c10.a, c10.aF + (double)c10.l(), c10.ax, E.dZ, ay.PLAYERS, 0.18f, 0.45f);
                                    if (arrn != null) break block18;
                                }
                                n3 = n4;
                                n2 = 7;
                            }
                            if (arrn == null) break block38;
                            if (n3 != n2) break block39;
                            this.h.f(f10);
                            if (arrn != null) break block18;
                        }
                        n3 = n4;
                        n2 = 8;
                    }
                    if (arrn == null) break block40;
                    if (n3 != n2) break block41;
                    this.h.i(f10);
                    if (arrn != null) break block18;
                }
                n3 = n4;
                n2 = 10;
            }
            if (n3 == n2) {
                this.h.a(net.minecraft.ar.aH.MOB_APPEARANCE, c10.a, c10.aF, c10.ax, 0.0, 0.0, 0.0, new int[0]);
                this.h.a(c10, c10.a, c10.aF, c10.ax, E.bk, ay.HOSTILE, 1.0f, 1.0f);
            }
        }
    }

    static u b(j j2) {
        return j2.m;
    }

    @Override
    public void a(net.minecraft.Q.F f10) {
        H.a(f10, this, this.l);
        x x2 = f10.a(this.h);
        if (x2 != null) {
            float f11 = (float)(f10.a() * 360) / 256.0f;
            x2.a(f11);
        }
    }

    @Override
    public void a(net.minecraft.Q.a a10) {
        H.a(a10, this, this.l);
        this.l.n.g().a(a10);
    }

    @Override
    public void a(net.minecraft.Q.j j2) {
        block8: {
            net.minecraft.client.b.L l2;
            block7: {
                int[] arrn;
                block6: {
                    int[] arrn2 = net.minecraft.client.o.j.b();
                    H.a(j2, this, this.l);
                    Iterator<Map.Entry<net.minecraft.l.d, Integer>> iterator = j2.a().entrySet().iterator();
                    arrn = arrn2;
                    while (iterator.hasNext()) {
                        Map.Entry<net.minecraft.l.d, Integer> entry = iterator.next();
                        net.minecraft.l.d d10 = entry.getKey();
                        int n2 = entry.getValue();
                        this.l.s.a().b(this.l.s, d10, n2);
                        if (arrn != null) {
                            if (arrn != null) continue;
                        }
                        break block6;
                    }
                    this.k = true;
                }
                l2 = this.l.aO;
                if (arrn == null) break block7;
                if (!(l2 instanceof net.minecraft.client.b.a4)) break block8;
                l2 = this.l.aO;
            }
            ((net.minecraft.client.b.a4)((Object)l2)).b();
        }
    }

    @Override
    public void a(net.minecraft.Q.aN aN2) {
        block3: {
            x x2;
            block2: {
                x x3;
                int[] arrn = net.minecraft.client.o.j.b();
                H.a(aN2, this, this.l);
                int[] arrn2 = arrn;
                x2 = x3 = aN2.a(this.h);
                if (arrn2 == null) break block2;
                if (!(x2 instanceof B)) break block3;
                x2 = x3;
            }
            ((B)x2).b(aN2.a());
        }
    }

    @Override
    public void a(a_ a_2) {
        H.a(a_2, this, this.l);
        this.l.s.b(a_2.a(), true);
        this.l.e.b().a(a_2.a());
    }

    /*
     * Exception decompiling
     */
    @Override
    public void a(ag var1_1) {
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
    public void a(net.minecraft.Q.W w2) {
        int[] arrn = net.minecraft.client.o.j.b();
        H.a(w2, this, this.l);
        int[] arrn2 = arrn;
        for (a1 a12 : w2.a()) {
            this.h.b(a12.a(), a12.c());
            if (arrn2 != null) continue;
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    public void a(T var1_1) {
        var2_2 = net.minecraft.client.o.j.b();
        v0 = this.l.n.c();
        v1 = var1_1;
        if (var2_2 == null) ** GOTO lbl9
        if (v1.a().a().isEmpty()) {
            v2 = null;
        } else {
            v1 = var1_1;
lbl9:
            // 2 sources

            v2 = v1.a();
        }
        v0.b(v2);
        v3 = this.l.n.c();
        v4 = var1_1;
        if (var2_2 == null) ** GOTO lbl18
        if (v4.b().a().isEmpty()) {
            v5 = null;
        } else {
            v4 = var1_1;
lbl18:
            // 2 sources

            v5 = v4.b();
        }
        v3.a(v5);
    }

    public GameProfile d() {
        return this.j;
    }

    private FutureCallback<Object> g() {
        return new n(this);
    }

    @Override
    public void a(aA aA2) {
        block5: {
            net.minecraft.K.b b10;
            int n2;
            x x2;
            block4: {
                int[] arrn = net.minecraft.client.o.j.b();
                H.a(aA2, this, this.l);
                int[] arrn2 = arrn;
                x2 = this.h.a(aA2.e());
                n2 = x2 instanceof B;
                if (arrn2 == null) break block4;
                if (n2 == 0) break block5;
                n2 = aA2.g();
            }
            if ((b10 = net.minecraft.K.b.a(n2)) != null) {
                net.minecraft.K.j j2 = new net.minecraft.K.j(b10, aA2.c(), aA2.d(), aA2.b(), aA2.a());
                j2.a(aA2.f());
                ((B)x2).b(j2);
            }
        }
    }

    @Override
    public void a(aG aG2) {
        H.a(aG2, this, this.l);
        this.l.s.Q();
    }

    @Override
    public void a(net.minecraft.Q.D d10) {
        block4: {
            v v2;
            block3: {
                int[] arrn;
                block2: {
                    int[] arrn2 = net.minecraft.client.o.j.b();
                    H.a(d10, this, this.l);
                    arrn = arrn2;
                    v2 = d10.a();
                    if (arrn == null) break block2;
                    if (v2 != null) break block3;
                    this.g.a(null, false);
                }
                if (arrn != null) break block4;
            }
            aN aN2 = this.g.a().a(v2);
            this.g.a(aN2, false);
        }
    }

    @Override
    public void a(at at2) {
        H.a(at2, this, this.l);
        this.l.p().c(new net.minecraft.client.e.y(new v(at2.b()), at2.f(), at2.a(), at2.g(), false, 0, net.minecraft.client.e.n.LINEAR, (float)at2.d(), (float)at2.e(), (float)at2.c()));
    }

    @Override
    public void a(aE aE2) {
        block8: {
            block7: {
                List<net.minecraft.q.s<?>> list;
                B b10;
                B b11;
                float f10;
                int[] arrn;
                float f11;
                double d10;
                double d11;
                double d12;
                block6: {
                    H.a(aE2, this, this.l);
                    d12 = aE2.l();
                    d11 = aE2.g();
                    d10 = aE2.f();
                    f11 = (float)(aE2.i() * 360) / 256.0f;
                    arrn = net.minecraft.client.o.j.b();
                    f10 = (float)(aE2.j() * 360) / 256.0f;
                    b10 = b11 = (B)net.minecraft.U.h.a(aE2.k(), (z)this.l.e);
                    if (arrn == null) break block6;
                    if (b10 == null) break block7;
                    N.a(b11, d12, d11, d10);
                    b11.bf = (float)(aE2.h() * 360) / 256.0f;
                    b11.a1 = (float)(aE2.h() * 360) / 256.0f;
                    b10 = b11;
                }
                x[] arrx = b10.aE();
                if (arrn != null) {
                    if (arrx != null) {
                        int n2 = aE2.e() - b11.W();
                        for (x x2 : arrx) {
                            x2.g(x2.W() + n2);
                            if (arrn != null) {
                                if (arrn != null) continue;
                            }
                            break;
                        }
                    } else {
                        b11.g(aE2.e());
                        b11.a(aE2.c());
                        b11.b(d12, d11, d10, f11, f10);
                        b11.aq = (float)aE2.d() / 8000.0f;
                        b11.G = (float)aE2.b() / 8000.0f;
                        b11.d = (float)aE2.a() / 8000.0f;
                        this.h.a(aE2.e(), (x)b11);
                    }
                }
                if ((list = aE2.m()) != null) {
                    b11.E().a(list);
                }
                if (arrn != null) break block8;
            }
            b.warn("Skipping Entity with id {}", (Object)aE2.k());
        }
    }

    @Override
    public void a(net.minecraft.Q.c c10) {
        H.a(c10, this, this.l);
        this.l.e.a(c10.a());
        this.l.e.b(c10.b());
    }

    @Override
    public void a(net.minecraft.Q.e e10) {
        H.a(e10, this, this.l);
        this.g.a(e10);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    @Override
    public void a(a9 var1_1) {
        block19: {
            block18: {
                block16: {
                    block17: {
                        block15: {
                            block14: {
                                var3_2 = var1_1.b();
                                var4_3 = var1_1.a();
                                var2_4 = net.minecraft.client.o.j.b();
                                v0 = this.b(var3_2);
                                if (var2_4 == null) break block14;
                                if (v0 == false) return;
                                v1 = var3_2;
                                v2 = "level://";
                                if (var2_4 == null) ** GOTO lbl16
                                v0 = v1.startsWith(v2);
                            }
                            if (!v0) break block15;
                            try {
                                v1 = var3_2.substring("level://".length());
                                v2 = StandardCharsets.UTF_8.toString();
lbl16:
                                // 2 sources

                                var5_5 = URLDecoder.decode(v1, v2);
                                var6_7 = new File(this.l.aJ, "saves");
                                var7_8 = new File(var6_7, (String)var5_5);
                                if (var2_4 == null) return;
                                if (var7_8.isFile()) {
                                    this.m.a(new net.minecraft.d.d(net.minecraft.d.k.ACCEPTED));
                                    Futures.addCallback(this.l.aa().c(var7_8), this.g());
                                    return;
                                }
                            }
                            catch (UnsupportedEncodingException var5_6) {
                                // empty catch block
                            }
                            this.m.a(new net.minecraft.d.d(net.minecraft.d.k.FAILED_DOWNLOAD));
                            if (var2_4 != null) return;
                        }
                        v3 = var5_5 = this.l.s();
                        if (var2_4 == null) break block16;
                        if (v3 == null) break block17;
                        v3 = var5_5;
                        if (var2_4 == null) break block16;
                        if (v3.a() == net.minecraft.client.E.c.ENABLED) {
                            this.m.a(new net.minecraft.d.d(net.minecraft.d.k.ACCEPTED));
                            Futures.addCallback(this.l.aa().a(var3_2, var4_3), this.g());
                            if (var2_4 != null) return;
                        }
                    }
                    v3 = var5_5;
                }
                if (var2_4 == null) break block18;
                if (v3 == null) break block19;
                v3 = var5_5;
            }
            if (v3.a() != net.minecraft.client.E.c.PROMPT) {
                this.m.a(new net.minecraft.d.d(net.minecraft.d.k.DECLINED));
                if (var2_4 != null) return;
            }
        }
        this.l.a(new k(this, var3_2, var4_3));
    }

    @Override
    public void a(net.minecraft.Q.A a10) {
        block2: {
            block1: {
                int[] arrn;
                block0: {
                    int[] arrn2 = net.minecraft.client.o.j.b();
                    H.a(a10, this, this.l);
                    arrn = arrn2;
                    if (arrn == null) break block0;
                    if (!a10.a()) break block1;
                    this.l.e.a(a10.c(), a10.b(), a10.d());
                }
                if (arrn != null) break block2;
            }
            this.l.e.b(a10.c(), a10.b(), a10.d());
        }
    }

    @Override
    public void a(a0 a02) {
        int[] arrn;
        block10: {
            net.minecraft.o.a a10;
            block9: {
                net.minecraft.o.a a11;
                int[] arrn2 = net.minecraft.client.o.j.b();
                H.a(a02, this, this.l);
                arrn = arrn2;
                if (arrn != null) {
                    if (a02.e()) {
                        this.h.a(a02.d(), a02.b(), true);
                    }
                    this.h.b(a02.d() << 4, 0, a02.b() << 4, (a02.d() << 4) + 15, 256, (a02.b() << 4) + 15);
                }
                a10 = a11 = this.h.b(a02.d(), a02.b());
                if (arrn == null) break block9;
                a10.a(a02.c(), a02.g(), a02.e());
                this.h.a(a02.d() << 4, 0, a02.b() << 4, (a02.d() << 4) + 15, 256, (a02.b() << 4) + 15);
                if (a02.e() && this.h.D instanceof J) break block10;
                a10 = a11;
            }
            a10.h();
        }
        for (r r2 : a02.a()) {
            block12: {
                y y2;
                block11: {
                    y y3;
                    net.minecraft.k.n n2 = new net.minecraft.k.n(r2.m("x"), r2.m("y"), r2.m("z"));
                    y2 = y3 = this.h.b(n2);
                    if (arrn == null) break block11;
                    if (y2 == null) break block12;
                    y2 = y3;
                }
                y2.c(r2);
            }
            if (arrn != null) continue;
        }
    }

    @Override
    public void a(net.minecraft.Q.J j2) {
        block24: {
            j j3;
            block23: {
                boolean bl2;
                block22: {
                    int[] arrn;
                    float f10;
                    float f11;
                    double d10;
                    double d11;
                    double d12;
                    c c10;
                    block21: {
                        block20: {
                            block19: {
                                block18: {
                                    block17: {
                                        block16: {
                                            block15: {
                                                H.a(j2, this, this.l);
                                                c10 = this.l.s;
                                                d12 = j2.f();
                                                d11 = j2.a();
                                                d10 = j2.d();
                                                f11 = j2.g();
                                                f10 = j2.e();
                                                arrn = net.minecraft.client.o.j.b();
                                                if (arrn == null) break block15;
                                                if (!j2.b().contains((Object)net.minecraft.Q.n.X)) break block16;
                                                d12 += c10.a;
                                            }
                                            if (arrn != null) break block17;
                                            net.minecraft.k.m.b(!net.minecraft.k.m.c());
                                        }
                                        c10.aq = 0.0;
                                    }
                                    if (!j2.b().contains((Object)net.minecraft.Q.n.Y)) break block18;
                                    d11 += c10.aF;
                                    if (arrn != null) break block19;
                                }
                                c10.G = 0.0;
                            }
                            if (!j2.b().contains((Object)net.minecraft.Q.n.Z)) break block20;
                            d10 += c10.ax;
                            if (arrn != null) break block21;
                        }
                        c10.d = 0.0;
                    }
                    bl2 = j2.b().contains((Object)net.minecraft.Q.n.X_ROT);
                    if (arrn != null) {
                        if (bl2) {
                            f10 += c10.at;
                        }
                        bl2 = j2.b().contains((Object)net.minecraft.Q.n.Y_ROT);
                    }
                    if (arrn == null) break block22;
                    if (bl2) {
                        f11 += c10.e;
                    }
                    c10.b(d12, d11, d10, f11, f10);
                    this.m.a(new l(j2.c()));
                    this.m.a(new net.minecraft.d.B(c10.a, c10.m().b, c10.ax, c10.e, c10.at, false));
                    j3 = this;
                    if (arrn == null) break block23;
                    bl2 = j3.a;
                }
                if (bl2) break block24;
                this.l.s.N = this.l.s.a;
                this.l.s.L = this.l.s.aF;
                this.l.s.k = this.l.s.ax;
                this.a = true;
                j3 = this;
            }
            j3.l.a((net.minecraft.client.b.L)null);
        }
    }

    @Override
    public void a(net.minecraft.Q.k k2) {
        block4: {
            x x2;
            block6: {
                int n2;
                int[] arrn;
                block7: {
                    block5: {
                        H.a(k2, this, this.l);
                        x2 = this.h.a(k2.b());
                        arrn = net.minecraft.client.o.j.b();
                        if (x2 == null) break block4;
                        String string = cj.b.f.a("Velocity Mode").m();
                        n2 = string.equalsIgnoreCase("Matrix");
                        if (arrn == null) break block5;
                        if (n2 == 0) break block6;
                        n2 = cj.b.i.a(bD.class).i() ? 1 : 0;
                    }
                    if (arrn == null) break block7;
                    if (n2 == 0) break block6;
                    n2 = k2.b();
                }
                if (n2 != Q.P().s.W()) break block4;
                x2.b(0.0, (double)k2.c() / 8000.0, (double)k2.d() / 8000.0 / 2.2);
                hC.c();
                if (arrn != null) break block4;
            }
            f5 f52 = new f5(x2, (double)k2.a() / 8000.0, (double)k2.c() / 8000.0, (double)k2.d() / 8000.0);
            af.a(f52);
            if (!f52.a()) {
                x2.b(f52.c(), f52.d(), f52.b());
            }
        }
    }

    @Nullable
    public e a(String string) {
        Iterator<e> iterator = this.e.values().iterator();
        int[] arrn = net.minecraft.client.o.j.b();
        while (iterator.hasNext()) {
            block4: {
                e e10;
                block3: {
                    e e11;
                    e10 = e11 = iterator.next();
                    if (arrn == null) break block3;
                    if (!e10.p().getName().equals(string)) break block4;
                    e10 = e11;
                }
                return e10;
            }
            if (arrn != null) continue;
        }
        return null;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    public void a(net.minecraft.Q.M var1_1) {
        v0 = net.minecraft.client.o.j.b();
        H.a(var1_1, this, this.l);
        var2_2 = v0;
        var3_3 = var1_1.e();
        var4_4 = null;
        var5_5 = null;
        v1 = var1_1.b();
        if (var2_2 == null) ** GOTO lbl11
        if (v1 != null) {
            v1 = var1_1.b();
lbl11:
            // 2 sources

            v2 = v1.a();
        } else {
            v2 = "";
        }
        var6_6 = v2;
        switch (net.minecraft.client.o.h.c[var3_3.ordinal()]) {
            case 1: {
                var4_4 = var6_6;
                break;
            }
            case 2: {
                var5_5 = var6_6;
                break;
            }
            case 3: {
                this.l.n.a(var6_6, false);
                return;
            }
            case 4: {
                this.l.n.a("", "", -1, -1, -1);
                this.l.n.i();
                return;
            }
        }
        this.l.n.a(var4_4, var5_5, var1_1.d(), var1_1.a(), var1_1.c());
    }

    @Override
    public void a(net.minecraft.Q.U u2) {
        H.a(u2, this, this.l);
        this.l.e.b().a(u2.a());
        this.l.e.b().d(u2.b());
    }

    @Override
    public void a(net.minecraft.Q.x x2) {
        block2: {
            int n2;
            int n3;
            net.minecraft.D.h h2;
            block3: {
                block4: {
                    int[] arrn;
                    net.minecraft.D.b b10;
                    block1: {
                        H.a(x2, this, this.l);
                        b10 = this.h.c();
                        arrn = net.minecraft.client.o.j.b();
                        if (x2.b() != 0) break block1;
                        h2 = b10.a(x2.d(), net.minecraft.D.a.a);
                        h2.a(x2.a());
                        h2.a(x2.c());
                        if (arrn != null) break block2;
                    }
                    h2 = b10.h(x2.d());
                    n3 = x2.b();
                    n2 = 1;
                    if (arrn == null) break block3;
                    if (n3 != n2) break block4;
                    b10.c(h2);
                    if (arrn != null) break block2;
                }
                n3 = x2.b();
                n2 = 2;
            }
            if (n3 == n2) {
                h2.a(x2.a());
                h2.a(x2.c());
            }
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    private boolean b(String var1_1) {
        var2_2 = net.minecraft.client.o.j.b();
        try {
            block6: {
                block7: {
                    var3_3 = new URI(var1_1);
                    var4_5 = var3_3.getScheme();
                    var5_6 = "level".equals(var4_5);
                    v0 = "http".equals(var4_5);
                    if (var2_2 == null) break block6;
                    if (v0) break block7;
                    v0 = "https".equals(var4_5);
                    if (var2_2 == null) break block6;
                    if (!v0) {
                        v0 = var5_6;
                        if (var2_2 != null) {
                            if (!v0) {
                                throw new URISyntaxException(var1_1, "Wrong protocol");
                            } else {
                                ** GOTO lbl18
                            }
                        } else {
                            ** GOTO lbl17
                        }
                    }
                    break block7;
lbl17:
                    // 2 sources

                    break block6;
                }
                v0 = var5_6;
            }
            if (var2_2 == null) return v0;
            if (v0 == false) return true;
            v0 = var1_1.contains("..");
            if (var2_2 != null) {
                if (v0 != false) throw new URISyntaxException(var1_1, "Invalid levelstorage resourcepack path");
                v0 = var1_1.endsWith("/resources.zip");
            }
            if (var2_2 == null) return v0;
            if (v0 == false) throw new URISyntaxException(var1_1, "Invalid levelstorage resourcepack path");
            return true;
        }
        catch (URISyntaxException var3_4) {
            this.m.a(new net.minecraft.d.d(net.minecraft.d.k.FAILED_DOWNLOAD));
            return false;
        }
    }

    @Override
    public void a(net.minecraft.Q.H h2) {
        block6: {
            Object object;
            c c10;
            block13: {
                boolean bl2;
                int[] arrn;
                block9: {
                    block10: {
                        block12: {
                            block11: {
                                block7: {
                                    block8: {
                                        block4: {
                                            block5: {
                                                H.a(h2, this, this.l);
                                                c10 = this.l.s;
                                                arrn = net.minecraft.client.o.j.b();
                                                bl2 = "minecraft:container".equals(h2.e());
                                                if (arrn == null) break block4;
                                                if (!bl2) break block5;
                                                c10.a(new net.minecraft.B.b(h2.d(), h2.f()));
                                                c10.cm.b = h2.c();
                                                if (arrn != null) break block6;
                                            }
                                            bl2 = "minecraft:villager".equals(h2.e());
                                        }
                                        if (arrn == null) break block7;
                                        if (!bl2) break block8;
                                        c10.a(new net.minecraft.U.r(c10, h2.d()));
                                        c10.cm.b = h2.c();
                                        if (arrn != null) break block6;
                                    }
                                    bl2 = "EntityHorse".equals(h2.e());
                                }
                                if (arrn == null) break block9;
                                if (!bl2) break block10;
                                object = this.h.a(h2.b());
                                if (arrn == null) break block11;
                                if (!(object instanceof D)) break block12;
                                c10.a((D)object, new net.minecraft.B.d(h2.d(), h2.f()));
                            }
                            c10.cm.b = h2.c();
                        }
                        if (arrn != null) break block6;
                    }
                    bl2 = h2.a();
                }
                if (bl2) break block13;
                c10.a(new net.minecraft.client.c.b(h2.e(), h2.d()));
                c10.cm.b = h2.c();
                if (arrn != null) break block6;
            }
            object = new net.minecraft.client.c.a(h2.e(), h2.d(), h2.f());
            c10.a((net.minecraft.B.a)object);
            c10.cm.b = h2.c();
        }
    }

    public Collection<e> c() {
        return this.e.values();
    }

    @Override
    public void a(net.minecraft.at.k k2) {
        block6: {
            j j2;
            block2: {
                block3: {
                    j j3;
                    int[] arrn;
                    block4: {
                        block5: {
                            int[] arrn2 = net.minecraft.client.o.j.b();
                            this.l.a((net.minecraft.client.E.l)null);
                            arrn = arrn2;
                            j2 = this;
                            if (arrn == null) break block2;
                            if (j2.i == null) break block3;
                            j3 = this;
                            if (arrn == null) break block4;
                            if (!(j3.i instanceof net.minecraft.client.b.aa)) break block5;
                            this.l.a(new net.minecraft.as.l(((net.minecraft.client.b.aa)this.i).c(), "disconnect.lost", k2).d());
                            if (arrn != null) break block6;
                        }
                        j3 = this;
                    }
                    j3.l.a(new net.minecraft.client.b.U(this.i, "disconnect.lost", k2));
                    if (arrn != null) break block6;
                }
                j2 = this;
            }
            j2.l.a(new net.minecraft.client.b.U(new av(new net.minecraft.client.b.a1()), "disconnect.lost", k2));
        }
    }

    @Override
    public void a(am am2) {
        block0: {
            int[] arrn = net.minecraft.client.o.j.b();
            H.a(am2, this, this.l);
            this.l.aW = new net.minecraft.client.E.h(this.l, this);
            this.h = new net.minecraft.client.E.l(this, new net.minecraft.ah.K(0L, am2.d(), false, am2.b(), am2.h()), am2.g(), am2.e(), this.l.an);
            int[] arrn2 = arrn;
            this.l.ac.bH = am2.e();
            this.l.a(this.h);
            this.l.s.p = am2.g();
            this.l.a(new V());
            this.l.s.g(am2.a());
            this.f = am2.c();
            this.l.s.a(am2.f());
            this.l.aW.a(am2.d());
            this.l.ac.k();
            this.m.a(new net.minecraft.d.h("MC|Brand", new net.minecraft.C.m(Unpooled.buffer()).a(K.a())));
            if (net.minecraft.k.m.d()) break block0;
            net.minecraft.client.o.j.b(new int[4]);
        }
    }

    @Override
    public void a(net.minecraft.Q.Y y2) {
        block3: {
            x x2;
            x x3;
            block4: {
                int[] arrn;
                block2: {
                    int[] arrn2 = net.minecraft.client.o.j.b();
                    H.a(y2, this, this.l);
                    arrn = arrn2;
                    x2 = x3 = this.l.s.aX();
                    if (arrn == null) break block2;
                    if (x2 == this.l.s) break block3;
                    x2 = x3;
                }
                if (arrn == null) break block4;
                if (!x2.a1()) break block3;
                x2 = x3;
            }
            x2.b(y2.c(), y2.d(), y2.e(), y2.b(), y2.a());
            this.m.a(new net.minecraft.d.x(x3));
        }
    }

    @Override
    public void a(net.minecraft.Q.z z2) {
        int[] arrn = net.minecraft.client.o.j.b();
        H.a(z2, this, this.l);
        int[] arrn2 = arrn;
        y y2 = this.h.b(z2.a());
        if (arrn2 != null) {
            if (!(y2 instanceof W)) {
                y2 = new W();
                y2.b(this.h);
                y2.a(z2.a());
            }
            this.l.s.a((W)y2);
        }
    }

    @Override
    public void a(net.minecraft.Q.t t2) {
        H.a(t2, this, this.l);
        c c10 = this.l.s;
        c10.cw.e = t2.a();
        c10.cw.g = t2.b();
        c10.cw.b = t2.c();
        c10.cw.d = t2.e();
        c10.cw.a(t2.f());
        c10.cw.b(t2.d());
    }

    @Override
    public void a(net.minecraft.Q.V v2) {
        this.a(new M(v2.a()));
    }

    @Override
    public void a(net.minecraft.Q.K k2) {
        H.a(k2, this, this.l);
        net.minecraft.J.m m2 = new net.minecraft.J.m(this.h, k2.a(), k2.c(), k2.e());
        m2.a(k2.d());
        this.h.a(k2.b(), (x)m2);
    }

    @Override
    public void a(net.minecraft.Q.C c10) {
        block1: {
            int n2;
            int n3;
            x x2;
            block10: {
                block11: {
                    int[] arrn;
                    block8: {
                        block9: {
                            B b10;
                            block6: {
                                block7: {
                                    block4: {
                                        block5: {
                                            block2: {
                                                block3: {
                                                    int[] arrn2 = net.minecraft.client.o.j.b();
                                                    H.a(c10, this, this.l);
                                                    arrn = arrn2;
                                                    x2 = this.h.a(c10.a());
                                                    if (x2 == null) break block1;
                                                    n3 = c10.b();
                                                    if (arrn == null) break block2;
                                                    if (n3 != 0) break block3;
                                                    b10 = (B)x2;
                                                    b10.b(net.minecraft.ar.a3.MAIN_HAND);
                                                    if (arrn != null) break block1;
                                                }
                                                n3 = c10.b();
                                            }
                                            n2 = 3;
                                            if (arrn == null) break block4;
                                            if (n3 != n2) break block5;
                                            b10 = (B)x2;
                                            b10.b(net.minecraft.ar.a3.OFF_HAND);
                                            if (arrn != null) break block1;
                                        }
                                        n3 = c10.b();
                                        n2 = 1;
                                    }
                                    if (arrn == null) break block6;
                                    if (n3 != n2) break block7;
                                    x2.aT();
                                    if (arrn != null) break block1;
                                }
                                n3 = c10.b();
                                n2 = 2;
                            }
                            if (arrn == null) break block8;
                            if (n3 != n2) break block9;
                            b10 = (net.minecraft.i.j)x2;
                            ((net.minecraft.i.j)b10).a(false, false, false);
                            if (arrn != null) break block1;
                        }
                        n3 = c10.b();
                        n2 = 4;
                    }
                    if (arrn == null) break block10;
                    if (n3 != n2) break block11;
                    this.l.au.a(x2, net.minecraft.ar.aH.CRIT);
                    if (arrn != null) break block1;
                }
                n3 = c10.b();
                n2 = 5;
            }
            if (n3 == n2) {
                this.l.au.a(x2, net.minecraft.ar.aH.CRIT_MAGIC);
            }
        }
    }

    @Override
    public void a(net.minecraft.Q.G g10) {
        H.a(g10, this, this.l);
        this.l.s.j(g10.b());
        this.l.s.S().a(g10.c());
        this.l.s.S().b(g10.a());
    }

    public void a(net.minecraft.C.K<?> k2) {
        this.m.a(k2);
    }

    @Override
    public void a(al al2) {
        int[] arrn = net.minecraft.client.o.j.b();
        H.a(al2, this, this.l);
        int[] arrn2 = arrn;
        if (arrn2 != null) {
            if (al2.d() != this.l.s.p) {
                this.a = false;
                net.minecraft.D.b b10 = this.h.c();
                this.h = new net.minecraft.client.E.l(this, new net.minecraft.ah.K(0L, al2.a(), false, this.l.e.b().a(), al2.c()), al2.d(), al2.b(), this.l.an);
                this.h.a(b10);
                this.l.a(this.h);
                this.l.s.p = al2.d();
                this.l.a(new V());
            }
            this.l.a(al2.d());
            this.l.aW.a(al2.a());
        }
    }

    @Override
    public void a(net.minecraft.Q.p p2) {
        H.a(p2, this, this.l);
        U u2 = new U(this.l.e, null, p2.g(), p2.d(), p2.a(), p2.h(), p2.c());
        u2.a(true);
        this.l.s.aq += (double)p2.b();
        this.l.s.G += (double)p2.f();
        this.l.s.d += (double)p2.e();
    }

    public net.minecraft.client.E.i h() {
        return this.g;
    }

    public static void b(int[] arrn) {
        c = arrn;
    }

    static Q a(j j2, Q q2) {
        j2.l = q2;
        return j2.l;
    }

    @Override
    public void a(net.minecraft.Q.o o2) {
        H.a(o2, this, this.l);
        this.l.e.c(o2.a(), o2.b(), o2.c());
    }

    private void lambda$func_191980_a$1(net.minecraft.l.i i2, net.minecraft.az.k k2) {
        i2.g(k2);
        i2.b(k2);
        net.minecraft.client.n.a.a(this.l.ay(), k2);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void a(X x2) {
        block18: {
            Object object;
            Object object2;
            boolean bl2;
            block25: {
                block26: {
                    Object object3;
                    int[] arrn;
                    block23: {
                        block24: {
                            int n2;
                            block21: {
                                block22: {
                                    d d10;
                                    block19: {
                                        block20: {
                                            block16: {
                                                block17: {
                                                    block15: {
                                                        int[] arrn2 = net.minecraft.client.o.j.b();
                                                        H.a(x2, this, this.l);
                                                        arrn = arrn2;
                                                        bl2 = "MC|TrList".equals(x2.b());
                                                        if (arrn == null) break block16;
                                                        if (!bl2) break block17;
                                                        object2 = x2.a();
                                                        try {
                                                            int n3;
                                                            n2 = object2.readInt();
                                                            object = this.l.aO;
                                                            if (arrn == null) break block15;
                                                            if (object != null) {
                                                                n3 = object instanceof net.minecraft.client.b.ak;
                                                                if (arrn == null) break block15;
                                                                if (n3 != 0) {
                                                                    n3 = n2;
                                                                    if (arrn == null) break block15;
                                                                    if (n3 == this.l.s.cm.b) {
                                                                        object3 = ((net.minecraft.client.b.ak)object).a();
                                                                        net.minecraft.y.a a10 = net.minecraft.y.a.b(object2);
                                                                        object3.a(a10);
                                                                    }
                                                                }
                                                            }
                                                            n3 = object2.release();
                                                        }
                                                        catch (IOException iOException) {
                                                            b.error("Couldn't load trade info", (Throwable)iOException);
                                                        }
                                                        finally {
                                                            object2.release();
                                                        }
                                                    }
                                                    if (arrn != null) break block18;
                                                }
                                                bl2 = "MC|Brand".equals(x2.b());
                                            }
                                            if (arrn == null) break block19;
                                            if (!bl2) break block20;
                                            this.l.s.c(x2.a().c(32767));
                                            if (arrn != null) break block18;
                                        }
                                        bl2 = "MC|BOpen".equals(x2.b());
                                    }
                                    if (arrn == null) break block21;
                                    if (!bl2) break block22;
                                    object2 = x2.a().a(net.minecraft.ar.a3.class);
                                    d d11 = d10 = object2 == net.minecraft.ar.a3.OFF_HAND ? this.l.s.b() : this.l.s.av();
                                    if (d10.w() == net.minecraft.u.h.as) {
                                        this.l.a(new net.minecraft.client.b.a6(this.l.s, d10, false));
                                    }
                                    if (arrn != null) break block18;
                                }
                                bl2 = "MC|DebugPath".equals(x2.b());
                            }
                            if (arrn == null) break block23;
                            if (!bl2) break block24;
                            object2 = x2.a();
                            n2 = object2.readInt();
                            float f10 = object2.readFloat();
                            object3 = net.minecraft.e.h.a(object2);
                            ((net.minecraft.client.f.h)this.l.ag.k).a(n2, (net.minecraft.e.h)object3, f10);
                            if (arrn != null) break block18;
                        }
                        bl2 = "MC|DebugNeighborsUpdate".equals(x2.b());
                    }
                    if (arrn == null) break block25;
                    if (!bl2) break block26;
                    object2 = x2.a();
                    long l2 = object2.k();
                    object3 = object2.l();
                    ((i)this.l.ag.f).a(l2, (net.minecraft.k.n)object3);
                    if (arrn != null) break block18;
                }
                bl2 = "MC|StopSound".equals(x2.b());
            }
            if (bl2) {
                object2 = x2.a();
                String string = object2.c(32767);
                object = object2.c(256);
                this.l.p().a((String)object, ay.a(string));
            }
        }
    }

    @Override
    public void a(an an2) {
        H.a(an2, this, this.l);
        an2.a(this.h).a(an2.a());
    }

    @Override
    public void a(ab ab2) {
        block8: {
            int n2;
            int[] arrn;
            block6: {
                int n3;
                block7: {
                    int[] arrn2 = net.minecraft.client.o.j.b();
                    H.a(ab2, this, this.l);
                    arrn = arrn2;
                    n3 = ab2.d();
                    if (arrn == null) break block6;
                    if (n3 != 0) break block7;
                    double d10 = ab2.k() * ab2.e();
                    double d11 = ab2.k() * ab2.b();
                    double d12 = ab2.k() * ab2.i();
                    try {
                        this.h.a(ab2.g(), ab2.a(), ab2.h(), ab2.c(), ab2.j(), d10, d11, d12, ab2.f());
                    }
                    catch (Throwable throwable) {
                        b.warn("Could not spawn particle effect {}", (Object)ab2.g());
                    }
                    if (arrn != null) break block8;
                }
                n3 = n2 = 0;
            }
            while (n2 < ab2.d()) {
                double d13 = this.d.nextGaussian() * (double)ab2.e();
                double d14 = this.d.nextGaussian() * (double)ab2.b();
                double d15 = this.d.nextGaussian() * (double)ab2.i();
                double d16 = this.d.nextGaussian() * (double)ab2.k();
                double d17 = this.d.nextGaussian() * (double)ab2.k();
                double d18 = this.d.nextGaussian() * (double)ab2.k();
                try {
                    this.h.a(ab2.g(), ab2.a(), ab2.h() + d13, ab2.c() + d14, ab2.j() + d15, d16, d17, d18, ab2.f());
                }
                catch (Throwable throwable) {
                    b.warn("Could not spawn particle effect {}", (Object)ab2.g());
                    return;
                }
                ++n2;
                if (arrn != null) continue;
            }
        }
    }

    @Override
    public void a(au au2) {
        block0: {
            H.a(au2, this, this.l);
            if (!net.minecraft.i.h.d(au2.a())) break block0;
            this.l.s.cB.a = au2.a();
        }
    }

    @Override
    public void a(aC aC2) {
        block3: {
            x x2;
            block2: {
                int[] arrn = net.minecraft.client.o.j.b();
                H.a(aC2, this, this.l);
                x x3 = this.h.a(aC2.a());
                int[] arrn2 = arrn;
                x2 = x3;
                if (arrn2 == null) break block2;
                if (x2 == null) break block3;
                x2 = x3;
            }
            x2.a(aC2.c(), aC2.b());
        }
    }

    @Override
    public void a(aS aS2) {
        block3: {
            net.minecraft.client.b.L l2;
            Object[] arrobject;
            block2: {
                int[] arrn = net.minecraft.client.o.j.b();
                H.a(aS2, this, this.l);
                int[] arrn2 = arrn;
                arrobject = aS2.a();
                Arrays.sort(arrobject);
                l2 = this.l.aO;
                if (arrn2 == null) break block2;
                if (!(l2 instanceof q)) break block3;
                l2 = this.l.aO;
            }
            ((q)((Object)l2)).a((String[])arrobject);
        }
    }

    @Override
    public void a(a2 a22) {
        block3: {
            net.minecraft.D.h h2;
            net.minecraft.D.b b10;
            block5: {
                a2 a23;
                int[] arrn;
                block4: {
                    S s2;
                    S s3;
                    block1: {
                        block2: {
                            int[] arrn2 = net.minecraft.client.o.j.b();
                            H.a(a22, this, this.l);
                            b10 = this.h.c();
                            arrn = arrn2;
                            h2 = b10.h(a22.d());
                            s3 = a22.b();
                            s2 = S.CHANGE;
                            if (arrn == null) break block1;
                            if (s3 != s2) break block2;
                            net.minecraft.D.e e10 = b10.d(a22.a(), h2);
                            e10.a(a22.c());
                            if (arrn != null) break block3;
                        }
                        a23 = a22;
                        if (arrn == null) break block4;
                        s3 = a23.b();
                        s2 = S.REMOVE;
                    }
                    if (s3 != s2) break block3;
                    a23 = a22;
                }
                if (!net.minecraft.ar.aD.a(a23.d())) break block5;
                b10.b(a22.a(), null);
                if (arrn != null) break block3;
            }
            if (h2 != null) {
                b10.b(a22.a(), h2);
            }
        }
    }

    public void f() {
        this.h = null;
    }

    static {
        b = LogManager.getLogger();
        net.minecraft.client.o.j.b(new int[5]);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    public void a(net.minecraft.Q.r var1_1) {
        block70: {
            block69: {
                block68: {
                    block67: {
                        block18: {
                            block65: {
                                block66: {
                                    block63: {
                                        block64: {
                                            block61: {
                                                block62: {
                                                    block59: {
                                                        block60: {
                                                            block57: {
                                                                block58: {
                                                                    block55: {
                                                                        block56: {
                                                                            block53: {
                                                                                block54: {
                                                                                    block51: {
                                                                                        block52: {
                                                                                            block49: {
                                                                                                block50: {
                                                                                                    block47: {
                                                                                                        block48: {
                                                                                                            block45: {
                                                                                                                block46: {
                                                                                                                    block43: {
                                                                                                                        block44: {
                                                                                                                            block41: {
                                                                                                                                block42: {
                                                                                                                                    block39: {
                                                                                                                                        block40: {
                                                                                                                                            block37: {
                                                                                                                                                block38: {
                                                                                                                                                    block35: {
                                                                                                                                                        block36: {
                                                                                                                                                            block33: {
                                                                                                                                                                block34: {
                                                                                                                                                                    block31: {
                                                                                                                                                                        block32: {
                                                                                                                                                                            block29: {
                                                                                                                                                                                block30: {
                                                                                                                                                                                    block27: {
                                                                                                                                                                                        block28: {
                                                                                                                                                                                            block25: {
                                                                                                                                                                                                block26: {
                                                                                                                                                                                                    block23: {
                                                                                                                                                                                                        block24: {
                                                                                                                                                                                                            block21: {
                                                                                                                                                                                                                block22: {
                                                                                                                                                                                                                    block19: {
                                                                                                                                                                                                                        block20: {
                                                                                                                                                                                                                            block16: {
                                                                                                                                                                                                                                block17: {
                                                                                                                                                                                                                                    H.a(var1_1, this, this.l);
                                                                                                                                                                                                                                    var3_2 = var1_1.e();
                                                                                                                                                                                                                                    var5_3 = var1_1.b();
                                                                                                                                                                                                                                    var7_4 = var1_1.i();
                                                                                                                                                                                                                                    var9_5 = null;
                                                                                                                                                                                                                                    var2_6 = net.minecraft.client.o.j.b();
                                                                                                                                                                                                                                    v0 = var1_1.f();
                                                                                                                                                                                                                                    v1 = 10;
                                                                                                                                                                                                                                    if (var2_6 == null) break block16;
                                                                                                                                                                                                                                    if (v0 != v1) break block17;
                                                                                                                                                                                                                                    var9_5 = net.minecraft.J.u.a(this.h, var3_2, var5_3, var7_4, net.minecraft.J.j.c(var1_1.k()));
                                                                                                                                                                                                                                    break block18;
                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                v0 = var1_1.f();
                                                                                                                                                                                                                                v1 = 90;
                                                                                                                                                                                                                            }
                                                                                                                                                                                                                            if (var2_6 == null) break block19;
                                                                                                                                                                                                                            if (v0 != v1) break block20;
                                                                                                                                                                                                                            var10_7 = this.h.a(var1_1.k());
                                                                                                                                                                                                                            if (var10_7 instanceof net.minecraft.i.j) {
                                                                                                                                                                                                                                var9_5 = new net.minecraft.z.o(this.h, (net.minecraft.i.j)var10_7, var3_2, var5_3, var7_4);
                                                                                                                                                                                                                            }
                                                                                                                                                                                                                            var1_1.b(0);
                                                                                                                                                                                                                            break block18;
                                                                                                                                                                                                                        }
                                                                                                                                                                                                                        v0 = var1_1.f();
                                                                                                                                                                                                                        v1 = 60;
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                    if (var2_6 == null) break block21;
                                                                                                                                                                                                                    if (v0 != v1) break block22;
                                                                                                                                                                                                                    var9_5 = new net.minecraft.z.h(this.h, var3_2, var5_3, var7_4);
                                                                                                                                                                                                                    break block18;
                                                                                                                                                                                                                }
                                                                                                                                                                                                                v0 = var1_1.f();
                                                                                                                                                                                                                v1 = 91;
                                                                                                                                                                                                            }
                                                                                                                                                                                                            if (var2_6 == null) break block23;
                                                                                                                                                                                                            if (v0 != v1) break block24;
                                                                                                                                                                                                            var9_5 = new net.minecraft.z.g(this.h, var3_2, var5_3, var7_4);
                                                                                                                                                                                                            break block18;
                                                                                                                                                                                                        }
                                                                                                                                                                                                        v0 = var1_1.f();
                                                                                                                                                                                                        v1 = 61;
                                                                                                                                                                                                    }
                                                                                                                                                                                                    if (var2_6 == null) break block25;
                                                                                                                                                                                                    if (v0 != v1) break block26;
                                                                                                                                                                                                    var9_5 = new net.minecraft.z.u(this.h, var3_2, var5_3, var7_4);
                                                                                                                                                                                                    break block18;
                                                                                                                                                                                                }
                                                                                                                                                                                                v0 = var1_1.f();
                                                                                                                                                                                                v1 = 68;
                                                                                                                                                                                            }
                                                                                                                                                                                            if (var2_6 == null) break block27;
                                                                                                                                                                                            if (v0 != v1) break block28;
                                                                                                                                                                                            var9_5 = new net.minecraft.z.p(this.h, var3_2, var5_3, var7_4, (double)var1_1.d() / 8000.0, (double)var1_1.j() / 8000.0, (double)var1_1.g() / 8000.0);
                                                                                                                                                                                            break block18;
                                                                                                                                                                                        }
                                                                                                                                                                                        v0 = var1_1.f();
                                                                                                                                                                                        v1 = 71;
                                                                                                                                                                                    }
                                                                                                                                                                                    if (var2_6 == null) break block29;
                                                                                                                                                                                    if (v0 != v1) break block30;
                                                                                                                                                                                    var9_5 = new net.minecraft.J.l(this.h, new net.minecraft.k.n(var3_2, var5_3, var7_4), net.minecraft.ar.aA.b(var1_1.k()));
                                                                                                                                                                                    var1_1.b(0);
                                                                                                                                                                                    break block18;
                                                                                                                                                                                }
                                                                                                                                                                                v0 = var1_1.f();
                                                                                                                                                                                v1 = 77;
                                                                                                                                                                            }
                                                                                                                                                                            if (var2_6 == null) break block31;
                                                                                                                                                                            if (v0 != v1) break block32;
                                                                                                                                                                            var9_5 = new A(this.h, new net.minecraft.k.n(net.minecraft.k.h.f(var3_2), net.minecraft.k.h.f(var5_3), net.minecraft.k.h.f(var7_4)));
                                                                                                                                                                            var1_1.b(0);
                                                                                                                                                                            break block18;
                                                                                                                                                                        }
                                                                                                                                                                        v0 = var1_1.f();
                                                                                                                                                                        v1 = 65;
                                                                                                                                                                    }
                                                                                                                                                                    if (var2_6 == null) break block33;
                                                                                                                                                                    if (v0 != v1) break block34;
                                                                                                                                                                    var9_5 = new F(this.h, var3_2, var5_3, var7_4);
                                                                                                                                                                    break block18;
                                                                                                                                                                }
                                                                                                                                                                v0 = var1_1.f();
                                                                                                                                                                v1 = 72;
                                                                                                                                                            }
                                                                                                                                                            if (var2_6 == null) break block35;
                                                                                                                                                            if (v0 != v1) break block36;
                                                                                                                                                            var9_5 = new net.minecraft.J.q(this.h, var3_2, var5_3, var7_4);
                                                                                                                                                            break block18;
                                                                                                                                                        }
                                                                                                                                                        v0 = var1_1.f();
                                                                                                                                                        v1 = 76;
                                                                                                                                                    }
                                                                                                                                                    if (var2_6 == null) break block37;
                                                                                                                                                    if (v0 != v1) break block38;
                                                                                                                                                    var9_5 = new net.minecraft.J.s(this.h, var3_2, var5_3, var7_4, net.minecraft.w.d.m);
                                                                                                                                                    break block18;
                                                                                                                                                }
                                                                                                                                                v0 = var1_1.f();
                                                                                                                                                v1 = 63;
                                                                                                                                            }
                                                                                                                                            if (var2_6 == null) break block39;
                                                                                                                                            if (v0 != v1) break block40;
                                                                                                                                            var9_5 = new net.minecraft.z.l(this.h, var3_2, var5_3, var7_4, (double)var1_1.d() / 8000.0, (double)var1_1.j() / 8000.0, (double)var1_1.g() / 8000.0);
                                                                                                                                            var1_1.b(0);
                                                                                                                                            break block18;
                                                                                                                                        }
                                                                                                                                        v0 = var1_1.f();
                                                                                                                                        v1 = 93;
                                                                                                                                    }
                                                                                                                                    if (var2_6 == null) break block41;
                                                                                                                                    if (v0 != v1) break block42;
                                                                                                                                    var9_5 = new net.minecraft.z.k(this.h, var3_2, var5_3, var7_4, (double)var1_1.d() / 8000.0, (double)var1_1.j() / 8000.0, (double)var1_1.g() / 8000.0);
                                                                                                                                    var1_1.b(0);
                                                                                                                                    break block18;
                                                                                                                                }
                                                                                                                                v0 = var1_1.f();
                                                                                                                                v1 = 64;
                                                                                                                            }
                                                                                                                            if (var2_6 == null) break block43;
                                                                                                                            if (v0 != v1) break block44;
                                                                                                                            var9_5 = new net.minecraft.z.m(this.h, var3_2, var5_3, var7_4, (double)var1_1.d() / 8000.0, (double)var1_1.j() / 8000.0, (double)var1_1.g() / 8000.0);
                                                                                                                            var1_1.b(0);
                                                                                                                            break block18;
                                                                                                                        }
                                                                                                                        v0 = var1_1.f();
                                                                                                                        v1 = 66;
                                                                                                                    }
                                                                                                                    if (var2_6 == null) break block45;
                                                                                                                    if (v0 != v1) break block46;
                                                                                                                    var9_5 = new net.minecraft.z.n(this.h, var3_2, var5_3, var7_4, (double)var1_1.d() / 8000.0, (double)var1_1.j() / 8000.0, (double)var1_1.g() / 8000.0);
                                                                                                                    var1_1.b(0);
                                                                                                                    break block18;
                                                                                                                }
                                                                                                                v0 = var1_1.f();
                                                                                                                v1 = 67;
                                                                                                            }
                                                                                                            if (var2_6 == null) break block47;
                                                                                                            if (v0 != v1) break block48;
                                                                                                            var9_5 = new net.minecraft.z.q(this.h, var3_2, var5_3, var7_4, (double)var1_1.d() / 8000.0, (double)var1_1.j() / 8000.0, (double)var1_1.g() / 8000.0);
                                                                                                            var1_1.b(0);
                                                                                                            break block18;
                                                                                                        }
                                                                                                        v0 = var1_1.f();
                                                                                                        v1 = 62;
                                                                                                    }
                                                                                                    if (var2_6 == null) break block49;
                                                                                                    if (v0 != v1) break block50;
                                                                                                    var9_5 = new net.minecraft.z.s(this.h, var3_2, var5_3, var7_4);
                                                                                                    break block18;
                                                                                                }
                                                                                                v0 = var1_1.f();
                                                                                                v1 = 79;
                                                                                            }
                                                                                            if (var2_6 == null) break block51;
                                                                                            if (v0 != v1) break block52;
                                                                                            var9_5 = new net.minecraft.z.i(this.h, var3_2, var5_3, var7_4, 0.0f, 0, null);
                                                                                            break block18;
                                                                                        }
                                                                                        v0 = var1_1.f();
                                                                                        v1 = 73;
                                                                                    }
                                                                                    if (var2_6 == null) break block53;
                                                                                    if (v0 != v1) break block54;
                                                                                    var9_5 = new net.minecraft.z.t(this.h, var3_2, var5_3, var7_4, net.minecraft.w.d.m);
                                                                                    var1_1.b(0);
                                                                                    break block18;
                                                                                }
                                                                                v0 = var1_1.f();
                                                                                v1 = 75;
                                                                            }
                                                                            if (var2_6 == null) break block55;
                                                                            if (v0 != v1) break block56;
                                                                            var9_5 = new G(this.h, var3_2, var5_3, var7_4);
                                                                            var1_1.b(0);
                                                                            break block18;
                                                                        }
                                                                        v0 = var1_1.f();
                                                                        v1 = 1;
                                                                    }
                                                                    if (var2_6 == null) break block57;
                                                                    if (v0 != v1) break block58;
                                                                    var9_5 = new o(this.h, var3_2, var5_3, var7_4);
                                                                    break block18;
                                                                }
                                                                v0 = var1_1.f();
                                                                v1 = 50;
                                                            }
                                                            if (var2_6 == null) break block59;
                                                            if (v0 != v1) break block60;
                                                            var9_5 = new net.minecraft.J.D(this.h, var3_2, var5_3, var7_4, null);
                                                            break block18;
                                                        }
                                                        v0 = var1_1.f();
                                                        v1 = 78;
                                                    }
                                                    if (var2_6 == null) break block61;
                                                    if (v0 != v1) break block62;
                                                    var9_5 = new net.minecraft.J.n(this.h, var3_2, var5_3, var7_4);
                                                    break block18;
                                                }
                                                v0 = var1_1.f();
                                                v1 = 51;
                                            }
                                            if (var2_6 == null) break block63;
                                            if (v0 != v1) break block64;
                                            var9_5 = new net.minecraft.J.p(this.h, var3_2, var5_3, var7_4);
                                            break block18;
                                        }
                                        v0 = var1_1.f();
                                        v1 = 2;
                                    }
                                    if (var2_6 == null) break block65;
                                    if (v0 != v1) break block66;
                                    var9_5 = new t(this.h, var3_2, var5_3, var7_4);
                                    break block18;
                                }
                                v0 = var1_1.f();
                                v1 = 70;
                            }
                            if (var2_6 == null) ** GOTO lbl228
                            if (v0 == v1) {
                                var9_5 = new net.minecraft.J.r(this.h, var3_2, var5_3, var7_4, net.minecraft.W.K.a(var1_1.k() & 65535));
                                var1_1.b(0);
                            } else {
                                v0 = var1_1.f();
                                v1 = 3;
lbl228:
                                // 2 sources

                                if (v0 == v1) {
                                    var9_5 = new net.minecraft.U.y(this.h, var3_2, var5_3, var7_4);
                                }
                            }
                        }
                        v2 /* !! */  = var9_5;
                        if (var2_6 != null) {
                            if (v2 /* !! */  == null) return;
                            N.a(var9_5, var3_2, var5_3, var7_4);
                            var9_5.at = (float)(var1_1.a() * 360) / 256.0f;
                            var9_5.e = (float)(var1_1.l() * 360) / 256.0f;
                            v2 /* !! */  = var9_5;
                        }
                        var10_7 = v2 /* !! */ .aE();
                        if (var2_6 != null) {
                            if (var10_7 != null) {
                                var11_8 = var1_1.c() - var9_5.W();
                                for (x var15_13 : var10_7) {
                                    var15_13.g(var15_13.W() + var11_8);
                                    if (var2_6 != null) {
                                        if (var2_6 != null) continue;
                                    }
                                    break;
                                }
                            } else {
                                var9_5.g(var1_1.c());
                                var9_5.a(var1_1.h());
                                this.h.a(var1_1.c(), var9_5);
                            }
                        }
                        v3 = var1_1.k();
                        if (var2_6 != null) {
                            if (v3 <= 0) return;
                            v3 = var1_1.f();
                        }
                        v4 = 60;
                        if (var2_6 == null) break block67;
                        if (v3 == v4) break block68;
                        v3 = var1_1.f();
                        v4 = 91;
                    }
                    if (v3 != v4) break block69;
                }
                v5 = var11_9 = this.h.a(var1_1.k() - 1);
                if (var2_6 == null) break block70;
                if (!(v5 instanceof B)) break block69;
                v5 = var9_5;
                if (var2_6 == null) break block70;
                if (v5 instanceof f) {
                    ((f)var9_5).aY = var11_9;
                }
            }
            v5 = var9_5;
        }
        v5.b((double)var1_1.d() / 8000.0, (double)var1_1.j() / 8000.0, (double)var1_1.g() / 8000.0);
    }

    @Override
    public void a(P p2) {
        block0: {
            x x2;
            H.a(p2, this, this.l);
            if (p2.e != net.minecraft.Q.B.ENTITY_DIED || (x2 = this.h.a(p2.d)) != this.l.s) break block0;
            this.l.a(new Y(p2.c));
        }
    }

    @Override
    public void a(a7 a72) {
        block2: {
            block6: {
                x x2;
                float f10;
                float f11;
                double d10;
                double d11;
                double d12;
                block4: {
                    x x3;
                    block5: {
                        int n2;
                        int[] arrn;
                        block3: {
                            int[] arrn2 = net.minecraft.client.o.j.b();
                            H.a(a72, this, this.l);
                            arrn = arrn2;
                            x3 = this.h.a(a72.c());
                            if (x3 == null) break block2;
                            d12 = a72.e();
                            d11 = a72.f();
                            d10 = a72.a();
                            N.a(x3, d12, d11, d10);
                            n2 = x3.a1();
                            if (arrn == null) break block3;
                            if (n2 != 0) break block2;
                            n2 = a72.g() * 360;
                        }
                        f11 = (float)n2 / 256.0f;
                        f10 = (float)(a72.b() * 360) / 256.0f;
                        x2 = x3;
                        if (arrn == null) break block4;
                        if (!(Math.abs(x2.a - d12) < 0.03125)) break block5;
                        x2 = x3;
                        if (arrn == null) break block4;
                        if (!(Math.abs(x2.aF - d11) < 0.015625)) break block5;
                        x2 = x3;
                        if (arrn == null) break block4;
                        if (!(Math.abs(x2.ax - d10) < 0.03125)) break block5;
                        x3.a(x3.a, x3.aF, x3.ax, f11, f10, 0, true);
                        if (arrn != null) break block6;
                    }
                    x2 = x3;
                }
                x2.a(d12, d11, d10, f11, f10, 3, true);
            }
            x3.A = a72.d();
        }
    }

    @Override
    public void a(a5 a52) {
        block2: {
            x x2;
            block6: {
                int[] arrn;
                block8: {
                    j j2;
                    block7: {
                        int n2;
                        block5: {
                            int n3;
                            block3: {
                                block4: {
                                    H.a(a52, this, this.l);
                                    x2 = a52.a(this.h);
                                    arrn = net.minecraft.client.o.j.b();
                                    if (x2 == null) break block2;
                                    n2 = a52.a();
                                    n3 = 21;
                                    if (arrn == null) break block3;
                                    if (n2 != n3) break block4;
                                    this.l.p().c(new net.minecraft.client.e.v((net.minecraft.T.a0)x2));
                                    if (arrn != null) break block2;
                                }
                                n2 = a52.a();
                                if (arrn == null) break block5;
                                n3 = 35;
                            }
                            if (n2 != n3) break block6;
                            n2 = 40;
                        }
                        int n4 = n2;
                        this.l.au.a(x2, net.minecraft.ar.aH.TOTEM, 30);
                        j2 = this;
                        if (arrn == null) break block7;
                        j2.h.a(x2.a, x2.aF, x2.ax, E.cm, x2.ad(), 1.0f, 1.0f, false);
                        if (x2 != this.l.s) break block8;
                        j2 = this;
                    }
                    j2.l.Y.a(new d(net.minecraft.u.h.A));
                }
                if (arrn != null) break block2;
            }
            x2.a(a52.a());
        }
    }

    @Override
    public void a(a4 a42) {
        H.a(a42, this, this.l);
        this.h.b(a42.b(), a42.a());
    }

    @Override
    public void a(ak ak2) {
        this.m.a(ak2.a());
    }

    private static void lambda$func_191980_a$2(net.minecraft.l.i i2, net.minecraft.client.h.k k2) {
        k2.a(i2);
    }

    public static int[] b() {
        return c;
    }

    @Override
    public void a(L l2) {
        block0: {
            H.a(l2, this, this.l);
            x x2 = l2.a(this.h);
            if (x2 == null) break block0;
            this.l.a(x2);
        }
    }
}

