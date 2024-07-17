package ch16collectionsframework;

import java.util.Enumeration;
import java.util.Properties;

/* Properties: 속성, 재산, SystemPropertiesAdvanced
    .properties     key=value       JDBC
    .xml                            SPRING(MAVEN)
    .json           "key":value     JS, SPRING
    .yaml(yml)      key: value      SPRING, SPRINGBOOT, KUBERNETES
 */
public class PropertiesDemo {
    public static void main(String[] args) {
        Properties properties = System.getProperties();
        Enumeration<Object> keys = properties.keys();
        while (keys.hasMoreElements()) {
            String key = (String) keys.nextElement();
            System.out.println(key + " => " + System.getProperty(key));
        }
    }
}
