/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.W.aC;
import net.minecraft.W.aE;
import net.minecraft.W.aH;
import net.minecraft.W.aO;
import net.minecraft.W.aX;
import net.minecraft.W.al;
import net.minecraft.W.bA;
import net.minecraft.W.bG;
import net.minecraft.W.bI;
import net.minecraft.W.bN;
import net.minecraft.W.bh;
import net.minecraft.W.cV;
import net.minecraft.W.cX;
import net.minecraft.W.ch;
import net.minecraft.W.cy;
import net.minecraft.W.z;
import net.minecraft.Z.i;
import net.minecraft.ah.t;
import net.minecraft.ar.aA;
import net.minecraft.client.x.Y;
import net.minecraft.k.n;
import net.minecraft.u.g;

public class cP {
    private static /* synthetic */ Y a;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean a(net.minecraft.W.K k2, i i2) {
        z z2;
        String string = K.d();
        boolean bl2 = i2.k();
        if (string == null) {
            if (bl2) {
                return false;
            }
            bl2 = i2.i();
        }
        if (string == null) {
            if (bl2) {
                return false;
            }
            bl2 = k2 instanceof cX;
        }
        if (string == null) {
            if (bl2) {
                return false;
            }
            bl2 = k2 instanceof net.minecraft.W.Y;
        }
        if (string == null) {
            if (bl2) {
                boolean bl3 = k2 instanceof al;
                if (string != null) return bl3;
                if (bl3) return true;
                bl3 = k2 instanceof aE;
                if (string != null) return bl3;
                if (bl3) return true;
                bl3 = k2 instanceof aC;
                if (string != null) return bl3;
                if (bl3) return true;
                bl3 = k2 instanceof aH;
                if (string != null) return bl3;
                if (bl3) return true;
                bl3 = k2 instanceof aX;
                if (string != null) return bl3;
                if (bl3) return true;
            }
            bl2 = k2 instanceof bA;
        }
        if (string != null) return bl2;
        if (bl2) return true;
        bl2 = k2 instanceof bG;
        if (string != null) return bl2;
        if (bl2) return true;
        bl2 = k2 instanceof aO;
        if (string != null) return bl2;
        if (bl2) return true;
        bl2 = k2 instanceof bN;
        if (string != null) return bl2;
        if (bl2) return true;
        bl2 = k2 instanceof bI;
        if (string != null) return bl2;
        if (bl2) return true;
        bl2 = k2 instanceof ch;
        if (string != null) return bl2;
        if (bl2) return true;
        boolean bl4 = k2 instanceof cy;
        if (string == null) {
            if (bl4 && i2.b(cV.z) == aA.UP) {
                return true;
            }
            bl4 = k2 instanceof bh;
        }
        if (string != null) return bl4;
        if (!bl4) return false;
        z z3 = z2 = i2.b(bh.C);
        z z4 = z.UP_X;
        if (string == null) {
            if (z3 == z4) return true;
            z3 = z2;
            z4 = z.UP_Z;
        }
        if (z3 != z4) return false;
        return true;
    }

    static {
        a = null;
    }

    public static void b() {
        a = fU.aX().W().b().b(g.o.d());
    }

    public static i c() {
        return g.o.d();
    }

    public static Y a() {
        return a;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean a(t t2, i i2, n n2) {
        net.minecraft.W.K k2 = i2.b();
        String string = K.d();
        boolean bl2 = cP.a(k2, i2);
        if (string == null) {
            if (!bl2) return false;
            bl2 = cP.a(t2, n2);
        }
        if (string != null) return bl2;
        if (!bl2) return false;
        return true;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean a(t t2, n n2) {
        i i2;
        String string;
        block2: {
            block3: {
                net.minecraft.W.K k2 = g.o;
                string = K.d();
                i2 = t2.d(n2.i());
                if (string != null) break block2;
                if (i2.b() == k2) break block3;
                i2 = t2.d(n2.j());
                if (string != null) break block2;
                if (i2.b() == k2) break block3;
                i2 = t2.d(n2.b());
                if (string != null) break block2;
                if (i2.b() == k2) break block3;
                i2 = t2.d(n2.m());
                if (string != null) break block2;
                if (i2.b() != k2) return false;
            }
            i2 = t2.d(n2.k());
        }
        boolean bl2 = i2.i();
        if (string != null) return bl2;
        if (!bl2) return false;
        return true;
    }
}

