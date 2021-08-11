/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  javax.annotation.Nullable
 */
package net.minecraft.ar;

import com.google.common.collect.Maps;
import java.util.Locale;
import java.util.Map;
import java.util.Random;
import javax.annotation.Nullable;
import net.minecraft.U.B;
import net.minecraft.ar.Q;
import net.minecraft.ar.R;
import net.minecraft.ar.p;
import net.minecraft.ar.v;
import net.minecraft.k.h;
import net.minecraft.k.m;
import net.minecraft.k.n;

public enum aA implements p
{
    DOWN(0, 1, -1, "down", R.NEGATIVE, Q.Y, new m(0, -1, 0)),
    UP(1, 0, -1, "up", R.POSITIVE, Q.Y, new m(0, 1, 0)),
    NORTH(2, 3, 2, "north", R.NEGATIVE, Q.Z, new m(0, 0, -1)),
    SOUTH(3, 2, 0, "south", R.POSITIVE, Q.Z, new m(0, 0, 1)),
    WEST(4, 5, 1, "west", R.NEGATIVE, Q.X, new m(-1, 0, 0)),
    EAST(5, 4, 3, "east", R.POSITIVE, Q.X, new m(1, 0, 0));

    private final /* synthetic */ String e;
    private static final /* synthetic */ Map<String, aA> a;
    private static final /* synthetic */ aA[] h;
    public static final /* synthetic */ aA[] VALUES;
    private final /* synthetic */ Q b;
    private final /* synthetic */ m i;
    private final /* synthetic */ R k;
    private final /* synthetic */ int d;
    private final /* synthetic */ int g;
    private static /* synthetic */ boolean j;
    private final /* synthetic */ int f;

    public static aA b(int n2) {
        return h[net.minecraft.k.h.g(n2 % h.length)];
    }

