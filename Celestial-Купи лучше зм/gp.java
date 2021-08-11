/*
 * Decompiled with CFR 0.150.
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import net.minecraft.Z.i;
import net.minecraft.client.x.P;
import net.minecraft.u.g;

public class gp {
    private final /* synthetic */ List<P> c;
    private final /* synthetic */ List<P> b;
    private final /* synthetic */ List<i> a;

    /*
     * Enabled aggressive block sorting
     */
    public i a(int n2) {
        i i2;
        block5: {
            int n3;
            block4: {
                String string = K.d();
                n3 = n2;
                if (string != null) break block4;
                if (n3 < 0) break block5;
                n3 = n2;
            }
            if (n3 < this.a.size()) {
                i2 = this.a.get(n2);
                return i2;
            }
        }
        i2 = g.bf.d();
        return i2;
    }

    public void a(P p2, i i2) {
        this.c.add(p2);
        this.a.add(i2);
    }

    public List<P> a(P p2) {
        this.b.set(0, p2);
        return this.b;
    }

    public int a() {
        return this.c.size();
    }

    public void b() {
        this.c.clear();
        this.a.clear();
    }

    public P b(int n2) {
        return this.c.get(n2);
    }

    public gp() {
        this.c = new ArrayList<P>();
        this.a = new ArrayList<i>();
        this.b = Arrays.asList(new P[0]);
    }

    private static gP a(gP gP2) {
        return gP2;
    }
}

