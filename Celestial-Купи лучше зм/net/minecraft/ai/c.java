/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.ai;

import net.minecraft.C.p;
import net.minecraft.C.u;
import net.minecraft.Y.a;
import net.minecraft.ai.b;
import net.minecraft.ai.d;
import net.minecraft.ai.f;
import net.minecraft.at.h;
import net.minecraft.at.k;

public class c
implements a {
    private final /* synthetic */ net.minecraft.R.b b;
    private final /* synthetic */ u a;

    @Override
    public void a(k k2) {
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    public void a(net.minecraft.aa.a var1_1) {
        var2_2 = f.c();
        v0 = net.minecraft.ai.b.a[var1_1.b().ordinal()];
        if (var2_2) ** GOTO lbl8
        switch (v0) {
            case 1: {
                this.a.a(p.LOGIN);
                v0 = var1_1.a();
lbl8:
                // 2 sources

                v1 = 340;
                if (!var2_2) {
                    if (v0 > v1) {
                        var3_3 = new h("multiplayer.disconnect.outdated_server", new Object[]{"1.12.2"});
                        this.a.a(new net.minecraft.ay.a(var3_3));
                        this.a.a(var3_3);
                        if (var2_2 == false) return;
                    }
                    v0 = var1_1.a();
                    v1 = 340;
                }
                if (v0 < v1) {
                    var3_3 = new h("multiplayer.disconnect.outdated_client", new Object[]{"1.12.2"});
                    this.a.a(new net.minecraft.ay.a(var3_3));
                    this.a.a(var3_3);
                    if (var2_2 == false) return;
                }
                this.a.a(new f(this.b, this.a));
                if (var2_2 == false) return;
            }
            case 2: {
                this.a.a(p.STATUS);
                this.a.a(new d(this.b, this.a));
                if (var2_2 == false) return;
            }
        }
        throw new UnsupportedOperationException("Invalid intention " + (Object)var1_1.b());
    }

    private static UnsupportedOperationException a(UnsupportedOperationException unsupportedOperationException) {
        return unsupportedOperationException;
    }

    public c(net.minecraft.R.b b10, u u2) {
        this.b = b10;
        this.a = u2;
    }
}

