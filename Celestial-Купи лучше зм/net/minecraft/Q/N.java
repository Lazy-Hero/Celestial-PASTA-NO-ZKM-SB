/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
package net.minecraft.Q;

import com.google.common.collect.Lists;
import java.io.IOException;
import java.util.List;
import net.minecraft.C.K;
import net.minecraft.C.m;
import net.minecraft.Q.O;
import net.minecraft.Q.aD;
import net.minecraft.az.k;
import net.minecraft.az.t;
import net.minecraft.n.a;

public class N
implements K<a> {
    private /* synthetic */ boolean a;
    private /* synthetic */ List<k> d;
    private /* synthetic */ O c;
    private /* synthetic */ List<k> e;
    private /* synthetic */ boolean b;

    public boolean b() {
        return this.a;
    }

    private static IOException a(IOException iOException) {
        return iOException;
    }

    public N(O o2, List<k> list, List<k> list2, boolean bl2, boolean bl3) {
        this.c = o2;
        this.e = list;
        this.d = list2;
        this.a = bl2;
        this.b = bl3;
    }

    public boolean d() {
        return this.b;
    }

    @Override
    public void a(a a10) {
        a10.a(this);
    }

    @Override
    public void a(m m2) throws IOException {
        block7: {
            int n2;
            boolean bl2;
            int n3;
            block8: {
                this.c = m2.a(O.class);
                this.a = m2.readBoolean();
                this.b = m2.readBoolean();
                n3 = m2.a();
                this.e = Lists.newArrayList();
                bl2 = aD.i();
                for (n2 = 0; n2 < n3; ++n2) {
                    this.e.add(t.a(m2.a()));
                    if (bl2) {
                        if (bl2) continue;
                    }
                    break block7;
                }
                N n4 = this;
                if (!bl2) break block8;
                if (n4.c != O.INIT) break block7;
                n3 = m2.a();
                n4 = this;
            }
            n4.d = Lists.newArrayList();
            for (n2 = 0; n2 < n3; ++n2) {
                this.d.add(t.a(m2.a()));
                if (bl2) continue;
            }
        }
    }

    public List<k> c() {
        return this.d;
    }

    public O e() {
        return this.c;
    }

    public N() {
    }

    @Override
    public void b(m m2) throws IOException {
        block7: {
            N n2;
            boolean bl2;
            block8: {
                boolean bl3 = aD.c();
                m2.a(this.c);
                bl2 = bl3;
                m2.writeBoolean(this.a);
                m2.writeBoolean(this.b);
                m2.d(this.e.size());
                for (k k2 : this.e) {
                    m2.d(t.a(k2));
                    if (!bl2) {
                        if (!bl2) continue;
                    }
                    break block7;
                }
                n2 = this;
                if (bl2) break block8;
                if (n2.c != O.INIT) break block7;
                m2.d(this.d.size());
                n2 = this;
            }
            for (k k2 : n2.d) {
                m2.d(t.a(k2));
                if (!bl2) continue;
            }
        }
    }

    public List<k> a() {
        return this.e;
    }
}

