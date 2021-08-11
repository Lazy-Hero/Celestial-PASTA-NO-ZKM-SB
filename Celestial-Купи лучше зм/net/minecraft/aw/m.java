/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.aw;

import net.minecraft.aw.w;
import net.minecraft.c.k;

class m
implements k<String> {
    final /* synthetic */ w a;

    private static Throwable a(Throwable throwable) {
        return throwable;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public String a() throws Exception {
        var2_1 = "Unknown?";
        var1_2 = w.d();
        try {
            if (var1_2 == null) ** GOTO lbl8
            switch (w.e(this.a)) {
                case 19132: {
                    var2_1 = "McRegion";
lbl8:
                    // 2 sources

                    if (var1_2 != null) return String.format("0x%05X - %s", new Object[]{w.e(this.a), var2_1});
                }
                case 19133: {
                    var2_1 = "Anvil";
                    return String.format("0x%05X - %s", new Object[]{w.e(this.a), var2_1});
                }
                default: {
                    return String.format("0x%05X - %s", new Object[]{w.e(this.a), var2_1});
                }
            }
        }
        catch (Throwable var3_3) {
            // empty catch block
        }
        return String.format("0x%05X - %s", new Object[]{w.e(this.a), var2_1});
    }

    m(w w2) {
        this.a = w2;
    }
}

