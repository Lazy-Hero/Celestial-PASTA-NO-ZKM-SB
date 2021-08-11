/*
 * Decompiled with CFR 0.150.
 */
import java.util.Map;

final class ap
implements gw {
    final /* synthetic */ Map a;

    ap(Map map) {
        this.a = map;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void a(gg gg2, cM cM2) {
        Map map = this.a;
        synchronized (map) {
            this.a.put("Response", cM2);
            this.a.notifyAll();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void a(gg gg2, Exception exception) {
        Map map = this.a;
        synchronized (map) {
            this.a.put("Exception", exception);
            this.a.notifyAll();
        }
    }
}

