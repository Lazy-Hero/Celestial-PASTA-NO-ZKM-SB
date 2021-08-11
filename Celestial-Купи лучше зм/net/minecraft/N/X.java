/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Iterables
 *  com.mojang.authlib.GameProfile
 *  com.mojang.authlib.minecraft.MinecraftSessionService
 *  com.mojang.authlib.properties.Property
 *  javax.annotation.Nullable
 */
package net.minecraft.N;

import com.google.common.collect.Iterables;
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.minecraft.MinecraftSessionService;
import com.mojang.authlib.properties.Property;
import javax.annotation.Nullable;
import net.minecraft.N.j;
import net.minecraft.N.y;
import net.minecraft.P.c;
import net.minecraft.P.r;
import net.minecraft.Q.ag;
import net.minecraft.W.aY;
import net.minecraft.a.o;
import net.minecraft.ah.z;
import net.minecraft.ar.aA;
import net.minecraft.ar.aD;
import net.minecraft.ar.ae;
import net.minecraft.ar.ao;
import net.minecraft.ar.h;
import net.minecraft.k.m;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class X
extends y
implements ao {
    private static /* synthetic */ o k;
    private /* synthetic */ int l;
    private /* synthetic */ boolean n;
    private static /* synthetic */ MinecraftSessionService i;
    private /* synthetic */ int o;
    private /* synthetic */ int j;
    private /* synthetic */ GameProfile m;

    @Override
    public void a(ae ae2) {
        block3: {
            block4: {
                X x2;
                z z2;
                block2: {
                    m[] arrm = net.minecraft.N.j.f();
                    z2 = this.a;
                    if (arrm != null) break block2;
                    if (z2 == null) break block3;
                    x2 = this;
                    if (arrm != null) break block4;
                    z2 = x2.a;
                }
                if (z2.d(this.j()).b(aY.I) != aA.UP) break block3;
                x2 = this;
            }
            x2.j = ae2.a(this.j, 16);
        }
    }

    public int a() {
        return this.l;
    }

    @Nullable
    public GameProfile b() {
        return this.m;
    }

    @Override
    public r r() {
        return this.a(new r());
    }

    @Override
    @Nullable
    public ag k() {
        return new ag(this.d, 4, this.r());
    }

    private void d() {
        this.m = X.b(this.m);
        this.b();
    }

    @Override
    public void c(r r2) {
        block3: {
            block7: {
                String string;
                r r3;
                m[] arrm;
                block6: {
                    int n2;
                    block4: {
                        block5: {
                            block2: {
                                m[] arrm2 = net.minecraft.N.j.f();
                                super.c(r2);
                                arrm = arrm2;
                                this.l = r2.r("SkullType");
                                this.j = r2.r("Rot");
                                n2 = this.l;
                                if (arrm != null) break block2;
                                if (n2 != 3) break block3;
                                n2 = r2.a("Owner", 10) ? 1 : 0;
                            }
                            if (arrm != null) break block4;
                            if (n2 == 0) break block5;
                            this.m = net.minecraft.P.c.a(r2.h("Owner"));
                            if (arrm == null) break block3;
                        }
                        r3 = r2;
                        string = "ExtraType";
                        if (arrm != null) break block6;
                        n2 = r3.a(string, 8) ? 1 : 0;
                    }
                    if (n2 == 0) break block3;
                    r3 = r2;
                    string = "ExtraType";
                }
                String string2 = r3.j(string);
                if (arrm != null) break block7;
                if (aD.a(string2)) break block3;
                this.m = new GameProfile(null, string2);
            }
            this.d();
        }
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public int c() {
        return this.j;
    }

    public void b(int n2) {
        this.l = n2;
        this.m = null;
    }

    @Override
    public r a(r r2) {
        m[] arrm = net.minecraft.N.j.f();
        super.a(r2);
        m[] arrm2 = arrm;
        r2.a("SkullType", (byte)(this.l & 0xFF));
        r r3 = r2;
        if (arrm2 == null) {
            r3.a("Rot", (byte)(this.j & 0xFF));
            if (this.m != null) {
                r r4 = new r();
                net.minecraft.P.c.a(r4, this.m);
                r2.a("Owner", r4);
            }
            r3 = r2;
        }
        return r3;
    }

    @Override
    public void c() {
        block3: {
            block4: {
                X x2;
                block5: {
                    int n2;
                    m[] arrm;
                    block2: {
                        arrm = net.minecraft.N.j.f();
                        n2 = this.l;
                        if (arrm != null) break block2;
                        if (n2 != 5) break block3;
                        x2 = this;
                        if (arrm != null) break block4;
                        n2 = x2.a.x(this.d) ? 1 : 0;
                    }
                    if (n2 == 0) break block5;
                    this.n = true;
                    ++this.o;
                    if (arrm == null) break block3;
                }
                x2 = this;
            }
            x2.n = false;
        }
    }

    public static GameProfile b(GameProfile gameProfile) {
        GameProfile gameProfile2;
        block7: {
            block8: {
                m[] arrm;
                block10: {
                    GameProfile gameProfile3;
                    block11: {
                        boolean bl2;
                        block9: {
                            arrm = net.minecraft.N.j.f();
                            gameProfile2 = gameProfile;
                            if (arrm != null) break block7;
                            if (gameProfile2 == null) break block8;
                            gameProfile2 = gameProfile;
                            if (arrm != null) break block7;
                            if (aD.a(gameProfile2.getName())) break block8;
                            bl2 = gameProfile.isComplete();
                            if (arrm != null) break block9;
                            if (!bl2) break block10;
                            gameProfile3 = gameProfile;
                            if (arrm != null) break block11;
                            bl2 = gameProfile3.getProperties().containsKey((Object)"textures");
                        }
                        if (!bl2) break block10;
                        gameProfile3 = gameProfile;
                    }
                    return gameProfile3;
                }
                if (k != null && i != null) {
                    Property property;
                    GameProfile gameProfile4;
                    Object object = gameProfile4 = k.a(gameProfile.getName());
                    if (arrm == null) {
                        if (object == null) {
                            return gameProfile;
                        }
                        object = Iterables.getFirst((Iterable)gameProfile4.getProperties().get((Object)"textures"), null);
                    }
                    if ((property = (Property)object) == null) {
                        gameProfile4 = i.fillProfileProperties(gameProfile4, true);
                    }
                    return gameProfile4;
                }
                return gameProfile;
            }
            gameProfile2 = gameProfile;
        }
        return gameProfile2;
    }

    /*
     * Enabled aggressive block sorting
     */
    public float a(float f10) {
        float f11;
        m[] arrm = net.minecraft.N.j.f();
        int n2 = this.n;
        if (arrm == null) {
            if (n2 != 0) {
                f11 = (float)this.o + f10;
                return f11;
            }
            n2 = this.o;
        }
        f11 = n2;
        return f11;
    }

    public void a(int n2) {
        this.j = n2;
    }

    @Override
    public void a(h h2) {
        block3: {
            block4: {
                X x2;
                z z2;
                block2: {
                    m[] arrm = net.minecraft.N.j.f();
                    z2 = this.a;
                    if (arrm != null) break block2;
                    if (z2 == null) break block3;
                    x2 = this;
                    if (arrm != null) break block4;
                    z2 = x2.a;
                }
                if (z2.d(this.j()).b(aY.I) != aA.UP) break block3;
                x2 = this;
            }
            x2.j = h2.a(this.j, 16);
        }
    }

    public static void a(MinecraftSessionService minecraftSessionService) {
        i = minecraftSessionService;
    }

    public static void a(o o2) {
        k = o2;
    }

    public void a(@Nullable GameProfile gameProfile) {
        this.l = 3;
        this.m = gameProfile;
        this.d();
    }
}

