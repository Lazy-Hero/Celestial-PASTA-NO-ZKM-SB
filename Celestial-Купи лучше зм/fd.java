/*
 * Decompiled with CFR 0.150.
 */
import java.util.Iterator;
import net.minecraft.k.n;

final class fd
implements Iterable {
    final /* synthetic */ n b;
    final /* synthetic */ n a;

    fd(n n2, n n3) {
        this.a = n2;
        this.b = n3;
    }

    public Iterator iterator() {
        return new bw(this);
    }
}

