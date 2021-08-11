/*
 * Decompiled with CFR 0.150.
 */
import java.util.List;
import net.minecraft.ar.v;
import net.minecraft.client.j.c;
import net.minecraft.client.j.j;

public class eP {
    public static c a(List<c> list, int n2, j j2) {
        c c10;
        block2: {
            c10 = list.get(n2);
            String string = K.d();
            while (eP.a(list, n2, c10, j2)) {
                c10 = list.get(n2);
                if (string == null) {
                    if (string == null) continue;
                }
                break block2;
            }
            c10.g = false;
        }
        return c10;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean a(List<c> list, int n2, c c10, j j2) {
        int n3 = 0;
        String string = K.d();
        for (v v2 : c10.a()) {
            c c11;
            block7: {
                c c12;
                int n4;
                int n5;
                block8: {
                    block6: {
                        block5: {
                            fU.b("Sprite dependency: " + c10.e() + " <- " + v2);
                            c11 = j2.d(v2);
                            if (string != null) return 0 != 0;
                            c c13 = c11;
                            if (string != null) break block5;
                            if (c13 != null) break block6;
                            c13 = c11 = j2.c(v2);
                        }
                        if (string == null) break block7;
                    }
                    n4 = n5 = list.indexOf(c11);
                    if (string != null) break block8;
                    if (n4 <= n2 + n3 && string == null) continue;
                    c12 = c11;
                    if (string != null) break block7;
                    n4 = c12.g ? 1 : 0;
                }
                if (n4 != 0) {
                    String string2 = "circular dependency: " + c10.e() + " -> " + c11.e();
                    v v3 = j2.a(c10);
                    ea.a(v3, string2);
                    if (string == null) break;
                }
                c12 = list.remove(n5);
            }
            c10.g = true;
            list.add(n2 + n3, c11);
            ++n3;
            if (string == null) continue;
        }
        int n6 = n3;
        if (string != null) return n6 != 0;
        if (n6 <= 0) return 0 != 0;
        return 1 != 0;
    }

    private static gP a(gP gP2) {
        return gP2;
    }
}

