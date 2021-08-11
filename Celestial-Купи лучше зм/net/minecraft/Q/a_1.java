/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.Q;

import java.io.IOException;
import java.util.UUID;
import net.minecraft.C.K;
import net.minecraft.C.m;
import net.minecraft.Q.aD;
import net.minecraft.Q.av;
import net.minecraft.ah.R;
import net.minecraft.ah.d;
import net.minecraft.ah.i;
import net.minecraft.at.k;

public class a
implements K<net.minecraft.n.a> {
    private /* synthetic */ boolean d;
    private /* synthetic */ UUID c;
    private /* synthetic */ av h;
    private /* synthetic */ boolean b;
    private /* synthetic */ d g;
    private /* synthetic */ float f;
    private /* synthetic */ boolean e;
    private /* synthetic */ k i;
    private /* synthetic */ i a;

    @Override
    private void a(int n2) {
        boolean bl2 = aD.i();
        int n3 = n2 & 1;
        if (bl2) {
            n3 = n3 > 0 ? 1 : 0;
        }
        this.e = n3;
        int n4 = n2 & 2;
        if (bl2) {
            n4 = n4 > 0 ? 1 : 0;
        }
        this.b = n4;
        int n5 = n2 & 2;
        if (bl2) {
            n5 = n5 > 0 ? 1 : 0;
        }
        this.d = n5;
    }

    public boolean b() {
        return this.b;
    }

    public UUID g() {
        return this.c;
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    public i j() {
        return this.a;
    }

    public a() {
    }

    /*
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    public void a(m m2) throws IOException {
        this.c = m2.f();
        boolean bl2 = aD.c();
        a a10 = this;
        m m3 = m2;
        if (!bl2) {
            a10.h = m3.a(av.class);
            switch (this.h) {
                case ADD: {
                    this.i = m2.m();
                    this.f = m2.readFloat();
                    this.g = m2.a(d.class);
                    this.a = m2.a(i.class);
                    this.a(m2.readUnsignedByte());
                }
                default: {
                    if (!bl2) return;
                }
                case UPDATE_PCT: {
                    this.f = m2.readFloat();
                    if (!bl2) return;
                }
                case UPDATE_NAME: {
                    this.i = m2.m();
                    if (!bl2) return;
                }
                case UPDATE_STYLE: {
                    this.g = m2.a(d.class);
                    this.a = m2.a(i.class);
                    if (!bl2) return;
                }
                case UPDATE_PROPERTIES: 
            }
            a10 = this;
            m3 = m2;
        }
        a10.a(m3.readUnsignedByte());
    }

    public boolean e() {
        return this.e;
    }

    public boolean c() {
        return this.d;
    }

    public d d() {
        return this.g;
    }

    @Override
    public void b(m m2) throws IOException {
        boolean bl2 = aD.c();
        m2.a(this.c);
        boolean bl3 = bl2;
        m m3 = m2.a(this.h);
        if (!bl3) {
            switch (this.h) {
                case ADD: {
                    m2.a(this.i);
                    m2.writeFloat(this.f);
                    m2.a(this.g);
                    m2.a(this.a);
                    m2.writeByte(this.h());
                }
                default: {
                    if (!bl3) break;
                }
                case UPDATE_PCT: {
                    m2.writeFloat(this.f);
                    if (!bl3) break;
                }
                case UPDATE_NAME: {
                    m2.a(this.i);
                    if (!bl3) break;
                }
                case UPDATE_STYLE: {
                    m2.a(this.g);
                    m2.a(this.a);
                    if (!bl3) break;
                }
                case UPDATE_PROPERTIES: {
                    m3 = m2.writeByte(this.h());
                }
            }
        }
    }

    public k f() {
        return this.i;
    }

    private int h() {
        int n2 = 0;
        boolean bl2 = aD.c();
        int n3 = this.e;
        if (!bl2) {
            if (n3 != 0) {
                n2 |= 1;
            }
            n3 = this.b;
        }
        if (!bl2) {
            if (n3 != 0) {
                n2 |= 2;
            }
            n3 = this.d;
        }
        if (!bl2) {
            if (n3 != 0) {
                n2 |= 2;
            }
            n3 = n2;
        }
        return n3;
    }

    public av i() {
        return this.h;
    }

    public a(av av2, R r2) {
        this.h = av2;
        this.c = r2.g();
        this.i = r2.a();
        this.f = r2.e();
        this.g = r2.d();
        this.a = r2.h();
        this.e = r2.c();
        this.b = r2.b();
        this.d = r2.f();
    }

    @Override
    public void a(net.minecraft.n.a a10) {
        a10.a(this);
    }

    public float a() {
        return this.f;
    }
}

