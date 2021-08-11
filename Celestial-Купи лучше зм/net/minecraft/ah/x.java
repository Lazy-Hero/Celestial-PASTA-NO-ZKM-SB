/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  javax.annotation.concurrent.Immutable
 */
package net.minecraft.ah;

import javax.annotation.concurrent.Immutable;
import net.minecraft.P.r;
import net.minecraft.ah.z;

@Immutable
public class x {
    public static final /* synthetic */ x a;
    private final /* synthetic */ String b;

    public static x a(r r2) {
        block3: {
            String string;
            r r3;
            block2: {
                String string2 = z.I();
                r3 = r2;
                string = "Lock";
                if (string2 == null) break block2;
                if (!r3.a(string, 8)) break block3;
                r3 = r2;
                string = "Lock";
            }
            String string3 = r3.j(string);
            return new x(string3);
        }
        return a;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public x(String string) {
        this.b = string;
    }

    static {
        a = new x("");
    }

    public void b(r r2) {
        r2.a("Lock", this.b);
    }

    public String b() {
        return this.b;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean a() {
        String string = z.I();
        String string2 = this.b;
        if (string != null) {
            if (string2 == null) return true;
            string2 = this.b;
        }
        boolean bl2 = string2.isEmpty();
        if (string == null) return bl2;
        if (!bl2) return false;
        return true;
    }
}

