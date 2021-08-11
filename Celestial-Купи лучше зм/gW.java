/*
 * Decompiled with CFR 0.150.
 */
class gW {
    private static gP a(gP gP2) {
        return gP2;
    }

    static final long a(long l2, float f10) {
        int n2 = ae.f();
        long l3 = l2 * 31L;
        if (n2 != 0) {
            l2 = l3;
            if (f10 == 0.0f) {
                return l2;
            }
            l3 = l2 + (long)Float.floatToIntBits(f10);
        }
        return l3;
    }

    static final long a(long l2, double d10) {
        int n2 = ae.f();
        long l3 = l2 * 31L;
        if (n2 != 0) {
            l2 = l3;
            if (d10 == 0.0) {
                return l2;
            }
            l3 = l2 + Double.doubleToLongBits(d10);
        }
        return l3;
    }

    private gW() {
    }

    static final int a(long l2) {
        return (int)(l2 ^ l2 >> 32);
    }

    static final long a(long l2, long l3) {
        return (l2 *= 31L) + l3;
    }
}

