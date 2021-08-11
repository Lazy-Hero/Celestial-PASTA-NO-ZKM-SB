/*
 * Decompiled with CFR 0.150.
 */
import java.util.Arrays;
import java.util.List;

public abstract class dB {
    public static final /* synthetic */ String c;
    public static final /* synthetic */ String d;
    private /* synthetic */ String k;
    private /* synthetic */ String[] l;
    private static /* synthetic */ String h;
    public static final /* synthetic */ String a;
    private /* synthetic */ boolean g;
    private /* synthetic */ boolean i;
    private /* synthetic */ String j;
    private /* synthetic */ String[] f;
    private /* synthetic */ String b;
    private /* synthetic */ String e;

    public void a(float f10) {
        block3: {
            int n2;
            block2: {
                String string = dB.i();
                n2 = this.l.length;
                if (string == null) break block2;
                if (n2 <= 1) break block3;
                f10 = fU.a(f10, 0.0f, 1.0f);
                n2 = Math.round(f10 * (float)(this.l.length - 1));
            }
            int n3 = n2;
            this.j = this.l[n3];
        }
    }

    public boolean n() {
        return false;
    }

    public static String i() {
        return h;
    }

    static {
        a = "\u00a7a";
        d = "\u00a79";
        c = "\u00a7c";
        if (dB.i() == null) {
            dB.c("zh4k2b");
        }
    }

    public String[] e() {
        return (String[])this.l.clone();
    }

    public dB(String string, String string2, String string3, String[] arrstring, String string4, String string5) {
        block3: {
            block2: {
                this.k = null;
                this.b = null;
                this.j = null;
                String string6 = dB.i();
                this.l = null;
                this.e = null;
                this.f = null;
                this.i = true;
                this.g = true;
                this.k = string;
                this.b = string2;
                this.j = string3;
                this.l = arrstring;
                dB dB2 = this;
                if (string6 == null) break block2;
                dB2.e = string4;
                if (string5 == null) break block3;
                dB2 = this;
            }
            dB2.f = new String[]{string5};
        }
    }

    public String r() {
        return this.b;
    }

    public String[] d() {
        return this.f;
    }

    public String f(String string) {
        return cS.b("value." + this.k + "." + string, string);
    }

    public boolean a(String string) {
        String string2 = dB.i();
        boolean bl2 = dB.a(string, this.l);
        if (string2 != null) {
            bl2 = bl2 >= false;
        }
        return bl2;
    }

    public void b(String string) {
        this.b = string;
    }

    public String o() {
        String string = fU.a(this.b);
        string = dQ.f(string, "//");
        string = cS.b("option." + this.l() + ".comment", string);
        return string;
    }

    public String k() {
        return this.j;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public boolean b() {
        String string = dB.i();
        boolean bl2 = fU.a((Object)this.j, (Object)this.e);
        if (string != null) {
            bl2 = !bl2;
        }
        return bl2;
    }

    public void a(String[] arrstring) {
        List<String> list = Arrays.asList(this.f);
        int n2 = 0;
        String string = dB.i();
        while (n2 < arrstring.length) {
            String string2 = arrstring[n2];
            if (string != null) {
                if (!list.contains(string2)) {
                    this.f = (String[])fU.a((Object[])this.f, (Object)string2);
                }
                ++n2;
            }
            if (string != null) continue;
        }
    }

    public static void c(String string) {
        h = string;
    }

    public void m() {
        block3: {
            int n2;
            int n3;
            block2: {
                n3 = dB.a(this.j, this.l);
                String string = dB.i();
                n2 = n3;
                if (string == null) break block2;
                if (n2 < 0) break block3;
                n2 = (n3 + 1) % this.l.length;
            }
            n3 = n2;
            this.j = this.l[n3];
        }
    }

    public boolean h(String string) {
        return false;
    }

    public void a(boolean bl2) {
        this.i = bl2;
    }

    private static int a(String string, String[] arrstring) {
        int n2;
        block4: {
            int n3 = 0;
            String string2 = dB.i();
            while (n3 < arrstring.length) {
                String string3 = arrstring[n3];
                if (string2 != null) {
                    n2 = string3.equals(string) ? 1 : 0;
                    if (string2 == null) break block4;
                    if (n2 != 0) {
                        return n3;
                    }
                    ++n3;
                }
                if (string2 != null) continue;
            }
            n2 = -1;
        }
        return n2;
    }

    public boolean q() {
        return this.i;
    }

    public boolean g(String string) {
        return false;
    }

    public String c() {
        return cS.b("option." + this.k, this.k);
    }

    public boolean a() {
        return this.g;
    }

    public float p() {
        int n2;
        String string = dB.i();
        int n3 = this.l.length;
        if (string != null) {
            if (n3 <= 1) {
                return 0.0f;
            }
            n3 = dB.a(this.j, this.l);
        }
        if ((n2 = n3) < 0) {
            return 0.0f;
        }
        float f10 = 1.0f * (float)n2 / ((float)this.l.length - 1.0f);
        return f10;
    }

    public void b(boolean bl2) {
        this.g = bl2;
    }

    public String toString() {
        return "" + this.k + ", value: " + this.j + ", valueDefault: " + this.e + ", paths: " + fU.a(this.f);
    }

    public String l() {
        return this.k;
    }

    public String g() {
        return null;
    }

    public String j() {
        return this.e;
    }

    public boolean d(String string) {
        boolean bl2 = dB.a(string, this.l);
        String string2 = dB.i();
        boolean bl3 = bl2;
        if (string2 != null) {
            if (bl3 < false) {
                return false;
            }
            this.j = string;
            bl3 = true;
        }
        return bl3;
    }

    public String e(String string) {
        return "";
    }

    public void h() {
        this.j = this.e;
    }

    public void f() {
        block3: {
            int n2;
            int n3;
            block2: {
                n3 = dB.a(this.j, this.l);
                String string = dB.i();
                n2 = n3;
                if (string == null) break block2;
                if (n2 < 0) break block3;
                n2 = (n3 - 1 + this.l.length) % this.l.length;
            }
            n3 = n2;
            this.j = this.l[n3];
        }
    }
}

