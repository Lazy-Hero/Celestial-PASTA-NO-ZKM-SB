/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.GameProfile
 *  org.apache.commons.lang3.ArrayUtils
 */
package net.minecraft.client.o;

import com.mojang.authlib.GameProfile;
import net.minecraft.C.P;
import net.minecraft.C.u;
import net.minecraft.at.g;
import net.minecraft.at.h;
import net.minecraft.at.k;
import net.minecraft.at.l;
import net.minecraft.client.Q;
import net.minecraft.client.o.j;
import net.minecraft.client.o.o;
import net.minecraft.f.a;
import net.minecraft.f.b;
import org.apache.commons.lang3.ArrayUtils;

class d
implements net.minecraft.F.b {
    private /* synthetic */ boolean a;
    final /* synthetic */ net.minecraft.client.E.a e;
    final /* synthetic */ u f;
    private /* synthetic */ long c;
    private /* synthetic */ boolean d;
    final /* synthetic */ o b;

    @Override
    public void a(a a10) {
        long l2 = this.c;
        long l3 = Q.aj();
        this.e.b = l3 - l2;
        this.f.a(new g("Finished"));
    }

    d(o o2, u u2, net.minecraft.client.E.a a10) {
        this.b = o2;
        this.f = u2;
        this.e = a10;
    }

    @Override
    public void a(k k2) {
        block3: {
            d d10;
            block2: {
                int[] arrn = j.b();
                d10 = this;
                if (arrn == null) break block2;
                if (d10.a) break block3;
                o.b().error("Can't ping {}: {}", (Object)this.e.h, (Object)k2.f());
                this.e.k = (Object)((Object)l.DARK_RED) + net.minecraft.client.D.h.a("multiplayer.status.cannot_connect", new Object[0]);
                this.e.j = "";
                d10 = this;
            }
            o.a(d10.b, this.e);
        }
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    public void a(b b10) {
        block31: {
            block48: {
                block44: {
                    int[] arrn;
                    block47: {
                        block46: {
                            block45: {
                                CharSequence charSequence;
                                block43: {
                                    P p2;
                                    P p3;
                                    block39: {
                                        block40: {
                                            block38: {
                                                block42: {
                                                    CharSequence charSequence2;
                                                    int n2;
                                                    block41: {
                                                        block28: {
                                                            net.minecraft.C.j j2;
                                                            block37: {
                                                                block36: {
                                                                    block35: {
                                                                        block34: {
                                                                            block33: {
                                                                                block32: {
                                                                                    block29: {
                                                                                        d d10;
                                                                                        block30: {
                                                                                            arrn = j.b();
                                                                                            d10 = this;
                                                                                            if (arrn == null) break block29;
                                                                                            if (!d10.d) break block30;
                                                                                            this.f.a(new h("multiplayer.status.unrequested", new Object[0]));
                                                                                            if (arrn != null) break block31;
                                                                                        }
                                                                                        d10 = this;
                                                                                    }
                                                                                    d10.d = true;
                                                                                    p3 = b10.a();
                                                                                    if (arrn == null) break block32;
                                                                                    if (p3.c() == null) break block33;
                                                                                    this.e.k = p3.c().a();
                                                                                }
                                                                                if (arrn != null) break block34;
                                                                            }
                                                                            this.e.k = "";
                                                                        }
                                                                        if (p3.d() == null) break block35;
                                                                        this.e.i = p3.d().a();
                                                                        this.e.g = p3.d().b();
                                                                        if (arrn != null) break block36;
                                                                    }
                                                                    this.e.i = net.minecraft.client.D.h.a("multiplayer.status.old", new Object[0]);
                                                                    this.e.g = 0;
                                                                }
                                                                j2 = p3.b();
                                                                if (arrn == null) break block37;
                                                                if (j2 == null) break block38;
                                                                this.e.j = (Object)((Object)l.GRAY) + "" + p3.b().c() + "" + (Object)((Object)l.DARK_GRAY) + "/" + (Object)((Object)l.GRAY) + p3.b().a();
                                                                p2 = p3;
                                                                if (arrn == null) break block39;
                                                                j2 = p2.b();
                                                            }
                                                            if (!ArrayUtils.isNotEmpty((Object[])j2.b())) break block40;
                                                            charSequence = new StringBuilder();
                                                            for (GameProfile gameProfile : p3.b().b()) {
                                                                CharSequence charSequence3 = charSequence;
                                                                if (arrn == null) continue;
                                                                n2 = ((StringBuilder)charSequence3).length();
                                                                if (arrn != null) {
                                                                    if (n2 > 0) {
                                                                        ((StringBuilder)charSequence).append("\n");
                                                                    }
                                                                    charSequence3 = ((StringBuilder)charSequence).append(gameProfile.getName());
                                                                    if (arrn != null) continue;
                                                                }
                                                                break block28;
                                                            }
                                                            n2 = p3.b().b().length;
                                                        }
                                                        if (arrn == null) break block41;
                                                        if (n2 >= p3.b().c()) break block42;
                                                        charSequence2 = charSequence;
                                                        if (arrn == null) break block42;
                                                        n2 = ((StringBuilder)charSequence2).length();
                                                    }
                                                    if (n2 > 0) {
                                                        ((StringBuilder)charSequence).append("\n");
                                                    }
                                                    charSequence2 = ((StringBuilder)charSequence).append(net.minecraft.client.D.h.a("multiplayer.status.and_more", p3.b().c() - p3.b().b().length));
                                                }
                                                this.e.d = ((StringBuilder)charSequence).toString();
                                                if (arrn != null) break block40;
                                            }
                                            this.e.j = (Object)((Object)l.DARK_GRAY) + net.minecraft.client.D.h.a("multiplayer.status.unknown", new Object[0]);
                                        }
                                        p2 = p3;
                                    }
                                    CharSequence charSequence4 = p2.a();
                                    if (arrn == null) break block43;
                                    if (charSequence4 == null) break block44;
                                    charSequence4 = charSequence = p3.a();
                                }
                                if (arrn == null) break block45;
                                if (!((String)charSequence).startsWith("data:image/png;base64,")) break block46;
                                this.e.a(((String)charSequence).substring("data:image/png;base64,".length()));
                            }
                            if (arrn != null) break block47;
                        }
                        o.b().error("Invalid server icon (unknown format)");
                    }
                    if (arrn != null) break block48;
                }
                this.e.a((String)null);
            }
            this.c = Q.aj();
            this.f.a(new net.minecraft.H.a(this.c));
            this.a = true;
        }
    }
}

