/*
 * Decompiled with CFR 0.150.
 */
import java.util.ArrayList;
import java.util.function.Supplier;
import net.minecraft.k.m;

public class hH {
    public /* synthetic */ String l;
    private /* synthetic */ double e;
    private final /* synthetic */ String m;
    private static /* synthetic */ String[] j;
    private /* synthetic */ boolean g;
    private /* synthetic */ boolean i;
    public /* synthetic */ boolean f;
    private /* synthetic */ ArrayList<String> h;
    private /* synthetic */ boolean b;
    private /* synthetic */ double k;
    public /* synthetic */ double p;
    private final /* synthetic */ Supplier<Boolean> d;
    private final /* synthetic */ bE a;
    private /* synthetic */ double o;
    private /* synthetic */ int n;
    private /* synthetic */ String c;

    public boolean d() {
        return this.l.equalsIgnoreCase("Check");
    }

    public String p() {
        return this.c;
    }

    public hH(String string, bE bE2, int n2, boolean bl2) {
        this.m = string;
        this.a = bE2;
        this.n = n2;
        this.a(this.n);
        this.i = bl2;
        this.l = "Color";
        this.d = hH::lambda$new$2;
    }

    public hH(String string, bE bE2, String string2, ArrayList<String> arrayList) {
        this.m = string;
        this.a = bE2;
        this.c = string2;
        this.h = arrayList;
        this.b = false;
        this.l = "Combo";
        this.d = hH::lambda$new$0;
    }

    public boolean q() {
        return this.b;
    }

    public void b(boolean bl2) {
        this.g = bl2;
    }

    public void a(String string) {
        this.c = string;
    }

    public double u() {
        return this.k;
    }

    public int o() {
        return this.n;
    }

    public double g() {
        return this.e;
    }

    public boolean l() {
        return this.g;
    }

    public float r() {
        return (float)this.p;
    }

    public void a(boolean bl2) {
        this.b = bl2;
    }

    public hH(String string, bE bE2, boolean bl2, Supplier<Boolean> supplier) {
        this.m = string;
        this.a = bE2;
        this.g = bl2;
        this.l = "Check";
        this.d = supplier;
    }

    public void a(double d10) {
        this.p = d10;
    }

    public boolean k() {
        return this.l.equalsIgnoreCase("Combo");
    }

    public static void b(String[] arrstring) {
        j = arrstring;
    }

    public String m() {
        return this.c;
    }

    public boolean s() {
        return this.l.equalsIgnoreCase("Color");
    }

    public long e() {
        return (long)this.p;
    }

    private static Boolean lambda$new$2() {
        return true;
    }

    public double b() {
        return this.o;
    }

    private static Boolean lambda$new$3() {
        return true;
    }

    public void a(int n2) {
        this.n = n2;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    private static Boolean lambda$new$1() {
        return true;
    }

    private static Boolean lambda$new$0() {
        return true;
    }

    public boolean n() {
        return this.d.get();
    }

    public boolean v() {
        return this.i;
    }

    public double f() {
        return this.p;
    }

    public hH(String string, bE bE2, double d10, double d11, double d12, float f10, Supplier<Boolean> supplier) {
        this.m = string;
        this.a = bE2;
        this.p = d10;
        String[] arrstring = hH.t();
        this.k = d11;
        this.o = d12;
        this.e = f10;
        this.l = "Slider";
        this.d = supplier;
        if (arrstring != null) {
            net.minecraft.k.m.b(!net.minecraft.k.m.d());
        }
    }

    public hH(String string, bE bE2, String string2, ArrayList<String> arrayList, Supplier<Boolean> supplier) {
        this.m = string;
        this.a = bE2;
        this.c = string2;
        this.h = arrayList;
        this.b = false;
        this.l = "Combo";
        this.d = supplier;
    }

    public ArrayList<String> i() {
        return this.h;
    }

    public bE j() {
        return this.a;
    }

    static {
        if (hH.t() != null) {
            hH.b(new String[1]);
        }
    }

    public String a() {
        return this.m;
    }

    public static String[] t() {
        return j;
    }

    public hH(String string, bE bE2, double d10, double d11, double d12, double d13) {
        block0: {
            String[] arrstring = hH.t();
            String[] arrstring2 = arrstring;
            this.m = string;
            this.a = bE2;
            this.p = d10;
            this.k = d11;
            this.o = d12;
            this.e = d13;
            this.l = "Slider";
            this.d = hH::lambda$new$3;
            if (!net.minecraft.k.m.c()) break block0;
            hH.b(new String[1]);
        }
    }

    public hH(String string, bE bE2, boolean bl2) {
        this.m = string;
        this.a = bE2;
        this.g = bl2;
        this.l = "Check";
        this.d = hH::lambda$new$1;
    }

    public int c() {
        return (int)this.p;
    }

    public boolean h() {
        return this.l.equalsIgnoreCase("Slider");
    }
}

