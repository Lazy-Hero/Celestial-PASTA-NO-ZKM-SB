/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  io.netty.buffer.ByteBuf
 *  io.netty.buffer.Unpooled
 */
package net.minecraft.Q;

import com.google.common.collect.Lists;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import net.minecraft.C.K;
import net.minecraft.C.m;
import net.minecraft.N.y;
import net.minecraft.P.r;
import net.minecraft.Q.aD;
import net.minecraft.k.n;
import net.minecraft.n.a;
import net.minecraft.t.f;

public class a0
implements K<a> {
    private /* synthetic */ int c;
    private /* synthetic */ boolean b;
    private /* synthetic */ byte[] f;
    private /* synthetic */ List<r> a;
    private /* synthetic */ int d;
    private /* synthetic */ int e;

    public boolean e() {
        return this.b;
    }

    @Override
    public void a(a a10) {
        a10.a(this);
    }

    public int g() {
        return this.d;
    }

    protected int a(net.minecraft.o.a a10, boolean bl2, int n2) {
        int n3;
        block15: {
            int n4;
            block9: {
                n4 = 0;
                boolean bl3 = aD.c();
                f[] arrf = a10.n();
                int n5 = 0;
                int n6 = arrf.length;
                while (n5 < n6) {
                    block10: {
                        block11: {
                            int n7;
                            f f10;
                            block14: {
                                block12: {
                                    block13: {
                                        f10 = arrf[n5];
                                        if (bl3) break block9;
                                        if (bl3) break block10;
                                        if (f10 == net.minecraft.o.a.u) break block11;
                                        n7 = this.e();
                                        if (bl3) break block12;
                                        if (n7 == 0) break block13;
                                        n7 = f10.i();
                                        if (bl3) break block12;
                                        if (n7 != 0) break block11;
                                    }
                                    n7 = n2 & 1 << n5;
                                }
                                if (bl3) break block14;
                                if (n7 == 0) break block11;
                                n4 += f10.f().a();
                                n4 += f10.c().a().length;
                                if (bl3) break block10;
                                n7 = bl2 ? 1 : 0;
                            }
                            if (n7 != 0) {
                                n4 += f10.a().a().length;
                            }
                        }
                        ++n5;
                    }
                    if (!bl3) continue;
                }
                n3 = this.e();
                if (bl3) break block15;
                if (n3 != 0) {
                    n4 += a10.g().length;
                }
            }
            n3 = n4;
        }
        return n3;
    }

    public m c() {
        return new m(Unpooled.wrappedBuffer((byte[])this.f));
    }

    @Override
    public void b(m m2) throws IOException {
        m2.writeInt(this.e);
        m2.writeInt(this.c);
        m2.writeBoolean(this.b);
        boolean bl2 = aD.c();
        m2.d(this.d);
        m2.d(this.f.length);
        m2.writeBytes(this.f);
        boolean bl3 = bl2;
        m2.d(this.a.size());
        for (r r2 : this.a) {
            m2.a(r2);
            if (!bl3) continue;
        }
    }

    public int d() {
        return this.e;
    }

    public int b() {
        return this.c;
    }

    public List<r> a() {
        return this.a;
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    private ByteBuf f() {
        ByteBuf byteBuf = Unpooled.wrappedBuffer((byte[])this.f);
        byteBuf.writerIndex(0);
        return byteBuf;
    }

    public a0() {
    }

    @Override
    public void a(m m2) throws IOException {
        this.e = m2.readInt();
        this.c = m2.readInt();
        this.b = m2.readBoolean();
        this.d = m2.a();
        int n2 = m2.a();
        boolean bl2 = aD.c();
        int n3 = n2;
        if (!bl2) {
            if (n3 > 0x200000) {
                throw new RuntimeException("Chunk Packet trying to allocate too much memory on read.");
            }
            this.f = new byte[n2];
            m2.readBytes(this.f);
            n3 = m2.a();
        }
        int n4 = n3;
        this.a = Lists.newArrayList();
        for (int i2 = 0; i2 < n4; ++i2) {
            this.a.add(m2.g());
            if (!bl2) continue;
        }
    }

    public int a(m m2, net.minecraft.o.a a10, boolean bl2, int n2) {
        int n3;
        block15: {
            int n4;
            block9: {
                n4 = 0;
                boolean bl3 = aD.c();
                f[] arrf = a10.n();
                int n5 = 0;
                int n6 = arrf.length;
                while (n5 < n6) {
                    block10: {
                        block11: {
                            int n7;
                            f f10;
                            block14: {
                                block12: {
                                    block13: {
                                        f10 = arrf[n5];
                                        if (bl3) break block9;
                                        if (bl3) break block10;
                                        if (f10 == net.minecraft.o.a.u) break block11;
                                        n7 = this.e();
                                        if (bl3) break block12;
                                        if (n7 == 0) break block13;
                                        n7 = f10.i();
                                        if (bl3) break block12;
                                        if (n7 != 0) break block11;
                                    }
                                    n7 = n2 & 1 << n5;
                                }
                                if (bl3) break block14;
                                if (n7 == 0) break block11;
                                n4 |= 1 << n5;
                                f10.f().b(m2);
                                m2.writeBytes(f10.c().a());
                                if (bl3) break block10;
                                n7 = bl2 ? 1 : 0;
                            }
                            if (n7 != 0) {
                                m2.writeBytes(f10.a().a());
                            }
                        }
                        ++n5;
                    }
                    if (!bl3) continue;
                }
                n3 = this.e();
                if (bl3) break block15;
                if (n3 != 0) {
                    m2.writeBytes(a10.g());
                }
            }
            n3 = n4;
        }
        return n3;
    }

    public a0(net.minecraft.o.a a10, int n2) {
        boolean bl2 = aD.c();
        boolean bl3 = bl2;
        this.e = a10.t;
        this.c = a10.i;
        int n3 = n2;
        if (!bl3) {
            n3 = n3 == 65535 ? 1 : 0;
        }
        this.b = n3;
        boolean bl4 = a10.z().D.h();
        this.f = new byte[this.a(a10, bl4, n2)];
        this.d = this.a(new m(this.f()), a10, bl4, n2);
        this.a = Lists.newArrayList();
        for (Map.Entry<n, y> entry : a10.l().entrySet()) {
            block7: {
                y y2;
                block6: {
                    int n4;
                    block5: {
                        n n5 = entry.getKey();
                        y2 = entry.getValue();
                        int n6 = n5.b() >> 4;
                        n4 = this.e();
                        if (bl3) break block5;
                        if (n4 != 0) break block6;
                        n4 = n2 & 1 << n6;
                    }
                    if (n4 == 0) break block7;
                }
                r r2 = y2.r();
                this.a.add(r2);
            }
            if (!bl3) continue;
        }
    }
}

