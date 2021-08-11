/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.p;

import java.util.Random;
import net.minecraft.Z.i;
import net.minecraft.ah.z;
import net.minecraft.k.n;

public abstract class a {
    private static /* synthetic */ boolean b;
    private final /* synthetic */ boolean c;

    public a(boolean bl2) {
        this.c = bl2;
    }

    protected void a(z z2, n n2, i i2) {
        block2: {
            boolean bl2;
            block3: {
                boolean bl3 = a.c();
                bl2 = this.c;
                if (!bl3) break block2;
                if (!bl2) break block3;
                z2.a(n2, i2, 3);
                if (bl3) break block2;
            }
            bl2 = z2.a(n2, i2, 2);
        }
    }

    private static gP c(gP gP2) {
        return gP2;
    }

    public void a() {
    }

    public abstract boolean a(z var1, Random var2, n var3);

    public static void b(boolean bl2) {
        b = bl2;
    }

    static {
        if (a.d()) {
            a.b(true);
        }
    }

    public static boolean d() {
        return b;
    }

    public a() {
        this(false);
    }

    public static boolean c() {
        boolean bl2 = a.d();
        return !bl2;
    }
}

