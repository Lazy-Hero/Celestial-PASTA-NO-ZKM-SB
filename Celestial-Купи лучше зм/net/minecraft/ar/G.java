/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package net.minecraft.ar;

import javax.annotation.Nullable;
import net.minecraft.U.B;
import net.minecraft.U.x;
import net.minecraft.ab.a;
import net.minecraft.ah.U;
import net.minecraft.ar.H;
import net.minecraft.ar.I;
import net.minecraft.ar.v;
import net.minecraft.at.h;
import net.minecraft.at.k;
import net.minecraft.i.j;
import net.minecraft.k.l;
import net.minecraft.z.f;

public class G {
    private /* synthetic */ boolean v;
    public static final /* synthetic */ G e;
    public static final /* synthetic */ G f;
    public static final /* synthetic */ G l;
    public static final /* synthetic */ G a;
    private /* synthetic */ boolean b;
    private /* synthetic */ boolean A;
    private /* synthetic */ boolean n;
    private /* synthetic */ boolean q;
    public static final /* synthetic */ G r;
    private /* synthetic */ boolean C;
    private /* synthetic */ boolean w;
    public static final /* synthetic */ G g;
    private /* synthetic */ float D;
    public static final /* synthetic */ G c;
    public static final /* synthetic */ G u;
    public static final /* synthetic */ G p;
    public static final /* synthetic */ G z;
    public static final /* synthetic */ G d;
    public /* synthetic */ String o;
    public static final /* synthetic */ G j;
    public static final /* synthetic */ G h;
    public static final /* synthetic */ G x;
    private /* synthetic */ boolean m;
    public static final /* synthetic */ G B;
    public static final /* synthetic */ G t;
    public static final /* synthetic */ G s;
    public static final /* synthetic */ G y;
    public static final /* synthetic */ G k;
    public static final /* synthetic */ G i;

    public static G a(x x2, B b10) {
        return new I("mob", x2, b10);
    }

    public static G b(@Nullable B b10) {
        return b10 != null ? new H("explosion.player", b10).g().d() : new G("explosion").g().d();
    }

    public static G a(j j2) {
        return new H("player", j2);
    }

    public static G a(x x2) {
        return new H("thorns", x2).a().v();
    }

    public boolean o() {
        return this.C;
    }

    public static G a(x x2, @Nullable x x3) {
        return new I("indirectMagic", x2, x3).u().v();
    }

    public float s() {
        return this.D;
    }

    public boolean b() {
        return this.m;
    }

    public G g() {
        this.A = true;
        return this;
    }

    protected G k() {
        this.q = true;
        this.D = 0.0f;
        return this;
    }

    protected G u() {
        this.w = true;
        this.D = 0.0f;
        return this;
    }

    public boolean j() {
        return this.b;
    }

    public G r() {
        this.C = true;
        return this;
    }

    public static G a(f f10, @Nullable x x2) {
        return new I("arrow", f10, x2).r();
    }

    public static G b(x x2, @Nullable x x3) {
        return new I("thrown", x2, x3).r();
    }

    public G d() {
        this.b = true;
        return this;
    }

    static {
        c = new G("inFire").p();
        g = new G("lightningBolt");
        x = new G("onFire").u().p();
        a = new G("lava").p();
        y = new G("hotFloor").p();
        t = new G("inWall").u();
        i = new G("cramming").u();
        u = new G("drown").u();
        j = new G("starve").u().k();
        p = new G("cactus");
        e = new G("fall").u();
        s = new G("flyIntoWall").u();
        l = new G("outOfWorld").u().e();
        B = new G("generic").u();
        f = new G("magic").u().v();
        k = new G("wither").u();
        r = new G("anvil");
        h = new G("fallingBlock");
        d = new G("dragonBreath").u();
        z = new G("fireworks").d();
    }

    public boolean l() {
        return this.q;
    }

    public boolean i() {
        return this.A;
    }

    @Nullable
    public x h() {
        return null;
    }

    protected G e() {
        this.m = true;
        return this;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static G a(@Nullable U u2) {
        G g10;
        block5: {
            U u3;
            block4: {
                int n2 = net.minecraft.ar.v.b();
                u3 = u2;
                if (n2 != 0) break block4;
                if (u3 == null) break block5;
                u3 = u2;
            }
            if (u3.d() != null) {
                g10 = new H("explosion.player", u2.d()).g().d();
                return g10;
            }
        }
        g10 = new G("explosion").g().d();
        return g10;
    }

    public boolean n() {
        return this.n;
    }

    protected G p() {
        this.n = true;
        return this;
    }

    public boolean a() {
        return this.v;
    }

    public String m() {
        return this.o;
    }

    public boolean f() {
        return this.w;
    }

    public static G a(B b10) {
        return new H("mob", b10);
    }

    @Nullable
    public l t() {
        return null;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public k c(B b10) {
        B b11 = b10.m();
        String string = "death.attack." + this.o;
        String string2 = string + ".player";
        return b11 != null && net.minecraft.ab.a.c(string2) ? new h(string2, b10.d(), b11.d()) : new h(string, b10.d());
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean c() {
        x x2 = this.h();
        int n2 = net.minecraft.ar.v.b();
        boolean bl2 = x2 instanceof j;
        if (n2 == 0) {
            if (!bl2) return false;
            bl2 = ((j)x2).cw.g;
        }
        if (n2 != 0) return bl2;
        if (!bl2) return false;
        return true;
    }

    protected G(String string) {
        this.D = 0.1f;
        this.o = string;
    }

    @Nullable
    public x q() {
        return this.h();
    }

    public G v() {
        this.v = true;
        return this;
    }

    public static G a(net.minecraft.z.j j2, @Nullable x x2) {
        return x2 == null ? new I("onFire", j2, j2).p().r() : new I("fireball", j2, x2).p().r();
    }
}

