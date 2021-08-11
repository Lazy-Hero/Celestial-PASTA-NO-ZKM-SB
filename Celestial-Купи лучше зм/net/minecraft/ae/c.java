/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Optional
 *  com.google.common.collect.ImmutableSet
 */
package net.minecraft.ae;

import com.google.common.base.Optional;
import com.google.common.collect.ImmutableSet;
import java.util.Collection;
import net.minecraft.ae.b;

public class c
extends b<Boolean> {
    private final /* synthetic */ ImmutableSet<Boolean> d;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean equals(Object object) {
        String[] arrstring = b.b();
        Object object2 = this;
        if (arrstring != null) {
            if (object2 == object) {
                return true;
            }
            object2 = object;
        }
        boolean bl2 = object2 instanceof c;
        if (arrstring == null) return bl2;
        if (!bl2) return false;
        bl2 = super.equals(object);
        if (arrstring == null) return bl2;
        if (!bl2) return false;
        c c10 = (c)object;
        return this.d.equals(c10.d);
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    public String a(Boolean bl2) {
        return bl2.toString();
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    public Optional<Boolean> a(String var1_1) {
        var2_2 = b.b();
        v0 = "true";
        if (var2_2 != null) {
            if (!v0.equals(var1_1)) {
                v0 = "false";
                if (var2_2 != null) {
                    if (!v0.equals(var1_1)) {
                        v1 = Optional.absent();
                        return v1;
                    } else {
                        ** GOTO lbl-1000
                    }
                }
            } else lbl-1000:
            // 3 sources

            {
                v0 = var1_1;
            }
        }
        v1 = Optional.of((Object)Boolean.valueOf(v0));
        return v1;
    }

    public static c a(String string) {
        return new c(string);
    }

    protected c(String string) {
        super(string, Boolean.class);
        this.d = ImmutableSet.of((Object)true, (Object)false);
    }

    @Override
    public Collection<Boolean> a() {
        return this.d;
    }

    @Override
    public int hashCode() {
        return 31 * super.hashCode() + this.d.hashCode();
    }
}

