/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.client.j.d;
import net.minecraft.client.j.p;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class aj
implements bu {
    private /* synthetic */ String a;
    private /* synthetic */ d c;
    private /* synthetic */ int b;

    @Override
    public int a() {
        return this.b;
    }

    public d a() {
        return this.c;
    }

    public String b() {
        return this.a;
    }

    @Override
    public int b() {
        return this.c.c();
    }

    @Override
    public void c() {
        p.c(this.c.c());
    }

    public String toString() {
        return "textureUnit: " + this.b + ", path: " + this.a + ", glTextureId: " + this.c.c();
    }

    public aj(int n2, String string, d d10) {
        this.b = -1;
        this.a = null;
        this.c = null;
        this.b = n2;
        this.a = string;
        this.c = d10;
    }
}

