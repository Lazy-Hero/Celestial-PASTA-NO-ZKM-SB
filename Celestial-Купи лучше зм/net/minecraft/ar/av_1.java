/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 *  com.google.common.collect.Iterators
 *  javax.annotation.Nullable
 */
package net.minecraft.ar;

import com.google.common.base.Predicate;
import com.google.common.collect.Iterators;
import java.util.Iterator;
import java.util.Random;
import javax.annotation.Nullable;
import net.minecraft.ar.N;
import net.minecraft.ar.aA;
import net.minecraft.ar.v;

public enum av implements Predicate<aA>,
Iterable<aA>
{
    HORIZONTAL,
    VERTICAL;


    private static gP a(gP gP2) {
        return gP2;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public aA[] a() {
        var1_1 = v.b();
        v0 = N.c[this.ordinal()];
        if (var1_1 != 0) ** GOTO lbl7
        switch (v0) {
            case 1: {
                v0 = 4;
lbl7:
                // 2 sources

                v1 = new aA[v0];
                v1[0] = aA.NORTH;
                v1[1] = aA.EAST;
                v1[2] = aA.SOUTH;
                v1[3] = aA.WEST;
                return v1;
            }
            case 2: {
                return new aA[]{aA.UP, aA.DOWN};
            }
        }
        throw new Error("Someone's been tampering with the universe!");
    }

    public aA a(Random random) {
        aA[] arraA = this.a();
        return arraA[random.nextInt(arraA.length)];
    }

    @Override
    public Iterator<aA> iterator() {
        return Iterators.forArray((Object[])this.a());
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean a(@Nullable aA aA2) {
        int n2 = v.d();
        aA aA3 = aA2;
        if (n2 != 0) {
            if (aA3 == null) return false;
            aA3 = aA2;
        }
        if (aA3.g().a() != this) return false;
        return true;
    }
}

