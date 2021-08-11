/*
 * Decompiled with CFR 0.150.
 */
import java.lang.reflect.Field;

public class a3
implements hE {
    private /* synthetic */ aI b;
    private final /* synthetic */ int a;
    private /* synthetic */ Class c;

    private static Throwable a(Throwable throwable) {
        return throwable;
    }

    public a3(aI aI2, Class class_, int n2) {
        this.b = null;
        this.c = null;
        this.b = aI2;
        this.c = class_;
        this.a = n2;
    }

    public a3(aI aI2, Class class_) {
        this(aI2, class_, 0);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    @Override
    public Field a() {
        var2_1 = this.b.b();
        var1_2 = K.d();
        v0 = var2_1;
        if (var1_2 != null) ** GOTO lbl9
        if (v0 == null) {
            return null;
        }
        try {
            v0 = var2_1;
lbl9:
            // 2 sources

            var3_3 = v0.getDeclaredFields();
            var4_5 = 0;
            var5_6 = 0;
            do {
                if (var5_6 >= var3_3.length) {
                }
                var6_7 = var3_3[var5_6];
                if (var1_2 != null) continue;
                if (var6_7.getType() == this.c) {
                    if (var4_5 == this.a) {
                        var6_7.setAccessible(true);
                        return var6_7;
                    }
                    ++var4_5;
                }
                ++var5_6;
            } while (var1_2 == null);
        }
        finally {
            return null;
        }
    }
}

