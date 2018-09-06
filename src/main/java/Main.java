import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.StringWriter;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;
import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.VelocityEngine;

public class Main {

  public static final String INP = "{\"id\": \"Hello, world!\"}";

  public static void main(String[] args) throws Exception {
    VelocityEngine velocityEngine = new VelocityEngine();
    velocityEngine.init();

    Template t = velocityEngine.getTemplate("templates/test.vm");

//    final Gson gson = new Gson();
//    Type type = new TypeToken<Map<String, Map<String, String>>>(){}.getType();
//    final HashMap<String, Map<String, String>> hashMap = gson.fromJson(INP, type);

//    System.out.println("hashMap = " + hashMap);

    VelocityContext arguments = new VelocityContext();
//
    HashMap mp = new HashMap();
    mp.put("id", "vn6wlyfeno0");
//
//    arguments.put("id", "vn6wlyfeno0");
    arguments.put("args", mp);
////    context.put("args", arguments);
////    wrapper.put("ctx", context);
//
    StringWriter writer = new StringWriter();
    t.merge(arguments, writer);
//
    final String s = writer.toString();
    System.out.println("s = " + s);
  }

}
