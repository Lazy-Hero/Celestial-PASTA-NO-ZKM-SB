/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Sets
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package net.minecraft.U;

import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import net.minecraft.J.D;
import net.minecraft.J.E;
import net.minecraft.J.F;
import net.minecraft.J.G;
import net.minecraft.J.n;
import net.minecraft.J.o;
import net.minecraft.J.p;
import net.minecraft.J.q;
import net.minecraft.J.r;
import net.minecraft.J.s;
import net.minecraft.J.t;
import net.minecraft.J.u;
import net.minecraft.Q.R;
import net.minecraft.Q.aq;
import net.minecraft.U.C;
import net.minecraft.U.H;
import net.minecraft.U.K;
import net.minecraft.U.M;
import net.minecraft.U.x;
import net.minecraft.U.y;
import net.minecraft.U.z;
import net.minecraft.ag.Y;
import net.minecraft.ag.au;
import net.minecraft.ah.A;
import net.minecraft.ar.Z;
import net.minecraft.ar.a_;
import net.minecraft.c.l;
import net.minecraft.h.c;
import net.minecraft.h.d;
import net.minecraft.i.k;
import net.minecraft.k.h;
import net.minecraft.o.a;
import net.minecraft.z.f;
import net.minecraft.z.i;
import net.minecraft.z.j;
import net.minecraft.z.m;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class N {
    private /* synthetic */ int a;
    private static final /* synthetic */ Logger e;
    private final /* synthetic */ a_<H> b;
    private final /* synthetic */ Set<H> c;
    private final /* synthetic */ A d;

    public void a(int n2) {
        this.a = (n2 - 1) * 16;
        int[] arrn = M.b();
        for (H h2 : this.c) {
            h2.a(this.a);
            if (arrn != null) continue;
        }
    }

    private static Throwable a(Throwable throwable) {
        return throwable;
    }

    public static void a(x x2, double d10, double d11, double d12) {
        x2.u = N.a(d10);
        x2.i = N.a(d11);
        x2.F = N.a(d12);
    }

    public void b(k k2) {
        Iterator<H> iterator = this.c.iterator();
        int[] arrn = M.b();
        while (iterator.hasNext()) {
            block5: {
                H h2;
                block3: {
                    H h3;
                    block4: {
                        h2 = h3 = iterator.next();
                        if (arrn == null) break block3;
                        if (h2.c() != k2) break block4;
                        h3.a(this.d.k);
                        if (arrn != null) break block5;
                    }
                    h2 = h3;
                }
                h2.d(k2);
            }
            if (arrn != null) continue;
        }
    }

    public void a(x x2) {
        block6: {
            boolean bl2;
            block65: {
                block66: {
                    int[] arrn;
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
                                                                                                                                                                                                            block17: {
                                                                                                                                                                                                                block18: {
                                                                                                                                                                                                                    block15: {
                                                                                                                                                                                                                        block16: {
                                                                                                                                                                                                                            block13: {
                                                                                                                                                                                                                                block14: {
                                                                                                                                                                                                                                    block11: {
                                                                                                                                                                                                                                        block12: {
                                                                                                                                                                                                                                            block7: {
                                                                                                                                                                                                                                                block8: {
                                                                                                                                                                                                                                                    arrn = M.b();
                                                                                                                                                                                                                                                    bl2 = x2 instanceof k;
                                                                                                                                                                                                                                                    if (arrn == null) break block7;
                                                                                                                                                                                                                                                    if (!bl2) break block8;
                                                                                                                                                                                                                                                    this.a(x2, 512, 2);
                                                                                                                                                                                                                                                    k k2 = (k)x2;
                                                                                                                                                                                                                                                    for (H h2 : this.c) {
                                                                                                                                                                                                                                                        block10: {
                                                                                                                                                                                                                                                            H h3;
                                                                                                                                                                                                                                                            block9: {
                                                                                                                                                                                                                                                                if (arrn == null) break block6;
                                                                                                                                                                                                                                                                h3 = h2;
                                                                                                                                                                                                                                                                if (arrn == null) break block9;
                                                                                                                                                                                                                                                                if (h3.c() == k2) break block10;
                                                                                                                                                                                                                                                                h3 = h2;
                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                            h3.d(k2);
                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                        if (arrn != null) continue;
                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                    if (arrn != null) break block6;
                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                bl2 = x2 instanceof net.minecraft.z.o;
                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                            if (arrn == null) break block11;
                                                                                                                                                                                                                                            if (!bl2) break block12;
                                                                                                                                                                                                                                            this.a(x2, 64, 5, true);
                                                                                                                                                                                                                                            if (arrn != null) break block6;
                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                        bl2 = x2 instanceof f;
                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                    if (arrn == null) break block13;
                                                                                                                                                                                                                                    if (!bl2) break block14;
                                                                                                                                                                                                                                    this.a(x2, 64, 20, false);
                                                                                                                                                                                                                                    if (arrn != null) break block6;
                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                bl2 = x2 instanceof m;
                                                                                                                                                                                                                            }
                                                                                                                                                                                                                            if (arrn == null) break block15;
                                                                                                                                                                                                                            if (!bl2) break block16;
                                                                                                                                                                                                                            this.a(x2, 64, 10, false);
                                                                                                                                                                                                                            if (arrn != null) break block6;
                                                                                                                                                                                                                        }
                                                                                                                                                                                                                        bl2 = x2 instanceof j;
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                    if (arrn == null) break block17;
                                                                                                                                                                                                                    if (!bl2) break block18;
                                                                                                                                                                                                                    this.a(x2, 64, 10, true);
                                                                                                                                                                                                                    if (arrn != null) break block6;
                                                                                                                                                                                                                }
                                                                                                                                                                                                                bl2 = x2 instanceof net.minecraft.z.u;
                                                                                                                                                                                                            }
                                                                                                                                                                                                            if (arrn == null) break block19;
                                                                                                                                                                                                            if (!bl2) break block20;
                                                                                                                                                                                                            this.a(x2, 64, 10, true);
                                                                                                                                                                                                            if (arrn != null) break block6;
                                                                                                                                                                                                        }
                                                                                                                                                                                                        bl2 = x2 instanceof net.minecraft.z.p;
                                                                                                                                                                                                    }
                                                                                                                                                                                                    if (arrn == null) break block21;
                                                                                                                                                                                                    if (!bl2) break block22;
                                                                                                                                                                                                    this.a(x2, 64, 10, false);
                                                                                                                                                                                                    if (arrn != null) break block6;
                                                                                                                                                                                                }
                                                                                                                                                                                                bl2 = x2 instanceof F;
                                                                                                                                                                                            }
                                                                                                                                                                                            if (arrn == null) break block23;
                                                                                                                                                                                            if (!bl2) break block24;
                                                                                                                                                                                            this.a(x2, 64, 10, true);
                                                                                                                                                                                            if (arrn != null) break block6;
                                                                                                                                                                                        }
                                                                                                                                                                                        bl2 = x2 instanceof q;
                                                                                                                                                                                    }
                                                                                                                                                                                    if (arrn == null) break block25;
                                                                                                                                                                                    if (!bl2) break block26;
                                                                                                                                                                                    this.a(x2, 64, 4, true);
                                                                                                                                                                                    if (arrn != null) break block6;
                                                                                                                                                                                }
                                                                                                                                                                                bl2 = x2 instanceof net.minecraft.z.s;
                                                                                                                                                                            }
                                                                                                                                                                            if (arrn == null) break block27;
                                                                                                                                                                            if (!bl2) break block28;
                                                                                                                                                                            this.a(x2, 64, 10, true);
                                                                                                                                                                            if (arrn != null) break block6;
                                                                                                                                                                        }
                                                                                                                                                                        bl2 = x2 instanceof net.minecraft.z.t;
                                                                                                                                                                    }
                                                                                                                                                                    if (arrn == null) break block29;
                                                                                                                                                                    if (!bl2) break block30;
                                                                                                                                                                    this.a(x2, 64, 10, true);
                                                                                                                                                                    if (arrn != null) break block6;
                                                                                                                                                                }
                                                                                                                                                                bl2 = x2 instanceof G;
                                                                                                                                                            }
                                                                                                                                                            if (arrn == null) break block31;
                                                                                                                                                            if (!bl2) break block32;
                                                                                                                                                            this.a(x2, 64, 10, true);
                                                                                                                                                            if (arrn != null) break block6;
                                                                                                                                                        }
                                                                                                                                                        bl2 = x2 instanceof s;
                                                                                                                                                    }
                                                                                                                                                    if (arrn == null) break block33;
                                                                                                                                                    if (!bl2) break block34;
                                                                                                                                                    this.a(x2, 64, 10, true);
                                                                                                                                                    if (arrn != null) break block6;
                                                                                                                                                }
                                                                                                                                                bl2 = x2 instanceof t;
                                                                                                                                            }
                                                                                                                                            if (arrn == null) break block35;
                                                                                                                                            if (!bl2) break block36;
                                                                                                                                            this.a(x2, 64, 20, true);
                                                                                                                                            if (arrn != null) break block6;
                                                                                                                                        }
                                                                                                                                        bl2 = x2 instanceof u;
                                                                                                                                    }
                                                                                                                                    if (arrn == null) break block37;
                                                                                                                                    if (!bl2) break block38;
                                                                                                                                    this.a(x2, 80, 3, true);
                                                                                                                                    if (arrn != null) break block6;
                                                                                                                                }
                                                                                                                                bl2 = x2 instanceof o;
                                                                                                                            }
                                                                                                                            if (arrn == null) break block39;
                                                                                                                            if (!bl2) break block40;
                                                                                                                            this.a(x2, 80, 3, true);
                                                                                                                            if (arrn != null) break block6;
                                                                                                                        }
                                                                                                                        bl2 = x2 instanceof au;
                                                                                                                    }
                                                                                                                    if (arrn == null) break block41;
                                                                                                                    if (!bl2) break block42;
                                                                                                                    this.a(x2, 64, 3, true);
                                                                                                                    if (arrn != null) break block6;
                                                                                                                }
                                                                                                                bl2 = x2 instanceof c;
                                                                                                            }
                                                                                                            if (arrn == null) break block43;
                                                                                                            if (!bl2) break block44;
                                                                                                            this.a(x2, 80, 3, false);
                                                                                                            if (arrn != null) break block6;
                                                                                                        }
                                                                                                        bl2 = x2 instanceof net.minecraft.z.q;
                                                                                                    }
                                                                                                    if (arrn == null) break block45;
                                                                                                    if (!bl2) break block46;
                                                                                                    this.a(x2, 80, 3, true);
                                                                                                    if (arrn != null) break block6;
                                                                                                }
                                                                                                bl2 = x2 instanceof Y;
                                                                                            }
                                                                                            if (arrn == null) break block47;
                                                                                            if (!bl2) break block48;
                                                                                            this.a(x2, 80, 3, false);
                                                                                            if (arrn != null) break block6;
                                                                                        }
                                                                                        bl2 = x2 instanceof d;
                                                                                    }
                                                                                    if (arrn == null) break block49;
                                                                                    if (!bl2) break block50;
                                                                                    this.a(x2, 160, 3, true);
                                                                                    if (arrn != null) break block6;
                                                                                }
                                                                                bl2 = x2 instanceof net.minecraft.ag.u;
                                                                            }
                                                                            if (arrn == null) break block51;
                                                                            if (!bl2) break block52;
                                                                            this.a(x2, 80, 3, true);
                                                                            if (arrn != null) break block6;
                                                                        }
                                                                        bl2 = x2 instanceof D;
                                                                    }
                                                                    if (arrn == null) break block53;
                                                                    if (!bl2) break block54;
                                                                    this.a(x2, 160, 10, true);
                                                                    if (arrn != null) break block6;
                                                                }
                                                                bl2 = x2 instanceof r;
                                                            }
                                                            if (arrn == null) break block55;
                                                            if (!bl2) break block56;
                                                            this.a(x2, 160, 20, true);
                                                            if (arrn != null) break block6;
                                                        }
                                                        bl2 = x2 instanceof z;
                                                    }
                                                    if (arrn == null) break block57;
                                                    if (!bl2) break block58;
                                                    this.a(x2, 160, Integer.MAX_VALUE, false);
                                                    if (arrn != null) break block6;
                                                }
                                                bl2 = x2 instanceof n;
                                            }
                                            if (arrn == null) break block59;
                                            if (!bl2) break block60;
                                            this.a(x2, 160, 3, true);
                                            if (arrn != null) break block6;
                                        }
                                        bl2 = x2 instanceof E;
                                    }
                                    if (arrn == null) break block61;
                                    if (!bl2) break block62;
                                    this.a(x2, 160, 20, true);
                                    if (arrn != null) break block6;
                                }
                                bl2 = x2 instanceof y;
                            }
                            if (arrn == null) break block63;
                            if (!bl2) break block64;
                            this.a(x2, 160, Integer.MAX_VALUE, true);
                            if (arrn != null) break block6;
                        }
                        bl2 = x2 instanceof p;
                    }
                    if (arrn == null) break block65;
                    if (!bl2) break block66;
                    this.a(x2, 256, Integer.MAX_VALUE, false);
                    if (arrn != null) break block6;
                }
                bl2 = x2 instanceof i;
            }
            if (bl2) {
                this.a(x2, 160, 2, false);
            }
        }
    }

    static {
        e = LogManager.getLogger();
    }

    public void a() {
        int n2;
        Object object;
        int[] arrn;
        ArrayList arrayList;
        block11: {
            int n3;
            arrayList = Lists.newArrayList();
            arrn = M.b();
            for (H object2 : this.c) {
                block13: {
                    H h2;
                    block12: {
                        object2.b(this.d.k);
                        h2 = object2;
                        if (arrn == null) break block12;
                        n3 = h2.v ? 1 : 0;
                        if (arrn == null) break block11;
                        if (n3 == 0) break block13;
                        h2 = object2;
                    }
                    object = h2.c();
                    boolean bl2 = object instanceof k;
                    if (arrn != null && bl2) {
                        bl2 = arrayList.add((k)object);
                    }
                }
                if (arrn != null) continue;
            }
            n3 = n2 = 0;
        }
        while (n2 < arrayList.size()) {
            Object object2 = arrayList.get(n2);
            block2: while (true) {
                k k2 = (k)object2;
                object = this.c.iterator();
                while (object.hasNext()) {
                    block15: {
                        H h3;
                        block14: {
                            H h4;
                            h3 = h4 = (H)object.next();
                            if (arrn == null) break block14;
                            object2 = h3.c();
                            if (arrn == null) continue block2;
                            if (object2 == k2) break block15;
                            h3 = h4;
                        }
                        h3.d(k2);
                    }
                    if (arrn != null) continue;
                }
                break;
            }
            ++n2;
            if (arrn != null) continue;
        }
    }

    public void a(x x2, net.minecraft.C.K<?> k2) {
        block3: {
            H h2;
            block2: {
                H h3 = this.b.f(x2.W());
                int[] arrn = M.b();
                h2 = h3;
                if (arrn == null) break block2;
                if (h2 == null) break block3;
                h2 = h3;
            }
            h2.b(k2);
        }
    }

    public static long a(double d10) {
        return h.g(d10 * 4096.0);
    }

    public N(A a10) {
        this.c = Sets.newHashSet();
        this.b = new a_();
        this.d = a10;
        this.a = a10.H().O().b();
    }

    public void a(k k2) {
        Iterator<H> iterator = this.c.iterator();
        int[] arrn = M.b();
        while (iterator.hasNext()) {
            H h2 = iterator.next();
            h2.e(k2);
            if (arrn != null) continue;
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public void a(k var1_1, a var2_2) {
        block20: {
            block19: {
                var4_3 = Lists.newArrayList();
                var5_4 = Lists.newArrayList();
                var3_5 = M.b();
                var6_6 = this.c.iterator();
                while (var6_6.hasNext()) {
                    block13: {
                        block16: {
                            block18: {
                                block17: {
                                    block15: {
                                        block14: {
                                            block12: {
                                                var7_7 = var6_6.next();
                                                v0 = var8_8 = var7_7.c();
                                                if (var3_5 == null) ** GOTO lbl59
                                                if (var3_5 == null) break block12;
                                                if (v0 == var1_1) break block13;
                                                v1 = var8_8;
                                            }
                                            v2 = v1.v;
                                            v3 = var2_2.t;
                                            if (var3_5 == null) break block14;
                                            if (v2 != v3) break block13;
                                            v2 = var8_8.y;
                                            if (var3_5 == null) break block15;
                                            v3 = var2_2.i;
                                        }
                                        if (v2 != v3) break block13;
                                        var7_7.d(var1_1);
                                        v2 = var8_8 instanceof C;
                                    }
                                    if (var3_5 == null) break block16;
                                    if (v2 == 0) break block17;
                                    v4 = ((C)var8_8).e();
                                    if (var3_5 == null) break block18;
                                    if (v4 != null) {
                                        var4_3.add(var8_8);
                                    }
                                }
                                v4 = var8_8;
                            }
                            v2 = v4.j().isEmpty() ? 1 : 0;
                        }
                        if (var3_5 != null && v2 == 0) {
                            v2 = var5_4.add(var8_8) ? 1 : 0;
                        }
                    }
                    if (var3_5 != null) continue;
                }
                v5 = var4_3.isEmpty();
                if (var3_5 == null) break block19;
                if (!v5) {
                    for (Object var7_7 : var4_3) {
                        var1_1.cD.a(new R((x)var7_7, ((C)var7_7).e()));
                        if (var3_5 == null) return;
                        if (var3_5 != null) continue;
                    }
                }
                v6 = var5_4;
                if (var3_5 == null) break block20;
                v5 = v6.isEmpty();
            }
            if (v5 != false) return;
            v6 = var5_4;
        }
        var6_6 = v6.iterator();
        do {
            if (var6_6.hasNext() == false) return;
            v0 = (x)var6_6.next();
lbl59:
            // 2 sources

            var7_7 = v0;
            var1_1.cD.a(new aq((x)var7_7));
        } while (var3_5 != null);
    }

    public void a(x x2, int n2, int n3, boolean bl2) {
        try {
            if (this.b.a(x2.W())) {
                throw new IllegalStateException("Entity is already tracked!");
            }
            H h2 = new H(x2, n2, this.a, n3, bl2);
            this.c.add(h2);
            this.b.a(x2.W(), h2);
            h2.a(this.d.k);
        }
        catch (Throwable throwable) {
            net.minecraft.c.f f10 = net.minecraft.c.f.a(throwable, "Adding entity to track");
            l l2 = f10.a("Entity To Track");
            l2.a("Tracking range", n2 + " blocks");
            l2.a("Update interval", new K(this, n3));
            x2.a(l2);
            this.b.f(x2.W()).c().a(f10.a("Entity That Is Already Tracked"));
            try {
                throw new Z(f10);
            }
            catch (Z z2) {
                e.error("\"Silently\" catching entity tracking error.", (Throwable)z2);
            }
        }
    }

    public void b(x x2, net.minecraft.C.K<?> k2) {
        block3: {
            H h2;
            block2: {
                H h3 = this.b.f(x2.W());
                int[] arrn = M.b();
                h2 = h3;
                if (arrn == null) break block2;
                if (h2 == null) break block3;
                h2 = h3;
            }
            h2.a(k2);
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public void b(x var1_1) {
        var2_2 = M.b();
        v0 = var1_1;
        if (var2_2 == null) ** GOTO lbl14
        if (v0 instanceof k) {
            var3_3 = (k)var1_1;
            var4_4 = this.c.iterator();
            while (var4_4.hasNext()) {
                v1 = var5_5 = var4_4.next();
                if (var2_2 != null) {
                    v1.a((k)var3_3);
                    if (var2_2 != null) continue;
                }
                break;
            }
        } else {
            v0 = this.b.e(var1_1.W());
lbl14:
            // 2 sources

            v1 = (H)v0;
        }
        v2 = var3_3 = v1;
        if (var2_2 != null) {
            if (v2 == null) return;
            this.c.remove(var3_3);
            v2 = var3_3;
        }
        v2.a();
    }

    public void a(x x2, int n2, int n3) {
        this.a(x2, n2, n3, false);
    }
}

