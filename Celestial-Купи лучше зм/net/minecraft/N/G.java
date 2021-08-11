/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package net.minecraft.N;

import java.util.Iterator;
import java.util.List;
import java.util.Random;
import javax.annotation.Nullable;
import net.minecraft.N.F;
import net.minecraft.N.j;
import net.minecraft.N.y;
import net.minecraft.P.c;
import net.minecraft.P.r;
import net.minecraft.Q.ag;
import net.minecraft.U.x;
import net.minecraft.Z.i;
import net.minecraft.ah.H;
import net.minecraft.ah.z;
import net.minecraft.ar.aA;
import net.minecraft.ar.ao;
import net.minecraft.k.h;
import net.minecraft.k.k;
import net.minecraft.k.l;
import net.minecraft.k.m;
import net.minecraft.k.n;
import net.minecraft.o.a;
import net.minecraft.u.g;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class G
extends F
implements ao {
    private /* synthetic */ int i;
    private /* synthetic */ long j;
    private /* synthetic */ boolean k;
    private static final /* synthetic */ Logger l;
    private /* synthetic */ n m;

    @Override
    public double q() {
        return 65536.0;
    }

    public boolean g() {
        m[] arrm = net.minecraft.N.j.f();
        long l2 = this.j - 200L;
        long l3 = l2 == 0L ? 0 : (l2 < 0L ? -1 : 1);
        if (arrm == null) {
            l3 = l3 < 0 ? (long)1 : (long)0;
        }
        return (boolean)l3;
    }

    public float a(float f10) {
        return h.c(((float)this.j + f10) / 200.0f, 0.0f, 1.0f);
    }

    @Override
    public void c() {
        block12: {
            block11: {
                boolean bl2;
                boolean bl3;
                block10: {
                    m[] arrm;
                    boolean bl4;
                    block9: {
                        boolean bl5;
                        block8: {
                            block6: {
                                block7: {
                                    bl5 = this.g();
                                    bl4 = this.e();
                                    ++this.j;
                                    arrm = net.minecraft.N.j.f();
                                    bl3 = bl4;
                                    if (arrm != null) break block6;
                                    if (!bl3) break block7;
                                    --this.i;
                                    if (arrm == null) break block8;
                                }
                                bl3 = this.a.C;
                            }
                            if (arrm != null) break block9;
                            if (bl3) break block8;
                            List<x> list = this.a.a(x.class, new k(this.j()));
                            bl3 = list.isEmpty();
                            if (arrm == null) {
                                long l2;
                                if (!bl3) {
                                    this.a(list.get(0));
                                }
                                bl3 = (l2 = this.j % 2400L - 0L) == 0L ? 0 : (l2 < 0L ? -1 : 1);
                            }
                            if (arrm != null) break block9;
                            if (!bl3) {
                                this.d();
                            }
                        }
                        bl3 = bl5;
                    }
                    bl2 = this.g();
                    if (arrm != null) break block10;
                    if (bl3 != bl2) break block11;
                    boolean bl2 = bl4;
                    bl2 = this.e();
                }
                if (bl3 == bl2) break block12;
            }
            this.b();
        }
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public boolean e() {
        m[] arrm = net.minecraft.N.j.f();
        boolean bl2 = this.i;
        if (arrm == null) {
            bl2 = bl2 > false;
        }
        return bl2;
    }

    @Override
    public boolean a(int n2, int n3) {
        m[] arrm = net.minecraft.N.j.f();
        boolean bl2 = n2;
        if (arrm == null) {
            if (bl2) {
                this.i = 40;
                return true;
            }
            bl2 = super.a(n2, n3);
        }
        return bl2;
    }

    private n a() {
        n n2 = G.a(this.a, this.m, 5, false);
        l.debug("Best exit position for portal at {} is {}", (Object)this.m, (Object)n2);
        return n2.a();
    }

    private void b(n n2) {
        block2: {
            block1: {
                y y2;
                m[] arrm;
                block0: {
                    m[] arrm2 = net.minecraft.N.j.f();
                    new net.minecraft.p.x().a(this.a, new Random(), n2);
                    y y3 = this.a.b(n2);
                    arrm = arrm2;
                    y2 = y3;
                    if (arrm != null) break block0;
                    if (!(y2 instanceof G)) break block1;
                    y2 = y3;
                }
                G g10 = (G)y2;
                g10.m = new n(this.j());
                g10.b();
                if (arrm == null) break block2;
            }
            l.warn("Couldn't save exit portal at {}", (Object)n2);
        }
    }

    private void f() {
        block10: {
            block9: {
                m[] arrm;
                l l2;
                block8: {
                    int n2;
                    l l3;
                    block7: {
                        int n3;
                        l3 = new l(this.j().e(), 0.0, this.j().a()).d();
                        l2 = l3.a(1024.0);
                        arrm = net.minecraft.N.j.f();
                        n2 = 16;
                        while (G.a(this.a, l2).b() > 0) {
                            n3 = n2--;
                            if (arrm == null && arrm == null) {
                                if (n3 <= 0) break;
                                l.debug("Skipping backwards past nonempty chunk at {}", (Object)l2);
                                l2 = l2.c(l3.a(-16.0));
                                if (arrm == null) continue;
                            }
                            break block7;
                        }
                        n3 = n2 = 16;
                    }
                    while (G.a(this.a, l2).b() == 0 && n2-- > 0) {
                        l.debug("Skipping forward past empty chunk at {}", (Object)l2);
                        l2 = l2.c(l3.a(16.0));
                        if (arrm == null) continue;
                    }
                    l.debug("Found chunk at {}", (Object)l2);
                    a a10 = G.a(this.a, l2);
                    this.m = G.a(a10);
                    G g10 = this;
                    if (arrm != null) break block8;
                    if (g10.m != null) break block9;
                    g10 = this;
                }
                g10.m = new n(l2.e + 0.5, 75.0, l2.b + 0.5);
                l.debug("Failed to find suitable block, settling on {}", (Object)this.m);
                new net.minecraft.p.y().a(this.a, new Random(this.m.h()), this.m);
                if (arrm == null) break block10;
            }
            l.debug("Found block at {}", (Object)this.m);
        }
        this.m = G.a(this.a, this.m, 16, true);
        l.debug("Creating portal at {}", (Object)this.m);
        this.m = this.m.c(10);
        this.b(this.m);
        this.b();
    }

    private static a a(z z2, l l2) {
        return z2.b(h.f(l2.e / 16.0), h.f(l2.b / 16.0));
    }

    @Override
    public r r() {
        return this.a(new r());
    }

    @Override
    public r a(r r2) {
        block2: {
            super.a(r2);
            m[] arrm = net.minecraft.N.j.f();
            r2.a("Age", this.j);
            m[] arrm2 = arrm;
            G g10 = this;
            if (arrm2 == null) {
                if (g10.m != null) {
                    r2.a("ExitPortal", net.minecraft.P.c.a(this.m));
                }
                g10 = this;
            }
            if (!g10.k) break block2;
            r2.a("ExactTeleport", this.k);
        }
        return r2;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    private static n a(z var0, n var1_1, int var2_2, boolean var3_3) {
        block11: {
            var5_4 = null;
            var6_5 = -var2_2;
            var4_6 = net.minecraft.N.j.f();
            block0: while (true) {
                v0 = var6_5;
                block1: while (v0 <= var2_2) {
                    if (var4_6 != null) break block11;
                    block2: for (var7_7 = -var2_2; var7_7 <= var2_2; ++var7_7) {
                        block12: {
                            block13: {
                                v0 = var6_5;
                                if (var4_6 != null) continue block1;
                                if (var4_6 != null) break block12;
                                if (v0 != 0) break block13;
                                v1 = var7_7;
                                if (var4_6 != null) break block12;
                                if (v1 == 0) {
                                    v1 = var3_3 ? 1 : 0;
                                    if (var4_6 == null) {
                                        if (v1 == 0) continue;
                                    } else {
                                        ** GOTO lbl20
                                    }
                                }
                                break block13;
lbl20:
                                // 2 sources

                                break block12;
                            }
                            v1 = var8_8 = 255;
                        }
                        do {
                            if (var5_4 == null) {
                                v2 = 0;
                                if (var4_6 == null) {
                                    // empty if block
                                }
                            } else {
                                v2 = var5_4.b();
                            }
                            if (var8_8 <= v2) continue block2;
                            var9_9 = new n(var1_1.e() + var6_5, (int)var8_8, var1_1.a() + var7_7);
                            var10_10 = var0.d(var9_9);
                            if (var4_6 != null) continue;
                            if (var10_10.e() && (var3_3 || var10_10.b() != g.g)) {
                                var5_4 = var9_9;
                                if (var4_6 == null) continue block2;
                            }
                            --var8_8;
                        } while (var4_6 == null);
                        if (var4_6 == null) continue;
                    }
                    ++var6_5;
                    if (var4_6 == null) continue block0;
                }
                break;
            }
            v3 = var5_4;
            if (var4_6 != null) return v3;
            if (v3 == null) {
                v3 = var1_1;
                return v3;
            }
        }
        v3 = var5_4;
        return v3;
    }

    @Nullable
    private static n a(a a10) {
        n n2;
        block3: {
            n n3 = new n(a10.t * 16, 30, a10.i * 16);
            int n4 = a10.b() + 16 - 1;
            n n5 = new n(a10.t * 16 + 16 - 1, n4, a10.i * 16 + 16 - 1);
            n n6 = null;
            double d10 = 0.0;
            Iterator<n> iterator = n.b(n3, n5).iterator();
            m[] arrm = net.minecraft.N.j.f();
            while (iterator.hasNext()) {
                block5: {
                    double d11;
                    n n7;
                    double d12;
                    block7: {
                        n n8;
                        block8: {
                            boolean bl2;
                            block6: {
                                i i2;
                                block4: {
                                    i i3;
                                    n2 = iterator.next();
                                    if (arrm != null) break block3;
                                    n8 = n2;
                                    i2 = i3 = a10.c(n8);
                                    if (arrm != null) break block4;
                                    if (i2.b() != g.v) break block5;
                                    i2 = a10.c(n8.c(1));
                                }
                                bl2 = i2.e();
                                if (arrm != null) break block6;
                                if (bl2) break block5;
                                bl2 = a10.c(n8.c(2)).e();
                            }
                            if (bl2) break block5;
                            d12 = n8.a(0.0, 0.0, 0.0);
                            n7 = n6;
                            if (arrm != null) break block7;
                            if (n7 == null) break block8;
                            d11 = d12;
                            if (arrm != null || !(d11 < d10)) break block5;
                        }
                        n7 = n8;
                    }
                    n6 = n7;
                    d11 = d10 = d12;
                }
                if (arrm == null) continue;
            }
            n2 = n6;
        }
        return n2;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public void a(x var1_1) {
        block14: {
            block15: {
                block11: {
                    block13: {
                        block12: {
                            block10: {
                                block9: {
                                    var2_2 = net.minecraft.N.j.f();
                                    v0 = this.a.C;
                                    if (var2_2 != null) break block9;
                                    if (v0 != false) return;
                                    v1 = this;
                                    if (var2_2 != null) break block10;
                                    v0 = v1.e();
                                }
                                if (v0 != false) return;
                                this.i = 100;
                                v1 = this;
                            }
                            v2 = v1.m;
                            if (var2_2 != null) break block11;
                            if (v2 != null) break block12;
                            v3 = this;
                            if (var2_2 != null) break block13;
                            if (v3.a.D instanceof H) {
                                this.f();
                            }
                        }
                        v3 = this;
                    }
                    if (var2_2 != null) break block14;
                    v2 = v3.m;
                }
                if (v2 == null) break block15;
                v4 = this;
                if (var2_2 != null) ** GOTO lbl33
                if (v4.k) {
                    v5 = this.m;
                } else {
                    v4 = this;
lbl33:
                    // 2 sources

                    v5 = v4.a();
                }
                var3_3 = v5;
                var1_1.c((double)var3_3.e() + 0.5, (double)var3_3.b() + 0.5, (double)var3_3.a() + 0.5);
            }
            v3 = this;
        }
        v3.d();
    }

    public float b(float f10) {
        return 1.0f - h.c(((float)this.i - f10) / 40.0f, 0.0f, 1.0f);
    }

    public void c(n n2) {
        this.k = true;
        this.m = n2;
    }

    @Override
    public boolean a(aA aA2) {
        return this.l().d().d(this.a, this.j(), aA2);
    }

    @Override
    public void c(r r2) {
        m[] arrm = net.minecraft.N.j.f();
        super.c(r2);
        this.j = r2.o("Age");
        m[] arrm2 = arrm;
        if (arrm2 == null) {
            if (r2.a("ExitPortal", 10)) {
                this.m = net.minecraft.P.c.d(r2.h("ExitPortal"));
            }
            this.k = r2.f("ExactTeleport");
        }
    }

    public void d() {
        block3: {
            z z2;
            block2: {
                m[] arrm = net.minecraft.N.j.f();
                z2 = this.a;
                if (arrm != null) break block2;
                if (z2.C) break block3;
                this.i = 40;
                z2 = this.a;
            }
            z2.a(this.j(), this.l(), 1, 0);
            this.b();
        }
    }

    @Override
    @Nullable
    public ag k() {
        return new ag(this.d, 8, this.r());
    }

    static {
        l = LogManager.getLogger();
    }

    public int b() {
        int n2;
        block3: {
            int n3 = 0;
            aA[] arraA = aA.values();
            m[] arrm = net.minecraft.N.j.f();
            for (aA aA2 : arraA) {
                n2 = n3;
                if (arrm == null) {
                    int n4 = this.a(aA2);
                    if (arrm == null) {
                        n4 = n4 != 0 ? 1 : 0;
                    }
                    n3 = n2 + n4;
                    if (arrm == null) continue;
                }
                break block3;
            }
            n2 = n3;
        }
        return n2;
    }
}

