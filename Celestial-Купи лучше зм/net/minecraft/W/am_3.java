/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Sets
 */
package net.minecraft.w;

import com.google.common.collect.Sets;
import java.util.Set;
import net.minecraft.W.K;
import net.minecraft.Z.i;
import net.minecraft.ac.c;
import net.minecraft.u.g;
import net.minecraft.w.a3;
import net.minecraft.w.a8;
import net.minecraft.w.bl;
import net.minecraft.w.d;

public class am
extends a3 {
    private static final /* synthetic */ float[] x;
    private static final /* synthetic */ Set<K> y;
    private static final /* synthetic */ float[] z;

    protected am(a8 a82) {
        super(a82, y);
        this.u = x[a82.ordinal()];
        this.w = z[a82.ordinal()];
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public float a(d d10, i i2) {
        float f10;
        block5: {
            c c10;
            c c11;
            block6: {
                int n2;
                c c12;
                block4: {
                    c12 = i2.o();
                    n2 = bl.g();
                    c11 = c12;
                    c10 = c.k;
                    if (n2 == 0) break block4;
                    if (c11 == c10) break block5;
                    c11 = c12;
                    c10 = c.f;
                }
                if (n2 == 0) break block6;
                if (c11 == c10) break block5;
                c11 = c12;
                c10 = c.z;
            }
            if (c11 != c10) {
                f10 = super.a(d10, i2);
                return f10;
            }
        }
        f10 = this.v;
        return f10;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    static {
        y = Sets.newHashSet((Object[])new K[]{g.cB, g.c8, g.bu, g.aB, g.cd, g.G, g.y, g.ae, g.cD, g.I, g.bc});
        x = new float[]{6.0f, 8.0f, 8.0f, 8.0f, 6.0f};
        z = new float[]{-3.2f, -3.2f, -3.1f, -3.0f, -3.0f};
    }
}

