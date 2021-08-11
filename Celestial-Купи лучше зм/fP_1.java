/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.client.q.a;
import net.minecraft.client.w.n;

public class fP {
    private /* synthetic */ boolean b;
    private /* synthetic */ gb[] a;

    private static gP a(gP gP2) {
        return gP2;
    }

    public void a(gb gb2) {
        this.a = (gb[])fU.a((Object[])this.a, (Object)gb2);
    }

    public void a(n n2, a a10, float f10, float f11) {
        block4: {
            int n3;
            String string;
            block3: {
                string = K.d();
                int n4 = this.b;
                if (string != null) break block3;
                if (n4 == 0) break block4;
                n4 = n3 = 0;
            }
            while (n3 < this.a.length) {
                gb gb2 = this.a[n3];
                gb2.a(n2, a10, f10, f11);
                ++n3;
                if (string == null) continue;
            }
        }
    }

    public gb[] a() {
        return this.a;
    }

    public boolean b() {
        return this.b;
    }

    public fP() {
        this.a = new gb[0];
        this.b = false;
    }

    public void a(boolean bl2) {
        this.b = bl2;
    }
}

