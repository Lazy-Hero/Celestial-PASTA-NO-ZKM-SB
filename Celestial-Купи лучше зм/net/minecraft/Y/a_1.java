/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package net.minecraft.y;

import java.io.IOException;
import java.util.ArrayList;
import javax.annotation.Nullable;
import net.minecraft.C.m;
import net.minecraft.P.c;
import net.minecraft.P.r;
import net.minecraft.P.u;
import net.minecraft.w.d;
import net.minecraft.y.b;

public class a
extends ArrayList<b> {
    public void a(m m2) {
        m2.writeByte((byte)(this.size() & 0xFF));
        int n2 = 0;
        String string = b.f();
        while (n2 < this.size()) {
            b b10 = (b)this.get(n2);
            m2.a(b10.k());
            m2.a(b10.l());
            d d10 = b10.d();
            boolean bl2 = d10.G();
            if (string == null) {
                bl2 = !bl2;
            }
            m2.writeBoolean(bl2);
            if (string == null) {
                if (!d10.G()) {
                    m2.a(d10);
                }
                m2.writeBoolean(b10.j());
                m2.writeInt(b10.c());
                m2.writeInt(b10.b());
                ++n2;
            }
            if (string == null) continue;
        }
    }

    public r a() {
        r r2;
        block2: {
            r2 = new r();
            u u2 = new u();
            String string = b.f();
            for (int i2 = 0; i2 < this.size(); ++i2) {
                b b10 = (b)this.get(i2);
                u2.a(b10.e());
                if (string == null) {
                    if (string == null) continue;
                }
                break block2;
            }
            r2.a("Recipes", u2);
        }
        return r2;
    }

    public static a b(m m2) throws IOException {
        a a10 = new a();
        int n2 = m2.readByte() & 0xFF;
        String string = b.f();
        for (int i2 = 0; i2 < n2; ++i2) {
            d d10 = m2.j();
            d d11 = m2.j();
            d d12 = d.m;
            boolean bl2 = m2.readBoolean();
            if (string == null) {
                if (bl2) {
                    d12 = m2.j();
                }
                bl2 = m2.readBoolean();
            }
            boolean bl3 = bl2;
            int n3 = m2.readInt();
            int n4 = m2.readInt();
            b b10 = new b(d10, d12, d11, n3, n4);
            boolean bl4 = bl3;
            if (string != null) continue;
            if (bl4) {
                b10.a();
            }
            bl4 = a10.add(b10);
            if (string == null) continue;
        }
        return a10;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private boolean a(d d10, d d11) {
        String string = b.f();
        boolean bl2 = d.c(d10, d11);
        if (string == null) {
            if (!bl2) return false;
            bl2 = d11.x();
        }
        if (string != null) return bl2;
        if (!bl2) return true;
        bl2 = d10.x();
        if (string == null) {
            if (!bl2) return false;
            bl2 = c.a(d11.v(), d10.v(), false);
        }
        if (string != null) return bl2;
        if (!bl2) return false;
        return true;
    }

    public a() {
    }

    public void a(r r2) {
        u u2 = r2.c("Recipes", 10);
        String string = b.f();
        for (int i2 = 0; i2 < u2.b(); ++i2) {
            r r3 = u2.d(i2);
            this.add(new b(r3));
            if (string == null) continue;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Nullable
    public b a(d d10, d d11, int n2) {
        int n3;
        String string;
        block18: {
            block19: {
                b b10;
                block25: {
                    int n4;
                    block24: {
                        block22: {
                            block23: {
                                block20: {
                                    block21: {
                                        string = b.f();
                                        n3 = n2;
                                        if (string != null) break block18;
                                        if (n3 <= 0) break block19;
                                        n3 = n2;
                                        if (string != null) break block18;
                                        if (n3 >= this.size()) break block19;
                                        b10 = (b)this.get(n2);
                                        n4 = this.a(d10, b10.k());
                                        if (string == null) {
                                            if (n4 == 0) return null;
                                            n4 = d11.G();
                                        }
                                        if (string != null) break block20;
                                        if (n4 == 0) break block21;
                                        n4 = b10.i();
                                        if (string != null) break block22;
                                        if (n4 == 0) break block23;
                                    }
                                    n4 = b10.i();
                                }
                                if (string == null) {
                                    if (n4 == 0) return null;
                                    n4 = this.a(d11, b10.d()) ? 1 : 0;
                                }
                                if (string != null) break block22;
                                if (n4 == 0) return null;
                            }
                            n4 = d10.t();
                        }
                        if (string == null) {
                            if (n4 < b10.k().t()) return null;
                            n4 = b10.i() ? 1 : 0;
                        }
                        if (string != null) break block24;
                        if (n4 == 0) break block25;
                        n4 = d11.t();
                    }
                    if (n4 < b10.d().t()) {
                        return null;
                    }
                }
                b b11 = b10;
                return b11;
            }
            n3 = 0;
        }
        int n5 = n3;
        do {
            block26: {
                int n6;
                b b12;
                block31: {
                    block30: {
                        block28: {
                            block29: {
                                block27: {
                                    if (n5 >= this.size()) return null;
                                    b12 = (b)this.get(n5);
                                    if (string != null) continue;
                                    if (!this.a(d10, b12.k())) break block26;
                                    n6 = d10.t();
                                    if (string != null) break block27;
                                    if (n6 < b12.k().t()) break block26;
                                    n6 = b12.i() ? 1 : 0;
                                }
                                if (string != null) break block28;
                                if (n6 != 0) break block29;
                                n6 = d11.G() ? 1 : 0;
                                if (string != null) break block28;
                                if (n6 != 0) return b12;
                            }
                            n6 = b12.i() ? 1 : 0;
                        }
                        if (string != null) break block30;
                        if (n6 == 0) break block26;
                        n6 = this.a(d11, b12.d()) ? 1 : 0;
                    }
                    if (string != null) break block31;
                    if (n6 == 0) break block26;
                    n6 = d11.t();
                }
                if (n6 >= b12.d().t()) {
                    return b12;
                }
            }
            ++n5;
        } while (string == null);
        return null;
    }

    public a(r r2) {
        this.a(r2);
    }

    private static Exception a(Exception exception) {
        return exception;
    }
}

