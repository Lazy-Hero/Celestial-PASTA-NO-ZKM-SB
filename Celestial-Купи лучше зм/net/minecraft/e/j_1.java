/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package net.minecraft.E;

import java.util.Iterator;
import javax.annotation.Nullable;
import net.minecraft.E.a_;
import net.minecraft.E.k;
import net.minecraft.E.l;
import net.minecraft.E.s;
import net.minecraft.aN;
import net.minecraft.k.m;

abstract class j
extends Enum<j> {
    public static final /* synthetic */ /* enum */ j GRANT;
    final /* synthetic */ String a;
    public static final /* synthetic */ /* enum */ j REVOKE;
    final /* synthetic */ String c;
    private static final /* synthetic */ j[] b;

    private static gP a(gP gP2) {
        return gP2;
    }

    s a() {
        return new s(this.a + ".usage", new Object[0]);
    }

    @Nullable
    static j a(String string) {
        j[] arrj = j.values();
        int n2 = arrj.length;
        m[] arrm = s.b();
        int n3 = 0;
        while (n3 < n2) {
            j j2 = arrj[n3];
            if (arrm != null) {
                if (j2.c.equals(string)) {
                    return j2;
                }
                ++n3;
            }
            if (arrm != null) continue;
        }
        return null;
    }

    j(String string2, a_ a_2) {
        this(string2);
    }

    public static j[] values() {
        return (j[])b.clone();
    }

    static {
        GRANT = new k("grant");
        REVOKE = new l("revoke");
        b = new j[]{GRANT, REVOKE};
    }

    private j(String string2) {
        this.c = string2;
        this.a = "commands.advancement." + string2;
    }

    public static j valueOf(String string) {
        return Enum.valueOf(j.class, string);
    }

    protected abstract boolean a(net.minecraft.i.k var1, aN var2);

    public int a(net.minecraft.i.k k2, Iterable<aN> iterable) {
        int n2;
        block3: {
            int n3 = 0;
            Iterator<aN> iterator = iterable.iterator();
            m[] arrm = s.b();
            while (iterator.hasNext()) {
                aN aN2 = iterator.next();
                n2 = this.a(k2, aN2) ? 1 : 0;
                if (arrm != null) {
                    if (n2 != 0) {
                        ++n3;
                    }
                    if (arrm != null) continue;
                }
                break block3;
            }
            n2 = n3;
        }
        return n2;
    }

    protected abstract boolean a(net.minecraft.i.k var1, aN var2, String var3);
}

