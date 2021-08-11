/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package net.minecraft.W;

import java.util.IdentityHashMap;
import java.util.Map;
import javax.annotation.Nullable;
import net.minecraft.W.K;
import net.minecraft.W.cL;
import net.minecraft.Z.d;
import net.minecraft.Z.i;
import net.minecraft.ac.c;
import net.minecraft.ah.t;
import net.minecraft.ah.z;
import net.minecraft.ar.aA;
import net.minecraft.ar.aW;
import net.minecraft.k.k;
import net.minecraft.k.n;

public class L
extends K {
    private static final /* synthetic */ Map z;

    @Override
    public aW b(i i2) {
        return aW.INVISIBLE;
    }

    @Override
    public void a(z z2, n n2, i i2, float f10, int n3) {
    }

    protected L() {
        super(net.minecraft.ac.c.A);
    }

    @Override
    public boolean w(i i2) {
        return false;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    static {
        z = new IdentityHashMap();
    }

    @Override
    public d a(t t2, i i2, n n2, aA aA2) {
        return d.UNDEFINED;
    }

    @Override
    public boolean p(i i2) {
        return false;
    }

    @Override
    public boolean b(t t2, n n2) {
        return true;
    }

    @Override
    public boolean a(i i2, boolean bl2) {
        return false;
    }

    public static void a(K k2, int n2) {
        boolean bl2 = cL.e();
        if (bl2) {
            if (!z.containsKey(k2)) {
                z.put(k2, k2.j);
            }
            k2.j = n2;
        }
    }

    public static void a(K k2) {
        block3: {
            int n2;
            block2: {
                boolean bl2 = cL.b();
                n2 = z.containsKey(k2);
                if (bl2) break block2;
                if (n2 == 0) break block3;
                n2 = (Integer)z.get(k2);
            }
            int n3 = n2;
            L.a(k2, n3);
        }
    }

    @Override
    @Nullable
    public k c(i i2, t t2, n n2) {
        return a;
    }
}