    public float n() {
        return (this.f & 3) * 90;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public aA a(Q q2) {
        int n2 = v.d();
        switch (q2) {
            case X: {
                aA aA2 = this;
                if (n2 == 0) return aA2;
                if (aA2 != WEST) {
                    aA2 = this;
                    if (n2 == 0) return aA2;
                    if (aA2 != EAST) {
                        return this.j();
                    }
                }
                aA2 = this;
                return aA2;
            }
            case Y: {
                aA aA3 = this;
                if (n2 == 0) return aA3;
                if (aA3 != UP) {
                    aA3 = this;
                    if (n2 == 0) return aA3;
                    if (aA3 != DOWN) {
                        return this.l();
                    }
                }
                aA3 = this;
                return aA3;
            }
            case Z: {
                aA aA4 = this;
                if (n2 == 0) return aA4;
                if (aA4 != NORTH) {
                    aA4 = this;
                    if (n2 == 0) return aA4;
                    if (aA4 != SOUTH) {
                        return this.q();
                    }
                }
                aA4 = this;
                return aA4;
            }
        }
        throw new IllegalStateException("Unable to get CW facing for axis " + q2);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public int r() {
        int n2 = v.b();
        aA aA2 = this;
        if (n2 == 0) {
            if (aA2.b != Q.X) return 0;
            aA2 = this;
        }
        int n3 = aA2.k.a();
        return n3;
    }

    private aA q() {
        switch (this) {
            case EAST: {
                return DOWN;
            }
            default: {
                throw new IllegalStateException("Unable to get Z-rotated facing of " + this);
            }
            case WEST: {
                return UP;
            }
            case UP: {
                return EAST;
            }
            case DOWN: 
        }
        return WEST;
    }

    public Q g() {
        return this.b;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public int i() {
        int n2 = v.b();
        aA aA2 = this;
        if (n2 == 0) {
            if (aA2.b != Q.Z) return 0;
            aA2 = this;
        }
        int n3 = aA2.k.a();
        return n3;
    }

    public aA d() {
        switch (this) {
            case NORTH: {
                return WEST;
            }
            case EAST: {
                return NORTH;
            }
            case SOUTH: {
                return EAST;
            }
            case WEST: {
                return SOUTH;
            }
        }
        throw new IllegalStateException("Unable to get CCW facing of " + this);
    }

    @Override
    public String a() {
        return this.e;
    }

    public aA h() {
        return VALUES[this.d];
    }

    public static boolean e() {
        boolean bl2 = aA.b();
        return !bl2;
    }

    public String toString() {
        return this.e;
    }

    public static aA a(R r2, Q q2) {
        aA[] arraA = aA.values();
        int n2 = v.b();
        int n3 = arraA.length;
        int n4 = 0;
        while (n4 < n3) {
            block3: {
                block4: {
                    aA aA2;
                    block5: {
                        aA aA3 = arraA[n4];
                        if (n2 != 0) break block3;
                        if (aA3.o() != r2) break block4;
                        aA2 = aA3;
                        if (n2 != 0) break block5;
                        if (aA2.g() != q2) break block4;
                        aA2 = aA3;
                    }
                    return aA2;
                }
                ++n4;
            }
            if (n2 == 0) continue;
        }
        throw new IllegalArgumentException("No such direction: " + (Object)((Object)r2) + " " + q2);
    }

    static {
        VALUES = new aA[6];
        h = new aA[4];
        a = Maps.newHashMap();
        aA[] arraA = aA.values();
        int n2 = arraA.length;
        aA.b(true);
        for (int i2 = 0; i2 < n2; ++i2) {
            aA aA2;
            aA.VALUES[aA2.g] = aA2 = arraA[i2];
            if (aA2.g().d()) {
                aA.h[aA2.f] = aA2;
            }
            a.put(aA2.c().toLowerCase(Locale.ROOT), aA2);
        }
    }

    private static IllegalStateException a(IllegalStateException illegalStateException) {
        return illegalStateException;
    }

    public int f() {
        return this.g;
    }

    public static void b(boolean bl2) {
        j = bl2;
    }

    public static aA a(Random random) {
        return aA.values()[random.nextInt(aA.values().length)];
    }

    public String c() {
        return this.e;
    }

    private aA j() {
        switch (this) {
            case NORTH: {
                return DOWN;
            }
            default: {
                throw new IllegalStateException("Unable to get X-rotated facing of " + this);
            }
            case SOUTH: {
                return UP;
            }
            case UP: {
                return NORTH;
            }
            case DOWN: 
        }
        return SOUTH;
    }

    public m m() {
        return this.i;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Nullable
    public static aA a(String string) {
        int n2 = v.d();
        Object object = string;
        if (n2 != 0) {
            if (object == null) {
                return null;
            }
            object = a.get(string.toLowerCase(Locale.ROOT));
        }
        aA aA2 = (aA)object;
        return aA2;
    }

    public int k() {
        return this.f;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static aA a(n n2, B b10) {
        int n3 = v.d();
        B b11 = b10;
        if (n3 == 0) return b11.K().h();
        if (Math.abs(b11.a - (double)((float)n2.e() + 0.5f)) < 2.0) {
            b11 = b10;
            if (n3 == 0) return b11.K().h();
            if (Math.abs(b11.ax - (double)((float)n2.a() + 0.5f)) < 2.0) {
                double d10 = b10.aF + (double)b10.l();
                double d11 = d10 - (double)n2.b() - 2.0;
                double d12 = d11 == 0.0 ? 0 : (d11 > 0.0 ? 1 : -1);
                if (n3 != 0) {
                    if (d12 > 0) {
                        return UP;
                    }
                    double d13 = (double)n2.b() - d10 - 0.0;
                    d12 = d13 == 0.0 ? 0 : (d13 > 0.0 ? 1 : -1);
                }
                if (d12 > 0) {
                    return DOWN;
                }
            }
        }
        b11 = b10;
        return b11.K().h();
    }

    public aA l() {
        switch (this) {
            case NORTH: {
                return EAST;
            }
            case EAST: {
                return SOUTH;
            }
            case SOUTH: {
                return WEST;
            }
            case WEST: {
                return NORTH;
            }
        }
        throw new IllegalStateException("Unable to get Y-rotated facing of " + this);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public int p() {
        int n2 = v.d();
        aA aA2 = this;
        if (n2 != 0) {
            if (aA2.b != Q.Y) return 0;
            aA2 = this;
        }
        int n3 = aA2.k.a();
        return n3;
    }

    public static boolean b() {
        return j;
    }

    public static aA a(float f10, float f11, float f12) {
        aA aA2;
        block4: {
            aA aA3 = NORTH;
            float f13 = Float.MIN_VALUE;
            aA[] arraA = aA.values();
            int n2 = arraA.length;
            int n3 = 0;
            int n4 = v.d();
            while (n3 < n2) {
                aA2 = arraA[n3];
                if (n4 != 0) {
                    aA aA4 = aA2;
                    float f14 = f10 * (float)aA4.i.e() + f11 * (float)aA4.i.b() + f12 * (float)aA4.i.a();
                    if (n4 != 0) {
                        if (f14 > f13) {
                            f13 = f14;
                            aA3 = aA4;
                        }
                        ++n3;
                    }
                    if (n4 != 0) continue;
                }
                break block4;
            }
            aA2 = aA3;
        }
        return aA2;
    }

    public static aA a(double d10) {
        return aA.b(net.minecraft.k.h.f(d10 / 90.0 + 0.5) & 3);
    }

    public static aA a(int n2) {
        return VALUES[net.minecraft.k.h.g(n2 % VALUES.length)];
    }

    public R o() {
        return this.k;
    }

    private aA(int n3, int n4, int n5, String string2, R r2, Q q2, m m2) {
        this.g = n3;
        this.f = n5;
        this.d = n4;
        this.e = string2;
        this.b = q2;
        this.k = r2;
        this.i = m2;
    }
}

