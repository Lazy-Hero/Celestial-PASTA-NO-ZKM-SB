/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.w;

import net.minecraft.W.K;
import net.minecraft.w.bl;
import net.minecraft.w.d;
import net.minecraft.w.s;

public class v
extends s {
    private /* synthetic */ String[] t;

    private static gP a(gP gP2) {
        return gP2;
    }

    public v(K k2, boolean bl2) {
        block3: {
            block2: {
                int n2 = bl.g();
                super(k2);
                int n3 = n2;
                if (n3 == 0) break block2;
                if (!bl2) break block3;
                this.d(0);
            }
            this.a(true);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public String d(d d10) {
        String string;
        block6: {
            int n2;
            int n3;
            block5: {
                int n4 = bl.c();
                v v2 = this;
                if (n4 != 0) return super.d(d10);
                if (v2.t == null) {
                    v2 = this;
                    return super.d(d10);
                }
                n2 = n3 = d10.d();
                if (n4 != 0) break block5;
                if (n2 < 0) break block6;
                n2 = n3;
            }
            if (n2 < this.t.length) {
                string = super.d(d10) + "." + this.t[n3];
                return string;
            }
        }
        string = super.d(d10);
        return string;
    }

    @Override
    public int c(int n2) {
        return n2;
    }

    public v a(String[] arrstring) {
        this.t = arrstring;
        return this;
    }
}

