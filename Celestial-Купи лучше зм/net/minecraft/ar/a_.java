/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package net.minecraft.ar;

import javax.annotation.Nullable;
import net.minecraft.ar.M;
import net.minecraft.ar.v;

public class a_<V> {
    private transient /* synthetic */ int c;
    private final /* synthetic */ float d = 0.75f;
    private transient /* synthetic */ M<V>[] b;
    private /* synthetic */ int a;

    private void g(int n2) {
        block4: {
            int n3;
            block2: {
                block3: {
                    M<V>[] arrm = this.b;
                    int n4 = arrm.length;
                    int n5 = v.b();
                    n3 = n4;
                    if (n5 != 0) break block2;
                    if (n3 != 0x40000000) break block3;
                    this.a = Integer.MAX_VALUE;
                    if (n5 == 0) break block4;
                }
                n3 = n2;
            }
            M[] arrm = new M[n3];
            this.a(arrm);
            this.b = arrm;
            float f10 = n2;
            this.getClass();
            this.a = (int)(f10 * 0.75f);
        }
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    /*
     * Enabled aggressive block sorting
     */
    @Nullable
    public V e(int n2) {
        Object v2;
        M<V> m2 = this.b(n2);
        int n3 = v.b();
        M<V> m3 = m2;
        if (n3 == 0) {
            if (m3 == null) {
                v2 = null;
                return v2;
            }
            m3 = m2;
        }
        v2 = m3.b;
        return v2;
    }

    private static int a(int n2, int n3) {
        return n2 & n3 - 1;
    }

    public a_() {
        this.b = new M[16];
        this.a = 12;
        this.d = 0.75f;
    }

    private void a(int n2, int n3, V v2, int n4) {
        block3: {
            int n5;
            a_ a_2;
            block2: {
                M<V> m2 = this.b[n4];
                this.b[n4] = new M<V>(n2, n3, v2, m2);
                int n6 = v.d();
                a_ a_3 = this;
                a_2 = a_3;
                n5 = a_3.c;
                if (n6 == 0) break block2;
                a_2.c = n5 + 1;
                if (n5 < this.a) break block3;
                a_2 = this;
                n5 = 2 * this.b.length;
            }
            a_2.g(n5);
        }
    }

    @Nullable
    final M<V> h(int n2) {
        int n3 = a_.d(n2);
        int n4 = v.b();
        M<V> m2 = this.b[a_.a(n3, this.b.length)];
        while (m2 != null) {
            M<V> m3 = m2;
            if (n4 == 0) {
                if (m3.a == n2) {
                    return m2;
                }
                m3 = m2 = m2.c;
            }
            if (n4 == 0) continue;
        }
        return null;
    }

    public void a() {
        block2: {
            M<V>[] arrm = this.b;
            int n2 = v.d();
            for (int i2 = 0; i2 < arrm.length; ++i2) {
                arrm[i2] = null;
                if (n2 != 0) {
                    if (n2 != 0) continue;
                }
                break block2;
            }
            this.c = 0;
        }
    }

    public void a(int n2, V v2) {
        block4: {
            int n3 = a_.d(n2);
            int n4 = v.d();
            int n5 = a_.a(n3, this.b.length);
            M<V> m2 = this.b[n5];
            while (m2 != null) {
                if (n4 != 0) {
                    M<V> m3 = m2;
                    if (n4 != 0) {
                        if (m3.a == n2) {
                            m2.b = v2;
                            return;
                        }
                        m3 = m2 = m2.c;
                    }
                    if (n4 != 0) continue;
                }
                break block4;
            }
            this.a(n3, n2, v2, n5);
        }
    }

    static int c(int n2) {
        return a_.d(n2);
    }

    public boolean a(int n2) {
        return this.h(n2) != null;
    }

    @Nullable
    final M<V> b(int n2) {
        M<V> m2;
        block3: {
            int n3 = a_.d(n2);
            int n4 = a_.a(n3, this.b.length);
            M<V> m3 = this.b[n4];
            int n5 = v.d();
            M<V> m4 = m3;
            while (m4 != null) {
                block4: {
                    M m5;
                    block5: {
                        block8: {
                            M<V> m6;
                            block6: {
                                M<V> m7;
                                block7: {
                                    m5 = m4.c;
                                    m2 = m4;
                                    if (n5 == 0) break block3;
                                    if (n5 == 0) break block4;
                                    if (m2.a != n2) break block5;
                                    --this.c;
                                    m7 = m3;
                                    m6 = m4;
                                    if (n5 == 0) break block6;
                                    if (m7 != m6) break block7;
                                    this.b[n4] = m5;
                                    if (n5 != 0) break block8;
                                }
                                m7 = m3;
                                m6 = m5;
                            }
                            m7.c = m6;
                        }
                        return m4;
                    }
                    m3 = m4;
                    M m8 = m4 = m5;
                }
                if (n5 != 0) continue;
            }
            m2 = m4;
        }
        return m2;
    }

    private void a(M<V>[] arrm) {
        M<V>[] arrm2 = this.b;
        int n2 = v.d();
        int n3 = arrm.length;
        int n4 = 0;
        while (n4 < arrm2.length) {
            M<V> m2 = arrm2[n4];
            if (n2 != 0) {
                if (m2 != null) {
                    M m3;
                    arrm2[n4] = null;
                    do {
                        m3 = m2.c;
                        int n5 = a_.a(m2.d, n3);
                        m2.c = arrm[n5];
                        arrm[n5] = m2;
                        m2 = m3;
                    } while ((m3 != null || n2 == 0) && n2 != 0);
                }
                ++n4;
            }
            if (n2 != 0) continue;
        }
    }

    @Nullable
    public V f(int n2) {
        int n3 = a_.d(n2);
        int n4 = v.d();
        M<V> m2 = this.b[a_.a(n3, this.b.length)];
        while (m2 != null) {
            M<V> m3 = m2;
            if (n4 != 0) {
                if (m3.a == n2) {
                    return m2.b;
                }
                m3 = m2 = m2.c;
            }
            if (n4 != 0) continue;
        }
        return null;
    }

    private static int d(int n2) {
        n2 = n2 ^ n2 >>> 20 ^ n2 >>> 12;
        return n2 ^ n2 >>> 7 ^ n2 >>> 4;
    }
}

