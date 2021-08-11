/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package net.minecraft.U;

import java.util.Collection;
import java.util.UUID;
import javax.annotation.Nullable;
import net.minecraft.P.r;
import net.minecraft.P.u;
import net.minecraft.j.b;
import net.minecraft.j.c;
import net.minecraft.j.e;
import net.minecraft.j.f;
import net.minecraft.j.g;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class M {
    public static final /* synthetic */ c b;
    public static final /* synthetic */ c f;
    private static final /* synthetic */ Logger k;
    public static final /* synthetic */ c h;
    public static final /* synthetic */ c d;
    public static final /* synthetic */ c a;
    public static final /* synthetic */ c i;
    public static final /* synthetic */ c c;
    public static final /* synthetic */ c j;
    public static final /* synthetic */ c e;
    private static /* synthetic */ int[] l;
    public static final /* synthetic */ c g;

    public static void a(g g10, u u2) {
        int[] arrn = M.b();
        for (int i2 = 0; i2 < u2.b(); ++i2) {
            b b10;
            r r2 = u2.d(i2);
            b b11 = b10 = g10.a(r2.j("Name"));
            if (arrn != null) {
                if (b11 == null) {
                    k.warn("Ignoring unknown attribute '{}'", (Object)r2.j("Name"));
                    if (arrn != null) continue;
                }
                b11 = b10;
            }
            M.a(b11, r2);
            if (arrn != null) continue;
        }
    }

    public static void b(int[] arrn) {
        l = arrn;
    }

    public static u a(g g10) {
        u u2;
        block2: {
            u u3 = new u();
            int[] arrn = M.b();
            for (b b10 : g10.a()) {
                u2 = u3;
                if (arrn != null) {
                    u2.a(M.a(b10));
                    if (arrn != null) continue;
                }
                break block2;
            }
            u2 = u3;
        }
        return u2;
    }

    private static r a(b b10) {
        r r2;
        block7: {
            Collection<f> collection;
            Collection<f> collection2;
            int[] arrn;
            block8: {
                r2 = new r();
                arrn = M.b();
                c c10 = b10.e();
                r2.a("Name", c10.c());
                r2.a("Base", b10.a());
                collection = collection2 = b10.b();
                if (arrn == null) break block8;
                if (collection == null) break block7;
                collection = collection2;
            }
            if (!collection.isEmpty()) {
                u u2 = new u();
                for (f f10 : collection2) {
                    if (arrn != null) {
                        if (f10.a()) {
                            u2.a(M.a(f10));
                        }
                        if (arrn != null) continue;
                    }
                    break block7;
                }
                r2.a("Modifiers", u2);
            }
        }
        return r2;
    }

    public static r a(f f10) {
        r r2 = new r();
        r2.a("Name", f10.d());
        r2.a("Amount", f10.f());
        r2.b("Operation", f10.e());
        r2.a("UUID", f10.c());
        return r2;
    }

    static {
        k = LogManager.getLogger();
        f = new e(null, "generic.maxHealth", 20.0, 0.0, 1024.0).a("Max Health").a(true);
        b = new e(null, "generic.followRange", 32.0, 0.0, 2048.0).a("Follow Range");
        h = new e(null, "generic.knockbackResistance", 0.0, 0.0, 1.0).a("Knockback Resistance");
        d = new e(null, "generic.movementSpeed", 0.7f, 0.0, 1024.0).a("Movement Speed").a(true);
        M.b(new int[2]);
        c = new e(null, "generic.flyingSpeed", 0.4f, 0.0, 1024.0).a("Flying Speed").a(true);
        g = new e(null, "generic.attackDamage", 2.0, 0.0, 2048.0);
        j = new e(null, "generic.attackSpeed", 4.0, 0.0, 1024.0).a(true);
        i = new e(null, "generic.armor", 0.0, 0.0, 30.0).a(true);
        e = new e(null, "generic.armorToughness", 0.0, 0.0, 20.0).a(true);
        a = new e(null, "generic.luck", 0.0, -1024.0, 1024.0).a(true);
    }

    public static int[] b() {
        return l;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    @Nullable
    public static f a(r r2) {
        UUID uUID = r2.l("UUID");
        try {
            return new f(uUID, r2.j("Name"), r2.e("Amount"), r2.m("Operation"));
        }
        catch (Exception exception) {
            k.warn("Unable to create attribute: {}", (Object)exception.getMessage());
            return null;
        }
    }

    private static void a(b b10, r r2) {
        block8: {
            int n2;
            String string;
            r r3;
            int[] arrn;
            block7: {
                int[] arrn2 = M.b();
                b10.a(r2.e("Base"));
                arrn = arrn2;
                r3 = r2;
                string = "Modifiers";
                n2 = 9;
                if (arrn == null) break block7;
                if (!r3.a(string, n2)) break block8;
                r3 = r2;
                string = "Modifiers";
                n2 = 10;
            }
            u u2 = r3.c(string, n2);
            int n3 = 0;
            while (n3 < u2.b()) {
                f f10 = M.a(u2.d(n3));
                if (arrn != null) {
                    if (f10 != null) {
                        f f11 = b10.a(f10.c());
                        if (f11 != null) {
                            b10.a(f11);
                        }
                        b10.b(f10);
                    }
                    ++n3;
                }
                if (arrn != null) continue;
            }
        }
    }
}

