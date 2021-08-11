/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.ac;

import net.minecraft.ac.b;
import net.minecraft.k.m;
import net.minecraft.w.bl;

public class a {
    public static final /* synthetic */ a O;
    public static final /* synthetic */ a M;
    public static final /* synthetic */ a d;
    public static final /* synthetic */ a Q;
    public static final /* synthetic */ a y;
    public static final /* synthetic */ a r;
    public static final /* synthetic */ a N;
    public static final /* synthetic */ a q;
    public static final /* synthetic */ a V;
    public static final /* synthetic */ a Z;
    public static final /* synthetic */ a w;
    public static final /* synthetic */ a n;
    public static final /* synthetic */ a b;
    public static final /* synthetic */ a[] c;
    public static final /* synthetic */ a e;
    public static final /* synthetic */ a U;
    public static final /* synthetic */ a h;
    public static final /* synthetic */ a ab;
    public static final /* synthetic */ a A;
    public static final /* synthetic */ a P;
    public static final /* synthetic */ a K;
    public static final /* synthetic */ a m;
    public static final /* synthetic */ a aa;
    public static final /* synthetic */ a z;
    public static final /* synthetic */ a ad;
    public static final /* synthetic */ a k;
    public static final /* synthetic */ a x;
    public static final /* synthetic */ a B;
    public static final /* synthetic */ a i;
    public static final /* synthetic */ a t;
    public static final /* synthetic */ a E;
    public static final /* synthetic */ a f;
    public static final /* synthetic */ a u;
    public static final /* synthetic */ a T;
    public static final /* synthetic */ a X;
    public static final /* synthetic */ a I;
    public static final /* synthetic */ a Y;
    public static final /* synthetic */ a s;
    public static final /* synthetic */ a L;
    public static final /* synthetic */ a W;
    public final /* synthetic */ int a;
    public static final /* synthetic */ a l;
    public static final /* synthetic */ a ac;
    public /* synthetic */ int J;
    public static final /* synthetic */ a G;
    public static final /* synthetic */ a S;
    public static final /* synthetic */ a g;
    public static final /* synthetic */ a[] F;
    public static final /* synthetic */ a C;
    public static final /* synthetic */ a R;
    public static final /* synthetic */ a o;
    public static final /* synthetic */ a H;
    public static final /* synthetic */ a p;
    public static final /* synthetic */ a v;
    public static final /* synthetic */ a D;
    public static final /* synthetic */ a j;

    static {
        F = new a[64];
        c = new a[16];
        O = new a(0, 0);
        t = new a(1, 8368696);
        K = new a(2, 16247203);
        i = new a(3, 0xC7C7C7);
        X = new a(4, 0xFF0000);
        u = new a(5, 0xA0A0FF);
        D = new a(6, 0xA7A7A7);
        m = new a(7, 31744);
        b = new a(8, 0xFFFFFF);
        U = new a(9, 10791096);
        ad = new a(10, 9923917);
        T = new a(11, 0x707070);
        B = new a(12, 0x4040FF);
        E = new a(13, 9402184);
        V = new a(14, 0xFFFCF5);
        N = new a(15, 14188339);
        d = new a(16, 11685080);
        q = new a(17, 6724056);
        g = new a(18, 0xE5E533);
        H = new a(19, 8375321);
        x = new a(20, 15892389);
        L = new a(21, 0x4C4C4C);
        l = new a(22, 0x999999);
        h = new a(23, 5013401);
        ab = new a(24, 8339378);
        w = new a(25, 3361970);
        Z = new a(26, 6704179);
        I = new a(27, 6717235);
        W = new a(28, 0x993333);
        k = new a(29, 0x191919);
        e = new a(30, 16445005);
        G = new a(31, 6085589);
        M = new a(32, 4882687);
        A = new a(33, 55610);
        v = new a(34, 8476209);
        aa = new a(35, 0x700200);
        R = new a(36, 13742497);
        Y = new a(37, 10441252);
        C = new a(38, 9787244);
        p = new a(39, 7367818);
        f = new a(40, 12223780);
        S = new a(41, 6780213);
        z = new a(42, 10505550);
        ac = new a(43, 0x392923);
        s = new a(44, 8874850);
        j = new a(45, 0x575C5C);
        o = new a(46, 8014168);
        Q = new a(47, 4996700);
        n = new a(48, 4993571);
        r = new a(49, 5001770);
        y = new a(50, 9321518);
        P = new a(51, 2430480);
        net.minecraft.ac.a.c[bl.WHITE.e()] = b;
        net.minecraft.ac.a.c[bl.ORANGE.e()] = N;
        net.minecraft.ac.a.c[bl.MAGENTA.e()] = d;
        net.minecraft.ac.a.c[bl.LIGHT_BLUE.e()] = q;
        net.minecraft.ac.a.c[bl.YELLOW.e()] = g;
        net.minecraft.ac.a.c[bl.LIME.e()] = H;
        net.minecraft.ac.a.c[bl.PINK.e()] = x;
        net.minecraft.ac.a.c[bl.GRAY.e()] = L;
        net.minecraft.ac.a.c[bl.SILVER.e()] = l;
        net.minecraft.ac.a.c[bl.CYAN.e()] = h;
        net.minecraft.ac.a.c[bl.PURPLE.e()] = ab;
        net.minecraft.ac.a.c[bl.BLUE.e()] = w;
        net.minecraft.ac.a.c[bl.BROWN.e()] = Z;
        net.minecraft.ac.a.c[bl.GREEN.e()] = I;
        net.minecraft.ac.a.c[bl.RED.e()] = W;
        net.minecraft.ac.a.c[bl.BLACK.e()] = k;
    }

    private static IndexOutOfBoundsException a(IndexOutOfBoundsException indexOutOfBoundsException) {
        return indexOutOfBoundsException;
    }

    public static a a(bl bl2) {
        return c[bl2.e()];
    }

    public int a(int n2) {
        int n3;
        m[] arrm;
        int n4;
        block11: {
            int n5;
            block10: {
                n4 = 220;
                arrm = net.minecraft.ac.b.b();
                n3 = n2;
                n5 = 3;
                if (arrm == null) {
                    if (n3 == n5) {
                        n4 = 135;
                    }
                    n3 = n2;
                    n5 = 2;
                }
                if (arrm != null) break block10;
                if (n3 == n5) {
                    n4 = 255;
                }
                n3 = n2;
                if (arrm != null) break block11;
                n5 = 1;
            }
            if (n3 == n5) {
                n4 = 220;
            }
            n3 = n2;
        }
        if (arrm == null) {
            if (n3 == 0) {
                n4 = 180;
            }
            n3 = (this.J >> 16 & 0xFF) * n4 / 255;
        }
        int n6 = n3;
        int n7 = (this.J >> 8 & 0xFF) * n4 / 255;
        int n8 = (this.J & 0xFF) * n4 / 255;
        if (arrm != null) {
            net.minecraft.k.m.b(!net.minecraft.k.m.c());
        }
        return 0xFF000000 | n6 << 16 | n7 << 8 | n8;
    }

    private a(int n2, int n3) {
        if (n2 < 0 || n2 > 63) {
            throw new IndexOutOfBoundsException("Map colour ID must be between 0 and 63 (inclusive)");
        }
        this.a = n2;
        this.J = n3;
        net.minecraft.ac.a.F[n2] = this;
    }
}

