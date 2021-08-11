/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL20
 */
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import net.minecraft.k.m;
import org.lwjgl.opengl.GL20;

public class c0 {
    private final /* synthetic */ int e;
    private static /* synthetic */ m[] d;
    private final /* synthetic */ int c;
    private final /* synthetic */ int b;
    private final /* synthetic */ int a;

    static {
        if (c0.b() == null) {
            c0.b(new m[1]);
        }
    }

    public c0(String string) throws IOException {
        m[] arrm = c0.b();
        int n2 = GL20.glCreateProgram();
        m[] arrm2 = arrm;
        GL20.glAttachShader((int)n2, (int)this.a(c0.class.getResourceAsStream("/passthrough.vsh"), 35633));
        GL20.glAttachShader((int)n2, (int)this.a(c0.class.getResourceAsStream(string), 35632));
        GL20.glLinkProgram((int)n2);
        this.c = n2;
        GL20.glUseProgram((int)n2);
        this.b = GL20.glGetUniformLocation((int)n2, (CharSequence)"time");
        this.a = GL20.glGetUniformLocation((int)n2, (CharSequence)"mouse");
        this.e = GL20.glGetUniformLocation((int)n2, (CharSequence)"resolution");
        GL20.glUseProgram((int)0);
        if (arrm2 == null) {
            m.b(!m.c());
        }
    }

    public static m[] b() {
        return d;
    }

    private int a(InputStream inputStream, int n2) throws IOException {
        int n3 = GL20.glCreateShader((int)n2);
        GL20.glShaderSource((int)n3, (CharSequence)this.a(inputStream));
        GL20.glCompileShader((int)n3);
        return n3;
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    public void a(int n2, int n3, float f10, float f11, float f12) {
        block0: {
            m[] arrm = c0.b();
            GL20.glUseProgram((int)this.c);
            m[] arrm2 = arrm;
            GL20.glUniform2f((int)this.e, (float)n2, (float)n3);
            GL20.glUniform2f((int)this.a, (float)(f10 / (float)n2), (float)(1.0f - f11 / (float)n3));
            GL20.glUniform1f((int)this.b, (float)f12);
            if (!m.c()) break block0;
            c0.b(new m[5]);
        }
    }

    public static void b(m[] arrm) {
        d = arrm;
    }

    private String a(InputStream inputStream) throws IOException {
        int n2;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] arrby = new byte[512];
        m[] arrm = c0.b();
        while ((n2 = inputStream.read(arrby, 0, arrby.length)) != -1) {
            byteArrayOutputStream.write(arrby, 0, n2);
            if (arrm != null) continue;
        }
        return new String(byteArrayOutputStream.toByteArray(), StandardCharsets.UTF_8);
    }
}

