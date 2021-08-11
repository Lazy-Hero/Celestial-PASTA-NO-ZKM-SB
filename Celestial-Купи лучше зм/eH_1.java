/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.ARBShaderObjects
 */
import org.lwjgl.opengl.ARBShaderObjects;

public abstract class eH {
    private /* synthetic */ int a;
    private final /* synthetic */ String c;
    private /* synthetic */ int b;

    public int e() {
        return this.a;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public eH(String string) {
        this.a = -1;
        this.b = -1;
        this.c = string;
    }

    public int a() {
        return this.b;
    }

    public String b() {
        return this.c;
    }

    public void a(int n2) {
        block3: {
            eH eH2;
            block2: {
                String string = dB.i();
                eH2 = this;
                if (string == null) break block2;
                if (eH2.a == n2) break block3;
                this.a = n2;
                this.b = ARBShaderObjects.glGetUniformLocationARB((int)n2, (CharSequence)this.c);
                eH2 = this;
            }
            eH2.d();
        }
    }

    public boolean c() {
        String string = dB.i();
        boolean bl2 = this.b;
        if (string != null) {
            bl2 = bl2 >= false;
        }
        return bl2;
    }

    protected abstract void d();
}

