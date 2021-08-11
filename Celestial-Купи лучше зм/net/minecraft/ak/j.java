/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.ak;

import net.minecraft.T.a4;
import net.minecraft.ak.h;
import net.minecraft.ak.i;

public class j
extends i {
    private /* synthetic */ int o;
    private final /* synthetic */ a4 n;

    @Override
    public void g() {
        super.g();
        this.n.a(false);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    public void b() {
        block5: {
            block4: {
                v0 = net.minecraft.ak.h.h();
                super.b();
                var1_1 = v0;
                v1 = ++this.o;
                v2 = 5;
                if (var1_1 != null) break block4;
                if (v1 < v2) ** GOTO lbl-1000
                v1 = this.g;
                if (var1_1 != null) break block5;
                v2 = 10;
            }
            ** if (v1 >= v2) goto lbl-1000
lbl-1000:
            // 1 sources

            {
                v1 = 1;
                ** GOTO lbl17
            }
lbl-1000:
            // 2 sources

            {
                v1 = 0;
            }
        }
        this.n.a((boolean)v1);
    }

    public j(a4 a42, double d10, boolean bl2) {
        super(a42, d10, bl2);
        this.n = a42;
    }

    @Override
    public void a() {
        super.a();
        this.o = 0;
    }

    private static gP a(gP gP2) {
        return gP2;
    }
}

