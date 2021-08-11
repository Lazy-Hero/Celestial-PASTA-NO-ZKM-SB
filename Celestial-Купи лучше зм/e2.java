/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.k.m;

public abstract class e2
implements fx {
    private final /* synthetic */ String[] a;
    private final /* synthetic */ String d;
    private final /* synthetic */ String c;
    private static /* synthetic */ String b;
    private final /* synthetic */ String e;

    private static gP a(gP gP2) {
        return gP2;
    }

    public static void b(String string) {
        b = string;
    }

    public String d() {
        return this.c;
    }

    public static String f() {
        return b;
    }

    public String a() {
        return this.e;
    }

    public e2(String string, String string2, String string3, String ... arrstring) {
        block0: {
            String string4 = e2.f();
            String string5 = string4;
            this.d = string;
            this.e = string2;
            this.a = arrstring;
            this.c = string3;
            if (m.d()) break block0;
            e2.b("wiylIc");
        }
    }

    public String[] b() {
        return this.a;
    }

    public String c() {
        return this.d;
    }

    public void e() {
        cp.a("\u00a7cInvalid usage, try: " + this.c);
    }

    static {
        if (e2.f() != null) {
            e2.b("wdZVR");
        }
    }
}

