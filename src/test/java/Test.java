import com.lakers.demo.cglib.CglibProxy;
import com.lakers.demo.jdk.reflect.JDKProxy;
import com.lakers.demo.jdk.util.ClassLoaderUtils;
import com.lakers.demo.service.IUserService;
import com.lakers.demo.service.UserServiceImpl;
import sun.misc.ProxyGenerator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created on 2022/8/23 16:19
 *
 * @author Lakers
 */
public class Test {

    @org.junit.Test
    public void test_proxy_jdk() throws Exception {

        IUserService proxy = (IUserService) JDKProxy.getProxy(Class.forName("com.lakers.demo.service.IUserService"));
        String userName = proxy.queryUserNameById("10001");
        System.out.println(userName);

        String name = "ProxyUserService";
        byte[] data = ProxyGenerator.generateProxyClass(name, new Class[]{IUserService.class});

        // 输出类字节码
        FileOutputStream out = null;
        try {

            out = new FileOutputStream(name + ".class");
            System.out.println((new File("")).getAbsolutePath());
            out.write(data);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (null != out) try {
                out.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    @org.junit.Test
    public void test_proxy_cglib() {
        CglibProxy cglibProxy = new CglibProxy();
        UserServiceImpl userService = (UserServiceImpl) cglibProxy.newInstall(new UserServiceImpl());
        String userName = userService.queryUserNameById("10001");
        System.out.println(userName);
    }
}
