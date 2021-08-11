/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.ao;

import java.util.List;
import java.util.Random;
import net.minecraft.ao.I;
import net.minecraft.ao.J;
import net.minecraft.ao.K;
import net.minecraft.ao.L;
import net.minecraft.ao.M;
import net.minecraft.ao.N;
import net.minecraft.ao.O;
import net.minecraft.ao.P;
import net.minecraft.ao.Q;
import net.minecraft.ao.R;
import net.minecraft.ao.S;
import net.minecraft.ao.T;
import net.minecraft.ao.U;
import net.minecraft.ao.V;
import net.minecraft.ao.W;
import net.minecraft.ao.X;
import net.minecraft.ao.be;
import net.minecraft.ao.by;
import net.minecraft.ao.u;
import net.minecraft.ar.aA;

public class bT {
    private static final /* synthetic */ be[] a;
    private static final /* synthetic */ be[] b;

    private static gP a(gP gP2) {
        return gP2;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    private static I b(be be2, List<u> list, Random random, int n2, int n3, int n4, aA aA2, int n5) {
        void var10_24;
        Class<? extends I> class_ = be2.e;
        String[] arrstring = u.b();
        Object var10_10 = null;
        Class<? extends I> class_2 = class_;
        Class class_3 = W.class;
        if (arrstring != null) {
            if (class_2 == class_3) {
                W w2 = W.a(list, random, n2, n3, n4, aA2, n5);
                return var10_24;
            }
            class_2 = class_;
            class_3 = Q.class;
        }
        if (arrstring != null) {
            if (class_2 == class_3) {
                Q q2 = Q.a(list, random, n2, n3, n4, aA2, n5);
                return var10_24;
            }
            class_2 = class_;
            class_3 = O.class;
        }
        if (arrstring != null) {
            if (class_2 == class_3) {
                O o2 = O.a(list, random, n2, n3, n4, aA2, n5);
                return var10_24;
            }
            class_2 = class_;
            class_3 = V.class;
        }
        if (arrstring != null) {
            if (class_2 == class_3) {
                V v2 = V.a(list, random, n2, n3, n4, n5, aA2);
                return var10_24;
            }
            class_2 = class_;
            class_3 = X.class;
        }
        if (arrstring != null) {
            if (class_2 == class_3) {
                X x2 = X.a(list, random, n2, n3, n4, n5, aA2);
                return var10_24;
            }
            class_2 = class_;
            class_3 = T.class;
        }
        if (arrstring != null) {
            if (class_2 == class_3) {
                T t2 = T.a(list, random, n2, n3, n4, aA2, n5);
                return var10_24;
            }
            class_2 = class_;
            class_3 = N.class;
        }
        if (arrstring != null) {
            if (class_2 == class_3) {
                N n6 = N.a(list, random, n2, n3, n4, aA2, n5);
                return var10_24;
            }
            class_2 = class_;
            class_3 = K.class;
        }
        if (arrstring != null) {
            if (class_2 == class_3) {
                K k2 = K.a(list, random, n2, n3, n4, aA2, n5);
                return var10_24;
            }
            class_2 = class_;
            class_3 = J.class;
        }
        if (arrstring != null) {
            if (class_2 == class_3) {
                J j2 = J.a(list, random, n2, n3, n4, aA2, n5);
                return var10_24;
            }
            class_2 = class_;
            class_3 = L.class;
        }
        if (arrstring != null) {
            if (class_2 == class_3) {
                L l2 = L.a(list, random, n2, n3, n4, aA2, n5);
                return var10_24;
            }
            class_2 = class_;
            class_3 = M.class;
        }
        if (arrstring != null) {
            if (class_2 == class_3) {
                M m2 = M.a(list, random, n2, n3, n4, aA2, n5);
                return var10_24;
            }
            class_2 = class_;
            class_3 = P.class;
        }
        if (arrstring != null) {
            if (class_2 == class_3) {
                P p2 = P.a(list, random, n2, n3, n4, aA2, n5);
                return var10_24;
            }
            class_2 = class_;
            class_3 = U.class;
        }
        if (class_2 != class_3) return var10_24;
        U u2 = U.a(list, random, n2, n3, n4, aA2, n5);
        return var10_24;
    }

    static {
        a = new be[]{new be(W.class, 30, 0, true), new be(Q.class, 10, 4), new be(O.class, 10, 4), new be(V.class, 10, 3), new be(X.class, 5, 2), new be(T.class, 5, 1)};
        b = new be[]{new be(N.class, 25, 0, true), new be(P.class, 15, 5), new be(K.class, 5, 10), new be(J.class, 5, 10), new be(L.class, 10, 3, true), new be(M.class, 7, 2), new be(U.class, 5, 2)};
    }

    static be[] b() {
        return a;
    }

    static be[] c() {
        return b;
    }

    static I a(be be2, List list, Random random, int n2, int n3, int n4, aA aA2, int n5) {
        return bT.b(be2, list, random, n2, n3, n4, aA2, n5);
    }

    public static void a() {
        by.b(Q.class, "NeBCr");
        by.b(S.class, "NeBEF");
        by.b(W.class, "NeBS");
        by.b(L.class, "NeCCS");
        by.b(M.class, "NeCTB");
        by.b(T.class, "NeCE");
        by.b(P.class, "NeSCSC");
        by.b(J.class, "NeSCLT");
        by.b(N.class, "NeSC");
        by.b(K.class, "NeSCRT");
        by.b(U.class, "NeCSR");
        by.b(X.class, "NeMT");
        by.b(O.class, "NeRC");
        by.b(V.class, "NeSR");
        by.b(R.class, "NeStart");
    }
}

