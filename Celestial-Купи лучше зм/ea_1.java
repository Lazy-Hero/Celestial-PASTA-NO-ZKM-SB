/*
 * Decompiled with CFR 0.150.
 */
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Map;
import net.minecraft.Z.i;
import net.minecraft.ah.t;
import net.minecraft.ah.z;
import net.minecraft.ar.v;
import net.minecraft.aw.s;
import net.minecraft.client.a.aF;
import net.minecraft.k.n;
import net.minecraft.w.an;
import net.minecraft.w.d;
import net.minecraft.w.m;

public class ea {
    public static boolean a(i i2) {
        net.minecraft.W.K k2 = i2.b();
        String string = K.d();
        boolean bl2 = cq.d4.b();
        if (string == null) {
            bl2 = !bl2 ? k2.e() : cq.g(k2, cq.d4, i2);
        }
        return bl2;
    }

    public static boolean a(m m2, d d10) {
        int n2;
        String string = K.d();
        int n3 = cq.j.b();
        if (string == null) {
            if (n3 != 0) {
                return cq.g(m2, cq.j, d10);
            }
            n3 = m2.c(d10);
        }
        int n4 = n2 = n3;
        if (string == null) {
            n4 = n4 != 0xFFFFFF;
        }
        return n4;
    }

    public static InputStream a(String string) {
        byte[] arrby;
        K k2;
        String string2 = K.d();
        Object object = cq.aw;
        if (string2 == null) {
            if (!((K)object).c()) {
                return null;
            }
            object = cq.a(cq.aw);
        }
        if ((k2 = object) == null) {
            return null;
        }
        Object object2 = string;
        if (string2 == null) {
            if (((String)object2).startsWith("/")) {
                string = string.substring(1);
            }
            object2 = cq.d(k2, cq.V, string);
        }
        if ((arrby = (byte[])object2) == null) {
            return null;
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(arrby);
        return byteArrayInputStream;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public static void a(v v2) {
        block3: {
            Object object;
            block2: {
                String string = K.d();
                object = cq.aG;
                if (string != null) break block2;
                if (((ak)object).b()) break block3;
                object = cq.d(cq.cm, new Object[0]);
            }
            ak ak2 = object;
            cq.d((Object)ak2, cq.aG, v2);
        }
    }

    public static void a(String string, Object object) {
        Map map = (Map)cq.a(cq.bO);
        String string2 = K.d();
        Object object2 = map;
        if (string2 == null && object2 != null) {
            object2 = map.put(string, object);
        }
    }

    public static int a(i i2, t t2, n n2) {
        String string = K.d();
        int n3 = cq.bz.b();
        if (string == null) {
            n3 = n3 != 0 ? cq.c(i2, cq.bz, t2, n2) : i2.h();
        }
        return n3;
    }

    public static void a(v v2, String string) {
        block3: {
            Object object;
            block2: {
                String string2 = K.d();
                object = cq.r;
                if (string2 != null) break block2;
                if (((ak)object).b()) break block3;
                object = cq.d(cq.cm, new Object[0]);
            }
            ak ak2 = object;
            cq.d((Object)ak2, cq.r, v2, string);
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean a(aF aF2, float f10, int n2) {
        String string = K.d();
        boolean bl2 = cq.i.b();
        if (string == null) {
            if (!bl2) return false;
            bl2 = cq.a(cq.i, aF2, Float.valueOf(f10), n2);
        }
        if (string != null) return bl2;
        if (!bl2) return false;
        return true;
    }

    public static s a(an an2, d d10, z z2) {
        return cq.ak.c() ? ((an)d10.w()).a(d10, z2) : an2.a(d10, z2);
    }

    public static boolean a(d d10) {
        String string = K.d();
        boolean bl2 = cq.bZ.b();
        if (string == null) {
            bl2 = !bl2 ? d10.a() : cq.g(d10.w(), cq.bZ, d10);
        }
        return bl2;
    }
}

