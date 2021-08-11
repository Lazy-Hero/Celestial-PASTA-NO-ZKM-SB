/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  javax.annotation.Nullable
 */
package net.minecraft.aw;

import com.google.common.collect.Maps;
import java.util.Map;
import javax.annotation.Nullable;
import net.minecraft.P.r;
import net.minecraft.ah.K;
import net.minecraft.ah.L;
import net.minecraft.ah.e;
import net.minecraft.ah.p;
import net.minecraft.ah.s;
import net.minecraft.av.b;
import net.minecraft.av.g;
import net.minecraft.aw.A;
import net.minecraft.aw.a;
import net.minecraft.aw.d;
import net.minecraft.aw.f;
import net.minecraft.aw.m;
import net.minecraft.aw.n;
import net.minecraft.aw.o;
import net.minecraft.aw.t;
import net.minecraft.aw.u;
import net.minecraft.aw.v;
import net.minecraft.c.l;

public class w {
    private /* synthetic */ int u;
    private /* synthetic */ boolean n;
    private /* synthetic */ L w;
    private /* synthetic */ int v;
    private /* synthetic */ int L;
    private /* synthetic */ int q;
    private /* synthetic */ double r;
    private /* synthetic */ long M;
    private /* synthetic */ boolean H;
    private /* synthetic */ boolean K;
    private /* synthetic */ boolean G;
    private /* synthetic */ double x;
    private /* synthetic */ e l;
    private /* synthetic */ int B;
    private /* synthetic */ long g;
    private /* synthetic */ boolean N;
    private /* synthetic */ int i;
    public static final /* synthetic */ e c;
    private /* synthetic */ r E;
    private /* synthetic */ String O;
    private /* synthetic */ double p;
    private static /* synthetic */ String[] d;
    private /* synthetic */ double a;
    private /* synthetic */ int k;
    private /* synthetic */ long P;
    private /* synthetic */ double j;
    private /* synthetic */ double z;
    private /* synthetic */ boolean o;
    private /* synthetic */ s s;
    private /* synthetic */ net.minecraft.ah.a h;
    private /* synthetic */ long C;
    private /* synthetic */ long f;
    private /* synthetic */ int F;
    private /* synthetic */ String t;
    private /* synthetic */ int e;
    private /* synthetic */ int b;
    private /* synthetic */ long J;
    private /* synthetic */ String A;
    private /* synthetic */ boolean y;
    private /* synthetic */ int m;
    private /* synthetic */ boolean I;
    private final /* synthetic */ Map<p, r> D;

    static L i(w w2) {
        return w2.w;
    }

    public void c(int n2) {
        this.L = n2;
    }

    public long K() {
        return this.M;
    }

    public void b(double d10) {
        this.x = d10;
    }

    static int n(w w2) {
        return w2.B;
    }

    static int l(w w2) {
        return w2.v;
    }

    public void a(long l2) {
        this.f = l2;
    }

    public void f(int n2) {
        this.m = n2;
    }

    static int b(w w2) {
        return w2.e;
    }

    public L w() {
        return this.w;
    }

    static long d(w w2) {
        return w2.f;
    }

    public void b(long l2) {
        this.J = l2;
    }

    public void a(e e10) {
        this.l = e10;
    }

    public boolean D() {
        return this.y;
    }

    public void a(int n2) {
        this.q = n2;
    }

    public void g(int n2) {
        this.e = n2;
    }

    public void a(l l2) {
        l2.a("Level seed", new n(this));
        l2.a("Level generator", new A(this));
        l2.a("Level generator options", new a(this));
        l2.a("Level spawn location", new t(this));
        l2.a("Level time", new u(this));
        l2.a("Level dimension", new o(this));
        l2.a("Level storage version", new m(this));
        l2.a("Level weather", new d(this));
        l2.a("Level game mode", new f(this));
    }

    public void a(boolean bl2) {
        this.H = bl2;
    }

    public double G() {
        return this.z;
    }

    public int h() {
        return this.v;
    }

    static int f(w w2) {
        return w2.m;
    }

    public boolean F() {
        return this.n;
    }

    public long x() {
        return this.J;
    }

    public void f(double d10) {
        this.r = d10;
    }

    static {
        c = net.minecraft.ah.e.NORMAL;
        net.minecraft.aw.w.b(new String[3]);
    }

    public void g(boolean bl2) {
        this.n = bl2;
    }

    public boolean t() {
        return this.I;
    }

    public r v() {
        return this.E;
    }

