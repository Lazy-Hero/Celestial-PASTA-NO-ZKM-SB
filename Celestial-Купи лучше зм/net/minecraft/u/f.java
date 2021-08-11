/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package net.minecraft.u;

import java.io.PrintStream;
import net.minecraft.K.b;
import net.minecraft.W.K;
import net.minecraft.W.a3;
import net.minecraft.W.as;
import net.minecraft.W.bC;
import net.minecraft.a7;
import net.minecraft.ar.aa;
import net.minecraft.ar.d;
import net.minecraft.u.A;
import net.minecraft.u.B;
import net.minecraft.u.C;
import net.minecraft.u.D;
import net.minecraft.u.e;
import net.minecraft.u.g;
import net.minecraft.u.h;
import net.minecraft.u.i;
import net.minecraft.u.j;
import net.minecraft.u.k;
import net.minecraft.u.l;
import net.minecraft.u.m;
import net.minecraft.u.n;
import net.minecraft.u.q;
import net.minecraft.u.r;
import net.minecraft.u.s;
import net.minecraft.u.t;
import net.minecraft.u.u;
import net.minecraft.u.v;
import net.minecraft.u.w;
import net.minecraft.u.y;
import net.minecraft.u.z;
import net.minecraft.w.bl;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class f {
    public static final /* synthetic */ PrintStream c;
    private static final /* synthetic */ Logger d;
    private static /* synthetic */ boolean b;
    private static /* synthetic */ boolean e;
    public static /* synthetic */ boolean a;

    private static gP a(gP gP2) {
        return gP2;
    }

    static {
        c = System.out;
        f.b(false);
        d = LogManager.getLogger();
    }

    public static boolean f() {
        return b;
    }

    public static void b(boolean bl2) {
        b = bl2;
    }

    public static void a(String string) {
        c.println(string);
    }

    public static boolean a() {
        boolean bl2 = f.f();
        return !bl2;
    }

    public static boolean b() {
        return e;
    }

    private static void e() {
        block1: {
            block0: {
                boolean bl2 = f.f();
                if (!d.isDebugEnabled()) break block0;
                System.setErr(new net.minecraft.R.d("STDERR", System.err));
                System.setOut(new net.minecraft.R.d("STDOUT", c));
                if (!bl2) break block1;
            }
            System.setErr(new aa("STDERR", System.err));
            System.setOut(new aa("STDOUT", c));
        }
    }

    static void d() {
        a3.B.a(h.x, new i());
        a3.B.a(h.aI, new j());
        a3.B.a(h.aA, new k());
        a3.B.a(h.bB, new l());
        a3.B.a(h.aB, new m());
        a3.B.a(h.bG, new n());
        a3.B.a(h.b3, new D());
        a3.B.a(h.W, new e());
        a3.B.a(h.bn, new v());
        boolean bl2 = f.f();
        a3.B.a(h.av, new q());
        a3.B.a(h.bL, new r());
        a3.B.a(h.N, new w(net.minecraft.J.g.OAK));
        a3.B.a(h.Z, new w(net.minecraft.J.g.SPRUCE));
        a3.B.a(h.s, new w(net.minecraft.J.g.BIRCH));
        a3.B.a(h.U, new w(net.minecraft.J.g.JUNGLE));
        a3.B.a(h.O, new w(net.minecraft.J.g.DARK_OAK));
        a3.B.a(h.R, new w(net.minecraft.J.g.ACACIA));
        s s2 = new s();
        a3.B.a(h.cg, s2);
        a3.B.a(h.ah, s2);
        a3.B.a(h.P, new t());
        a3.B.a(h.cn, new y());
        a3.B.a(h.aL, new z());
        a3.B.a(net.minecraft.w.k.b(g.cR), new u());
        a3.B.a(h.cp, new A());
        a3.B.a(net.minecraft.w.k.b(g.G), new B());
        bl[] arrbl = bl.values();
        int n2 = arrbl.length;
        boolean bl3 = bl2;
        for (int i2 = 0; i2 < n2; ++i2) {
            bl bl4 = arrbl[i2];
            a3.B.a(net.minecraft.w.k.b(as.b(bl4)), new C(null));
            if (!bl3) continue;
            net.minecraft.k.m.b(!net.minecraft.k.m.d());
            break;
        }
    }

    public static void c() {
        block8: {
            boolean bl2;
            block10: {
                boolean bl3;
                block9: {
                    block7: {
                        bl3 = f.f();
                        bl2 = e;
                        if (bl3) break block7;
                        if (bl2) break block8;
                        e = true;
                        f.e();
                        net.minecraft.ar.d.b();
                        K.a();
                        bC.b();
                        net.minecraft.K.b.h();
                        net.minecraft.ax.u.c();
                        net.minecraft.w.k.n();
                        net.minecraft.K.i.b();
                        net.minecraft.K.g.b();
                        net.minecraft.U.h.c();
                        net.minecraft.A.h.a();
                        f.d();
                        bl2 = net.minecraft.az.t.a();
                    }
                    if (!bl3) {
                        if (!bl2) {
                            a = true;
                            d.error("Errors with built-in recipes!");
                        }
                        net.minecraft.l.m.c();
                        bl2 = d.isDebugEnabled();
                    }
                    if (bl3) break block9;
                    if (!bl2) break block8;
                    bl2 = new a7(null).c();
                }
                if (!bl3) {
                    if (bl2) {
                        a = true;
                        d.error("Errors with built-in advancements!");
                    }
                    bl2 = net.minecraft.aj.j.a();
                }
                if (bl3) break block10;
                if (bl2) break block8;
                bl2 = true;
            }
            a = bl2;
            d.error("Errors with built-in loot tables");
        }
    }
}

