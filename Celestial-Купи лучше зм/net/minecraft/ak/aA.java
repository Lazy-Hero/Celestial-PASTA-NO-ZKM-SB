/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package net.minecraft.ak;

import javax.annotation.Nullable;
import net.minecraft.U.D;
import net.minecraft.ak.a9;
import net.minecraft.ak.g;
import net.minecraft.ak.h;
import net.minecraft.k.l;

public class aA
extends a9 {
    protected final /* synthetic */ float j;

    public aA(D d10, double d11) {
        this(d10, d11, 0.001f);
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    @Nullable
    protected l d() {
        l l2;
        aA aA2;
        block7: {
            int n2;
            block6: {
                String string = net.minecraft.ak.h.h();
                n2 = this.e.aj();
                if (string != null) break block6;
                if (n2 != 0) {
                    l l3;
                    l l4 = l3 = net.minecraft.ak.g.b(this.e, 15, 7);
                    if (string != null) return l4;
                    if (l4 == null) {
                        l4 = super.d();
                        return l4;
                    }
                    l4 = l3;
                    return l4;
                }
                aA2 = this;
                if (string != null) break block7;
                float f10 = aA2.e.f().nextFloat() - this.j;
                n2 = f10 == 0.0f ? 0 : (f10 > 0.0f ? 1 : -1);
            }
            if (n2 >= 0) {
                l2 = net.minecraft.ak.g.b(this.e, 10, 7);
                return l2;
            }
            aA2 = this;
        }
        l2 = super.d();
        return l2;
    }

    public aA(D d10, double d11, float f10) {
        super(d10, d11);
        this.j = f10;
    }

    private static gP b(gP gP2) {
        return gP2;
    }
}

