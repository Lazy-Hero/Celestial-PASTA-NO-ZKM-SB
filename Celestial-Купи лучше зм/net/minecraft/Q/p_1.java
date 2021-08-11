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
import net.minecraft.Q.aD;
import net.minecraft.k.l;
import net.minecraft.k.n;
import net.minecraft.n.a;

public class p
implements K<a> {
    public /* synthetic */ float c;
    public /* synthetic */ float e;
    public static /* synthetic */ double f;
    public static /* synthetic */ double d;
    public /* synthetic */ float a;
    private /* synthetic */ float h;
    public static /* synthetic */ double g;
    private /* synthetic */ List<n> b;

    public p() {
    }

    public double d() {
        return d;
    }

    @Override
    public void b(m m2) throws IOException {
        block2: {
            boolean bl2 = aD.c();
            m2.writeFloat((float)f);
            boolean bl3 = bl2;
            m2.writeFloat((float)d);
            m2.writeFloat((float)g);
            m2.writeFloat(this.h);
            m2.writeInt(this.b.size());
            int n2 = (int)f;
            int n3 = (int)d;
            int n4 = (int)g;
            for (n n5 : this.b) {
                int n6 = n5.e() - n2;
                int n7 = n5.b() - n3;
                int n8 = n5.a() - n4;
                m2.writeByte(n6);
                m2.writeByte(n7);
                m2.writeByte(n8);
                if (!bl3) {
                    if (!bl3) continue;
                }
                break block2;
            }
            m2.writeFloat(this.e);
            m2.writeFloat(this.a);
            m2.writeFloat(this.c);
        }
    }

    public float e() {
        return this.c;
    }

    public float f() {
        return this.a;
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    public float b() {
        return this.e;
    }

    public double g() {
        return f;
    }

    public float h() {
        return this.h;
    }

    public double a() {
        return g;
    }

    public p(double d10, double d11, double d12, float f10, List<n> list, l l2) {
        block3: {
            block2: {
                boolean bl2 = aD.c();
                boolean bl3 = bl2;
                f = d10;
                d = d11;
                g = d12;
                this.h = f10;
                this.b = Lists.newArrayList(list);
                if (bl3) break block2;
                if (l2 == null) break block3;
                this.e = (float)l2.e;
                this.a = (float)l2.d;
            }
            this.c = (float)l2.b;
        }
    }

    @Override
    public void a(a a10) {
        a10.a(this);
    }

    @Override
    public void a(m m2) throws IOException {
        block2: {
            f = m2.readFloat();
            d = m2.readFloat();
            g = m2.readFloat();
            this.h = m2.readFloat();
            int n2 = m2.readInt();
            this.b = Lists.newArrayListWithCapacity((int)n2);
            int n3 = (int)f;
            int n4 = (int)d;
            int n5 = (int)g;
            boolean bl2 = aD.i();
            for (int i2 = 0; i2 < n2; ++i2) {
                int n6 = m2.readByte() + n3;
                int n7 = m2.readByte() + n4;
                int n8 = m2.readByte() + n5;
                this.b.add(new n(n6, n7, n8));
                if (bl2) {
                    if (bl2) continue;
                }
                break block2;
            }
            this.e = m2.readFloat();
            this.a = m2.readFloat();
            this.c = m2.readFloat();
        }
    }

    public List<n> c() {
        return this.b;
    }
}

