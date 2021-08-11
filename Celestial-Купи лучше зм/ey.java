/*
 * Decompiled with CFR 0.150.
 */
import java.util.Map;

public class ey
extends Thread {
    private final /* synthetic */ String b;
    private final /* synthetic */ eL a;
    private final /* synthetic */ Map d;
    private final /* synthetic */ byte[] c;

    public eL a() {
        return this.a;
    }

    public ey(String string, Map map, byte[] arrby, eL eL2) {
        this.b = string;
        this.d = map;
        this.c = arrby;
        this.a = eL2;
    }

    public byte[] c() {
        return this.c;
    }

    public String b() {
        return this.b;
    }

    @Override
    public void run() {
        try {
            ec.a(this.b, this.d, this.c);
            this.a.a(this.b, this.c, null);
        }
        catch (Exception exception) {
            this.a.a(this.b, this.c, exception);
        }
    }
}

