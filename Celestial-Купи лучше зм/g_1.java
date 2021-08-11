/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.client.w.c;
import net.minecraft.client.w.n;

public class g {
    private /* synthetic */ int a;
    private /* synthetic */ c b;

    private static gP a(gP gP2) {
        return gP2;
    }

    public g(int n2, c c10) {
        this.a = 0;
        this.b = null;
        this.a = n2;
        this.b = c10;
    }

    public c a() {
        return this.b;
    }

    public void a(n n2, float f10) {
        c c10 = gb.a(n2, this.a);
        String string = K.d();
        c c11 = c10;
        if (string == null) {
            if (c11 != null) {
                c10.a(f10);
            }
            c11 = this.b;
        }
        c11.b(f10);
    }
}

