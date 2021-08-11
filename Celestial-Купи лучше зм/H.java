/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.client.Q;

public class H
extends Thread {
    private /* synthetic */ dl a;
    private /* synthetic */ String b;

    @Override
    public void run() {
        try {
            byte[] arrby = gh.b(this.b, Q.P().au());
            this.a.a(this.b, arrby, null);
        }
        catch (Exception exception) {
            this.a.a(this.b, null, exception);
        }
    }

    public String b() {
        return this.b;
    }

    public H(String string, dl dl2) {
        this.b = null;
        this.a = null;
        this.b = string;
        this.a = dl2;
    }

    public dl a() {
        return this.a;
    }
}

