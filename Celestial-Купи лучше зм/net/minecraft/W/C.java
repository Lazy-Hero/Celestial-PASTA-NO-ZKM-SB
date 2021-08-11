/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 *  com.google.common.collect.Collections2
 *  com.google.common.collect.Lists
 */
package net.minecraft.W;

import com.google.common.base.Predicate;
import com.google.common.collect.Collections2;
import com.google.common.collect.Lists;
import java.util.Collection;
import net.minecraft.W.cL;
import net.minecraft.W.cP;
import net.minecraft.W.ci;
import net.minecraft.ar.p;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public enum C implements p
{
    DANDELION(ci.YELLOW, 0, "dandelion"),
    POPPY(ci.RED, 0, "poppy"),
    BLUE_ORCHID(ci.RED, 1, "blue_orchid", "blueOrchid"),
    ALLIUM(ci.RED, 2, "allium"),
    HOUSTONIA(ci.RED, 3, "houstonia"),
    RED_TULIP(ci.RED, 4, "red_tulip", "tulipRed"),
    ORANGE_TULIP(ci.RED, 5, "orange_tulip", "tulipOrange"),
    WHITE_TULIP(ci.RED, 6, "white_tulip", "tulipWhite"),
    PINK_TULIP(ci.RED, 7, "pink_tulip", "tulipPink"),
    OXEYE_DAISY(ci.RED, 8, "oxeye_daisy", "oxeyeDaisy");

    private final /* synthetic */ int c;
    private static final /* synthetic */ C[][] a;
    private final /* synthetic */ ci f;
    private final /* synthetic */ String d;
    private final /* synthetic */ String b;

    private C(ci ci2, int n3, String string2, String string3) {
        this.f = ci2;
        this.c = n3;
        this.d = string2;
        this.b = string3;
    }

    static {
        a = new C[ci.values().length][];
        for (ci ci2 : ci.values()) {
            Collection collection = Collections2.filter((Collection)Lists.newArrayList((Object[])C.values()), (Predicate)new cP(ci2));
            C.a[ci2.ordinal()] = collection.toArray(new C[collection.size()]);
        }
    }

    public String c() {
        return this.b;
    }

    public int b() {
        return this.c;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public String toString() {
        return this.d;
    }

    public static C[] a(ci ci2) {
        return a[ci2.ordinal()];
    }

    public ci a() {
        return this.f;
    }

    private C(ci ci2, int n3, String string2) {
        this(ci2, n3, string2, string2);
    }

    @Override
    public String a() {
        return this.d;
    }

    public static C a(ci ci2, int n2) {
        C[] arrc;
        block4: {
            int n3;
            block2: {
                block3: {
                    arrc = a[ci2.ordinal()];
                    boolean bl2 = cL.b();
                    n3 = n2;
                    if (bl2) break block2;
                    if (n3 < 0) break block3;
                    n3 = n2;
                    if (bl2) break block2;
                    if (n3 < arrc.length) break block4;
                }
                n3 = 0;
            }
            n2 = n3;
        }
        return arrc[n2];
    }
}

