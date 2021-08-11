/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package net.minecraft.Q;

import java.io.IOException;
import javax.annotation.Nullable;
import net.minecraft.C.K;
import net.minecraft.C.m;
import net.minecraft.Q.Q;
import net.minecraft.Q.aD;
import net.minecraft.at.k;
import net.minecraft.n.a;

public class M
implements K<a> {
    private /* synthetic */ int a;
    private /* synthetic */ Q c;
    private /* synthetic */ k e;
    private /* synthetic */ int d;
    private /* synthetic */ int b;

    public M() {
    }

    public int a() {
        return this.a;
    }

    @Override
    public void a(a a10) {
        a10.a(this);
    }

    public Q e() {
        return this.c;
    }

    private static IOException a(IOException iOException) {
        return iOException;
    }

    @Override
    public void b(m m2) throws IOException {
        block6: {
            Q q2;
            Q q3;
            block5: {
                block2: {
                    m m3;
                    block3: {
                        boolean bl2;
                        block4: {
                            bl2 = aD.c();
                            m3 = m2.a(this.c);
                            if (bl2) break block2;
                            if (this.c == Q.TITLE) break block3;
                            q3 = this.c;
                            q2 = Q.SUBTITLE;
                            if (bl2) break block4;
                            if (q3 == q2) break block3;
                            q3 = this.c;
                            q2 = Q.ACTIONBAR;
                        }
                        if (bl2) break block5;
                        if (q3 != q2) break block2;
                    }
                    m3 = m2.a(this.e);
                }
                q3 = this.c;
                q2 = Q.TIMES;
            }
            if (q3 != q2) break block6;
            m2.writeInt(this.b);
            m2.writeInt(this.a);
            m2.writeInt(this.d);
        }
    }

    public k b() {
        return this.e;
    }

    public int d() {
        return this.b;
    }

    public M(Q q2, @Nullable k k2, int n2, int n3, int n4) {
        this.c = q2;
        this.e = k2;
        this.b = n2;
        this.a = n3;
        this.d = n4;
    }

    public int c() {
        return this.d;
    }

    public M(Q q2, k k2) {
        this(q2, k2, -1, -1, -1);
    }

    public M(int n2, int n3, int n4) {
        this(Q.TIMES, null, n2, n3, n4);
    }

    @Override
    public void a(m m2) throws IOException {
        block9: {
            block8: {
                M m3;
                Q q2;
                Q q3;
                block6: {
                    boolean bl2;
                    block7: {
                        block4: {
                            M m4;
                            block5: {
                                this.c = m2.a(Q.class);
                                bl2 = aD.c();
                                m4 = this;
                                if (bl2) break block4;
                                if (m4.c == Q.TITLE) break block5;
                                m4 = this;
                                if (bl2) break block4;
                                if (m4.c == Q.SUBTITLE) break block5;
                                q3 = this.c;
                                q2 = Q.ACTIONBAR;
                                if (bl2) break block6;
                                if (q3 != q2) break block7;
                            }
                            m4 = this;
                        }
                        m4.e = m2.m();
                    }
                    m3 = this;
                    if (bl2) break block8;
                    q3 = m3.c;
                    q2 = Q.TIMES;
                }
                if (q3 != q2) break block9;
                this.b = m2.readInt();
                this.a = m2.readInt();
                m3 = this;
            }
            m3.d = m2.readInt();
        }
    }
}

