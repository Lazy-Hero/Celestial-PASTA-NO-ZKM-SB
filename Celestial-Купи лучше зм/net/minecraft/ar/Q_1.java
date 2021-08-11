/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 *  com.google.common.collect.Maps
 *  javax.annotation.Nullable
 */
package net.minecraft.ar;

import com.google.common.base.Predicate;
import com.google.common.collect.Maps;
import java.util.Locale;
import java.util.Map;
import javax.annotation.Nullable;
import net.minecraft.ar.aA;
import net.minecraft.ar.av;
import net.minecraft.ar.p;
import net.minecraft.ar.v;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public enum Q implements Predicate<aA>,
p
{
    X("x", av.HORIZONTAL),
    Y("y", av.VERTICAL),
    Z("z", av.HORIZONTAL);

    private final /* synthetic */ av b;
    private final /* synthetic */ String d;
    private static final /* synthetic */ Map<String, Q> a;

    public boolean b() {
        return this.b == av.VERTICAL;
    }

    public boolean d() {
        return this.b == av.HORIZONTAL;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Nullable
    public static Q a(String string) {
        int n2 = v.d();
        Object object = string;
        if (n2 != 0) {
            if (object == null) {
                return null;
            }
            object = a.get(string.toLowerCase(Locale.ROOT));
        }
        Q q2 = (Q)object;
        return q2;
    }

    public String c() {
        return this.d;
    }

    public av a() {
        return this.b;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean a(@Nullable aA aA2) {
        int n2 = v.b();
        aA aA3 = aA2;
        if (n2 == 0) {
            if (aA3 == null) return false;
            aA3 = aA2;
        }
        if (aA3.g() != this) return false;
        return true;
    }

    static {
        a = Maps.newHashMap();
        for (Q q2 : Q.values()) {
            a.put(q2.c().toLowerCase(Locale.ROOT), q2);
        }
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    private Q(String string2, av av2) {
        this.d = string2;
        this.b = av2;
    }

    public String toString() {
        return this.d;
    }

    @Override
    public String a() {
        return this.d;
    }
}

