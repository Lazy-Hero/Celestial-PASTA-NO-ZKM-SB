/*
 * Decompiled with CFR 0.150.
 */
import java.io.File;
import java.io.IOException;

public abstract class c_ {
    private final /* synthetic */ boolean d;
    private final /* synthetic */ String b;
    private final /* synthetic */ File a;
    private static /* synthetic */ String c;

    public static void b(String string) {
        c = string;
    }

    public abstract void e() throws IOException;

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public c_(String var1_1, boolean var2_2) {
        super();
        this.b = var1_1;
        this.d = var2_2;
        var3_3 = c_.d();
        this.a = new File(a1.c(), var1_1 + ".txt");
        v0 = this;
        if (var3_3 != null) ** GOTO lbl11
        if (v0.a.exists() != false) return;
        try {
            v0 = this;
lbl11:
            // 2 sources

            v0.b();
            return;
        }
        catch (Exception var4_4) {
            var4_4.printStackTrace();
        }
    }

    public final File c() {
        return this.a;
    }

    public abstract void b() throws IOException;

    private static Exception a(Exception exception) {
        return exception;
    }

    public final String a() {
        return this.b;
    }

    public static String d() {
        return c;
    }

    static boolean a(c_ c_2) {
        return c_2.f();
    }

    static {
        if (c_.d() != null) {
            c_.b("fYYdH");
        }
    }

    private boolean f() {
        return this.d;
    }
}