    public String p() {
        return this.t;
    }

    public boolean a() {
        return this.o;
    }

    protected w() {
        this.w = net.minecraft.ah.L.a;
        this.O = "";
        this.x = 6.0E7;
        this.a = 5.0;
        this.z = 0.2;
        this.F = 5;
        this.b = 15;
        this.D = Maps.newEnumMap(p.class);
        this.h = new net.minecraft.ah.a();
    }

    public double l() {
        return this.r;
    }

    public void c(double d10) {
        this.p = d10;
    }

    public long J() {
        return this.C;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public int z() {
        return this.L;
    }

    public e o() {
        return this.l;
    }

    public s g() {
        return this.s;
    }

    static int q(w w2) {
        return w2.q;
    }

    public void f(boolean bl2) {
        this.y = bl2;
    }

    public long A() {
        return this.P;
    }

    public void a(L l2) {
        this.w = l2;
    }

    static boolean o(w w2) {
        return w2.o;
    }

    public static void a(b b10) {
        b10.a(net.minecraft.av.f.LEVEL, (g)new v());
    }

    static String j(w w2) {
        return w2.O;
    }

    public int I() {
        return this.e;
    }

    public long m() {
        return this.f;
    }

    static boolean c(w w2) {
        return w2.G;
    }

    public r a(p p2) {
        r r2 = this.D.get((Object)p2);
        String[] arrstring = net.minecraft.aw.w.d();
        r r3 = r2;
        if (arrstring != null) {
            r3 = r3 == null ? new r() : r2;
        }
        return r3;
    }

    public double n() {
        return this.x;
    }

    public double i() {
        return this.a;
    }

    static boolean k(w w2) {
        return w2.n;
    }

    static boolean a(w w2) {
        return w2.H;
    }

    public void c(boolean bl2) {
        this.G = bl2;
    }

    public void e(int n2) {
        this.k = n2;
    }

    public void a(double d10) {
        this.j = d10;
    }

    public void d(double d10) {
        this.z = d10;
    }

    public int u() {
        return this.b;
    }

    public void i(int n2) {
        this.b = n2;
    }

    static boolean p(w w2) {
        return w2.y;
    }

    public int M() {
        return this.k;
    }

    public int f() {
        return this.q;
    }

    public void a(s s2) {
        this.s = s2;
    }

    public int j() {
        return this.m;
    }

    public int y() {
        return this.F;
    }

    public void a(K k2) {
        this.g = k2.e();
        this.s = k2.d();
        this.y = k2.j();
        this.o = k2.a();
        this.w = k2.i();
        this.O = k2.c();
        this.n = k2.f();
    }

    public void e(double d10) {
        this.a = d10;
    }

    public void a(String string) {
        this.t = string;
    }

    public void d(int n2) {
        this.v = n2;
    }

    public w(r r2) {
        block67: {
            String string;
            r r3;
            Object object;
            String[] arrstring;
            block66: {
                boolean bl2;
                block65: {
                    block64: {
                        block63: {
                            block61: {
                                boolean bl3;
                                w w2;
                                block62: {
                                    block60: {
                                        long l2;
                                        block58: {
                                            w w3;
                                            block59: {
                                                block57: {
                                                    int n2;
                                                    block55: {
                                                        w w4;
                                                        block56: {
                                                            boolean bl4;
                                                            block47: {
                                                                block48: {
                                                                    block52: {
                                                                        block51: {
                                                                            int n3;
                                                                            block54: {
                                                                                int n4;
                                                                                block53: {
                                                                                    L l3;
                                                                                    block49: {
                                                                                        block50: {
                                                                                            this.w = net.minecraft.ah.L.a;
                                                                                            this.O = "";
                                                                                            this.x = 6.0E7;
                                                                                            this.a = 5.0;
                                                                                            this.z = 0.2;
                                                                                            this.F = 5;
                                                                                            this.b = 15;
                                                                                            this.D = Maps.newEnumMap(p.class);
                                                                                            this.h = new net.minecraft.ah.a();
                                                                                            arrstring = net.minecraft.aw.w.d();
                                                                                            bl4 = r2.a("Version", 10);
                                                                                            if (arrstring != null) {
                                                                                                if (bl4) {
                                                                                                    object = r2.h("Version");
                                                                                                    this.A = ((r)object).j("Name");
                                                                                                    this.i = ((r)object).m("Id");
                                                                                                    this.N = ((r)object).f("Snapshot");
                                                                                                }
                                                                                                this.g = r2.o("RandomSeed");
                                                                                                bl4 = r2.a("generatorName", 8);
                                                                                            }
                                                                                            if (arrstring == null) break block47;
                                                                                            if (!bl4) break block48;
                                                                                            object = r2.j("generatorName");
                                                                                            l3 = this.w = net.minecraft.ah.L.a((String)object);
                                                                                            if (arrstring == null) break block49;
                                                                                            if (l3 != null) break block50;
                                                                                            this.w = net.minecraft.ah.L.a;
                                                                                            if (arrstring != null) break block51;
                                                                                            net.minecraft.k.m.b(!net.minecraft.k.m.d());
                                                                                        }
                                                                                        l3 = this.w;
                                                                                    }
                                                                                    bl4 = l3.h();
                                                                                    if (arrstring == null) break block52;
                                                                                    if (!bl4) break block51;
                                                                                    n3 = 0;
                                                                                    n4 = r2.a("generatorVersion", 99);
                                                                                    if (arrstring == null) break block53;
                                                                                    if (n4 == 0) break block54;
                                                                                    n4 = r2.m("generatorVersion");
                                                                                }
                                                                                n3 = n4;
                                                                            }
                                                                            this.w = this.w.a(n3);
                                                                        }
                                                                        bl4 = r2.a("generatorOptions", 8);
                                                                    }
                                                                    if (arrstring == null) break block47;
                                                                    if (bl4) {
                                                                        this.O = r2.j("generatorOptions");
                                                                    }
                                                                }
                                                                w4 = this;
                                                                n2 = r2.m("GameType");
                                                                if (arrstring == null) break block55;
                                                                w4.s = net.minecraft.ah.s.a(n2);
                                                                bl4 = r2.a("MapFeatures", 99);
                                                            }
                                                            if (!bl4) break block56;
                                                            this.y = r2.f("MapFeatures");
                                                            if (arrstring != null) break block57;
                                                        }
                                                        w4 = this;
                                                        n2 = 1;
                                                    }
                                                    w4.y = n2;
                                                }
                                                this.k = r2.m("SpawnX");
                                                this.m = r2.m("SpawnY");
                                                this.v = r2.m("SpawnZ");
                                                w3 = this;
                                                l2 = r2.o("Time");
                                                if (arrstring == null) break block58;
                                                w3.J = l2;
                                                if (!r2.a("DayTime", 99)) break block59;
                                                this.f = r2.o("DayTime");
                                                if (arrstring != null) break block60;
                                            }
                                            w3 = this;
                                            l2 = this.J;
                                        }
                                        w3.f = l2;
                                    }
                                    this.C = r2.o("LastPlayed");
                                    this.P = r2.o("SizeOnDisk");
                                    this.t = r2.j("LevelName");
                                    this.L = r2.m("version");
                                    this.u = r2.m("clearWeatherTime");
                                    this.e = r2.m("rainTime");
                                    this.G = r2.f("raining");
                                    this.q = r2.m("thunderTime");
                                    this.H = r2.f("thundering");
                                    w2 = this;
                                    bl3 = r2.f("hardcore");
                                    if (arrstring == null) break block61;
                                    w2.o = bl3;
                                    if (!r2.a("initialized", 99)) break block62;
                                    this.I = r2.f("initialized");
                                    if (arrstring != null) break block61;
                                }
                                w2 = this;
                                bl3 = w2.I = true;
                            }
                            if (!r2.a("allowCommands", 99)) break block63;
                            this.n = r2.f("allowCommands");
                            if (arrstring != null) break block64;
                        }
                        this.n = this.s == net.minecraft.ah.s.CREATIVE;
                    }
                    bl2 = r2.a("Player", 10);
                    if (arrstring != null) {
                        if (bl2) {
                            this.E = r2.h("Player");
                            this.B = this.E.m("Dimension");
                        }
                        bl2 = r2.a("GameRules", 10);
                    }
                    if (arrstring != null) {
                        if (bl2) {
                            this.h.a(r2.h("GameRules"));
                        }
                        bl2 = r2.a("Difficulty", 99);
                    }
                    if (arrstring != null) {
                        if (bl2) {
                            this.l = net.minecraft.ah.e.a(r2.r("Difficulty"));
                        }
                        bl2 = r2.a("DifficultyLocked", 1);
                    }
                    if (arrstring != null) {
                        if (bl2) {
                            this.K = r2.f("DifficultyLocked");
                        }
                        bl2 = r2.a("BorderCenterX", 99);
                    }
                    if (arrstring != null) {
                        if (bl2) {
                            this.j = r2.e("BorderCenterX");
                        }
                        bl2 = r2.a("BorderCenterZ", 99);
                    }
                    if (arrstring != null) {
                        if (bl2) {
                            this.p = r2.e("BorderCenterZ");
                        }
                        bl2 = r2.a("BorderSize", 99);
                    }
                    if (arrstring != null) {
                        if (bl2) {
                            this.x = r2.e("BorderSize");
                        }
                        bl2 = r2.a("BorderSizeLerpTime", 99);
                    }
                    if (arrstring != null) {
                        if (bl2) {
                            this.M = r2.o("BorderSizeLerpTime");
                        }
                        bl2 = r2.a("BorderSizeLerpTarget", 99);
                    }
                    if (arrstring != null) {
                        if (bl2) {
                            this.r = r2.e("BorderSizeLerpTarget");
                        }
                        bl2 = r2.a("BorderSafeZone", 99);
                    }
                    if (arrstring != null) {
                        if (bl2) {
                            this.a = r2.e("BorderSafeZone");
                        }
                        bl2 = r2.a("BorderDamagePerBlock", 99);
                    }
                    if (arrstring != null) {
                        if (bl2) {
                            this.z = r2.e("BorderDamagePerBlock");
                        }
                        bl2 = r2.a("BorderWarningBlocks", 99);
                    }
                    if (arrstring != null) {
                        if (bl2) {
                            this.F = r2.m("BorderWarningBlocks");
                        }
                        bl2 = r2.a("BorderWarningTime", 99);
                    }
                    if (arrstring == null) break block65;
                    if (bl2) {
                        this.b = r2.m("BorderWarningTime");
                    }
                    r3 = r2;
                    string = "DimensionData";
                    if (arrstring == null) break block66;
                    bl2 = r3.a(string, 10);
                }
                if (!bl2) break block67;
                r3 = r2;
                string = "DimensionData";
            }
            object = r3.h(string);
            for (String string2 : ((r)object).d()) {
                this.D.put(net.minecraft.ah.p.a(Integer.parseInt(string2)), ((r)object).h(string2));
                if (arrstring != null) continue;
            }
        }
    }

    public String e() {
        return this.A;
    }

    public boolean c() {
        return this.N;
    }

    public net.minecraft.ah.a E() {
        return this.h;
    }

    static int e(w w2) {
        return w2.L;
    }

    public int C() {
        return this.i;
    }

    public void b(boolean bl2) {
        this.o = bl2;
    }

    static int h(w w2) {
        return w2.k;
    }

    public w(K k2, String string) {
        this.w = net.minecraft.ah.L.a;
        this.O = "";
        this.x = 6.0E7;
        this.a = 5.0;
        this.z = 0.2;
        this.F = 5;
        this.b = 15;
        this.D = Maps.newEnumMap(p.class);
        this.h = new net.minecraft.ah.a();
        this.a(k2);
        this.t = string;
        this.l = c;
        this.I = false;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public String r() {
        String[] arrstring = net.minecraft.aw.w.d();
        w w2 = this;
        if (arrstring != null) {
            if (w2.O == null) {
                return "";
            }
            w2 = this;
        }
        String string = w2.O;
        return string;
    }

    public double H() {
        return this.j;
    }

    public r a(@Nullable r r2) {
        String[] arrstring = net.minecraft.aw.w.d();
        r r3 = r2;
        if (arrstring != null) {
            if (r3 == null) {
                r2 = this.E;
            }
            r3 = new r();
        }
        r r4 = r3;
        this.a(r4, r2);
        return r4;
    }

    private void a(r r2, r r3) {
        block10: {
            r r4;
            block9: {
                String[] arrstring;
                block8: {
                    r r5 = new r();
                    r5.a("Name", "1.12.2");
                    r5.b("Id", 1343);
                    r5.a("Snapshot", false);
                    r2.a("Version", r5);
                    r2.b("DataVersion", 1343);
                    r2.a("RandomSeed", this.g);
                    r2.a("generatorName", this.w.b());
                    r2.b("generatorVersion", this.w.f());
                    r2.a("generatorOptions", this.O);
                    r2.b("GameType", this.s.c());
                    r2.a("MapFeatures", this.y);
                    r2.b("SpawnX", this.k);
                    String[] arrstring2 = net.minecraft.aw.w.d();
                    r2.b("SpawnY", this.m);
                    r2.b("SpawnZ", this.v);
                    r2.a("Time", this.J);
                    r2.a("DayTime", this.f);
                    r2.a("SizeOnDisk", this.P);
                    r2.a("LastPlayed", net.minecraft.R.b.R());
                    r2.a("LevelName", this.t);
                    arrstring = arrstring2;
                    r2.b("version", this.L);
                    r2.b("clearWeatherTime", this.u);
                    r2.b("rainTime", this.e);
                    r2.a("raining", this.G);
                    r2.b("thunderTime", this.q);
                    r2.a("thundering", this.H);
                    r2.a("hardcore", this.o);
                    r2.a("allowCommands", this.n);
                    r2.a("initialized", this.I);
                    r2.a("BorderCenterX", this.j);
                    r2.a("BorderCenterZ", this.p);
                    r2.a("BorderSize", this.x);
                    r2.a("BorderSizeLerpTime", this.M);
                    r2.a("BorderSafeZone", this.a);
                    r2.a("BorderDamagePerBlock", this.z);
                    r2.a("BorderSizeLerpTarget", this.r);
                    r2.a("BorderWarningBlocks", (double)this.F);
                    r2.a("BorderWarningTime", (double)this.b);
                    if (arrstring != null) {
                        if (this.l != null) {
                            r2.a("Difficulty", (byte)this.l.a());
                        }
                        r2.a("DifficultyLocked", this.K);
                        r2.a("GameRules", this.h.a());
                    }
                    r r6 = new r();
                    for (Map.Entry<p, r> entry : this.D.entrySet()) {
                        r6.a(String.valueOf(entry.getKey().a()), entry.getValue());
                        if (arrstring != null) {
                            if (arrstring != null) continue;
                        }
                        break block8;
                    }
                    r2.a("DimensionData", r6);
                }
                r4 = r3;
                if (arrstring == null) break block9;
                if (r4 == null) break block10;
                r4 = r2;
            }
            r4.a("Player", r3);
        }
    }

    public void a(net.minecraft.k.n n2) {
        this.k = n2.e();
        this.m = n2.b();
        this.v = n2.a();
    }

    public static void b(String[] arrstring) {
        d = arrstring;
    }

    static long g(w w2) {
        return w2.J;
    }

    public boolean b() {
        return this.G;
    }

    static s m(w w2) {
        return w2.s;
    }

    public w(w w2) {
        block0: {
            this.w = net.minecraft.ah.L.a;
            this.O = "";
            this.x = 6.0E7;
            this.a = 5.0;
            this.z = 0.2;
            this.F = 5;
            this.b = 15;
            this.D = Maps.newEnumMap(p.class);
            this.h = new net.minecraft.ah.a();
            this.g = w2.g;
            this.w = w2.w;
            this.O = w2.O;
            this.s = w2.s;
            this.y = w2.y;
            this.k = w2.k;
            this.m = w2.m;
            this.v = w2.v;
            this.J = w2.J;
            this.f = w2.f;
            this.C = w2.C;
            this.P = w2.P;
            String[] arrstring = net.minecraft.aw.w.d();
            this.E = w2.E;
            this.B = w2.B;
            this.t = w2.t;
            this.L = w2.L;
            this.e = w2.e;
            this.G = w2.G;
            this.q = w2.q;
            this.H = w2.H;
            this.o = w2.o;
            this.n = w2.n;
            this.I = w2.I;
            this.h = w2.h;
            this.l = w2.l;
            this.K = w2.K;
            this.j = w2.j;
            this.p = w2.p;
            this.x = w2.x;
            this.M = w2.M;
            this.r = w2.r;
            this.a = w2.a;
            this.z = w2.z;
            this.b = w2.b;
            this.F = w2.F;
            if (net.minecraft.k.m.d()) break block0;
            net.minecraft.aw.w.b(new String[1]);
        }
    }

    public void b(int n2) {
        this.F = n2;
    }

    public boolean k() {
        return this.H;
    }

    public static String[] d() {
        return d;
    }

    public boolean q() {
        return this.K;
    }

    public void h(int n2) {
        this.u = n2;
    }

    public void e(boolean bl2) {
        this.I = bl2;
    }

    public int B() {
        return this.u;
    }

    public double s() {
        return this.p;
    }

    public void c(long l2) {
        this.M = l2;
    }

    public void a(p p2, r r2) {
        this.D.put(p2, r2);
    }

    public long L() {
        return this.g;
    }

    public void d(boolean bl2) {
        this.K = bl2;
    }
}

