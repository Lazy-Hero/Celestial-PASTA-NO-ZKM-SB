/*
 * Decompiled with CFR 0.150.
 */
import java.util.Iterator;
import net.minecraft.client.a.aC;
import net.minecraft.client.k.s;
import net.minecraft.k.n;

public class dP
implements Iterator<s> {
    private final /* synthetic */ dd a;
    private final /* synthetic */ aC b;
    private final /* synthetic */ fZ c;

    @Override
    public void remove() {
        throw new RuntimeException("Not implemented");
    }

    @Override
    public boolean hasNext() {
        return this.a.hasNext();
    }

    public dP(aC aC2, n n2, n n3, int n4, int n5) {
        this.c = new fZ(0, 0, 0);
        this.b = aC2;
        this.a = new dd(n2, n3, n4, n5);
    }

    public s a() {
        n n2 = this.a.a();
        this.c.a(n2.e() << 4, n2.b() << 4, n2.a() << 4);
        s s2 = this.b.a(this.c);
        return s2;
    }
}

