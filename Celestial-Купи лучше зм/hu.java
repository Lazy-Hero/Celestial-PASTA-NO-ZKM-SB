/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.ar.aA;
import net.minecraft.k.n;

public enum hu {
    DOWN(aA.DOWN),
    UP(aA.UP),
    NORTH(aA.NORTH),
    SOUTH(aA.SOUTH),
    WEST(aA.WEST),
    EAST(aA.EAST),
    NORTH_WEST(aA.NORTH, aA.WEST),
    NORTH_EAST(aA.NORTH, aA.EAST),
    SOUTH_WEST(aA.SOUTH, aA.WEST),
    SOUTH_EAST(aA.SOUTH, aA.EAST),
    DOWN_NORTH(aA.DOWN, aA.NORTH),
    DOWN_SOUTH(aA.DOWN, aA.SOUTH),
    UP_NORTH(aA.UP, aA.NORTH),
    UP_SOUTH(aA.UP, aA.SOUTH),
    DOWN_WEST(aA.DOWN, aA.WEST),
    DOWN_EAST(aA.DOWN, aA.EAST),
    UP_WEST(aA.UP, aA.WEST),
    UP_EAST(aA.UP, aA.EAST);

    private final /* synthetic */ aA a;
    private /* synthetic */ aA c;

    public boolean a() {
        return this.c != null;
    }

    private hu(aA aA2, aA aA3) {
        this.a = aA2;
        this.c = aA3;
    }

    private hu(aA aA2) {
        this.a = aA2;
    }

    public aA f() {
        return this.a;
    }

    n a(n n2) {
        String string = K.d();
        n n3 = n2.a(this.a, 1);
        if (string == null) {
            n2 = n3;
            if (this.c != null) {
                n2 = n2.a(this.c, 1);
            }
            n3 = n2;
        }
        return n3;
    }

    public int e() {
        int n2 = this.a.p();
        if (this.c != null) {
            n2 += this.c.p();
        }
        return n2;
    }

    public int d() {
        int n2 = this.a.r();
        if (this.c != null) {
            n2 += this.c.r();
        }
        return n2;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public int b() {
        int n2 = this.a.i();
        if (this.c != null) {
            n2 += this.c.i();
        }
        return n2;
    }

    public aA c() {
        return this.c;
    }
}

