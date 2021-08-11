/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.client.b.l;
import net.minecraft.k.m;

public class Q {
    private final /* synthetic */ String b;
    private final /* synthetic */ gD a;
    public /* synthetic */ double d;
    private final /* synthetic */ ex g;
    private final /* synthetic */ ef c;
    private final /* synthetic */ int f;
    private final /* synthetic */ String e;
    private final /* synthetic */ gu h;

    public int b() {
        return Math.max(100, Math.max(this.h.b(this.b), this.h.b(this.e)) + 40);
    }

    public Q(String string, String string2, gD gD2, int n2, gu gu2) {
        this.b = string;
        this.e = string2;
        this.f = n2;
        this.a = gD2;
        this.c = new ef();
        String string3 = gD.b();
        this.h = gu2;
        l l2 = new l(net.minecraft.client.Q.P());
        this.g = new ex(l2.e() - this.b(), l2.a() - 30);
        if (string3 == null) {
            m.b(!m.d());
        }
    }

    public int c() {
        return this.f;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public ef g() {
        return this.c;
    }

    public String e() {
        return this.e;
    }

    public String d() {
        return this.b;
    }

    public gD f() {
        return this.a;
    }

    public ex a() {
        return this.g;
    }
}

