/*
 * Decompiled with CFR 0.150.
 */
import java.util.HashMap;
import java.util.Map;
import net.minecraft.client.Q;
import net.minecraft.client.q.a;
import net.minecraft.client.w.n;

public class fB {
    private static /* synthetic */ Map c;
    private static /* synthetic */ long a;
    private static final /* synthetic */ boolean b;

    public static synchronized fP a(a a10) {
        fP fP2;
        Object object;
        Object object2;
        String string;
        block10: {
            block9: {
                int n2;
                block8: {
                    string = K.d();
                    n2 = b;
                    if (string != null) break block8;
                    if (n2 == 0) break block9;
                    long l2 = System.currentTimeMillis() - (a + 5000L);
                    n2 = l2 == 0L ? 0 : (l2 < 0L ? -1 : 1);
                }
                if (n2 <= 0) break block9;
                object = object2 = Q.P().s;
                if (string != null) break block10;
                if (object != null) {
                    fB.a(((a)object2).r(), null);
                    a = System.currentTimeMillis();
                }
            }
            object = a10;
        }
        Object object3 = object2 = ((a)object).r();
        if (string == null) {
            if (object3 == null) {
                return null;
            }
            object3 = fB.a().get(object2);
        }
        fP fP3 = fP2 = (fP)object3;
        if (string == null) {
            if (fP3 == null) {
                fP2 = new fP();
                fB.a().put(object2, fP2);
                et et2 = new et((String)object2);
                String string2 = ec.a() + "/users/" + (String)object2 + ".cfg";
                H h2 = new H(string2, et2);
                h2.start();
            }
            fP3 = fP2;
        }
        return fP3;
    }

    public static void a(n n2, a a10, float f10, float f11) {
        block3: {
            fP fP2;
            block2: {
                fP fP3 = fB.a(a10);
                String string = K.d();
                fP2 = fP3;
                if (string != null) break block2;
                if (fP2 == null) break block3;
                fP2 = fP3;
            }
            fP2.a(n2, a10, f10, f11);
        }
    }

    static {
        c = null;
        b = Boolean.getBoolean("player.models.reload");
        a = System.currentTimeMillis();
    }

    public static synchronized void a(String string, fP fP2) {
        fB.a().put(string, fP2);
    }

    private static Map a() {
        String string = K.d();
        Map map = c;
        if (string == null) {
            if (map == null) {
                c = new HashMap();
            }
            map = c;
        }
        return map;
    }

    private static gP a(gP gP2) {
        return gP2;
    }
}

