/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.Q;

import java.io.IOException;
import java.util.Collection;
import net.minecraft.C.K;
import net.minecraft.C.m;
import net.minecraft.Q.aD;
import net.minecraft.aw.C;
import net.minecraft.aw.i;
import net.minecraft.aw.s;
import net.minecraft.n.a;

public class aR
implements K<a> {
    private /* synthetic */ int c;
    private /* synthetic */ int e;
    private /* synthetic */ int a;
    private /* synthetic */ i[] d;
    private /* synthetic */ int i;
    private /* synthetic */ int f;
    private /* synthetic */ byte[] b;
    private /* synthetic */ byte g;
    private /* synthetic */ boolean h;

    public aR() {
    }

    @Override
    public void a(m m2) throws IOException {
        block8: {
            block7: {
                boolean bl2;
                block6: {
                    this.i = m2.a();
                    bl2 = aD.i();
                    this.g = m2.readByte();
                    this.h = m2.readBoolean();
                    this.d = new i[m2.a()];
                    for (int i2 = 0; i2 < this.d.length; ++i2) {
                        short s2 = m2.readByte();
                        this.d[i2] = new i(C.a((byte)(s2 >> 4 & 0xF)), m2.readByte(), m2.readByte(), (byte)(s2 & 0xF));
                        if (bl2) {
                            if (bl2) continue;
                        }
                        break block6;
                    }
                    this.a = m2.readUnsignedByte();
                }
                aR aR2 = this;
                if (!bl2) break block7;
                if (aR2.a <= 0) break block8;
                this.c = m2.readUnsignedByte();
                this.f = m2.readUnsignedByte();
                this.e = m2.readUnsignedByte();
                aR2 = this;
            }
            aR2.b = m2.c();
        }
    }

    @Override
    public void a(a a10) {
        a10.a(this);
    }

    public int a() {
        return this.i;
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    public aR(int n2, byte by2, boolean bl2, Collection<i> collection, byte[] arrby, int n3, int n4, int n5, int n6) {
        boolean bl3 = aD.c();
        this.i = n2;
        this.g = by2;
        this.h = bl2;
        this.d = collection.toArray(new i[collection.size()]);
        this.f = n3;
        this.e = n4;
        this.a = n5;
        boolean bl4 = bl3;
        this.c = n6;
        this.b = new byte[n5 * n6];
        int n7 = 0;
        while (n7 < n5) {
            block3: {
                for (int i2 = 0; i2 < n6; ++i2) {
                    this.b[n7 + i2 * n5] = arrby[n3 + n7 + (n4 + i2) * 128];
                    if (!bl4) {
                        if (!bl4) continue;
                    }
                    break block3;
                }
                ++n7;
            }
            if (!bl4) continue;
        }
    }

    @Override
    public void a(s s2) {
        int n2;
        boolean bl2;
        block5: {
            s2.c = this.g;
            boolean bl3 = aD.i();
            s2.g = this.h;
            s2.i.clear();
            bl2 = bl3;
            for (n2 = 0; n2 < this.d.length; ++n2) {
                i i2 = this.d[n2];
                s2.i.put("icon-" + n2, i2);
                if (bl2) {
                    if (bl2) continue;
                }
                break block5;
            }
            n2 = 0;
        }
        while (n2 < this.a) {
            block6: {
                for (int i3 = 0; i3 < this.c; ++i3) {
                    s2.l[this.f + n2 + (this.e + i3) * 128] = this.b[n2 + i3 * this.a];
                    if (bl2) {
                        if (bl2) continue;
                    }
                    break block6;
                }
                ++n2;
            }
            if (bl2) continue;
        }
    }

    @Override
    public void b(m m2) throws IOException {
        block8: {
            block7: {
                boolean bl2;
                block6: {
                    m2.d(this.i);
                    m2.writeByte(this.g);
                    m2.writeBoolean(this.h);
                    m2.d(this.d.length);
                    i[] arri = this.d;
                    int n2 = arri.length;
                    bl2 = aD.c();
                    for (int i2 = 0; i2 < n2; ++i2) {
                        i i3 = arri[i2];
                        m2.writeByte((i3.d() & 0xF) << 4 | i3.b() & 0xF);
                        m2.writeByte(i3.a());
                        m2.writeByte(i3.c());
                        if (!bl2) {
                            if (!bl2) continue;
                        }
                        break block6;
                    }
                    m2.writeByte(this.a);
                }
                if (bl2) break block7;
                if (this.a <= 0) break block8;
                m2.writeByte(this.c);
                m2.writeByte(this.f);
                m2.writeByte(this.e);
            }
            m2.a(this.b);
        }
    }
}

